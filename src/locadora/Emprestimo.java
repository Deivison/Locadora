/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora;

import java.util.Date;

/**
 *
 * @author Deivison
 */
public class Emprestimo {

    public Emprestimo(){
    }

    private int inscricaoSocio;
    private Date dataEmprestimo, dataDevolucao;
    private float valorPago;

    /**
     * @return the inscricaoSocio
     */
    public int getInscricaoSocio() {
        return inscricaoSocio;
    }

    /**
     * @param inscricaoSocio the inscricaoSocio to set
     */
    public void setInscricaoSocio(int inscricaoSocio) {
        this.inscricaoSocio = inscricaoSocio;
    }

    /**
     * @return the dataEmprestimo
     */
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    /**
     * @param dataEmprestimo the dataEmprestimo to set
     */
    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    /**
     * @return the dataDevolucao
     */
    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * @return the valorPago
     */
    public float getValorPago() {
        return valorPago;
    }

    /**
     * @param valorPago the valorPago to set
     */
    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

}
