package hello;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

public class Artist {

    String name;
    String age;
    String instrument;
    String genre;
    String ethnicity;
    String mostFamousWork;
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public String toString() {
        return "Artist{" +
                "name=" + name +
                ", age=" + age +
                ", instrument=" + instrument +
                ", genre=" + genre +
                ", ethnicity=" + ethnicity +
                ", mostFamousWork=" + mostFamousWork +
                '\'' +
                '}';
    }

    public Artist (){
    }

    public Artist(String name, String age, String instrument, String genre, String ethnicity, String mostFamousWork) {
        this.name = name;
        this.age = age;
        this.instrument = instrument;
        this.genre = genre;
        this.ethnicity = ethnicity;
        this.mostFamousWork = mostFamousWork;
    }

    public String getName() {
        return name;
    }

    public Artist setName(String name) {
        this.name = name;
        return this;
    }

    public String getAge() {
        return age;
    }

    public Artist setAge(String age) {
        this.age = age;
        return this;
    }

    public String getInstrument() {
        return instrument;
    }

    public Artist setInstrument(String instrument) {
        this.instrument = instrument;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public Artist setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public Artist setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
        return this;
    }

    public String getMostFamousWork() {
        return mostFamousWork;
    }

    public Artist setMostFamousWork(String mostFamousWork) {
        this.mostFamousWork = mostFamousWork;
        return this;
    }
}