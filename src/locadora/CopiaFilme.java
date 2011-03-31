/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Deivison
 */
public class CopiaFilme {
    private String stringData;

    public CopiaFilme(){
    }

    private int codigo, duracaoEmMinutos, ano;
    private String titulo, genero, diretor, artPrinc1, artPrinc2, estado;
    // String[] artistasPrincipais = new String[1];
    private Date dataAquisicao;
    private Emprestimo[] emprestimo = new Emprestimo[5];

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

    /**
     * @return the artPrinc1
     */
    public String getArtPrinc1() {
        return artPrinc1;
    }

    /**
     * @param artPrinc1 the artPrinc1 to set
     */
    public void setArtPrinc1(String artPrinc1) {
        this.artPrinc1 = artPrinc1;
    }

    /**
     * @return the artPrinc2
     */
    public String getArtPrinc2() {
        return artPrinc2;
    }

    /**
     * @param artPrinc2 the artPrinc2 to set
     */
    public void setArtPrinc2(String artPrinc2) {
        this.artPrinc2 = artPrinc2;
    }

    public int qtdeEmprestimoOcupados(){
        int contador = 0;
        for(int i=0;i<=this.getEmprestimo().length-1;i++)
        {
            if(this.getEmprestimo()[i]!=null)
            {
                contador++;
            }
        }
        return contador;
    }

    /**
     * @return the emprestimo
     */

    
    public Emprestimo[] getEmprestimo() {
        return emprestimo;
    }
    
    public Emprestimo getEmprestimo(int pos){
        return emprestimo[pos];
    }

    public void setEmprestimo(Emprestimo emprestimo, int pos){
        this.emprestimo[pos] = emprestimo;
    }

    public void salvar(CopiaFilme[] fita, int posicaoFita, String codigo, String titulo, String duracao, String ano, String genero, String diretor, String artista1, String artista2, String stringData, String estado){
         try{
            try{
                    fita[posicaoFita].setCodigo(Integer.parseInt(codigo));
                    fita[posicaoFita].setTitulo(titulo);
                    fita[posicaoFita].setDuracaoEmMinutos(Integer.parseInt(duracao));
                    fita[posicaoFita].setAno(Integer.parseInt(ano));
                    fita[posicaoFita].setGenero(genero);
                    fita[posicaoFita].setDiretor(diretor);
                    fita[posicaoFita].setArtPrinc1(artista1);
                    fita[posicaoFita].setArtPrinc2(artista2);

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    Date data = null;

                    data = formato.parse(stringData);
                    fita[posicaoFita].setDataAquisicao(data);

                    fita[posicaoFita].setEstado(estado);

                    System.out.println(fita[posicaoFita].getCodigo());
                    System.out.println(fita[posicaoFita].getTitulo());
                    System.out.println(fita[posicaoFita].getDuracaoEmMinutos());
                    System.out.println(fita[posicaoFita].getAno());
                    System.out.println(fita[posicaoFita].getGenero());
                    System.out.println(fita[posicaoFita].getDiretor());
                    System.out.println(fita[posicaoFita].getArtPrinc1());
                    System.out.println(fita[posicaoFita].getArtPrinc2());
                    System.out.print(fita[posicaoFita].getDataAquisicao());
                    System.out.println(fita[posicaoFita].getEstado());

                    posicaoFita++;
               }
             catch(ParseException ex){
                     JOptionPane.showMessageDialog(null,"A data deve ter o formato dd/mm/aaaa.", "Erro", 0);
               }
           }
           catch(NumberFormatException e){
               JOptionPane.showMessageDialog(null,"Duração e Ano devem ser preenchidos com números inteiros.", "Erro", 0);
           }
      }
}
