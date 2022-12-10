package appexamen;

import java.awt.Color;
import java.awt.Dimension;  //libreria para las dimensiones
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import static javafx.scene.paint.Color.color;


import javax.swing.JPanel;  //libreria para trabajar con graficos

public class Canvas extends JPanel implements MouseListener{  //la funcion de extends es para que la clase herede de una libreria sus funciones
    private Rectangle2D r;
    private Rectangle2D r2; 
    private int conta =0;
    private int c = 0;
    private double[] x,y;
    private Color color;
    
    
    public Canvas(){
        r = new Rectangle2D.Double(100,50,20,20);
        r2 = new Rectangle2D.Double(300,50,20,20);
        x=new double[2];
        y=new double[2];
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.CYAN);
        
        this.addMouseListener(this);
        
        
    }
    
    @Override
    public void paintComponent (Graphics g){
        
        super.paintComponent(g);
        Graphics2D g3= (Graphics2D)g;
        
        g3.fill(r);
        g3.fill(r2);
            if(x[0] >= 100 && x[0]<=120 && x[1]>=300 && x[1]<=320 && y[0]>=50 && y[0]<=70 && y[1]>=50 && y[1]<=70){
              
            
            Line2D linea= new Line2D.Double(x[0],y[0],x[1],y[1]);
            g3.setColor(color);
            g3.draw(linea);
            
            conta=0;
            
        }
           
            
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        x[conta]= me.getX();
        y[conta]=me.getY();
        conta++;
        
            repaint();
            
            if(conta>1){
                conta=0;
            }
        
        
        

        System.out.println("Precionaste");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
    
}