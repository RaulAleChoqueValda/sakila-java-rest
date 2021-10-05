package bo.edu.ucb.ingsoft.sakila;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "countries", path = "countries")
public interface CountryRestRepository extends PagingAndSortingRepository<Country, Integer>{
    //List<Country> findAll();
    List<Country> findByCountry(@Param("country") String country);
}
