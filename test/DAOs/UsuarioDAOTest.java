package DAOs;

import Model.Usuario;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author augustosimionato
 */
public class UsuarioDAOTest {

    /**
     * Test of criaConexao method, of class UsuarioDAO.
     */
    @Test
    public void testCriaConexao() {
        System.out.println("Test: criaConexao");
        UsuarioDAO instance = new UsuarioDAO();
        boolean expResult = true;
        boolean result = instance.criaConexao();
        assertEquals(expResult, result); //OK
    }

    /**
     * Test of closeAll method, of class UsuarioDAO.
     */
    @Test
    public void testCloseAll() {
        System.out.println("\nTest: closeAll");
        UsuarioDAO instance = new UsuarioDAO();

        assertTrue("Falha ao criar conexão", instance.criaConexao());

        assertTrue("Falha ao fechar os recursos", instance.closeAll()); //OK
    }

    /**
     * Test of emailExist method, of class UsuarioDAO.
     */
    @Test
    public void testEmailExist() {
        System.out.println("\nTest: emailExist");

        String email = "email_inexistente@example.com";

        UsuarioDAO instance = new UsuarioDAO();

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String currentDate = sdf.format(new Date());

            Usuario novoUsuario = new Usuario("Nome", email, "senha", currentDate);
            instance.criaConexao();
            instance.cadastroUsuario(novoUsuario);
        } catch (Exception e) {
            fail("Falha ao inserir o usuário de teste: " + e.getMessage());
        }

        boolean expResult = true;
        boolean result = instance.emailExist(email);
        assertEquals(expResult, result); //OK
    }

    /**
     * Test of cadastroUsuario method, of class UsuarioDAO.
     */
    @Test
    public void testCadastroUsuario() {
        System.out.println("\nTest: cadastroUsuario");

        Usuario usu = new Usuario("Novo Usuario", "novousuario@example.com", "senha123", "2024-05-24");

        UsuarioDAO instance = new UsuarioDAO();
        instance.criaConexao();

        boolean expResult = true;
        boolean result = instance.cadastroUsuario(usu);

        assertEquals(expResult, result); //OK
    }

    /**
     * Test of logUsuario method, of class UsuarioDAO.
     */
    @Test
    public void testLogUsuario() {
        System.out.println("\nTest: logUsuario");

        String email = "asd";
        String senha = "asd";

        UsuarioDAO instance = new UsuarioDAO();
        instance.criaConexao();

        boolean expResult = true;
        boolean result = instance.logUsuario(email, senha);

        assertEquals(expResult, result); //OK
    }

}
