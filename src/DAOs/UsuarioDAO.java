package DAOs;

import Model.Usuario;
import SqlCommands.Sql;
import Utils.JDBCUtil;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Arthur Hassimyan
 */
public class UsuarioDAO {

    private Connection connection = null;
    private PreparedStatement pstdados = null;
    private ResultSet rsdados = null;
    private static final String path = System.getProperty("user.dir");
    private static final File config_file = new File(path + "/src/Utils/configuracaobd.properties");

    

//    public boolean closeAll() {
//        try {
//            pstdados.close();
//            rsdados.close();
//            return true;
//        } catch (SQLException erro) {
//            System.out.println("Falha na conexao, comando sql = " + erro);
//        }
//        return false;
//    }
    public boolean closeAll() {
        try {
            if (pstdados != null) {
                pstdados.close();
            }
            if (rsdados != null) {
                rsdados.close();
            }
            return true;
        } catch (SQLException erro) {
            System.out.println("Falha ao fechar os recursos: " + erro.getMessage());
            return false;
        }
    }

    public boolean emailExist(String email) {
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(Sql.selectUsuario, tipo, concorrencia);
            pstdados.setString(1, email);
            rsdados = pstdados.executeQuery();
            return rsdados.next();
        } catch (SQLException e) {
            System.out.println("Erro ao verificar o email: " + e.getMessage());
        }
        return false;
    }

    public boolean cadastroUsuario(Usuario usu) {
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(Sql.insertUsuario, tipo, concorrencia);
            pstdados.setString(1, usu.getNome());
            pstdados.setString(2, usu.getEmail());
            pstdados.setString(3, usu.getSenha());
            pstdados.setString(4, usu.getDate());
            int resposta = pstdados.executeUpdate();
            pstdados.close();
            if (resposta == 1) {
                connection.commit();
                return true;
            } else {
                connection.rollback();
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao verificar o email: " + e.getMessage());
        }
        return false;
    }

    public boolean logUsuario(String email, String senha) {
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(Sql.selectLogin, tipo, concorrencia);
            pstdados.setString(1, email);
            pstdados.setString(2, senha);
            rsdados = pstdados.executeQuery();
            return rsdados.next();
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
        }
        return false;
    }

    public int getIdLoginBD() throws SQLException {
        rsdados.first();
        int id = rsdados.getInt("idLogin");
        return id;
    }

//    public boolean deletarUsuario(int id) {
//        try {
//            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
//            int concorrencia = ResultSet.CONCUR_UPDATABLE;
//            pstdados = connection.prepareStatement(Sql.deleteUsuario, tipo, concorrencia);
//            pstdados.setInt(1, id);
//            int resposta = pstdados.executeUpdate();
//            pstdados.close();
//            if (resposta == 1) {
//                connection.commit();
//                return true;
//            } else {
//                connection.rollback();
//                return false;
//            }
//        } catch (SQLException e) {
//            System.out.println("Erro ao deletar o usuário: " + e.getMessage());
//        }
//        return false;
//    }
}
