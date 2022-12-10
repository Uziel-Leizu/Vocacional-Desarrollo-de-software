package appsupermario;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Canvas extends JPanel implements KeyListener {

    //variables
    private AffineTransform tr;
    private Image[] imgder;
    private Image[] imgizq;
    private Image[][] barriles;
    private int K;
    private Timer timer;
    private int x;
    private int y;
    private int xbar[];
    private int bar;
    private boolean der,perdiste, izq, derizq, salto, caida,con;
    private Graphics2D g2;
    
    

    //constructor
    public Canvas() {
        bar=0;
        perdiste = false;
        xbar=new int[5];
        con=false;
        y = 200;
        x = 200;
        salto = false;
        der = false;
        izq = false;
        derizq = false;
        for(int i=0;i<5;i++){
            xbar[i]=1000;
        }
        for(int i=0;i<5;i++){
            xbar[i]=(xbar[i]+(i)*(500));
        }
        tr = new AffineTransform();
        imgder = new Image[10];
        imgizq = new Image[10];
        barriles = new Image[4][5];
        this.setPreferredSize(new Dimension(1000, 500));
        this.setBackground(Color.WHITE);
        this.setFocusable(true);

        K = 0;
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                for(int i=0;i<5;i++){
                    xbar[i]=xbar[i]-10;
                }
                bar++;
                if (izq) {
                    x = x - 10;
                    K++;
                }
                if (der) {

                    x = x + 10;
                    K++;
                }
                if (salto && con) {
                    y = y - 20;
                    
                    if (derizq==false){
                        x=x+20;
                        
                    }
                    
                    if(derizq==true){
                        x=x-20;
                    }
                    
                }
                if (y == 140) {
                    caida = true;
                }
                if (caida) {
                    salto = false;
                    
                    if (derizq==false){
                        x=x+20;
                    }
                    
                    if(derizq==true){
                        x=x-20;
                    }
                    
                    if (y == 200) {
                        caida = false;
                        con= false;
                    }
                    y = y + 20;
                    
                    
                    
                }
                repaint();
            }
        });
        this.addKeyListener(this);
        this.setFocusable(true);
        timer.start();

        //frame estatico derecha
        try {
            imgder[4] = ImageIO.read(new File(4 + ".png"));
        } catch (IOException ex) {
            Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
        }
        //frame salto derecha
        try {
            imgder[5] = ImageIO.read(new File(3 + ".png"));
        } catch (IOException ex) {
            Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
        }
        //frame estatico izquierda
        try {
            imgizq[4] = ImageIO.read(new File(9 + ".png"));
        } catch (IOException ex) {
            Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
        }
        //frame salto izquierda
        try {
            imgizq[5] = ImageIO.read(new File(8 + ".png"));
        } catch (IOException ex) {
            Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < 3; i++) {
            try {
                imgder[i] = ImageIO.read(new File(i + ".png"));
            } catch (IOException ex) {
                Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (int i = 0; i < 3; i++) {
            try {
                imgizq[i] = ImageIO.read(new File(i + 5 + ".png"));
            } catch (IOException ex) {
                Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for(int f=0;f<4;f++){
            for(int c=0;c<5;c++){
                try {
                    barriles[f][c] = ImageIO.read(new File(f+"b.png"));
                } catch (IOException ex) {
                    Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.g2 = (Graphics2D) g;
        if (bar == 4){
            bar=0;
        }
        if (K == 3) {
            K = 0;
            der = false;
            izq = false;
        }
        if(perdiste==false){
        if (salto == false) {
            if (der == false && derizq == false) {
                g2.drawImage(imgder[4], x, y, 100, 100, this);
            }
        }
        if (salto == false) {
            if (izq == false && derizq == true) {
                g2.drawImage(imgizq[4], x, y, 100, 100, this);
            }
        }
        if (izq) {
            g2.drawImage(imgizq[K], x, y, 100, 100, this);
        }
        if (derizq == false && salto == true) {
            g2.drawImage(imgder[5], x, y, 100, 100, this);
        }
        if (derizq == true && salto == true) {
            g2.drawImage(imgizq[5], x, y, 100, 100, this);
        }
        }
        if (der) {
            g2.drawImage(imgder[K], x, y, 100, 100, this);
        }
        for(int c=0;c<4;c++){
        for(int i=0;i<5;i++){
            g2.drawImage(barriles[bar][i], xbar[i] ,250, 50, 50, this);
        }
        }
        if(perdiste){
            g2.setPaint(Color.BLUE);
            g2.drawString("GAME OVER", 220, 250);
            repaint();
            izq=false;
            der=false;
            salto=false;
            caida=false;
        }
//        System.out.println(imgder[K].equals(g));
//        System.out.println(imgder[0].equals(barriles[0][0]));
        for(int i=0;i<5;i++){
            if(x<=xbar[i]+50 && x>=xbar[i]-50 && y<=250 && y > 190){
                perdiste=true;
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            der = true;
            izq = false;
            derizq = false;
        }
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            der = false;
            izq = true;
            derizq = true;
        }
        if(con==false){
        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            salto = true;
            con=true;
        }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }
}