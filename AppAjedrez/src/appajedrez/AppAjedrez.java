package appajedrez;

import javax.swing.JFrame;

public class AppAjedrez {

    public static void main(String[] args) {
        JFrame frmGrafico = new JFrame("Ajedrez");
        Canvas c = new Canvas();
        frmGrafico.add(c);
        frmGrafico.pack();
        frmGrafico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmGrafico.setVisible(true);
    }
    
}
