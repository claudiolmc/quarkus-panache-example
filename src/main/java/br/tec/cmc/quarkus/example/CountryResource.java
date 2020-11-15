package br.tec.cmc.quarkus.example;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import br.tec.cmc.quarkus.example.entity.Country;
import br.tec.cmc.quarkus.example.repository.CountryRepository;

@Path("/country")
@RequestScoped
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CountryResource {

    @Inject 
    private CountryRepository repo;
    
    @GET
    @Path("{id}")
    public Country findById(@PathParam Long id) {
        return repo.findById(id);
    }

    @GET
    public List<Country> findByAll() {
        return repo.findAll().list();
    }
}