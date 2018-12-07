/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.ClienteDAO;
import DAO.TesteDAO;
import Entidade.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Amanda
 */
@ManagedBean
@RequestScoped
public class ClienteBean {
    
    private Cliente cliente = new Cliente();
    private List<Cliente> clientes = new ArrayList<>();
    private TesteDAO dao = new TesteDAO();
    
    public void adiciona(){
      clientes.add(cliente); 
      dao.save();
     // cliente = new Cliente();
      
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    
}
