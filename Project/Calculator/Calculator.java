import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JPanel implements ActionListener {
	private JTextField display = new JTextField("0");
	private String button = "789/456*123-0.=+";
	private double result = 0;
	private String operator = "=";
	private boolean calculating = true;
	private boolean decimal = false;
	
	public Calculator()
	{
		setLayout(new BorderLayout());
		
		display.setEditable(false);
		add(display, "North");
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4, 4));
		
			for (int i = 0; i < button.length(); i++)
			{
				JButton b = new JButton(button.substring(i, i + 1));
				p.add(b);
				b.addActionListener(this);
			}
			
		add(p, "Center");
		
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		String cmd = evt.getActionCommand();
			if ('0' <= cmd.charAt(0) && cmd.charAt(0) <= '9' || cmd.equals("."))
			{
				System.out.println("Entered Here");
				
				if (calculating)
				{
					System.out.println("Entered  calculating " + cmd.charAt(0));
					display.setText(cmd);
				}
				else
				display.setText(display.getText() + cmd);
				calculating = false;
			}
			
			else
			{
				if (calculating)
				{
					if (cmd.equals("-"))
					calculating = false;
				}
				else
				{
					try
					{
						double x = Double.parseDouble(display.getText());
						calculate(x);
						operator = cmd;
						calculating = true;
					}catch(NumberFormatException e){
						display.setText("Illegal Number Format");
						calculating = false;
					}
					calculating = true;
				}
			}
	}
	
	private void calculate(double n)
	{
		if (operator.equals("+"))
		result += n;
		else if (operator.equals("-"))
			result -= n;
		else if (operator.equals("+"))
			result += n;
		else if (operator.equals("/"))
			result /= n;
		else if (operator.equals("="))
			result = n;
		
		display.setText("" + result);
	}
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setTitle("Calculator");
		frame.setBounds(250, 250, 200, 200);
		frame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	
		Container contentPane = frame.getContentPane();
		contentPane.add(new Calculator());
		frame.show();
	}
}
