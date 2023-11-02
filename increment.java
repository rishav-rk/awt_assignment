import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class increment extends Frame implements ActionListener
{
	Button incr_ment = new Button("increment");
	Button decr_ment = new Button("decrement");
	Button reset = new Button("reset");

	TextField tf = new TextField();
	increment()
	{
		super("Count");
		
		//setLayout(null);
		setSize(700,400);

	tf.setText("0");
	add(tf,BorderLayout.NORTH);
	add(incr_ment,BorderLayout.CENTER);	
	add(decr_ment,BorderLayout.SOUTH);
	add(reset,BorderLayout.EAST);

	setVisible(true);

	incr_ment.addActionListener(this);
	decr_ment.addActionListener(this);
	reset.addActionListener(this);
	}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==incr_ment) 
	{
		int txt =Integer.parseInt(tf.getText()) ;
		txt++;
		tf.setText(String.valueOf(txt));
	}
	if(e.getSource()==decr_ment)
	{
		int txt=Integer.parseInt(tf.getText());
		tf.setText(String.valueOf(--txt));
	}
	if(e.getSource()==reset)
	{
		tf.setText("0");
	}
}
	
	public static void main(String[] st)
	{
		new increment();
	}
}		