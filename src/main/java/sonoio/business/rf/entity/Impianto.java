/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonoio.business.rf.entity;

import java.time.LocalDate;
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
@Table(name = "impianto")
public class Impianto extends BaseEntity {

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Traliccio traliccio;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Marchio marchio;

    @Column(name = "validato")
    private Short validato;
    @Size(max = 2)
    @Column(name = "dipartimento")
    private String dipartimento;

    @ManyToOne
    @JoinColumn(name = "fk_gestore_old")
    private Marchio marchioOld;

    @Column(name = "tipologia")
    private Short tipologia;
    @Size(max = 50)
    @Column(name = "comune")
    private String comune;
    @Size(max = 150)
    @Column(name = "Indirizzo")
    private String indirizzo;
    @Size(max = 2)
    @Column(name = "provincia")
    private String provincia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "utmx")
    private Double utmx;
    @Column(name = "utmy")
    private Double utmy;
    @Column(name = "quota_slm")
    private Double quotaSlm;
    @Size(max = 1000)
    @Column(name = "notesito")
    private String notesito;
    @Size(max = 20)
    @Column(name = "pt_ricarp")
    private String ptRicarp;
    @Column(name = "dt_ricarp")
    private LocalDate dtRicarp;
    @Size(max = 20)
    @Column(name = "pt_rilpar")
    private String ptRilpar;
    @Column(name = "dt_rilpar")
    private LocalDate dtRilpar;
    @Size(max = 1)
    @Column(name = "stato_parere")
    private String statoParere;
    @ManyToOne
    @JoinColumn(name = "id_utente")
    private Utente utente;
    @Size(max = 50)
    @Column(name = "desc_parere")
    private String descParere;
    @Column(name = "flag_ponte")
    private Short flagPonte;
    @Column(name = "flag_20watt")
    private Short flag20watt;
    @Column(name = "flag_5watt")
    private Short flag5watt;
    @Column(name = "flag_tipo")
    private Short flagTipo;
    @Column(name = "flag_sistemi")
    private Short flagSistemi;
    @Column(name = "flag_sportunico")
    private Short flagSportunico;
    @Column(name = "flag_realizzato")
    private Short flagRealizzato;
    @Column(name = "flag_umts900")
    private Short flagUmts900;
    @Size(max = 20)
    @Column(name = "codice_sito")
    private String codiceSito;
    @Size(max = 20)
    @Column(name = "pt_ricges")
    private String ptRicges;
    @Column(name = "dt_ricges")

    private LocalDate dtRicges;
    @Column(name = "dt_scadenza")

    private LocalDate dtScadenza;
    @Column(name = "dt_realizza")

    private LocalDate dtRealizza;
    @Size(max = 30)
    @Column(name = "protocollo_su")
    private String protocolloSu;
    @Size(max = 50)
    @Column(name = "comune_su")
    private String comuneSu;
    @Size(max = 50)
    @Column(name = "nsprotocollo_su")
    private String nsprotocolloSu;
    @Size(max = 2000)
    @Column(name = "note_pronuncia")
    private String notePronuncia;
    @Column(name = "flag_sitocaldo")
    private Short flagSitocaldo;
    @Size(max = 20)
    @Column(name = "pt_detdir")
    private String ptDetdir;
    @Column(name = "dt_valteo")

    private LocalDate dtValteo;
    @Size(max = 20)
    @Column(name = "prot_conformita")
    private String protConformita;
    @Column(name = "data_conformita")

    private LocalDate dataConformita;
    @Column(name = "flag_dtx")
    private Short flagDtx;
    @Column(name = "flag_pc")
    private Short flagPc;
    @Column(name = "flag_ac")
    private Short flagAc;
    @Column(name = "flag_dtt")
    private Short flagDtt;
    @Column(name = "flag_passdtt")
    private Short flagPassdtt;
    @Column(name = "dt_passdtt")

    private LocalDate dtPassdtt;
    @Column(name = "potenza_tot")
    private Double potenzaTot;
    @Column(name = "data_ultmod")
    private LocalDate dataUltmod;
    @Column(name = "data_cessato")
    private LocalDate dataCessato;
    @Column(name = "flag_dl98")
    private Short flagDl98;
    @Column(name = "hce_max")
    private Double hceMax;
    @Column(name = "flag_valutabozza")
    private Short flagValutabozza;
    @Column(name = "flag_scia")
    private Short flagScia;
    @Column(name = "flag_fascicolo")
    private Short flagFascicolo;
    @Size(max = 10)
    @Column(name = "fk_doqui")
    private String fkDoqui;
    @Column(name = "flag_progettosingolo")
    private Short flagProgettosingolo;
    @Column(name = "flag_richiesta87b")
    private Short flagRichiesta87b;
    @Column(name = "flag_tariffamisure")
    private Short flagTariffamisure;
    @Column(name = "nsorgenti")
    private Short nsorgenti;
    @Size(max = 1000)
    @Column(name = "note_improced")
    private String noteImproced;
    @Column(name = "flag_urgenza")
    private Short flagUrgenza;

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

    public Short getValidato() {
        return validato;
    }

    public void setValidato(Short validato) {
        this.validato = validato;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }

    public Marchio getMarchioOld() {
        return marchioOld;
    }

    public void setMarchioOld(Marchio marchioOld) {
        this.marchioOld = marchioOld;
    }

    public Short getTipologia() {
        return tipologia;
    }

    public void setTipologia(Short tipologia) {
        this.tipologia = tipologia;
    }

    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
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

    public Double getQuotaSlm() {
        return quotaSlm;
    }

    public void setQuotaSlm(Double quotaSlm) {
        this.quotaSlm = quotaSlm;
    }

    public String getNotesito() {
        return notesito;
    }

    public void setNotesito(String notesito) {
        this.notesito = notesito;
    }

    public String getPtRicarp() {
        return ptRicarp;
    }

    public void setPtRicarp(String ptRicarp) {
        this.ptRicarp = ptRicarp;
    }

    public LocalDate getDtRicarp() {
        return dtRicarp;
    }

    public void setDtRicarp(LocalDate dtRicarp) {
        this.dtRicarp = dtRicarp;
    }

    public String getPtRilpar() {
        return ptRilpar;
    }

    public void setPtRilpar(String ptRilpar) {
        this.ptRilpar = ptRilpar;
    }

    public LocalDate getDtRilpar() {
        return dtRilpar;
    }

    public void setDtRilpar(LocalDate dtRilpar) {
        this.dtRilpar = dtRilpar;
    }

    public String getStatoParere() {
        return statoParere;
    }

    public void setStatoParere(String statoParere) {
        this.statoParere = statoParere;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public String getDescParere() {
        return descParere;
    }

    public void setDescParere(String descParere) {
        this.descParere = descParere;
    }

    public Short getFlagPonte() {
        return flagPonte;
    }

    public void setFlagPonte(Short flagPonte) {
        this.flagPonte = flagPonte;
    }

    public Short getFlag20watt() {
        return flag20watt;
    }

    public void setFlag20watt(Short flag20watt) {
        this.flag20watt = flag20watt;
    }

    public Short getFlag5watt() {
        return flag5watt;
    }

    public void setFlag5watt(Short flag5watt) {
        this.flag5watt = flag5watt;
    }

    public Short getFlagTipo() {
        return flagTipo;
    }

    public void setFlagTipo(Short flagTipo) {
        this.flagTipo = flagTipo;
    }

    public Short getFlagSistemi() {
        return flagSistemi;
    }

    public void setFlagSistemi(Short flagSistemi) {
        this.flagSistemi = flagSistemi;
    }

    public Short getFlagSportunico() {
        return flagSportunico;
    }

    public void setFlagSportunico(Short flagSportunico) {
        this.flagSportunico = flagSportunico;
    }

    public Short getFlagRealizzato() {
        return flagRealizzato;
    }

    public void setFlagRealizzato(Short flagRealizzato) {
        this.flagRealizzato = flagRealizzato;
    }

    public Short getFlagUmts900() {
        return flagUmts900;
    }

    public void setFlagUmts900(Short flagUmts900) {
        this.flagUmts900 = flagUmts900;
    }

    public String getCodiceSito() {
        return codiceSito;
    }

    public void setCodiceSito(String codiceSito) {
        this.codiceSito = codiceSito;
    }

    public String getPtRicges() {
        return ptRicges;
    }

    public void setPtRicges(String ptRicges) {
        this.ptRicges = ptRicges;
    }

    public LocalDate getDtRicges() {
        return dtRicges;
    }

    public void setDtRicges(LocalDate dtRicges) {
        this.dtRicges = dtRicges;
    }

    public LocalDate getDtScadenza() {
        return dtScadenza;
    }

    public void setDtScadenza(LocalDate dtScadenza) {
        this.dtScadenza = dtScadenza;
    }

    public LocalDate getDtRealizza() {
        return dtRealizza;
    }

    public void setDtRealizza(LocalDate dtRealizza) {
        this.dtRealizza = dtRealizza;
    }

    public String getProtocolloSu() {
        return protocolloSu;
    }

    public void setProtocolloSu(String protocolloSu) {
        this.protocolloSu = protocolloSu;
    }

    public String getComuneSu() {
        return comuneSu;
    }

    public void setComuneSu(String comuneSu) {
        this.comuneSu = comuneSu;
    }

    public String getNsprotocolloSu() {
        return nsprotocolloSu;
    }

    public void setNsprotocolloSu(String nsprotocolloSu) {
        this.nsprotocolloSu = nsprotocolloSu;
    }

    public String getNotePronuncia() {
        return notePronuncia;
    }

    public void setNotePronuncia(String notePronuncia) {
        this.notePronuncia = notePronuncia;
    }

    public Short getFlagSitocaldo() {
        return flagSitocaldo;
    }

    public void setFlagSitocaldo(Short flagSitocaldo) {
        this.flagSitocaldo = flagSitocaldo;
    }

    public String getPtDetdir() {
        return ptDetdir;
    }

    public void setPtDetdir(String ptDetdir) {
        this.ptDetdir = ptDetdir;
    }

    public LocalDate getDtValteo() {
        return dtValteo;
    }

    public void setDtValteo(LocalDate dtValteo) {
        this.dtValteo = dtValteo;
    }

    public String getProtConformita() {
        return protConformita;
    }

    public void setProtConformita(String protConformita) {
        this.protConformita = protConformita;
    }

    public LocalDate getDataConformita() {
        return dataConformita;
    }

    public void setDataConformita(LocalDate dataConformita) {
        this.dataConformita = dataConformita;
    }

    public Short getFlagDtx() {
        return flagDtx;
    }

    public void setFlagDtx(Short flagDtx) {
        this.flagDtx = flagDtx;
    }

    public Short getFlagPc() {
        return flagPc;
    }

    public void setFlagPc(Short flagPc) {
        this.flagPc = flagPc;
    }

    public Short getFlagAc() {
        return flagAc;
    }

    public void setFlagAc(Short flagAc) {
        this.flagAc = flagAc;
    }

    public Short getFlagDtt() {
        return flagDtt;
    }

    public void setFlagDtt(Short flagDtt) {
        this.flagDtt = flagDtt;
    }

    public Short getFlagPassdtt() {
        return flagPassdtt;
    }

    public void setFlagPassdtt(Short flagPassdtt) {
        this.flagPassdtt = flagPassdtt;
    }

    public LocalDate getDtPassdtt() {
        return dtPassdtt;
    }

    public void setDtPassdtt(LocalDate dtPassdtt) {
        this.dtPassdtt = dtPassdtt;
    }

    public Double getPotenzaTot() {
        return potenzaTot;
    }

    public void setPotenzaTot(Double potenzaTot) {
        this.potenzaTot = potenzaTot;
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

    public Short getFlagDl98() {
        return flagDl98;
    }

    public void setFlagDl98(Short flagDl98) {
        this.flagDl98 = flagDl98;
    }

    public Double getHceMax() {
        return hceMax;
    }

    public void setHceMax(Double hceMax) {
        this.hceMax = hceMax;
    }

    public Short getFlagValutabozza() {
        return flagValutabozza;
    }

    public void setFlagValutabozza(Short flagValutabozza) {
        this.flagValutabozza = flagValutabozza;
    }

    public Short getFlagScia() {
        return flagScia;
    }

    public void setFlagScia(Short flagScia) {
        this.flagScia = flagScia;
    }

    public Short getFlagFascicolo() {
        return flagFascicolo;
    }

    public void setFlagFascicolo(Short flagFascicolo) {
        this.flagFascicolo = flagFascicolo;
    }

    public String getFkDoqui() {
        return fkDoqui;
    }

    public void setFkDoqui(String fkDoqui) {
        this.fkDoqui = fkDoqui;
    }

    public Short getFlagProgettosingolo() {
        return flagProgettosingolo;
    }

    public void setFlagProgettosingolo(Short flagProgettosingolo) {
        this.flagProgettosingolo = flagProgettosingolo;
    }

    public Short getFlagRichiesta87b() {
        return flagRichiesta87b;
    }

    public void setFlagRichiesta87b(Short flagRichiesta87b) {
        this.flagRichiesta87b = flagRichiesta87b;
    }

    public Short getFlagTariffamisure() {
        return flagTariffamisure;
    }

    public void setFlagTariffamisure(Short flagTariffamisure) {
        this.flagTariffamisure = flagTariffamisure;
    }

    public Short getNsorgenti() {
        return nsorgenti;
    }

    public void setNsorgenti(Short nsorgenti) {
        this.nsorgenti = nsorgenti;
    }

    public String getNoteImproced() {
        return noteImproced;
    }

    public void setNoteImproced(String noteImproced) {
        this.noteImproced = noteImproced;
    }

    public Short getFlagUrgenza() {
        return flagUrgenza;
    }

    public void setFlagUrgenza(Short flagUrgenza) {
        this.flagUrgenza = flagUrgenza;
    }

}
