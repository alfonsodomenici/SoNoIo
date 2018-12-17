/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonoio.business.rf.entity;

import java.time.LocalDate;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import sonoio.BaseEntity;

/**
 *
 * @author utente
 */

@Entity
@Table(name = "utente")
public class Utente extends BaseEntity {
    
    @Size(max = 30)
    @Column(name = "utente")
    private String utente;
    @Size(max = 30)
    @Column(name = "login_old")
    private String loginOld;
    @Size(max = 50)
    @Column(name = "nome_esteso")
    private String nomeEsteso;
    @Size(max = 5)
    @Column(name = "sigla")
    private String sigla;
    @Size(max = 100)
    @Column(name = "filtro")
    private String filtro;
    @Size(max = 5)
    @Column(name = "filtroprov")
    private String filtroprov;
    @Basic(optional = false)
    @NotNull
    @Column(name = "slettura")
    private short slettura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "flag_versamenti")
    private short flagVersamenti;
    @Column(name = "dt_login")
    
    private LocalDate dtLogin;
    @Column(name = "dt_logout")
    
    private LocalDate dtLogout;
    @Size(max = 2)
    @Column(name = "dipartimento")
    private String dipartimento;
    @Column(name = "prov_al")
    private Short provAl;
    @Column(name = "prov_at")
    private Short provAt;
    @Column(name = "prov_bi")
    private Short provBi;
    @Column(name = "prov_cn")
    private Short provCn;
    @Column(name = "prov_no")
    private Short provNo;
    @Column(name = "prov_to")
    private Short provTo;
    @Column(name = "prov_vb")
    private Short provVb;
    @Column(name = "prov_vc")
    private Short provVc;
    @Column(name = "admin")
    private Short admin;
    @Column(name = "flag_siti")
    private Short flagSiti;
    @Column(name = "flag_pratiche")
    private Short flagPratiche;
    @Column(name = "flag_segreteria")
    private Short flagSegreteria;
    @Column(name = "flag_nooper")
    private Short flagNooper;
    @Column(name = "flag_cessato")
    private Short flagCessato;
    @Column(name = "flag_elf")
    private Short flagElf;
    @Size(max = 10)
    @Column(name = "password")
    private String password;
    @Size(max = 50)
    @Column(name = "video")
    private String video;
    @Column(name = "n_login")
    private Short nLogin;
    @Size(max = 50)
    @Column(name = "nomepc")
    private String nomepc;
    @Size(max = 20)
    @Column(name = "ip_address")
    private String ipAddress;
    
    /*
    getter e setter
    */

    public String getUtente() {
        return utente;
    }

    public void setUtente(String utente) {
        this.utente = utente;
    }

    public String getLoginOld() {
        return loginOld;
    }

    public void setLoginOld(String loginOld) {
        this.loginOld = loginOld;
    }

    public String getNomeEsteso() {
        return nomeEsteso;
    }

    public void setNomeEsteso(String nomeEsteso) {
        this.nomeEsteso = nomeEsteso;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public String getFiltroprov() {
        return filtroprov;
    }

    public void setFiltroprov(String filtroprov) {
        this.filtroprov = filtroprov;
    }

    public short getSlettura() {
        return slettura;
    }

    public void setSlettura(short slettura) {
        this.slettura = slettura;
    }

    public short getFlagVersamenti() {
        return flagVersamenti;
    }

    public void setFlagVersamenti(short flagVersamenti) {
        this.flagVersamenti = flagVersamenti;
    }

    public LocalDate getDtLogin() {
        return dtLogin;
    }

    public void setDtLogin(LocalDate dtLogin) {
        this.dtLogin = dtLogin;
    }

    public LocalDate getDtLogout() {
        return dtLogout;
    }

    public void setDtLogout(LocalDate dtLogout) {
        this.dtLogout = dtLogout;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }

    public Short getProvAl() {
        return provAl;
    }

    public void setProvAl(Short provAl) {
        this.provAl = provAl;
    }

    public Short getProvAt() {
        return provAt;
    }

    public void setProvAt(Short provAt) {
        this.provAt = provAt;
    }

    public Short getProvBi() {
        return provBi;
    }

    public void setProvBi(Short provBi) {
        this.provBi = provBi;
    }

    public Short getProvCn() {
        return provCn;
    }

    public void setProvCn(Short provCn) {
        this.provCn = provCn;
    }

    public Short getProvNo() {
        return provNo;
    }

    public void setProvNo(Short provNo) {
        this.provNo = provNo;
    }

    public Short getProvTo() {
        return provTo;
    }

    public void setProvTo(Short provTo) {
        this.provTo = provTo;
    }

    public Short getProvVb() {
        return provVb;
    }

    public void setProvVb(Short provVb) {
        this.provVb = provVb;
    }

    public Short getProvVc() {
        return provVc;
    }

    public void setProvVc(Short provVc) {
        this.provVc = provVc;
    }

    public Short getAdmin() {
        return admin;
    }

    public void setAdmin(Short admin) {
        this.admin = admin;
    }

    public Short getFlagSiti() {
        return flagSiti;
    }

    public void setFlagSiti(Short flagSiti) {
        this.flagSiti = flagSiti;
    }

    public Short getFlagPratiche() {
        return flagPratiche;
    }

    public void setFlagPratiche(Short flagPratiche) {
        this.flagPratiche = flagPratiche;
    }

    public Short getFlagSegreteria() {
        return flagSegreteria;
    }

    public void setFlagSegreteria(Short flagSegreteria) {
        this.flagSegreteria = flagSegreteria;
    }

    public Short getFlagNooper() {
        return flagNooper;
    }

    public void setFlagNooper(Short flagNooper) {
        this.flagNooper = flagNooper;
    }

    public Short getFlagCessato() {
        return flagCessato;
    }

    public void setFlagCessato(Short flagCessato) {
        this.flagCessato = flagCessato;
    }

    public Short getFlagElf() {
        return flagElf;
    }

    public void setFlagElf(Short flagElf) {
        this.flagElf = flagElf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public Short getnLogin() {
        return nLogin;
    }

    public void setnLogin(Short nLogin) {
        this.nLogin = nLogin;
    }

    public String getNomepc() {
        return nomepc;
    }

    public void setNomepc(String nomepc) {
        this.nomepc = nomepc;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
    
}
