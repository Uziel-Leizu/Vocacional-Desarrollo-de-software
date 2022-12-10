package appraton;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import jssc.SerialPortException;

public class Canvas extends JPanel implements MouseListener{
    private double[] x,y;
    private int conta;
    private int c;
    private Color color;
    private JButton btnRojo,btnVerde;
    private PanamaHitek_Arduino arduino;
    
    public Canvas(){
        arduino =new PanamaHitek_Arduino();
        try {
            arduino.arduinoTX("COM3", 9600);
        } catch (ArduinoException ex) {
            Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
        }
        x=new double[6];
        y=new double[6];
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.YELLOW);
        this.addMouseListener(this);
        btnRojo=new JButton("Rojo");
        btnVerde=new JButton("verde");
        this.add(btnRojo);
        this.add(btnVerde);
        btnRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                color=Color.RED;
                try{
                    arduino.sendData("1");
                } catch (ArduinoException ex) {
                    Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SerialPortException ex) {
                    Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        btnVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                color=Color.GREEN;
                try {
                    arduino.sendData("0");
                } catch (ArduinoException ex) {
                    Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SerialPortException ex) {
                    Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
    }
    @Override
     public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g3 = (Graphics2D)g;
        
            
        if (conta>5){
            for(c=0;c<5;c++){
            Line2D linea= new Line2D.Double(x[c],y[c],x[1+c],y[1+c]);
            g3.setColor(color);
            g3.draw(linea);
            
            }
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
