package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import hello.Record;

@RestController
class addArtistController {

    @Autowired Record record;

    @RequestMapping("/add-artist")
    public Artist addArtist(@RequestParam(value = "name", defaultValue = "Cher") String name,
                            @RequestParam(value = "age", defaultValue = "70") String age,
                            @RequestParam(value = "instrument", defaultValue = "voice") String instrument,
                            @RequestParam(value = "genre", defaultValue = "pop") String genre,
                            @RequestParam(value = "ethnicity", defaultValue = "Armenian") String ethnicity,
                            @RequestParam(value = "mostFamousWork", defaultValue = "Believe") String mostFamousWork) {

        record.addArtist(new Artist(name, age, instrument, genre, ethnicity, mostFamousWork));
        return new Artist(name, age, instrument, genre, ethnicity, mostFamousWork);
    }
}
