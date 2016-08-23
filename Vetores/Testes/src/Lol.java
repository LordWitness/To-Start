import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lol extends JFrame{
  public Lol() {
    super("A classe JButton");
    
    Container c = getContentPane();
    c.setLayout(new FlowLayout(FlowLayout.LEFT));

    // Cria um botão com o texto "Clique Aqui"
    JButton btn = new JButton("Clique Aqui");
    btn.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent e){
          JOptionPane.showMessageDialog(null, 
            "Fui clicado");
        }
      }
    );
    
  
  }
  
  public static void main(String args[]){
    
  }
}
