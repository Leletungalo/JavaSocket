import javax.swing.*;
import java.awt.*;

public class Wechart extends JFrame {

    public Wechart(){
        setTitle("We Chart");
        setSize(800,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,0));

        JPanel topPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        topPanel.setSize(400,500);
        topPanel.setLayout(null);


        JButton button1 = new JButton("Connect");
        JLabel ipLabel = new JLabel("IP address");
        TextField ipAddress = new TextField("Ip address");
       // TextField port = new TextField("port number");

        ipLabel.setSize(80,30);
        ipLabel.setLocation(200,100);
        ipAddress.setSize(200,30);
        ipAddress.setLocation(300,100);
     //   port.setSize(200,30);
       // port.setLocation(230,250);
        button1.setSize(150,30);
        button1.setLocation(200,150);

        button1.addActionListener(new listeners(ipAddress));

        topPanel.add(button1);
        topPanel.add(ipAddress);
        topPanel.add(ipLabel);
      //  topPanel.add(port);


        add(topPanel);
        add(bottomPanel);

        setVisible(true);
    }

    public static void main(String []agrs){
        new Wechart();

    }
}
