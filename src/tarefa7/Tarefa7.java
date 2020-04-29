/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa7;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Josemolamazo
 */
public class Tarefa7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barco vel = new Veleros("vel123", 2, 4.5f);
        Barco yat = new Yates("yat123", 35.5f, 3, 7.5f);
        Barco barMot = new BarcoMotor("barMot123", 60.6f, 5.3f);

        ArrayList<Barco> barcos = new ArrayList();
        barcos.add(vel);
        barcos.add(yat);
        barcos.add(barMot);

        int opcion = 0;
        while (opcion < 4) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "---MENU---"
                    + "\n 1. Alquilar velero."
                    + "\n 2. Alquilar barco a motor."
                    + "\n 3. Alquilar yate."
                    + "\n 4. Sair."));
            switch (opcion) {
                case 1:
                    System.out.println("---FACTURA--------\n" + vel.factura(vel.aluguer()));
                    break;
                case 2:
                    System.out.println("---FACTURA--------\n" + barMot.factura(barMot.aluguer()));
                    break;
                case 3:
                    System.out.println("---FACTURA--------\n" + yat.factura(yat.aluguer()));
                    break;
                case 4:
                    System.exit(0);
            }

        }
    }
}
