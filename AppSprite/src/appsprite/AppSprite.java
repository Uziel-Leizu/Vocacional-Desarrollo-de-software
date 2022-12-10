package appsprite;

import javax.swing.JFrame;

public class AppSprite {

    public static void main(String[] args) {
        JFrame frmGrafico= new JFrame("SUPER MARIO BROS");  //contorno de la App
        frmGrafico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//establecer comportamiento de cierre
        Canvas c= new Canvas();//antes de setVisible
        frmGrafico.add(c);//agraga el componente de la clase Canvas
        frmGrafico.pack();//ajustar al tamaño del Canvas
        frmGrafico.setVisible(true);
        
    }
    
}
