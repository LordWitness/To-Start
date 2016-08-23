import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Estudos extends JFrame{
  public Estudos() {
    super("A classe JButton");
    
    Container c = getContentPane();
    c.setLayout(new FlowLayout(FlowLayout.LEFT));

    // Cria um bot�o com o texto "Clique Aqui"
    JButton btn = new JButton("Clique Aqui");
    btn.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent e){
          JOptionPane.showMessageDialog(null, 
            "Fui clicado");
        }
      }
    );
    
    // Adiciona o bot�o � janela
    c.add(btn);  

    setSize(350, 250);
    setVisible(true);
  }
  
  public static void main(String args[]){
    Estudos app = new Estudos();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
