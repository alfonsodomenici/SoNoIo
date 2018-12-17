/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonoio.business.rf.entity;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import sonoio.BaseEntity;

/**
 *
 * @author utente
 */
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = Sorgente.FIND_ALL,
            query = "select e from Sorgente e ORDER BY e.frequenza")
    ,
    @NamedQuery(name = Sorgente.FIND_BY_ID,
            query = "select e from Sorgente e where e.id = :id"),})
@Entity
@Table(name = "sorgente")
public class Sorgente extends BaseEntity {

    public static final String FIND_ALL = "Sorgente.findAll";
    public static final String FIND_BY_ID = "Sorgente.findById";

    @Lob
    private byte[] msi;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Impianto impianto;

    @Size(max = 2)
    @Column(name = "dipartimento")
    private String dipartimento;
    @Size(max = 50)
    @Column(name = "segnale")
    private String segnale;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "frequenza")
    private Double frequenza;
    @Column(name = "guadagno")
    private Double guadagno;
    @Size(max = 20)
    @Column(name = "direzione")
    private String direzione;
    @Column(name = "portanti")
    private Integer portanti;
    @Column(name = "tilt_elettrico")
    private Double tiltElettrico;
    @Column(name = "tilt_pronuncia")
    private Double tiltPronuncia;
    @Column(name = "tilt_mecc")
    private Double tiltMecc;
    @Size(max = 10)
    @Column(name = "polariz")
    private String polariz;
    @Size(max = 50)
    @Column(name = "marca_antenna")
    private String marcaAntenna;
    @Size(max = 100)
    @Column(name = "modello_antenna")
    private String modelloAntenna;
    @Size(max = 250)
    @Column(name = "percorso_msi")
    private String percorsoMsi;
    @Column(name = "altezza")
    private Double altezza;
    @Column(name = "potenza")
    private Double potenza;
    @Column(name = "fascia_d1")
    private Double fasciaD1;
    @Column(name = "fascia_d2")
    private Double fasciaD2;
    @Column(name = "fascia_d3")
    private Double fasciaD3;
    @Column(name = "fascia_d4")
    private Double fasciaD4;
    @Column(name = "fascia_d5")
    private Double fasciaD5;
    @Size(max = 1)
    @Column(name = "parere")
    private String parere;
    @Size(max = 20)
    @Column(name = "pt_domarp")
    private String ptDomarp;
    @Column(name = "dt_domarp")
    private LocalDate dtDomarp;
    @Size(max = 20)
    @Column(name = "pt_rilpar")
    private String ptRilpar;
    @Column(name = "dt_rilpar")
    private LocalDate dtRilpar;
    @Column(name = "fl_variaz")
    private Short flVariaz;
    @Column(name = "dt_variaz")
    private LocalDate dtVariaz;
    @Size(max = 30)
    @Column(name = "utente_variazione")
    private String utenteVariazione;
    @Column(name = "dt_scadenza")
    private LocalDate dtScadenza;
    @Size(max = 250)
    @Column(name = "note_tecniche")
    private String noteTecniche;
    @Column(name = "dataultmod")
    private LocalDate dataultmod;
    @Column(name = "id_utente")
    private Short idUtente;
    @Size(max = 2)
    @Column(name = "multifreq")
    private String multifreq;
    @Size(max = 1)
    @Column(name = "prescrizione")
    private String prescrizione;
    @Column(name = "flag_misura")
    private Short flagMisura;
    @Column(name = "flag_ponte")
    private Short flagPonte;
    @Column(name = "flag_20w")
    private Short flag20w;
    @Column(name = "flag_5w")
    private Short flag5w;
    @Column(name = "flag_sistema")
    private Short flagSistema;
    @Column(name = "direz_num")
    private Short direzNum;
    @Column(name = "utmx")
    private Double utmx;
    @Column(name = "utmy")
    private Double utmy;
    @Size(max = 2000)
    @Column(name = "note_pronuncia")
    private String notePronuncia;
    @Column(name = "flag_docok")
    private Short flagDocok;
    @Column(name = "flag_punti")
    private Short flagPunti;
    @Column(name = "flag_bs")
    private Short flagBs;
    @Column(name = "flag_dtx")
    private Short flagDtx;
    @Column(name = "flag_pc")
    private Short flagPc;
    @Column(name = "flag_ac")
    private Short flagAc;
    @Column(name = "flag_wi")
    private Short flagWi;
    @Column(name = "flag_umts900")
    private Short flagUmts900;
    @Column(name = "dt_umts900")

    private LocalDate dtUmts900;
    @Size(max = 20)
    @Column(name = "pt_umts900")
    private String ptUmts900;
    @Column(name = "potumts900")
    private Double potumts900;
    @Column(name = "flag_passdtt")
    private Short flagPassdtt;
    @Column(name = "filemsilenght")
    private Integer filemsilenght;
    @Column(name = "data_ins_msi")
    private LocalDate dataInsMsi;
    @Column(name = "data_cessato")
    private LocalDate dataCessato;
    @Column(name = "alfatdd")
    private Double alfatdd;
    @Column(name = "potenzaridotta")
    private Double potenzaridotta;
    @Column(name = "alfa24")
    private Double alfa24;

    public Sorgente() {
    }

    public Sorgente(Long id, Double freq, String percorso, byte[] msi) {
        this.setId(id);
        this.frequenza = freq;
        this.percorsoMsi = percorso;
        this.msi = msi;
    }

    /**
     * Unzip diagrammi
     *
     * @return
     */
    public String unzipMsi() {
        if (msi == null || msi.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            ZipInputStream in = new ZipInputStream(new ByteArrayInputStream(msi));
            ZipEntry ze = null;
            while ((ze = in.getNextEntry()) != null) {
                byte[] buffer = new byte[1024];
                int len = 0;
                BufferedReader bf = new BufferedReader(new InputStreamReader(in, "UTF-8"));
                bf.lines().forEach(v -> sb.append(v).append("\\n"));
            }
        } catch (IOException ex) {
            Logger.getLogger(CellaMS.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return sb.toString();
        }
    }

    /*
    getter a setter
     */
    public byte[] getMsi() {
        return msi;
    }

    public void setMsi(byte[] msi) {
        this.msi = msi;
    }

    public Impianto getImpianto() {
        return impianto;
    }

    public void setImpianto(Impianto impianto) {
        this.impianto = impianto;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }

    public String getSegnale() {
        return segnale;
    }

    public void setSegnale(String segnale) {
        this.segnale = segnale;
    }

    public Double getFrequenza() {
        return frequenza;
    }

    public void setFrequenza(Double frequenza) {
        this.frequenza = frequenza;
    }

    public Double getGuadagno() {
        return guadagno;
    }

    public void setGuadagno(Double guadagno) {
        this.guadagno = guadagno;
    }

    public String getDirezione() {
        return direzione;
    }

    public void setDirezione(String direzione) {
        this.direzione = direzione;
    }

    public Integer getPortanti() {
        return portanti;
    }

    public void setPortanti(Integer portanti) {
        this.portanti = portanti;
    }

    public Double getTiltElettrico() {
        return tiltElettrico;
    }

    public void setTiltElettrico(Double tiltElettrico) {
        this.tiltElettrico = tiltElettrico;
    }

    public Double getTiltPronuncia() {
        return tiltPronuncia;
    }

    public void setTiltPronuncia(Double tiltPronuncia) {
        this.tiltPronuncia = tiltPronuncia;
    }

    public Double getTiltMecc() {
        return tiltMecc;
    }

    public void setTiltMecc(Double tiltMecc) {
        this.tiltMecc = tiltMecc;
    }

    public String getPolariz() {
        return polariz;
    }

    public void setPolariz(String polariz) {
        this.polariz = polariz;
    }

    public String getMarcaAntenna() {
        return marcaAntenna;
    }

    public void setMarcaAntenna(String marcaAntenna) {
        this.marcaAntenna = marcaAntenna;
    }

    public String getModelloAntenna() {
        return modelloAntenna;
    }

    public void setModelloAntenna(String modelloAntenna) {
        this.modelloAntenna = modelloAntenna;
    }

    public String getPercorsoMsi() {
        return percorsoMsi;
    }

    public void setPercorsoMsi(String percorsoMsi) {
        this.percorsoMsi = percorsoMsi;
    }

    public Double getAltezza() {
        return altezza;
    }

    public void setAltezza(Double altezza) {
        this.altezza = altezza;
    }

    public Double getPotenza() {
        return potenza;
    }

    public void setPotenza(Double potenza) {
        this.potenza = potenza;
    }

    public Double getFasciaD1() {
        return fasciaD1;
    }

    public void setFasciaD1(Double fasciaD1) {
        this.fasciaD1 = fasciaD1;
    }

    public Double getFasciaD2() {
        return fasciaD2;
    }

    public void setFasciaD2(Double fasciaD2) {
        this.fasciaD2 = fasciaD2;
    }

    public Double getFasciaD3() {
        return fasciaD3;
    }

    public void setFasciaD3(Double fasciaD3) {
        this.fasciaD3 = fasciaD3;
    }

    public Double getFasciaD4() {
        return fasciaD4;
    }

    public void setFasciaD4(Double fasciaD4) {
        this.fasciaD4 = fasciaD4;
    }

    public Double getFasciaD5() {
        return fasciaD5;
    }

    public void setFasciaD5(Double fasciaD5) {
        this.fasciaD5 = fasciaD5;
    }

    public String getParere() {
        return parere;
    }

    public void setParere(String parere) {
        this.parere = parere;
    }

    public String getPtDomarp() {
        return ptDomarp;
    }

    public void setPtDomarp(String ptDomarp) {
        this.ptDomarp = ptDomarp;
    }

    public LocalDate getDtDomarp() {
        return dtDomarp;
    }

    public void setDtDomarp(LocalDate dtDomarp) {
        this.dtDomarp = dtDomarp;
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

    public Short getFlVariaz() {
        return flVariaz;
    }

    public void setFlVariaz(Short flVariaz) {
        this.flVariaz = flVariaz;
    }

    public LocalDate getDtVariaz() {
        return dtVariaz;
    }

    public void setDtVariaz(LocalDate dtVariaz) {
        this.dtVariaz = dtVariaz;
    }

    public String getUtenteVariazione() {
        return utenteVariazione;
    }

    public void setUtenteVariazione(String utenteVariazione) {
        this.utenteVariazione = utenteVariazione;
    }

    public LocalDate getDtScadenza() {
        return dtScadenza;
    }

    public void setDtScadenza(LocalDate dtScadenza) {
        this.dtScadenza = dtScadenza;
    }

    public String getNoteTecniche() {
        return noteTecniche;
    }

    public void setNoteTecniche(String noteTecniche) {
        this.noteTecniche = noteTecniche;
    }

    public LocalDate getDataultmod() {
        return dataultmod;
    }

    public void setDataultmod(LocalDate dataultmod) {
        this.dataultmod = dataultmod;
    }

    public Short getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(Short idUtente) {
        this.idUtente = idUtente;
    }

    public String getMultifreq() {
        return multifreq;
    }

    public void setMultifreq(String multifreq) {
        this.multifreq = multifreq;
    }

    public String getPrescrizione() {
        return prescrizione;
    }

    public void setPrescrizione(String prescrizione) {
        this.prescrizione = prescrizione;
    }

    public Short getFlagMisura() {
        return flagMisura;
    }

    public void setFlagMisura(Short flagMisura) {
        this.flagMisura = flagMisura;
    }

    public Short getFlagPonte() {
        return flagPonte;
    }

    public void setFlagPonte(Short flagPonte) {
        this.flagPonte = flagPonte;
    }

    public Short getFlag20w() {
        return flag20w;
    }

    public void setFlag20w(Short flag20w) {
        this.flag20w = flag20w;
    }

    public Short getFlag5w() {
        return flag5w;
    }

    public void setFlag5w(Short flag5w) {
        this.flag5w = flag5w;
    }

    public Short getFlagSistema() {
        return flagSistema;
    }

    public void setFlagSistema(Short flagSistema) {
        this.flagSistema = flagSistema;
    }

    public Short getDirezNum() {
        return direzNum;
    }

    public void setDirezNum(Short direzNum) {
        this.direzNum = direzNum;
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

    public String getNotePronuncia() {
        return notePronuncia;
    }

    public void setNotePronuncia(String notePronuncia) {
        this.notePronuncia = notePronuncia;
    }

    public Short getFlagDocok() {
        return flagDocok;
    }

    public void setFlagDocok(Short flagDocok) {
        this.flagDocok = flagDocok;
    }

    public Short getFlagPunti() {
        return flagPunti;
    }

    public void setFlagPunti(Short flagPunti) {
        this.flagPunti = flagPunti;
    }

    public Short getFlagBs() {
        return flagBs;
    }

    public void setFlagBs(Short flagBs) {
        this.flagBs = flagBs;
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

    public Short getFlagWi() {
        return flagWi;
    }

    public void setFlagWi(Short flagWi) {
        this.flagWi = flagWi;
    }

    public Short getFlagUmts900() {
        return flagUmts900;
    }

    public void setFlagUmts900(Short flagUmts900) {
        this.flagUmts900 = flagUmts900;
    }

    public LocalDate getDtUmts900() {
        return dtUmts900;
    }

    public void setDtUmts900(LocalDate dtUmts900) {
        this.dtUmts900 = dtUmts900;
    }

    public String getPtUmts900() {
        return ptUmts900;
    }

    public void setPtUmts900(String ptUmts900) {
        this.ptUmts900 = ptUmts900;
    }

    public Double getPotumts900() {
        return potumts900;
    }

    public void setPotumts900(Double potumts900) {
        this.potumts900 = potumts900;
    }

    public Short getFlagPassdtt() {
        return flagPassdtt;
    }

    public void setFlagPassdtt(Short flagPassdtt) {
        this.flagPassdtt = flagPassdtt;
    }

    public Integer getFilemsilenght() {
        return filemsilenght;
    }

    public void setFilemsilenght(Integer filemsilenght) {
        this.filemsilenght = filemsilenght;
    }

    public LocalDate getDataInsMsi() {
        return dataInsMsi;
    }

    public void setDataInsMsi(LocalDate dataInsMsi) {
        this.dataInsMsi = dataInsMsi;
    }

    public LocalDate getDataCessato() {
        return dataCessato;
    }

    public void setDataCessato(LocalDate dataCessato) {
        this.dataCessato = dataCessato;
    }

    public Double getAlfatdd() {
        return alfatdd;
    }

    public void setAlfatdd(Double alfatdd) {
        this.alfatdd = alfatdd;
    }

    public Double getPotenzaridotta() {
        return potenzaridotta;
    }

    public void setPotenzaridotta(Double potenzaridotta) {
        this.potenzaridotta = potenzaridotta;
    }

    public Double getAlfa24() {
        return alfa24;
    }

    public void setAlfa24(Double alfa24) {
        this.alfa24 = alfa24;
    }

}
