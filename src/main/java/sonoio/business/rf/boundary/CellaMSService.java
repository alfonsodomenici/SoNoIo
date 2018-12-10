/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonoio.business.rf.boundary;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import sonoio.business.rf.entity.CellaMS;

/**
 *
 * @author utente
 */
@Path("/rf")
public class CellaMSService {

    @PersistenceContext(unitName = "pu")
    EntityManager em;

    @GET
    public List<CellaMS> all() {
        return em.createNamedQuery(CellaMS.FIND_ALL, CellaMS.class)
                .setMaxResults(100)
                .getResultList();
    }

    @GET
    @Path("{id}")
    public CellaMS find(@PathParam("id") Long id) {
        CellaMS result = em.createNamedQuery(CellaMS.FIND_BY_ID, CellaMS.class)
                .setParameter("id", id)
                .getResultList()
                .stream()
                .findFirst()
                .orElseGet(null);
        System.out.println(result.unzipMsi());
        return result;
    }
}
