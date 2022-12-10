package graficos;

import javax.swing.JFrame;

public class Graficos {

    public static void main(String[] args) {
        JFrame frmGrafico = new JFrame();
        Canvas c = new Canvas();
        frmGrafico.add(c);
        frmGrafico.pack();
        frmGrafico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmGrafico.setVisible(true);
        
    }
    
}
