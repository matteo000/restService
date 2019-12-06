package com.expedia.repofinder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.expedia.repofinder.model.GitHubResponse;
import com.expedia.repofinder.service.FetchService;

@RestController
public class FinderController {

    @Autowired
    private FetchService fetchService;

    @RequestMapping("/")
    public ResponseEntity<GitHubResponse> index(@RequestParam String index,
                                        @RequestParam String token) {
        return new ResponseEntity<>(fetchService.initializeFetch(index, token), HttpStatus.OK);
    }
}
