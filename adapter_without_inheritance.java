import java.awt.Frame;
import java.awt.TextArea;
// import java.awt.TextField;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
// import java.awt.event.WindowListener;
import java.awt.event.MouseAdapter;


public class adapter_without_inheritance extends Frame
{
    Button b=new Button("OK");
    // TextField tf=new TextField();
    TextArea ta = new TextArea(10,10);
    adapter_without_inheritance()
    {
        setSize(500 ,600);
        setLayout(new FlowLayout());

        add(b);
        add(ta);

        setVisible(true);
        b.addMouseListener(new MouseAdapter()
        {
             public void mouseClicked(java.awt.event.MouseEvent m)
             {
                System.out.println("Button clicked Mouse Clicked");
                ta.setText("MOUSE CLICKED");
             }
        });
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent w)
            {
                System.out.println("Frame or Window Closed");
                System.exit(0);
            }
        });
    }

    public static void main(String[] st)
    {
        new adapter_without_inheritance();
    }
}