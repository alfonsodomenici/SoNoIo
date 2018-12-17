/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonoio.business.rf.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.crypto.Data;
import sonoio.BaseEntity;

/**
 *
 * @author utente
 */
@Entity
@Table(name = "proprietario")
public class Proprietario extends BaseEntity {
    
    @Size(max = 100)
    @Column(name = "Denominazione")
    private String denominazione;
    
    @Size(max = 50)
    @Column(name = "Indirizzo")
    private String indirizzo;
    
    @Size(max = 5)
    @Column(name = "CAP")
    private String CAP;
    
    @Size(max = 50)
    @Column(name = "Comune")
    private String comune;
    
    @Size(max = 2)
    @Column(name = "Provincia")
    private String provincia;
    
    @Size(max = 100)
    @Column(name = "Telefono")
    private String telefono;
    
    @Size(max = 50)
    @Column(name = "Referente")
    private String referente;
    
    @Size(max = 50)
    @Column(name = "Codice_Fiscale")
    private String codice_fiscale;
    
    @Size(max = 20)
    @Column(name = "Partita_IVA")
    private String partita_IVA;
    
    @Size(max = 100)
    @Column(name = "PEC")
    private String PEC;
    
    @Size(max = 50)
    @Column(name = "Legale_Rappres")
    private String legale_rappres;
    
    @Size(max = 50)
    @Column(name = "Referente_Pareri")
    private String referente_pareri;
    
    @Size(max = 50)
    @Column(name = "Amministratore")
    private String amministratore;
    
    @Size(max = 50)
    @Column(name = "Rif_Tecnico")
    private String rif_tecnico;
    
    @Column(name = "Flag_ConPratica")
    private Short flag_conpratica;
    
    @Column(name = "Flag_Soccorso")
    private Short flag_soccorso;
    
    @Column(name = "Flag_Cessato")
    private Short flag_cessato;
    
    @Column(name = "Data_Cessato")
    @Temporal(TemporalType.TIMESTAMP)
    private Data data_cessato;
    
    @Column(name = "Data_UltMod")
    @Temporal(TemporalType.TIMESTAMP)
    private Data data_ultmod;
}
