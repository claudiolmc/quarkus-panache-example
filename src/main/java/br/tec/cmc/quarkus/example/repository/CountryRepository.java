package br.tec.cmc.quarkus.example.repository;

import javax.enterprise.context.ApplicationScoped;

import br.tec.cmc.quarkus.example.entity.Country;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class CountryRepository implements PanacheRepository<Country> {
    
}
