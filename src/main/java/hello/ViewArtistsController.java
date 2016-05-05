package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by blakegilmore on 5/5/16.
 */
@RestController
public class ViewArtistsController {

    @Autowired Record record;

    @RequestMapping("/artists")
    public List<Artist> viewArtists() {
            System.out.println(record.artists);
            return record.artists;
    }
}
