package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
class viewArtistController {

    @Autowired Record record;

    @RequestMapping("/artists/{id}")
    public Artist viewArtist(@PathVariable("id") String id) {
        return record.viewArtist(Integer.parseInt(id));
    }
}