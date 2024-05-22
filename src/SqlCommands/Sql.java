package SqlCommands;

/**
 *
 * @author Arthur Hassimyan
 */
public final class Sql {
    public final static String insertUsuario = "INSERT INTO usuario(nome, email, senha, dateCreate) VALUES (?,?,?,?)";
    public final static String selectUsuario = "SELECT * FROM usuario WHERE email = ?";
    public final static String selectLogin = "SELECT idLogin FROM usuario WHERE email = ? AND senha = ?";
    public final static String deleteUsuario = "DELETE FROM usuario WHERE idLogin = ?";
}
