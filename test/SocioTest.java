
import junit.framework.Assert;
import junit.framework.TestCase;
import locadora.DadosInsuficientesException;
import locadora.Socio;
import locadora.interfaces.TelaPrincipal.*;


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

    public void testInicializaSocio(){
        boolean socioInstanciado = false;
        inicializaSocio();
        if(socio[posicao] instanceof Socio){
            socioInstanciado = true;
        }
        else
        {
            socioInstanciado = false;
        }
        assertTrue(socioInstanciado);
    }

    public void testInstanciaNaoVazia(){
        boolean instanciaNaoVazia = false;
        inicializaSocio();
        if(socio[posicao] != null){
            instanciaNaoVazia = true;
        }
        else
        {
            instanciaNaoVazia = false;
        }
        assertTrue(instanciaNaoVazia);
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

    public void testNomeNaoVazio(){
        inicializaSocio();
        boolean naoVazio = false;
        stringTestada = "João";
        if(!stringTestada.isEmpty()){
            socio[posicao].setNome(stringTestada);
            naoVazio = true;
        }
        assertTrue(naoVazio);
    }

    public void testEndereco(){
        inicializaSocio();
        stringTestada = "Rua Projetada, S/N - Centro - Campos dos Goytacazes - RJ";
        socio[posicao].setEndereco(stringTestada);
        assertEquals(stringTestada, socio[posicao].getEndereco());
    }

    public void testEnderecoNaoVazio(){
        inicializaSocio();
        boolean naoVazio = false;
        stringTestada = "Rua Projetada, S/N - Centro - Campos dos Goytacazes - RJ";
        if(!stringTestada.isEmpty()){
            socio[posicao].setNome(stringTestada);
            naoVazio = true;
        }
        assertTrue(naoVazio);
    }

    public void testTelefone(){
        inicializaSocio();
        stringTestada = "2722-2222";
        socio[posicao].setTelefone(stringTestada);
        assertEquals(stringTestada, socio[posicao].getTelefone());
    }

    public void testTelefoneNaoVazio(){
        inicializaSocio();
        boolean naoVazio = false;
        stringTestada = "2722-2222";
        if(!stringTestada.isEmpty()){
            socio[posicao].setNome(stringTestada);
            naoVazio = true;
        }
        assertTrue(naoVazio);
    }

    public void testNomeObrigatorio() {
        new Socio(1, "Linus", "Rua 1", "(22) 2222-2222");
        try {
            new Socio(1, "", "Rua 1", "(22) 2222-2222");
            fail("Deveria ter disparado exceção");
        }
        catch(DadosInsuficientesException e)
        {
            assertEquals(e.getMessage(), "nome");
        }
    }

}
