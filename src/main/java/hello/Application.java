package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by blakegilmore on 5/5/16.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

// TODO: X hold artist in Record
// TODO: X hold artistS in Record
// TODO: X create separate endpoint for remove
// TODO: X create separate endpoint for view
// TODO: X create 2 GET request endpoints with different types
// TODO: create a DELETE request endpoint
// TODO: create a post request endpoint
// TODO: pass in JSON to the POST request for request parameters