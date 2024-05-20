/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SqlCommands;

/**
 *
 * @author Arthur Hassimyan
 */
public final class Sql {
    public final static String insertUsuario = "INSERT INTO usuario(nome, email, senha, dateCreate) VALUES (?,?,?,?)";
    public final static String selectUsuario = "SELECT * FROM usuario WHERE email = ?";
    public final static String selectLogin = "SELECT idLogin FROM usuario WHERE email = ? AND senha = ?";
}
