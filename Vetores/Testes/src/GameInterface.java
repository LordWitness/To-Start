import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JFrame;

public class GameInterface extends JFrame {
	public GameInterface() {
		super("Perguntas e respostas");
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton btn = new JButton ("Clique Aqui");
		btn.addActionListener(new 
				ActionListener(){	
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "Resposta Correta" );
						
						
					}
			}
		);
			c.add(btn);
			setSize(350,250);
			setVisible(true);
	}
	public static void main(String[] args){
		GameInterface app = new GameInterface();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}
	
	
}
