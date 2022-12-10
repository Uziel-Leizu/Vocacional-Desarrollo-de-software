package graficos;

import java.awt.Color;
import java.awt.Dimension;  //libreria para las dimensiones
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;  //libreria para trabajar con graficos

public class Canvas extends JPanel {  //la funcion de extends es para que la clase herede de una libreria sus funciones
    
    public Canvas(){
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.CYAN);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g3= (Graphics2D)g;
        Line2D linea= new Line2D.Double(100,50,300,50);
        g3.draw(linea);
        Rectangle2D r = new Rectangle2D.Double(100,100,200,100);
        g3.fill(r);
        Ellipse2D eli = new Ellipse2D.Double(300,200,250,100);
        //g3.fill(eli);
        Arc2D arco = new Arc2D.Double(200,200,100,100,30,60,Arc2D.PIE);
        g3.fill(arco);
        QuadCurve2D cuadratica = new QuadCurve2D.Double(300,200,350,400,400,200);
        g3.draw(cuadratica);
        CubicCurve2D cubica = new CubicCurve2D.Double(300,400,350,350,400,450,450,400);
        g3.draw(cubica);
    }
    
}
