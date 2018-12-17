/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonoio.business.rf.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import sonoio.BaseEntity;

/**
 *
 * @author utente
 */
@Entity
@Table(name = "tipo_gestore")
public class TipoGestore extends BaseEntity {

    private String denominazione;

    /*
    getter e setter
    */

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }
    
    
}
