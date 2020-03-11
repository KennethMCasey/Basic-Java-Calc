package calc;

import java.awt.Dimension;

import javax.swing.JFrame;

public class TextFieldCalc {
public static void main(String[] args) {
	javax.swing.SwingUtilities.invokeLater(new Runnable() {
		
		
	
			
			@Override
			public void run() {
				MyJFrame gui = new MyJFrame();
				gui.setVisible(true);
				gui.setSize( new Dimension(300, 500));
				gui.setDefaultCloseOperation(MyJFrame.EXIT_ON_CLOSE);
			}
	});
			
			
	
	
	
}
}
