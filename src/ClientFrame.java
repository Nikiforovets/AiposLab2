import javax.swing.*;
import java.awt.*;

/**
 * Created by Максим on 01.04.2017.
 */
public class ClientFrame extends JFrame{

    private JTextField textField;
    private JLabel label;

    public ClientFrame(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("aipos2");
        setSize(new Dimension(340, 480));

        textField = new JTextField();
        textField.setBounds(10, 30, 130, 30);

        add(textField);
        setVisible(true);
    }
}
