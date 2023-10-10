import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.MouseEvent;


// import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;



 class mouselistener extends Frame implements MouseListener
 {
    Button b = new Button("ok");
    TextField tf = new TextField();
    mouselistener()
    {
    setLayout(null);
    setSize(600,700);
    tf.setBounds(40, 60, 300, 300);
    b.setBounds(400, 400, 100, 100);
    add(b);
    add(tf);
    b.addMouseListener(this);
    setVisible(true);

    }
        public void mouseClicked(MouseEvent m)
    {
        tf.setText("Mouse Clicked");
    }
    public void mousePressed(MouseEvent m)
    {
        tf.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent m)
    {
        tf.setText("Mouse Released");
    }
    public void mouseEntered(MouseEvent m)
    {
        tf.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent m)
    {
        tf.setText("Mouse Exited");
    }
    public static void main(String[] st)
    {
        new mouselistener();
    }
}

