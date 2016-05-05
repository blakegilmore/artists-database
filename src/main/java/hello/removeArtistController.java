package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
class removeArtistController {

    @Autowired Record record;

    @RequestMapping(value = "/artists/{id}", method = RequestMethod.DELETE)
    public void removeArtist(@PathVariable("id") String id)
    {
        record.removeArtist(Integer.parseInt(id));
    }
}