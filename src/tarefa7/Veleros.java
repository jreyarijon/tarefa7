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
public class Veleros extends Barco {

    private String matricula;
    private int nMastil;
    private float eslora;

    public Veleros() {
    }

    public Veleros(String matricula, int nMastil, float eslora) {
        this.matricula = matricula;
        this.nMastil = nMastil;
        this.eslora = eslora;
    }

    @Override
    public float aluguer() {
        return 10 * eslora + nMastil * 8;
    }

    @Override
    public String factura(float total) {
        return "   Velero \n" + " matricula= " + matricula + "\n eslora= " + eslora + "\n TOTAL= " + Math.round(total*100)/100d;
    }

}
