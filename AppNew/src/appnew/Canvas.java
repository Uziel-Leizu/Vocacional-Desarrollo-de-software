package appnew;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;



public class Canvas extends JPanel implements KeyListener{
    
    //VARIABLE
    private Timer timer;
    private double x,y;
    private boolean der,izq,up,down,r1,r2,r3,r4,win;
    private JLabel texto;
    public Canvas(){
        texto =new JLabel("GANASTE");
        x=10;
        y=10;
        r1=true;
        r2=true;
        r3=true;
        r4=true;
        up=false;
        down=false;
        der=false;
        izq=false;
        win=false;
        this.add(texto);
        
        texto.setVisible(win);
        

        

        
        timer = new Timer(10,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(der){
                    x=x+5;
                    if(x>460){
                        der=false;
                        izq=true;
                    }
                    
                }
                if(izq){
                    x=x-5;
                    if(x<0){
                        izq=false;
                        der=true;
                    }
                }
                 if(up){
                    y=y+5;
                    if(y>460){
                        up=false;
                        down=true;
                    }
                }
                if(down){
                    y=y-5;
                    if(y<0){
                        down=false;
                        up=true;
                    }
                }
            if(r1==false && r2==false && r3==false && r4==false){
            JOptionPane.showMessageDialog(null,"GANASTE");
            r1=true;
            r2=true;
            r3=true;
            r4=true;
        }
                repaint();
                
            }
        });
        timer.start();
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.YELLOW);
        this.addKeyListener(this);
        this.setFocusable(true);
       
        
        
    }
    
    @Override
        public void paintComponent (Graphics g){
        Rectangle2D rec1,rec2,rec3,rec4;
        super.paintComponent(g);
        Graphics2D g3= (Graphics2D)g;
        Ellipse2D eli = new Ellipse2D.Double(x,y,40,40);
        g3.setPaint(new Color(12,56,98));
        g3.fill(eli);
        rec1 = new Rectangle2D.Double(100,50,20,20);
        rec2 = new Rectangle2D.Double(300,100,20,20);
        rec3 = new Rectangle2D.Double(300,150,20,20);
        rec4 = new Rectangle2D.Double(300,300,20,20);
        
        if(r1){
            g3.fill(rec1);
        }
        if(r2){
            g3.fill(rec2);
        }
        if(r3){
            g3.fill(rec3);
        }
        if(r4){
            g3.fill(rec4);
        }
        if(eli.intersects(rec1)){
            r1=false;
            repaint();
        }
            if(eli.intersects(rec2)){
            r2=false;
            repaint();
        }
            if(eli.intersects(rec3)){
            r3=false;
            repaint();
        }
            if(eli.intersects(rec4)){
            r4=false;
            repaint();
        }

        }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode()==KeyEvent.VK_RIGHT){
            der=true;
            izq=false;
        }
        if(ke.getKeyCode()==KeyEvent.VK_LEFT){
            der=false;
            izq=true;
        }
        if(ke.getKeyCode()==KeyEvent.VK_DOWN){
            up=true;
            down=false;
        }
        if(ke.getKeyCode()==KeyEvent.VK_UP){
            up=false;
            down=true;
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
        
         
         
        
}