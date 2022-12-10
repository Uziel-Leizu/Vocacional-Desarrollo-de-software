package appknion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javafx.scene.shape.Shape;
import javafx.scene.transform.Affine;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Canvas extends JPanel implements KeyListener {

    private boolean derecha, izq, up, down, relo;
    private int i, conta;
    private Timer timer;
    private double z, y;
    private double[] x = new double[5];
    private double[] y2 = new double[6];
    private double[] x3 = new double[5];
    private double[] y3 = new double[6];
    private boolean[] rect = new boolean[6];
    private AffineTransform tr;
    private Ellipse2D[] eli;
    private Rectangle2D[] target;
    private Rectangle2D[] rec;
    private boolean[] space = new boolean[6];
    private int contadortar;

    public Canvas() {
        contadortar = 0;
        up = false;
        down = false;
        relo = true;
        z = 390;
        y = 235;
        for (int i = 0; i < 6; i++) {
            y2[i] = 235;
        }
        for (int i = 0; i < 6; i++) {
            y2[i] = 235;
        }
        for (int i = 0; i < 6; i++) {
            rect[i] = true;
        }

        timer = new Timer(10, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                
                if(rect[0]==false && rect[1]==false && rect[2]==false && rect[3]==false && rect[4]==false && rect[5]==false ){
                     contadortar = 0;
                    JOptionPane.showMessageDialog(null,"GANASTE");
                    for (int i = 0; i < 6; i++) {
                        rect[i] = true;
                    }
                }
                

                if (up) {
                    y = y - 5;
                    if (relo) {
                        if (!space[conta]) {
                            y2[conta] = y;
                        }
                    }

                }

                if (down) {
                    y = y + 5;
                    if (relo) {
                        if (!space[conta]) {
                            y2[conta] = y;
                        }
                    }

                }
                if (y > 450) {
                    up = true;
                    down = false;

                }
                if (y < 0) {
                    up = false;
                    down = true;

                }
                for (int i = 0; i < 6; i++) {
                    if (y3[i] >= 0 || y3[i] <= 0) {
                        y3[i] = y3[i] + 5;
                    }
                    if (y3[i] == 500) {
                        y3[i] = -500;
                    }
                }
                
                repaint();
            }
        });

        timer.start();

        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.pink);
        this.addKeyListener(this);
        this.setFocusable(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Rectangle2D r1 = new Rectangle2D.Double(390, y, 100, 50);
        g2.setPaint(new Color(74, 0, 0));
        g2.fill(r1);

        Ellipse2D[] eli = new Ellipse2D[5];
        Rectangle2D[] target = new Rectangle2D[6];

        for (int j = 0; j < 6; j++) {

            target[j] = new Rectangle2D.Double(50, y3[j] + (j * 100), 30, 30);

        }

        for (int i = 0; i < 5; i++) {

            eli[i] = new Ellipse2D.Double(x[i], y2[i], 40, 40);
            g2.setPaint(new Color(50, 197, 100));
        }

        for (int j = 0; j < 6; j++) {
            if (rect[j]) {
                g2.fill(target[j]);
            }
        }

        for (int i = 0; i < 5; i++) {
            if (space[i]) {
                x[i] -= 5;
            }

            if (space[i]) {
                g2.setPaint(new Color(50, 30, 100));
                g2.fill(eli[i]);
            }

            if (x[i] <= 0) {
                x[i] = 390;
                space[i] = false;
            }

        }
        for (int r = 0; r < 6; r++) {
            for (int c = 0; c < 5; c++) {
                if (eli[c].intersects(target[r])) {
                    rect[r] = false;
                    repaint();
                }
            }
        }

    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {

        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            up = true;
            down = false;
        }
        if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            up = false;
            down = true;
        }

        if (ke.getKeyCode() == KeyEvent.VK_SPACE) {

            if (relo) {
                space[conta] = true;
            }
            conta++;
            if (conta >= 6) {
                relo = false;
            }

        }

        if (ke.getKeyCode() == KeyEvent.VK_R) {

            conta = 0;
            relo = true;

        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }
}