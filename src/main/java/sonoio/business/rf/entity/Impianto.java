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
@Table(name = "impianto")
public class Impianto extends BaseEntity {

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Traliccio traliccio;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Marchio marchio;

    /*
    getter e setter
     */
    public Traliccio getTraliccio() {
        return traliccio;
    }

    public void setTraliccio(Traliccio traliccio) {
        this.traliccio = traliccio;
    }

    public Marchio getMarchio() {
        return marchio;
    }

    public void setMarchio(Marchio marchio) {
        this.marchio = marchio;
    }

}
