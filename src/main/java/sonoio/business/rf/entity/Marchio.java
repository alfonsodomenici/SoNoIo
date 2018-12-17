/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonoio.business.rf.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
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
    
    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Tipologia_Impianto tipologia;
           
    @Column(name = "Alfa_tdd")
    private float alfa_tdd;
    
    @Column(name = "Data_cessato")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_cessato;
    
    /*
    getter e setter
    */

    public Tipologia_Impianto getTipologia() {
        return tipologia;
    }

    public void setTipologia(Tipologia_Impianto tipologia) {
        this.tipologia = tipologia;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
    
    
}
