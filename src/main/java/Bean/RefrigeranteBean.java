/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Entidade.Refrigerante;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author mayar

public class RefrigeranteBean {

    /**
     * Creates a new instance of RefrigeranteBean
     */

@ManagedBean
@SessionScoped
public class RefrigeranteBean {

    private Refrigerante refrigerante;
    private List<Refrigerante> refrigerantes = new ArrayList<>();

    public void adicionar() {
        refrigerantes.add(refrigerante);
        refrigerante = new Refrigerante();
    }

    public Refrigerante getRefrigerante() {
        return refrigerante;
    }

    public void setRefrigerante(Refrigerante refrigerante) {
        this.refrigerante = refrigerante;
    }

    public void setRefrigerantes(List<Refrigerante> refrigerantes) {
        this.refrigerantes = refrigerantes;
    }

    public List<Refrigerante> getRefrigerantes() {
        return refrigerantes;
    }
}