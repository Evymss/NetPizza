/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Entidade.Usuario;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author mayar
 */ 

@ManagedBean

public class LoginMB {

 private Usuario usuario = new Usuario();

 

  public String doEfetuarLogin() {

    if("sakurai".equals(usuario.getLogin())

            && "123".equals(usuario.getSenha())) {

      return "Promocao.xhtml";

    } else {

      /* Cria uma mensagem. */

      FacesMessage msg = new FacesMessage("Usuário ou senha inválido!");

      /* Obtém a instancia atual do FacesContext e adiciona a mensagem de erro nele. */

      FacesContext.getCurrentInstance().addMessage("erro", msg);

      return null;

    }

  }

 

  public Usuario getUsuario() {

    return usuario;

  }

 

  public void setUsuario(Usuario usuario) {

    this.usuario = usuario;

  }
}
