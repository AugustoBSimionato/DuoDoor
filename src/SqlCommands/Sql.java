package SqlCommands;

/**
 *
 * @author Arthur Hassimyan
 */
public final class Sql {
    public final static String insertUsuario = "INSERT INTO usuario(nome, email, senha, dateCreate) VALUES (?,?,?,?)";
    public final static String selectUsuario = "SELECT * FROM usuario WHERE email = ? AND senha = ?";
    public final static String selectidLogin = "SELECT * FROM usuario WHERE idLogin = ?";
    public final static String selectLogin = "SELECT idLogin FROM usuario WHERE email = ? AND senha = ?";
    public final static String updateSenha = "UPDATE usuario SET senha = ? WHERE idLogin = ? AND senha = ?";
    public final static String deleteUsuario = "DELETE FROM usuario WHERE idLogin = ?";
    public final static String selectQuestionE = "SELECT * FROM questoes_e WHERE idPergunta IN (?, ?, ?)";
    public final static String selectQuestionM = "SELECT * FROM questoes_m WHERE idPergunta IN (?, ?, ?)";
    public final static String selectQuestionH = "SELECT * FROM questoes_h WHERE idPergunta IN (?, ?, ?)";
}
