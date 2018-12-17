/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonoio.business.rf.entity;

import java.util.Date;
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
@Table(name = "utente")
public class Utente extends BaseEntity {
    
    @Size(max = 30)
    @Column(name = "Utente")
    private String utente;
    
    @Size(max = 30)
    @Column(name = "Nome_Esteso")
    private String nome_esteso;
    
    @Size(max =5)
    @Column(name = "Sigla")
    private String sigla;
    
    @Size(max = 30)
    @Column(name = "Filtro")
    private String filtro;
    
    @Size(max = 30)
    @Column(name = "FiltroProv")
    private String filtroprov;
    
    @Column(name = "Slettura")
    private Short slettura;
    
    @Column(name = "Flag_Versamenti")
    private Short flag_versamenti;
    
    @Column(name = "Data_Login")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_login;
    
    @Column(name = "Data_Logout")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_logout;
    
    @Size(max = 30)
    @Column(name="Dipartimento")
    private String dipartimento;
    
    @Column(name="Prov_Al")
    private Short prov_al;
    
    @Column(name="Prov_At")
    private Short prov_at;
    
    @Column(name="Prov_Bi")
    private Short prov_bi;
    
    @Column(name="Prov_Cn")
    private Short prov_cn;
    
    @Column(name="Prov_No")
    private Short prov_no;
    
    @Column(name="Prov_To")
    private Short prov_to;
    
    @Column(name="Prov_Vb")
    private Short prov_vb;
    
    @Column(name="Prov_Vc")
    private Short prov_vc;
    
    @Column(name="Admin")
    private Short admin;
    
    @Column(name="Flag_siti")
    private Short flag_siti;
    
    @Column(name="Flag_Pratiche")
    private Short flag_pratiche;
    
    @Column(name="Flag_segreteria")
    private Short flag_segreteria;
    
    @Column(name="Flag_Nooper")
    private Short flag_nooper;
    
    @Column(name="Flag_Cessato")
    private Short flag_cessato;
    
    @Column(name="Flag_Elf")
    private Short flag_elf;
    
    @Column(name="Password")
    private Short password;
    
    @Column(name="Video")
    private Short video;
    
    @Column(name="n_login")
    private Short n_login;
    
    @Column(name="Nomepc")
    private Short nomepc;
    
    @Column(name="Ip_Address")
    private Short ip_address;
 
}
