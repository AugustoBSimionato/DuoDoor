package DAOs;

import Model.Usuario;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.SQLException;

public class SpecificDAOTest {

    @BeforeClass
    public static void setup() {
        SpecificDAO.CriaConexao();
    }

    @Test
    public void testInsertUsuario() {
        System.out.println("\nTest: insertUsuario");
        try {
            SpecificDAO.deleteUsuarioByEmail("testuser@example.com");

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String currentDate = sdf.format(new Date());
            Usuario usu = new Usuario("Test User", "testuser@example.com", "password123", currentDate);
            boolean result = SpecificDAO.insertUsuario(usu);
            assertTrue("Falha ao inserir o usuário", result);
        } catch (SQLException e) {
            fail("Erro ao inserir usuário: " + e.getMessage());
        }
    }

    @Test
    public void testUpdateSenha() {
        System.out.println("\nTest: updateSenha");
        try {
            int idLogin = 18;
            String atual = "password123";
            String nova = "newpassword123";
            boolean result = SpecificDAO.updateSenha(idLogin, atual, nova);
            assertTrue("Falha ao atualizar a senha", result);
        } catch (SQLException e) {
            fail("Erro ao atualizar a senha: " + e.getMessage());
        }
    }

    @Test
    public void testLogUsuario() {
        System.out.println("\nTest: logUsuario");
        String email = "testuser@example.com";
        String senha = "password123";
        boolean result = SpecificDAO.logUsuario(email, senha);
        assertTrue("Falha ao logar o usuário", result);
    }

    @Test
    public void testLoadSettings() {
        System.out.println("\nTest: loadSettings");
        int idLogin = 1;
        boolean result = SpecificDAO.loadSettings(idLogin);
        assertTrue("Falha ao carregar configurações do usuário", result);
    }

    @Test
    public void testGetUsuario() {
        System.out.println("\nTest: getUsuario");
        try {
            String sql = "SELECT nome FROM usuario WHERE email = 'testuser@example.com'";
            SpecificDAO.initializeResultSet(sql);
            String result = SpecificDAO.getUsuario();
            assertNotNull("Falha ao obter nome do usuário", result);
            assertFalse("Nome do usuário vazio", result.isEmpty());
        } catch (SQLException e) {
            fail("Erro ao obter nome do usuário: " + e.getMessage());
        }
    }

    @Test
    public void testGetEmail() {
        System.out.println("\nTest: getEmail");
        try {
            String sql = "SELECT email FROM usuario WHERE email = 'testuser@example.com'";
            SpecificDAO.initializeResultSet(sql);
            String result = SpecificDAO.getEmail();
            assertNotNull("Falha ao obter email do usuário", result);
            assertFalse("Email do usuário vazio", result.isEmpty());
        } catch (SQLException e) {
            fail("Erro ao obter email do usuário: " + e.getMessage());
        }
    }

    @Test
    public void testGetDate() {
        System.out.println("\nTest: getDate");
        try {
            String sql = "SELECT dateCreate FROM usuario WHERE email = 'testuser@example.com'";
            SpecificDAO.initializeResultSet(sql);
            Date result = SpecificDAO.getDate();
            assertNotNull("Falha ao obter data de criação do usuário", result);
        } catch (SQLException e) {
            fail("Erro ao obter data de criação do usuário: " + e.getMessage());
        }
    }

}
