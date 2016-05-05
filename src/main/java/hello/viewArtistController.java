package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
class viewArtistController {

    @Autowired Record record;

    @RequestMapping("/view-artist")
    public List<Artist> viewArtist(@RequestParam(value = "input", defaultValue = "1") String input) {
        if (input.equals("all")) {
            System.out.println(record.artists);
            return record.artists;
        }
        return record.viewArtist(Integer.parseInt(input));
    }
}