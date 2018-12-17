/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonoio.business.rf.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "proprietario")
public class Proprietario extends BaseEntity {
    
   @Size(max = 100)
    @Column(name = "denominazione")
    private String denominazione;
    @Size(max = 50)
    @Column(name = "indirizzo")
    private String indirizzo;
    @Size(max = 5)
    @Column(name = "cap")
    private String cap;
    @Size(max = 50)
    @Column(name = "comune")
    private String comune;
    @Size(max = 2)
    @Column(name = "provincia")
    private String provincia;
    @Size(max = 100)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 50)
    @Column(name = "referente")
    private String referente;
    @Size(max = 50)
    @Column(name = "codice_fiscale")
    private String codiceFiscale;
    @Size(max = 20)
    @Column(name = "partita_iva")
    private String partitaIva;
    @Size(max = 100)
    @Column(name = "pec")
    private String pec;
    @Size(max = 50)
    @Column(name = "legale_rappres")
    private String legaleRappres;
    @Size(max = 50)
    @Column(name = "referente_pareri")
    private String referentePareri;
    @Size(max = 50)
    @Column(name = "amministratore")
    private String amministratore;
    @Size(max = 50)
    @Column(name = "rif_tecnico")
    private String rifTecnico;
    @Column(name = "flag_conpratica")
    private Short flagConpratica;
    @Column(name = "flag_soccorso")
    private Short flagSoccorso;
    @Column(name = "data_cessato")
    
    private LocalDate dataCessato;
    @Column(name = "data_ultmod")
    
    private LocalDate dataUltmod;

    /*
    getter e setter
    */

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getReferente() {
        return referente;
    }

    public void setReferente(String referente) {
        this.referente = referente;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getPartitaIva() {
        return partitaIva;
    }

    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }

    public String getPec() {
        return pec;
    }

    public void setPec(String pec) {
        this.pec = pec;
    }

    public String getLegaleRappres() {
        return legaleRappres;
    }

    public void setLegaleRappres(String legaleRappres) {
        this.legaleRappres = legaleRappres;
    }

    public String getReferentePareri() {
        return referentePareri;
    }

    public void setReferentePareri(String referentePareri) {
        this.referentePareri = referentePareri;
    }

    public String getAmministratore() {
        return amministratore;
    }

    public void setAmministratore(String amministratore) {
        this.amministratore = amministratore;
    }

    public String getRifTecnico() {
        return rifTecnico;
    }

    public void setRifTecnico(String rifTecnico) {
        this.rifTecnico = rifTecnico;
    }

    public Short getFlagConpratica() {
        return flagConpratica;
    }

    public void setFlagConpratica(Short flagConpratica) {
        this.flagConpratica = flagConpratica;
    }

    public Short getFlagSoccorso() {
        return flagSoccorso;
    }

    public void setFlagSoccorso(Short flagSoccorso) {
        this.flagSoccorso = flagSoccorso;
    }

    public LocalDate getDataCessato() {
        return dataCessato;
    }

    public void setDataCessato(LocalDate dataCessato) {
        this.dataCessato = dataCessato;
    }

    public LocalDate getDataUltmod() {
        return dataUltmod;
    }

    public void setDataUltmod(LocalDate dataUltmod) {
        this.dataUltmod = dataUltmod;
    }
    
    
}
