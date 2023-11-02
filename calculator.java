import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class calculator extends Frame {

  calculator() {
    super("CALCULATOR");
    Button button[] = new Button[9];
    String labels[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
    TextField tf = new TextField();

    int width = 600, count = 0;
    int x_axis = -200, y_axis = 100;
    setLayout(null);
    setSize(width, 700);
    tf.setBounds(0, 0, 600, 100);
    add(tf);

    for (int i = 8; i >= 0; i--) {
            count++;
            x_axis += 200;
            button[i] = new Button(labels[i]);
      
            button[i].setBounds(x_axis, y_axis, 200, 80);
            add(button[i]);
            if (count == 3) {
              x_axis = -200;
              count = 0;
              y_axis += 80;
            }

    }
    setVisible(true);
  }

  public static void main(String[] st) {
     new calculator();
  }
}
