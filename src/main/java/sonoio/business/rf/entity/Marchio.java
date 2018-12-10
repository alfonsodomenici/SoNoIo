/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonoio.business.rf.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import sonoio.BaseEntity;

/**
 *
 * @author utente
 */
@Entity
@Table(name = "marchio")
public class Marchio extends BaseEntity{
    
    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Proprietario proprietario;
    
    /*
    getter e setter
    */

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
    
    
}
