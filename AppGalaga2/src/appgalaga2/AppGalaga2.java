/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appgalaga2;

import javax.swing.JFrame;

/**
 *
 * @author LCE3-01
 */
public class AppGalaga2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frmGrafico= new JFrame("Arduino leds Binario");  //contorno de la App
        frmGrafico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//establecer comportamiento de cierre
        Canvas c= new Canvas();//antes de setVisible
        frmGrafico.add(c);//agraga el componente de la clase Canvas
        frmGrafico.pack();//ajustar al tamaño del Canvas
        frmGrafico.setVisible(true);
    }
    
}
