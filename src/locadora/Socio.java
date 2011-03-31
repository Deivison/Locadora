/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora;


/**
 *
 * @author Deivison
 */
public class Socio {

    public Socio(){

    }
    private int inscricao;
    private String nome;
    private String endereco;
    private String telefone;

    public Socio(int inscricao, String nome, String endereco, String telefone) {
        if (nome == null || nome.isEmpty())
            throw new DadosInsuficientesException("nome");
    }

    /**
     * @return the inscricao
     */
    public int getInscricao() {
        return inscricao;
    }

    /**
     * @param inscricao the inscricao to set
     */
    public void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
