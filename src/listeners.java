
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class listeners extends Component implements ActionListener {
    private TextField field;
    private TextArea area;
    public listeners(TextField filed){
        this.field = filed;
    }

    public listeners(TextArea area){
        this.area = area;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getActionCommand().equals("connect")){

            field.setText("lelethu");
        }else if (actionEvent.getActionCommand().equals("fileChooser")){
           selectAFile();
        }else {
            //area.setText("lelethu area");

            /*final JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(this);

            try {
                // Open an input stream
                Scanner reader = new Scanner(fc.getSelectedFile());
                String line = reader.nextLine();

                area.setText(line);

                reader.close();

            }catch (FileNotFoundException e){
                System.out.println("file not found");
            }*/


            //  area.setText(filename);
        }

    }

    public File selectAFile(){

        JFileChooser chooser=new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.showSaveDialog(this);

        //String path = chooser.getSelectedFile().getAbsolutePath();
        String filename =chooser.getSelectedFile().getName();
        field.setText(filename);
        return chooser.getSelectedFile();
    }


}
