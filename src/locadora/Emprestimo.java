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

    private int inscricaoSocio;
    private double valorPago;
    private String dataEmprestimo, dataDevolucao;

    public Emprestimo(){
    }

    public Emprestimo(int inscricao, String pdataEmprestimo){
        inscricaoSocio = inscricao;
        dataEmprestimo = pdataEmprestimo;
    }

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
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    /**
     * @param dataEmprestimo the dataEmprestimo to set
     */
    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    /**
     * @return the dataDevolucao
     */
    public String getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * @return the valorPago
     */
    public double getValorPago() {
        return valorPago;
    }

    /**
     * @param valorPago the valorPago to set
     */
    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
}
