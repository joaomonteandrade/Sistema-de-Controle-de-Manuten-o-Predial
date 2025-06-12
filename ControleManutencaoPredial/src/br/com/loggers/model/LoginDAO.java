/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.loggers.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import br.com.loggers.model.Connect;
/**
 *
 * @author Aluno
 */
public class LoginDAO {
    public void cadastrarUsuario(String nome, String email, String senha) throws SQLException{
        Connection conexao = new Connect().conectar();
        String sql = "INSERT INTO user(nome, email, senha) VALUES ('"+nome+"', '"+email+"', '"+senha+"')";
        PreparedStatement state = conexao.prepareStatement(sql);
        state.execute();
        conexao.close();
    }
    public boolean login(String email, String senha) throws SQLException{
        Connection conexao = new Connect().conectar();
        String sql = "SELECT email,senha FROM user WHERE email = '"+email+"' AND senha = '"+senha+"'";
        PreparedStatement state = conexao.prepareStatement(sql);
        ResultSet rs = state.executeQuery();
        
        if(rs.next()){
            conexao.close();
            return true;
        } else {
            conexao.close();
            return false;
        }
    }
    public String[] getData(String email) throws SQLException{
        Connection conexao = new Connect().conectar();
        String sql = "SELECT * FROM user WHERE email = '"+email+"'";
        PreparedStatement state = conexao.prepareStatement(sql);
        ResultSet rs = state.executeQuery();
        if(rs.next()){
            String nome = rs.getString("nome");
            String emailhere = rs.getString("email");
            String senha = rs.getString("senha");
            conexao.close();
            return new String[]{nome, emailhere, senha};
        }else{
            conexao.close();
            return new String[]{"", "", ""};
        }
    }
}
