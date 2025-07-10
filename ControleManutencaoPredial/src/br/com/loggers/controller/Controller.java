
package br.com.loggers.controller;

import br.com.loggers.model.Connect;
import br.com.loggers.model.DAO;
import br.com.loggers.view.View;
import br.com.loggers.controller.User;

import java.sql.SQLException;
import java.sql.Connection;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



public class Controller {
    
    private DAO theDAO;
    
    public Controller() {
        this.theDAO = new DAO();
    }
    
    public boolean createUser(User theUser) throws SQLException{
        return this.theDAO.createUser(theUser);
    }
    
    public User getUser(User theUser) throws SQLException {
        return this.theDAO.getUser(theUser);
    }
    
    public int countPendente(){
        return this.theDAO.countPendente();
    }
    public int countAndamento(){
        return this.theDAO.countAndamento();
    }
    public int countFinalizado(){
        return this.theDAO.countFinalizado();
    }
    public int countAgendado(){
        return this.theDAO.countAgendado();
    }
    
    public List<String> getTecnico() {
        return this.theDAO.getTecnico();
    }
    
    public List<String> getLocal() {
        return this.theDAO.getLocal();
    }
    
    public List<String> getTipoAtivo() {
        return this.theDAO.getTipoAtivo();
    }
    
    public List<String> getPeriodicidade() {
        return this.theDAO.getPeriodicidade();
    }
    
    public List<String> getOSID() {
        return this.theDAO.getOSID();
    }

    
    public int getUserId(String nome){
        return this.theDAO.getUserId(nome);
    }
    
    public int getLocalId(String nome){
        return this.theDAO.getLocalId(nome);
    }
    
    public int getAtivoTipoID(String nome){
        return this.theDAO.getAtivoTipoID(nome);
    }
    
    public int getPeriocididadeID(String nome){
        return this.theDAO.getPeriocididadeID(nome);
    }
    
    public boolean insertOS(OS ordem){
        return this.theDAO.insertOS(ordem);
    }
    
    public boolean insertAtivo(Ativo ativo){
        return this.theDAO.insertAtivo(ativo);
    }
    
    public boolean insertManutencao(Manutencao manutencao){
        return this.theDAO.insertManutencao(manutencao);
    }
    
    public DefaultTableModel getOSTable(){
        return this.theDAO.getOSTable();
    }
    
    public DefaultTableModel getManutencaoTable(){
        return this.theDAO.getManutencaoTable();
    }
    
    public DefaultTableModel getLogsTable(){
        return this.theDAO.getLogsTable();
    }
    
    public DefaultTableModel getAtivoTable(){
        return this.theDAO.getAtivoTable();
    }
    
}
