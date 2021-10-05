package bo.edu.ucb.ingsoft.sakila;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class Countries {
    ArrayList<Country> countryList = new ArrayList<>();

    @GetMapping(path="/countryOld", produces = MediaType.APPLICATION_JSON_VALUE )
    public ArrayList<Country> listAll() {
        return countryList;
    }

    @PostMapping(path="/country", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public Country listAll(@RequestBody Country country) {
        countryList.add(country);
        return country;
    }
}
