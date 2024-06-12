package DAOs;

import Model.Questoes;
import Model.Usuario;
import SqlCommands.Sql;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Arthur Hassimyan
 */
public class SpecificDAO extends GenericDAO {

    public static boolean insertUsuario(Usuario usu) throws SQLException {
        prepStat(Sql.insertUsuario, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        pstdados.setString(1, usu.getNome());
        pstdados.setString(2, usu.getEmail());
        pstdados.setString(3, usu.getSenha());
        pstdados.setString(4, usu.getDate());
        return genericUpdate();
    }

    public static boolean updateSenha(int idLogin, String atual, String nova) throws SQLException {
        prepStat(Sql.updateSenha, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        pstdados.setString(1, nova);
        pstdados.setInt(2, idLogin);
        pstdados.setString(3, atual);
        return genericUpdate();
    }

    public static boolean logUsuario(String email, String senha) {
        try {
            prepStat(Sql.selectUsuario, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pstdados.setString(1, email);
            pstdados.setString(2, senha);
            return genericQuery();
        } catch (SQLException erro) {
            System.out.println("Erro ao executar consulta = " + erro);
        }
        return false;
    }

    public static boolean loadSettings(int idLogin) {
        try {
            prepStat(Sql.selectidLogin, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pstdados.setInt(1, idLogin);
            return genericQuery();
        } catch (SQLException erro) {
            System.out.println("Erro ao executar consulta = " + erro);
        }
        return false;
    }

    public static boolean loadIdQuestion(String sql, int[] vetor) {
        try {
            prepStat(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pstdados.setInt(1, vetor[0]);
            pstdados.setInt(2, vetor[1]);
            pstdados.setInt(3, vetor[2]);
            return genericQuery();
        } catch (SQLException erro) {
            System.out.println("Erro ao executar consulta = " + erro);
        }
        return false;
    }

    public static ArrayList<Questoes> loadQuestion() throws SQLException {
        ArrayList<Questoes> questoes = new ArrayList<>();
        rsdados.first();
        for (int i = 0; i < 3; i++) {
            Questoes quest = new Questoes();
            quest.setPergunta(rsdados.getString("pergunta"));
            quest.setResposta(rsdados.getString("resposta"));
            rsdados.next();
            questoes.add(quest);
        }
        return questoes;
    }

    public static int getIdLoginBD() throws SQLException {
        rsdados.first();
        return rsdados.getInt("idLogin");
    }

    public static String getUsuario() throws SQLException {
        rsdados.first();
        return rsdados.getString("nome");
    }

    public static String getEmail() throws SQLException {
        rsdados.first();
        return rsdados.getString("email");
    }

    public static Date getDate() throws SQLException {
        rsdados.first();
        return rsdados.getDate("dateCreate");
    }

    public static boolean deleteUsuarioByEmail(String email) throws SQLException {
        prepStat("DELETE FROM usuario WHERE email = ?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        pstdados.setString(1, email);
        return genericUpdate();
    }
    
    public static void initializeResultSet(String sql) throws SQLException {
        prepStat(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        genericQuery(); // Assuming this method executes the query and initializes rsdados
    }

}
