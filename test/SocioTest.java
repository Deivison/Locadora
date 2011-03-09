
import junit.framework.Assert;
import junit.framework.TestCase;
import locadora.Socio;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deivison
 */
public class SocioTest extends TestCase {
    
    Socio[] socio = new Socio[10];
    private int inteiroTestado;
    private String stringTestada;
    private int posicao = 0;

    public void inicializaSocio(){
        socio[posicao] = new Socio();
    }
    
    public void testInscricao(){
        inicializaSocio();
        inteiroTestado = 10;
        socio[posicao].setInscricao(inteiroTestado);
        assertEquals(inteiroTestado, socio[posicao].getInscricao());
    }

    public void testNome(){
        inicializaSocio();
        stringTestada = "João";
        socio[posicao].setNome(stringTestada);
        assertEquals(stringTestada, socio[posicao].getNome());
    }

    public void testEndereco(){
        inicializaSocio();
        stringTestada = "Rua Projetada, S/N - Centro - Campos dos Goytacazes - RJ";
        socio[posicao].setEndereco(stringTestada);
        assertEquals(stringTestada, socio[posicao].getEndereco());
    }

    public void testTelefone(){
        inicializaSocio();
        stringTestada = "2722-2222";
        socio[posicao].setTelefone(stringTestada);
        assertEquals(stringTestada, socio[posicao].getTelefone());
    }

}
