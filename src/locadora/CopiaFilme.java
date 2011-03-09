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
public class CopiaFilme {

    public CopiaFilme(){
    }

    private int codigo, ano, duracaoEmMinutos;
    private String titulo, genero, diretor, estado;
    private String[] artistasPrincipais = new String[1];
    private Emprestimo[] emprestimo = new Emprestimo[5];
    private Date dataAquisicao;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the diretor
     */
    public String getDiretor() {
        return diretor;
    }

    /**
     * @param diretor the diretor to set
     */
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    /**
     * @return the artistasPrincipais
     */
    public String[] getArtistasPrincipais() {
        return artistasPrincipais;
    }

    /**
     * @param artistasPrincipais the artistasPrincipais to set
     */
    public void setArtistasPrincipais(String[] artistasPrincipais) {
        this.artistasPrincipais = artistasPrincipais;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the dataAquisicao
     */
    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    /**
     * @param dataAquisicao the dataAquisicao to set
     */
    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    /**
     * @return the duracaoEmMinutos
     */
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    /**
     * @param duracaoEmMinutos the duracaoEmMinutos to set
     */
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

}
