import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.channels.CancelledKeyException;
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
    private String mese;
    Timer updateTimer;
    int DELAY = 100;

    Calendar rightNow = Calendar.getInstance();

    public Orologio1() {

        updateTimer = new Timer(DELAY, e -> {

            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("MMMM");

            y = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
            h = String.valueOf(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
            d = String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
            m = String.valueOf(Calendar.getInstance().get(Calendar.MINUTE));
            s = String.valueOf(Calendar.getInstance().get(Calendar.SECOND));
            mese = sdf.format(rightNow.getTime());

            anno.setText(d + " " + mese + " " + y);
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

        try {
            frame.setIconImage( new ImageIcon( new File("C:\\Users\\gino-\\Desktop\\clock.png").toURI().toURL()).getImage());
        } catch (Exception ex) {}

    }

}
