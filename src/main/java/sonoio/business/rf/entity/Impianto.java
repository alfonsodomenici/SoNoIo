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
@Table(name = "impianto")
public class Impianto extends BaseEntity {

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Traliccio traliccio;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Marchio marchio;

    @Column(name = "Validato")
    private Short validato;
    
    @Size(max = 2)
    @Column(name = "Dipartimento")
    private String dipartimento;
    
    @Column(name = "Tipologia")
    private Short tipologia;
    @Size(max = 50)
    @Column(name = "Comune")
    private String comune;
    @Size(max = 150)
    @Column(name = "Indirizzo")
    private String indirizzo;
    @Size(max = 2)
    @Column(name = "Provincia")
    private String provincia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "UTMX")
    private Double utmx;
    @Column(name = "UTMY")
    private Double utmy;
    @Column(name = "Quota_slm")
    private Double quotaslm;
    @Size(max = 1000)
    @Column(name = "NoteSito")
    private String noteSito;
    @Size(max = 20)
    @Column(name = "Pt_RicARP")
    private String ptRicARP;
    @Column(name = "Dt_RicARP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtRicARP;
    @Size(max = 20)
    @Column(name = "Pt_RilPar")
    private String ptRilPar;
    @Column(name = "Dt_RilPar")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtRilPar;
    @Size(max = 1)
    @Column(name = "Stato_Parere")
    private String statoParere;
    @Column(name = "ID_Utente")
    private Short iDUtente;
    @Size(max = 50)
    @Column(name = "DESC_PARERE")
    private String descParere;
    @Column(name = "Flag_Ponte")
    private Short flagPonte;
    @Column(name = "Flag_20Watt")
    private Short flag20Watt;
    @Column(name = "Flag_5Watt")
    private Short flag5Watt;
    @Column(name = "Flag_Tipo")
    private Short flagTipo;
    @Column(name = "Flag_Sistemi")
    private Short flagSistemi;
    @Column(name = "Flag_SportUnico")
    private Short flagSportUnico;
    @Column(name = "FLag_Realizzato")
    private Short fLagRealizzato;
    @Column(name = "Flag_UMTS900")
    private Short flagUMTS900;
    @Size(max = 20)
    @Column(name = "Codice_Sito")
    private String codiceSito;
    @Size(max = 20)
    @Column(name = "Pt_RicGes")
    private String ptRicGes;
    @Column(name = "Dt_RicGes")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtRicGes;
    @Column(name = "Dt_Scadenza")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtScadenza;
    @Column(name = "Dt_Realizza")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtRealizza;
    @Size(max = 30)
    @Column(name = "Protocollo_SU")
    private String protocolloSU;
    @Size(max = 50)
    @Column(name = "Comune_SU")
    private String comuneSU;
    @Size(max = 50)
    @Column(name = "NsProtocollo_SU")
    private String nsProtocolloSU;
    @Size(max = 2000)
    @Column(name = "Note_Pronuncia")
    private String notePronuncia;
    @Column(name = "ID_COSITING")
    private Integer idCositing;
    @Column(name = "Flag_SitoCaldo")
    private Short flagSitoCaldo;
    @Size(max = 20)
    @Column(name = "Pt_DetDir")
    private String ptDetDir;
    @Column(name = "Dt_ValTeo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtValTeo;
    @Size(max = 20)
    @Column(name = "Prot_Conformita")
    private String protConformita;
    @Column(name = "Data_Conformita")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataConformita;
    @Column(name = "Flag_DTX")
    private Short flagDTX;
    @Column(name = "Flag_PC")
    private Short flagPC;
    @Column(name = "Flag_AC")
    private Short flagAC;
    @Column(name = "Flag_DTT")
    private Short flagDTT;
    @Column(name = "Flag_PassDTT")
    private Short flagPassDTT;
    @Column(name = "Dt_PassDTT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtPassDTT;
    @Column(name = "Potenza_tot")
    private Double potenzatot;
    @Column(name = "Flag_DL98")
    private Short flagDL98;
    @Column(name = "HCE_MAX")
    private Double hceMax;
    @Column(name = "Flag_ValutaBozza")
    private Short flagValutaBozza;
    @Column(name = "Flag_SCIA")
    private Short flagSCIA;
    @Column(name = "Flag_Fascicolo")
    private Short flagFascicolo;
    @Size(max = 10)
    @Column(name = "FK_Doqui")
    private String fKDoqui;
    @Column(name = "Flag_ProgettoSingolo")
    private Short flagProgettoSingolo;
    @Column(name = "Flag_Richiesta87b")
    private Short flagRichiesta87b;
    @Column(name = "Flag_TariffaMisure")
    private Short flagTariffaMisure;
    @Column(name = "NSorgenti")
    private Short nSorgenti;
    @Size(max = 1000)
    @Column(name = "note_improced")
    private String noteImproced;
    @Column(name = "Flag_urgenza")
    private Short flagurgenza;

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
