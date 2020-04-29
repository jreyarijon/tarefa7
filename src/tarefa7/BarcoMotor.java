/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa7;

/**
 *
 * @author Josemolamazo
 */
public class BarcoMotor extends Barco {

    private String matricula;
    private float potenciaCV;
    private float eslora;

    public BarcoMotor() {
    }

    public BarcoMotor(String matricula, float potenciaCV, float eslora) {
        this.matricula = matricula;
        this.potenciaCV = potenciaCV;
        this.eslora = eslora;
    }

    @Override
    public float aluguer() {
        return 10 * eslora + 2 / potenciaCV;
    }

    @Override
    public String factura(float total) {
        return "   Barcos a motor  \n" + " matricula= " + matricula + "\n eslora=" + eslora + "\n TOTAL= " + Math.round(total*100)/100d;
    }

}
