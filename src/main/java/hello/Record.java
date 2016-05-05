package hello;

import hello.Artist;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class Record {

    public ArrayList<Artist> artists;
    public Record()
    {
        artists = new ArrayList<Artist>();
    }

    List<Artist> viewArtist(int intInput) {
        try {
            System.out.println(artists.get(intInput - 1));
            ArrayList container = new ArrayList();
            container.add(artists.get(intInput - 1));
            return container;
        } catch (IndexOutOfBoundsException e){
            System.out.println("That artist doesn't exist.");
            return Collections.EMPTY_LIST;
        }
    }

    void removeArtist(int intInput){
        try {
            Artist rmved = artists.remove(intInput - 1);
            /// show the element that's been removed
            System.out.println(rmved);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("That artist doesn't exist.");
        }
    }

    void addArtist(Artist artist){
        artists.add(artist);
        System.out.println("I am all the artists on record >>"+artists);
    }

}
