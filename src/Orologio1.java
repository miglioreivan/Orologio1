import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class Orologio1 {
    private JPanel orologio;
    private JLabel anno;
    private JLabel ora;
    private String y;
    private String d;
    private String h;
    private String m;
    private String s;
    Timer updateTimer;
    int DELAY = 100;

    Calendar rightNow = Calendar.getInstance();

    public Orologio1() {


        updateTimer = new Timer(DELAY, e -> {

            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("MMMM");

            y = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
            h = String.valueOf(Calendar.getInstance().get(Calendar.HOUR));
            d = String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
            m = String.valueOf(Calendar.getInstance().get(Calendar.MINUTE));
            s = String.valueOf(Calendar.getInstance().get(Calendar.SECOND));

            anno.setText(d + " " + sdf.format(rightNow.getTime()) + " " + y);
            ora.setText(h+":"+m+":"+s);
        });
        updateTimer.start();

    }

    public static void main(String[] args){

        JFrame frame = new JFrame("Orologio");
        frame.setContentPane(new Orologio1().orologio);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }

}