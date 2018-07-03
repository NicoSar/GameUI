package gameui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Screen extends JFrame implements ActionListener {
    private JButton bouton = new JButton("Jouer");
    private JButton bouton2 = new JButton("Quitter");
  
    //Création de l'image
    ImageIcon image = new ImageIcon("images/card.jpg");
    JLabel img = new JLabel("", image, JLabel.CENTER);
    
    Image icone = Toolkit.getDefaultToolkit().getImage("images/icon.png"); 
    
    
    public Screen() {
        this.setTitle("Solitaire");
        this.setSize(300, 80); 
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
        this.setVisible(true);
        this.setIconImage(icone);
        
        
        JPanel panel = new JPanel(); //Nouveau panel PANEL
        panel.setBackground(Color.GRAY); //Couleur du Panel   
        panel.add(bouton, BorderLayout.WEST);
        
        
        panel.add(bouton2, BorderLayout.EAST);
        bouton.addActionListener(this);
        bouton2.addActionListener(this);
        this.setContentPane(panel);               
        this.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
          //java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit(); 
        
         //Image fond = toolkit.getImage("images/wallpaper.jpg"); 
       
        
        Object  source = e.getSource();
            if  (source == bouton) {
                JPanel game = new JPanel(); //Nouveau panel GAME
                game.add(img, BorderLayout.CENTER);
                game.add(new JLabel(new ImageIcon("images/wallpaper.jpg")));	
              
                this.setSize(1400, 900); //1400 de large et 900 de hauteur
                this.setLocationRelativeTo(null);
                this.setContentPane(game);
                this.setVisible(true);
                
                
    /*img.addMouseListener(new MouseAdapter() { //Event sur ImageIcon
                
    @Override
    public void mouseClicked(MouseEvent me) {
        JOptionPane.showMessageDialog(null,"alert");
    }
    });*/
            }
        
        else if (source == bouton2) {
            System.exit(0);
        }
    }
}
