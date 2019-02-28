import javax.swing.*;
import java.awt.*;

public class Wechart extends JFrame {

    public Wechart(){
        setTitle("We Chart");
        setSize(800,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,0));

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.gray);
        TextArea middlePanel = new TextArea();
        JPanel bottomPanel = new JPanel();
        topPanel.setLayout(null);
        bottomPanel.setLayout(null);

        //Top panel components
        JButton button1 = new JButton("Connect");
        JLabel ipLabel = new JLabel("IP address");
        TextField ipAddress = new TextField();
       // TextField port = new TextField("port number");

        //Buttom Panel components
        JLabel sendLabel = new JLabel("Enter a message");
        TextField sendText = new TextField();
        JButton sendButton =new JButton("send");

        JButton fileLabel = new JButton("Choose a File");
        TextField fileText = new TextField();
        JButton fileSendButton =new JButton("up load");


        ipLabel.setSize(80,30);
        ipLabel.setLocation(150,150);
        ipAddress.setSize(200,30);
        ipAddress.setLocation(250,150);

        button1.setSize(150,30);
        button1.setLocation(480,150);

        //Bottom Panel components setting
        sendLabel.setSize(150,30);
        sendLabel.setLocation(0,20);
        sendText.setSize(200,30);
        sendText.setLocation(150,20);
        sendButton.setSize(150,30);
        sendButton.setLocation(380,20);

        fileLabel.setSize(130,30);
        fileLabel.setLocation(0,80);
        fileText.setSize(200,30);
        fileText.setLocation(150,80);
        fileSendButton.setSize(150,30);
        fileSendButton.setLocation(380,80);




        button1.setActionCommand("connect");
        button1.addActionListener(new listeners(ipAddress));

        sendButton.addActionListener(new listeners(middlePanel));

        fileLabel.setActionCommand("fileChooser");
        fileLabel.addActionListener(new listeners(fileText));

        topPanel.add(button1);
        topPanel.add(ipAddress);
        topPanel.add(ipLabel);

        bottomPanel.add(sendLabel);
        bottomPanel.add(sendText);
        bottomPanel.add(sendButton);

        bottomPanel.add(fileLabel);
        bottomPanel.add(fileText);
        bottomPanel.add(fileSendButton);


        add(topPanel);
        add(middlePanel);
        add(bottomPanel);


        setVisible(true);
    }

    public static void main(String []agrs){
        new Wechart();

    }
}
