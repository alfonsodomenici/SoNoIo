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
import javax.validation.constraints.Size;
import sonoio.BaseEntity;

/**
 *
 * @author utente
 */
@Entity
@Table(name = "traliccio")
public class Traliccio extends BaseEntity {

    @Size(max = 250)
    @Column(name = "denominazione",length = 250)
    private String denominazione;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "utmx")
    private Double utmx;
    @Column(name = "utmy")
    private Double utmy;
    @Column(name = "quota_slm")
    private Integer quotaSlm;
    @Size(max = 50)
    @Column(name = "comune")
    private String comune;
    @Size(max = 10)
    @Column(name = "istat_comune")
    private String istatComune;
    @Size(max = 2)
    @Column(name = "provincia")
    private String provincia;
    @Size(max = 50)
    @Column(name = "tipo_via")
    private String tipoVia;
    @Size(max = 150)
    @Column(name = "nome_via")
    private String nomeVia;
    @Size(max = 15)
    @Column(name = "n_civico")
    private String nCivico;
    @Size(max = 20)
    @Column(name = "foglio")
    private String foglio;
    @Size(max = 50)
    @Column(name = "mappale")
    private String mappale;
    @Size(max = 250)
    @Column(name = "percorso")
    private String percorso;
    @Size(max = 250)
    @Column(name = "percorso_foto2")
    private String percorsoFoto2;
    @Size(max = 250)
    @Column(name = "percorso_foto3")
    private String percorsoFoto3;
    @Size(max = 250)
    @Column(name = "note_varie")
    private String noteVarie;
    @Column(name = "stato")
    private Short stato;
    @Column(name = "x_ed50")
    private Double xEd50;
    @Column(name = "y_ed50")
    private Double yEd50;
    @Column(name = "utente_ultmod")
    private Short utenteUltmod;
    @Column(name = "data_ultmod")
    private LocalDate dataUltmod;
    @Column(name = "data_cessato")
    private LocalDate dataCessato;

    /*
    getter e setter
    */

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public Double getUtmx() {
        return utmx;
    }

    public void setUtmx(Double utmx) {
        this.utmx = utmx;
    }

    public Double getUtmy() {
        return utmy;
    }

    public void setUtmy(Double utmy) {
        this.utmy = utmy;
    }

    public Integer getQuotaSlm() {
        return quotaSlm;
    }

    public void setQuotaSlm(Integer quotaSlm) {
        this.quotaSlm = quotaSlm;
    }

    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    public String getIstatComune() {
        return istatComune;
    }

    public void setIstatComune(String istatComune) {
        this.istatComune = istatComune;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTipoVia() {
        return tipoVia;
    }

    public void setTipoVia(String tipoVia) {
        this.tipoVia = tipoVia;
    }

    public String getNomeVia() {
        return nomeVia;
    }

    public void setNomeVia(String nomeVia) {
        this.nomeVia = nomeVia;
    }

    public String getnCivico() {
        return nCivico;
    }

    public void setnCivico(String nCivico) {
        this.nCivico = nCivico;
    }

    public String getFoglio() {
        return foglio;
    }

    public void setFoglio(String foglio) {
        this.foglio = foglio;
    }

    public String getMappale() {
        return mappale;
    }

    public void setMappale(String mappale) {
        this.mappale = mappale;
    }

    public String getPercorso() {
        return percorso;
    }

    public void setPercorso(String percorso) {
        this.percorso = percorso;
    }

    public String getPercorsoFoto2() {
        return percorsoFoto2;
    }

    public void setPercorsoFoto2(String percorsoFoto2) {
        this.percorsoFoto2 = percorsoFoto2;
    }

    public String getPercorsoFoto3() {
        return percorsoFoto3;
    }

    public void setPercorsoFoto3(String percorsoFoto3) {
        this.percorsoFoto3 = percorsoFoto3;
    }

    public String getNoteVarie() {
        return noteVarie;
    }

    public void setNoteVarie(String noteVarie) {
        this.noteVarie = noteVarie;
    }

    public Short getStato() {
        return stato;
    }

    public void setStato(Short stato) {
        this.stato = stato;
    }

    public Double getxEd50() {
        return xEd50;
    }

    public void setxEd50(Double xEd50) {
        this.xEd50 = xEd50;
    }

    public Double getyEd50() {
        return yEd50;
    }

    public void setyEd50(Double yEd50) {
        this.yEd50 = yEd50;
    }

    public Short getUtenteUltmod() {
        return utenteUltmod;
    }

    public void setUtenteUltmod(Short utenteUltmod) {
        this.utenteUltmod = utenteUltmod;
    }

    public LocalDate getDataUltmod() {
        return dataUltmod;
    }

    public void setDataUltmod(LocalDate dataUltmod) {
        this.dataUltmod = dataUltmod;
    }

    public LocalDate getDataCessato() {
        return dataCessato;
    }

    public void setDataCessato(LocalDate dataCessato) {
        this.dataCessato = dataCessato;
    }

}
