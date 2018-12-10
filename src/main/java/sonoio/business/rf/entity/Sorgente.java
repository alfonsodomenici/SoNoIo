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
import javax.xml.bind.annotation.XmlRootElement;
import sonoio.BaseEntity;

/**
 *
 * @author utente
 */
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = Sorgente.FIND_ALL,
            query = "select e from Sorgente e ORDER BY e.freq")
    ,
    @NamedQuery(name = Sorgente.FIND_BY_ID,
            query = "select e from Sorgente e where e.id = :id"),})
@Entity
@Table(name = "sorgente")
public class Sorgente extends BaseEntity {

    public static final String FIND_ALL = "Sorgente.findAll";
    public static final String FIND_BY_ID = "Sorgente.findById";

    @Column(name = "frequenza")
    private Float freq;

    @Column(name = "percorso_msi")
    private String percorso;

    @Lob
    private byte[] msi;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Impianto impianto;

    public Sorgente() {
    }

    public Sorgente(Long id, Float freq, String percorso, byte[] msi) {
        this.setId(id);
        this.freq = freq;
        this.percorso = percorso;
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
    public Float getFreq() {

        return freq;
    }

    public void setFreq(Float freq) {
        this.freq = freq;
    }

    public String getPercorso() {
        return percorso;
    }

    public void setPercorso(String percorso) {
        this.percorso = percorso;
    }

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

}
