package apparduinobinario;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import jssc.SerialPortException;

public class Canvas extends JPanel{
    
    //VARIABLES
    private PanamaHitek_Arduino arduino;
    private JButton btnEnviar;
    private String valor;
    private JTextField txt1;
    private int valorInt;
    private JLabel texto;
    
    public Canvas(){
        btnEnviar=new JButton("Enviar");
        texto =new JLabel("INGRESA UN NUMERO DE 0 A 255");
        arduino =new PanamaHitek_Arduino();
        add(texto);
        txt1 = new JTextField();
        txt1.setSize(50,26);
        txt1.setText("Ingrese Un Numero");
        this.add(txt1);
        
        
        try {
            arduino.arduinoTX("COM3", 9600);
        } catch (ArduinoException ex) {
            Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.setPreferredSize(new Dimension(300,100));
        this.setBackground(Color.YELLOW);
        
        
         this.add(btnEnviar);
         btnEnviar.addActionListener(new ActionListener() {
             
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = txt1.getText();
                valorInt = Integer.parseInt(valor);
                
                try {
                    arduino.sendByte(valorInt);
                } catch (ArduinoException ex) {
                    Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SerialPortException ex) {
                    Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
         
         
        
    }
    
}
