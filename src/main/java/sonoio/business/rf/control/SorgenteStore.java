/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonoio.business.rf.control;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import sonoio.business.rf.entity.CellaMS;
import sonoio.business.rf.entity.Sorgente;

/**
 *
 * @author utente
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class SorgenteStore {

    @PersistenceContext(unitName = "pupg")
    EntityManager em;

    public Sorgente save(Sorgente s) {
        return em.merge(s);
    }

    public List<Sorgente> all() {
        return em.createNamedQuery(Sorgente.FIND_ALL)
                .getResultList();
    }
    
    @GET
    @Path("{id}")
    public Sorgente find(@PathParam("id") Long id) {
        Sorgente result = em.createNamedQuery(Sorgente.FIND_BY_ID, Sorgente.class)
                .setParameter("id", id)
                .getResultList()
                .stream()
                .findFirst()
                .orElseGet(null);
        System.out.println(result.unzipMsi());
        return result;
    }
}
