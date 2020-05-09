import javax.swing.*;
import java.util.Calendar;

public class Orologio1 {
    private JPanel orologio;
    private JLabel anno;
    private JLabel giorno;
    private JLabel ora;
    private JLabel min;
    private JLabel sec;
    private String y, d, h, m, s;
    Calendar now = Calendar.getInstance();

    public Orologio1() {

        y= String.valueOf(Calendar.YEAR);
        m= String.valueOf(Calendar.MONTH);
        d= String.valueOf(Calendar.DAY_OF_MONTH);
        h=String.valueOf(Calendar.HOUR);
        m=String.valueOf(Calendar.MINUTE);
        s=String.valueOf(Calendar.SECOND);

        anno.setText(y);
        giorno.setText(d);
        ora.setText(h);
        min.setText(m);
        sec.setText(s);

    }

    public static void main(String[] args){

        JFrame frame = new JFrame("Orologio");
        frame.setContentPane(new Orologio1().orologio);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}