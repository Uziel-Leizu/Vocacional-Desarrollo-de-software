package appajedrez;

import java.awt.Color;
import java.awt.Dimension;  //libreria para las dimensiones
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Canvas extends JPanel{
    
    public Canvas(){
        this.setPreferredSize(new Dimension(400,400));
        this.setBackground(Color.WHITE);
    }
    
    @Override
    public void paintComponent(Graphics g){
        
        
        super.paintComponent(g);
        Graphics2D g3= (Graphics2D)g;
        int y=0;
        
        for(int f=0;f<8;f++){
            int x=0;
            if(f!=0){ 
                
            }
            
            for(int c=0;c<8;c++){

                    if(c%2!=0){
                        if(f%2!=0){
                        Rectangle2D r = new Rectangle2D.Double(x,y,50,50);
                        g3.fill(r);
                        }
                    }
                    if(c%2==0){
                        if(f%2==0){
                        Rectangle2D r = new Rectangle2D.Double(x,y,50,50);
                        g3.fill(r);
                        }
                    }
                x=x+50;
            }
            y=y+50;
        }
    }
        
        
    
}
