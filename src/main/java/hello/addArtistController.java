package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import hello.Record;

@RestController
class addArtistController {

    @Autowired Record record;

    @RequestMapping(value = "/artists", method = RequestMethod.POST)
    public Artist addArtist(@RequestBody Artist artist) {

        record.addArtist(artist);
        return artist;
    }
}
