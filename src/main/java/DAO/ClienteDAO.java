/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.Connection;
import Entidade.Cliente;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author mayar
 */
public class ClienteDAO {
    
    
    
    public Cliente save(Cliente cliente){
       EntityManager em = new Connection().getConnection();
        
   try{
                  
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        
    }catch(Exception e){
        System.err.println(e);
        em.getTransaction().rollback();
        
    }finally{
          em.close();  
    }
        
          return cliente;
        }
    
     public Cliente update(Cliente cliente){
         //precisa do if-else para add o merge e fazer update
         
     EntityManager em = new Connection().getConnection();
     
     try{
         em.getTransaction().begin();
         if(cliente.getId()==null){
             em.persist(cliente);
             
         }else{
             em.merge(cliente);
         }
         em.getTransaction().commit();
         
     }catch(Exception e){
          System.err.println(e);
         em.getTransaction().rollback();
         
     }finally{
         em.close();
     }
     
        return cliente;
     
     

}
     
      public Cliente selectById(Integer id){
         //vai buscar segundo o id passado por parametro
         
     EntityManager em = new Connection().getConnection();
     Cliente endereco= null;
     
     
     try{
         
        endereco= em.find(Cliente.class,id );
        
         
     }catch(Exception e){
         System.err.println(e);
     }finally{
         em.close();
     }
     
        return endereco;
     
     

}
      
      public List<Cliente> selectAll(){
          
           EntityManager em = new Connection().getConnection();
           List<Cliente> enderecos = null;
           
           try{
               enderecos = em.createQuery("from Endereco e").getResultList();
               
           }catch(Exception e){
               System.err.println(e);
           }finally{
               em.close();
           }
           return  enderecos;
      }
      
      public Cliente remove(Integer id){
          
          EntityManager em = new Connection().getConnection();
          Cliente endereco=null;
          
          
          try{
              endereco = em.find(Cliente.class, id);
              
              em.getTransaction().begin();
              em.remove(endereco);
              em.getTransaction().commit();
              
          }catch(Exception e ){
              
              System.err.println(e);
              em.getTransaction().rollback();
              
          }finally{
              em.close();
          }
          return endereco;
      }
    
}
