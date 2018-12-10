/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonoio.business.rf.boundary;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import sonoio.business.rf.control.SorgenteStore;
import sonoio.business.rf.entity.CellaMS;
import sonoio.business.rf.entity.Sorgente;

/**
 *
 * @author utente
 */
@Path("/sorgenti")
public class SorgenteService {

    @Inject
    SorgenteStore store;

    @Inject
    CellaMSService cellaMSService;

    @GET
    public List<Sorgente> all() {
        return store.all();
    }

    @GET
    @Path("{id}")
    public Sorgente find(@PathParam("id") Long id) {
        Sorgente result = store.find(id);
        System.out.println(result.unzipMsi());
        return result;
    }

    @GET
    @Path("import")
    public void importOld() {
        cellaMSService.all()
                .stream()
                .map(v -> new Sorgente(v.getCella(), v.getFreq(), v.getPercorso(), v.getMsi()))
                .forEach(store::save);
    }
}
