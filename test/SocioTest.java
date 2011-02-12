
import java.util.Date;
import junit.framework.*;
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
     public void testLocarFilme(int codigo, int inscricao, Date data_emprestimo){
         Socio socio = new Socio();
         socio.locarFilme(codigo, inscricao, data_emprestimo);
}
}
