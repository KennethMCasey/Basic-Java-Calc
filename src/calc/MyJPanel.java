package calc;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class MyJPanel extends JPanel implements ActionListener {
	private JLabel jlDisplay;
	private	JPanel  jpTF, jpBtn;
	private JTextField jtf1, jtf2;
	private JButton jbAdd, jbSub, jMult, JDiv;
	
	
public MyJPanel() {
	super(new GridLayout (3,0));
	JPanel result = new JPanel( new BorderLayout() );
	
	jlDisplay = new JLabel("Add or Subtract Below");
	
	result.add(jlDisplay);
	add(result);
	
	jtf1 = new JTextField("num1", 5);
	jtf2 = new JTextField("num2" , 5);
	jbAdd = new JButton("Add");
	jbSub = new JButton("Sub");
	jMult = new JButton("Multiply");
	JDiv = new JButton("Divide");
	

	jbAdd.addActionListener(this);
	jbSub.addActionListener(this);
	jMult.addActionListener(this);
	JDiv.addActionListener(this);
	
	
	JPanel nums = new JPanel(new GridLayout(1, 2));
	nums.add(jtf1);
	nums.add(jtf2);
	add(nums);
	
	JPanel buttons = new JPanel(new GridLayout(1, 2));
	buttons.add(jbAdd);
	buttons.add(jbSub);
	buttons.add(jMult);
	buttons.add(JDiv);
	
	add(buttons);
}


public int  getIntFromTextField(JTextField jtf) throws NumberFormatException {
	return  Integer.parseInt( jtf.getText() ); // assuming is always num
}

@Override
public void actionPerformed(ActionEvent e) {
	try {
	double x =  (e.getSource().equals(jbAdd)) ?  (getIntFromTextField(jtf1) + getIntFromTextField(jtf2)) : (e.getSource().equals(jbSub)) ? (getIntFromTextField(jtf1) - getIntFromTextField(jtf2)) : (e.getSource().equals(jMult)) ? (getIntFromTextField(jtf1) * getIntFromTextField(jtf2)) :  (getIntFromTextField(jtf1) / getIntFromTextField(jtf2));
	jlDisplay.setText(Double.toString(x));	
	}
	catch(Exception ex) 
	{
		jlDisplay.setText("ERROR: CHECK VALUES");
	}
}
	
	







	
}
