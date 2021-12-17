import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{

    private String title;
    private Dimension d;

    private JButton button = new JButton("Say meow");
    private JLabel label = new JLabel("0");

    public MainFrame(String title,  Dimension d)  {
        this.title = title;
        this.d = d;
    }

    void init() {
        setTitle(title);
        setSize(d);
        setLayout(new GridLayout(3,3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        button.addActionListener(new ButtonActionListener());
        add(button);
        add(label);

        setVisible(true);

    }

    public class ButtonActionListener implements ActionListener {
        int counter = 0;
        String b = "";
        public void actionPerformed(ActionEvent event) {
            System.out.println("Meow");
            counter++;
            b = String.valueOf(counter);
            label.setText(b);
        }
    }
}
