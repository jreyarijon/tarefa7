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
public class Yates extends Barco {

    private String matricula;
    private float potenciaCV;
    private int camarotes;
    private float eslora;

    public Yates() {
    }

    public Yates(String matricula, float potenciaCV, int camarotes, float eslora) {
        this.matricula = matricula;
        this.potenciaCV = potenciaCV;
        this.camarotes = camarotes;
        this.eslora = eslora;
    }

    @Override
    public float aluguer() {
        return 10 * eslora + (2 / potenciaCV + 25 / camarotes);
    }

    @Override
    public String factura(float total) {
        return "   Yates  \n" + " matricula= " + matricula + "\n eslora=" + eslora + "\n TOTAL= " + Math.round(total*100)/100d;
    }

}
