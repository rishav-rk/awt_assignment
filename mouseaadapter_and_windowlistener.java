import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.MouseEvent;
import java.awt.event.WindowListener;


import java.awt.event.MouseAdapter;

public class mouseaadapter_and_windowlistener extends Frame implements WindowListener
{
    Button b=new Button("OK");
    TextField tf=new TextField();
    mouseaadapter_and_windowlistener()
    {
        setSize(500 ,600);
        add(b,java.awt.BorderLayout.SOUTH);
        add(tf,java.awt.BorderLayout.CENTER);
        setVisible(true);
        b.addMouseListener(new ma());
        this.addWindowListener(this);
    }
    public void windowOpened(java.awt.event.WindowEvent m){
        System.out.println("window opened");
    }
    public void windowClosing(java.awt.event.WindowEvent m){
                System.out.println("window closing");
                System.exit(0);

    }
    public void windowClosed(java.awt.event.WindowEvent m){
        // System.exit(0);
        System.out.println("window closed");

    }
    public void windowIconified(java.awt.event.WindowEvent m){
        System.out.println("window iconified");

    }
    public void windowDeiconified(java.awt.event.WindowEvent m){
        System.out.println("window deiconified");

    }
    public void windowActivated(java.awt.event.WindowEvent m){
        System.out.println("window activated");

    }
    public void windowDeactivated(java.awt.event.WindowEvent m){
        System.out.println("window deactivated");

    }
    public static void main(String[] st)
    {
        new mouseaadapter_and_windowlistener();
    }
}
class ma extends MouseAdapter
{
    public void mouseEntered(MouseEvent m)
    {
        System.out.println(m.getY());
        // tf.setText("MOUSE ENTERED IN ma CLASS");
    }
}
