import javax.swing.*;
import java.util.Calendar;
import java.util.Date;

public class Orologio1 {
    private JPanel orologio;
    private JLabel anno;
    private JLabel ora;
    private JLabel min;
    private JLabel sec;
    private String y;
    private String d;
    private String mh;
    private String h;
    private String m;
    private String s;

    Date dateOne = new Date();

    public Orologio1() {

        y=String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
        mh=String.valueOf(Calendar.getInstance().get(Calendar.MONTH));
        d=String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        h=String.valueOf(Calendar.getInstance().get(Calendar.HOUR));
        m=String.valueOf(Calendar.getInstance().get(Calendar.MINUTE));
        s=String.valueOf(Calendar.getInstance().get(Calendar.SECOND));

        anno.setText(y);
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