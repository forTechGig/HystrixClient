package com.example.hystricClient.hystricClient;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@RestController
public class HystrixClient {

    @RequestMapping(name = "getUser", method = RequestMethod.GET )
    public ResponseEntity<String> getUser(@RequestParam("userId") String userId){
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}
