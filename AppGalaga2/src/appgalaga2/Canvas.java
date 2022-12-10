
package appgalaga2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Canvas extends JPanel implements KeyListener {

    //VARIABLE
    private Timer timer;
    private double x, rec, y;
    private boolean der, izq, up, down, espacio,upy,downy;
    private Shape eli;
    private int conta;
    private AffineTransform tr;
    private Shape rec1; 

    public Canvas() {
        
        tr = new AffineTransform();
        conta=0;
        eli= new Ellipse2D.Double();
        y = 10;
        x = 400;
        rec = 10;
        upy=false;
        downy=false;
        up = false;
        down = false;
        der = false;
        izq = false;
        espacio = false;
        rec1 = new Rectangle2D.Double(400, 10, 100, 50);
        this.eli = new Ellipse2D.Double(400,10,40,40);
        
        
        

        timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                y=rec1.getBounds2D().getY();
                
                if (up) {                    
                    tr.setToTranslation(0, -5);
                    down=false;
                    up=true;
                        
                }

               if (down) {
                    tr.setToTranslation(0, 5);
                    down=true;
                    up = false;
                  }

                if(rec1.getBounds2D().getY()>450){
                up = true;
                down = false;
                }
                if(rec1.getBounds2D().getY()<0){
                down = true;
                up=false;
                }
                if(izq){
                    tr.setToTranslation(-5, 0);
                }
                repaint();

            }
        });
        timer.start();
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.YELLOW);
        this.addKeyListener(this);
        this.setFocusable(true);

    }

    @Override
    public void paintComponent(Graphics g) {
        
        this.rec1 = this.tr.createTransformedShape(rec1);
        this.eli = this.tr.createTransformedShape(eli);
        super.paintComponent(g);
        Graphics2D g3 = (Graphics2D) g;
        
        if(conta < 5){
            
            g3.setPaint(new Color(12, 56, 98));
            g3.fill(eli);
        }
        
        g3.fill(this.rec1);

    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_R) {
            conta=0;
        }

        if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            up = false;
            down = true;
            downy=false;
            upy=true;
        }
        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            up = true;
            down = false;
            downy=true;
            upy=false;
            
        }
        if (ke.getKeyCode() == KeyEvent.VK_SPACE) {
            izq = true;
            espacio = true;
            upy=false;
            downy=false;
            conta++;
            
        }
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

}