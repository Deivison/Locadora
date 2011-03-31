
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.TestCase;
import junit.framework.Assert;
import locadora.CopiaFilme;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deivison
 */
public class CopiaFilmeTest extends TestCase {

    CopiaFilme[] copiaFilme = new CopiaFilme[10];
    private int inteiroTestado;
    private String stringTestada;
    private int posicao = 0;

    public void inicializarCopiaFilme(){
//        copiaFilme[posicao] = new CopiaFilme();
    }

    public void setUp(){
        copiaFilme[posicao] = new CopiaFilme();
    }

    public void testCodigo(){
        inicializarCopiaFilme();
        inteiroTestado = 10;
        copiaFilme[posicao].setCodigo(inteiroTestado);
        assertEquals(inteiroTestado, copiaFilme[posicao].getCodigo());
    }

    public void testIgualdadeAno(){
        inicializarCopiaFilme();
        inteiroTestado = 2011;
        copiaFilme[posicao].setCodigo(inteiroTestado);
        assertEquals(inteiroTestado, copiaFilme[posicao].getCodigo());
    }

    public void testQuantidadeDigitosAno(){
        inicializarCopiaFilme();
        inteiroTestado = 2011;
        int qtdeDigitos = Integer.toString(inteiroTestado).length();
        assertEquals(4, qtdeDigitos);
    }

    public void testTitulo(){
        inicializarCopiaFilme();
        stringTestada = "Avatar";
        copiaFilme[posicao].setTitulo(stringTestada);
        assertEquals(stringTestada, copiaFilme[posicao].getTitulo());
    }

    public void testGenero(){
        inicializarCopiaFilme();
        boolean generoValido;
        stringTestada = "Suspense";
        if ((stringTestada.equalsIgnoreCase("Ação"))||(stringTestada.equalsIgnoreCase("Aventura") || (stringTestada.equalsIgnoreCase("Comédia") || (stringTestada.equalsIgnoreCase("Drama") || (stringTestada.equalsIgnoreCase("Ficção Científica") || (stringTestada.equalsIgnoreCase("Suspense") || (stringTestada.equalsIgnoreCase("Terror"))))))))
        {
            generoValido = true;
            copiaFilme[posicao].setGenero(stringTestada);
        }
        else
        {
            generoValido = false;
        }
        assertTrue(generoValido);
    }

    public void testDuracao(){
        inicializarCopiaFilme();
        inteiroTestado = 120;
        copiaFilme[posicao].setDuracaoEmMinutos(inteiroTestado);
        assertEquals(inteiroTestado, copiaFilme[posicao].getDuracaoEmMinutos());
    }

    public void testDiretor(){
        inicializarCopiaFilme();
        stringTestada = "James Cameron";
        copiaFilme[posicao].setDiretor(stringTestada);
        assertEquals(stringTestada, copiaFilme[posicao].getDiretor());
    }

    public void testArtPrinc1(){
        inicializarCopiaFilme();
        stringTestada = "Sam Worthington";
        copiaFilme[posicao].setArtPrinc1(stringTestada);
        assertEquals(stringTestada, copiaFilme[posicao].getArtPrinc1());
    }

   public void testArtPrinc2(){
        inicializarCopiaFilme();
        stringTestada = "Zoë Saldaña";
        copiaFilme[posicao].setArtPrinc2(stringTestada);
        assertEquals(stringTestada, copiaFilme[posicao].getArtPrinc2());
    }

    public void testEstado(){
        inicializarCopiaFilme();
        boolean estadoValido;
        stringTestada = "Bom";
        if ((stringTestada.equalsIgnoreCase("Bom"))||(stringTestada.equalsIgnoreCase("Ruim")))
        {
            estadoValido = true;
            copiaFilme[posicao].setEstado(stringTestada);
        }
        else
        {
            estadoValido = false;
        }
        assertTrue(estadoValido);
    }

    public void testDataAquisicao() throws ParseException {
        inicializarCopiaFilme();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        String stringData = "24/01/2011";
        data = formato.parse(stringData);
        copiaFilme[posicao].setDataAquisicao(data);
        assertEquals(data, copiaFilme[posicao].getDataAquisicao());
    }
}
