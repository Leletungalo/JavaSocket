
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class listeners implements ActionListener {
    TextField field1;

    public listeners(TextField filed1){
        this.field1 = filed1;
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        field1.setText("lelethu");
    }


}
