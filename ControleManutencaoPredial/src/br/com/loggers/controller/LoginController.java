
package br.com.loggers.controller;

import br.com.loggers.model.Connect;
import br.com.loggers.model.LoginDAO;
import br.com.loggers.view.View;
import br.com.loggers.controller.User;

import java.sql.SQLException;
import java.sql.Connection;



public class LoginController {
    
    /**public void cadastroUsuario(View view) throws SQLException{
        Connection conexao = new Connect().conectar();
        LoginDAO cadastro = new LoginDAO();
        cadastro.cadastrarUsuario(view.getjTextField3().getText(), view.getjTextField2().getText(), view.getjPasswordField2().getText());
        
    }**/
    
    

    User user = new User();

    public boolean loginUsuario(View view) throws SQLException {
        Connection conexao = new Connect().conectar();
        LoginDAO login = new LoginDAO();
        if(login.login(view.getjTextFieldEmail().getText(), view.getjPasswordFieldSenha().getText())){
            String[] data = login.getData(view.getjTextFieldEmail().getText());
            user.setData(data[0], data[1], data[2]);
            System.out.println(user.getNome());
            return true;
        }else{
            return false;
        }
    }

    public User getUser() {
        return user;
    }
    
}
