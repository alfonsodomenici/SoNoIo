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
import java.io.Serializable;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author utente
 */
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = CellaMS.FIND_ALL,
            query = "select e from CellaMS e where e.freq is not null ORDER BY e.freq")
    ,
   @NamedQuery(name = CellaMS.FIND_BY_ID,
            query = "select e from CellaMS e where e.cella = :id"),})
@Entity
@Table(name = "Tbl_Celle")
public class CellaMS implements Serializable {

    public static final String FIND_ALL = "Cella.findAll";
    public static final String FIND_BY_ID = "Cella.findById";

    @Id
    @Column(name = "cella")
    private Long cella;

    @Column(name = "frequenza")
    private Float freq;

    @Column(name = "percorso_msi")
    private String percorso;

    @Lob
    @Column(name = "diagrammamsi")
    private byte[] msi;

    /*
    getter e setter
     */
    public Long getCella() {
        return cella;
    }

    public void setCella(Long cella) {
        this.cella = cella;
    }

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

    public String unzipMsi() {
        if (msi == null || msi.length == 0) {
            return "";
        }
        System.out.println(new String(msi));

        String result = "";
        try {
            ZipInputStream in = new ZipInputStream(new ByteArrayInputStream(msi));
            ZipEntry ze = null;
            while ((ze = in.getNextEntry()) != null) {
                byte[] buffer = new byte[1024];
                int len = 0;
                while ((len = in.read(buffer)) > 0) {
                    result += new String(buffer);
                }
                System.out.println("Output String lenght : " + result.length());
            }
        } catch (IOException ex) {
            Logger.getLogger(CellaMS.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return result;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.cella);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CellaMS other = (CellaMS) obj;
        return Objects.equals(this.cella, other.cella);
    }

}
