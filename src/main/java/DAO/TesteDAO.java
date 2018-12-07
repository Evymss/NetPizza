package DAO;

import Connection.Connection;
import Entidade.Cliente;

public class TesteDAO {
    
    public Cliente save() {
        try {
            Connection c = new Connection();
        } catch (Exception e) {
            System.out.println("ERROOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        }
        
        System.out.println("ok");
        return new Cliente();
    }
}
