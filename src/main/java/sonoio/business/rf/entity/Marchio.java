/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonoio.business.rf.entity;

import java.time.LocalDate;
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
public class Marchio extends BaseEntity {

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Proprietario proprietario;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private TipologiaImpianto tipologia;

    private String denominazione;

    @Column(name = "data_cessato")
    private LocalDate dataCessato;
    
    @Column(name = "alfa_tdd")
    private Double alfaTdd;
    /*
    getter e setter
     */
    public TipologiaImpianto getTipologia() {
        return tipologia;
    }

    public void setTipologia(TipologiaImpianto tipologia) {
        this.tipologia = tipologia;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public LocalDate getDataCessato() {
        return dataCessato;
    }

    public void setDataCessato(LocalDate dataCessato) {
        this.dataCessato = dataCessato;
    }

    public Double getAlfaTdd() {
        return alfaTdd;
    }

    public void setAlfaTdd(Double alfaTdd) {
        this.alfaTdd = alfaTdd;
    }

    
}
