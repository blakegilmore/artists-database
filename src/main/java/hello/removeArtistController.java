package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
class removeArtistController {

    @Autowired Record record;

    @RequestMapping(value = "/remove-artist", method = RequestMethod.DELETE)
    public void removeArtist(@RequestParam(value = "input", defaultValue = "1") String input) {
        record.removeArtist(Integer.parseInt(input));
    }
}