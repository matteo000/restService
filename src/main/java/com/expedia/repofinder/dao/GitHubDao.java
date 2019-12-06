package com.expedia.repofinder.dao;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.expedia.repofinder.model.GitHubResponse;

@Repository
public class GitHubDao {

    public GitHubDao(){}

    public GitHubResponse retrieveRepositories(String index, String token) {
        String url = "https://github.expedia.biz/api/v3/search/repositories?q=" + index + "&access_token=" + token;

        RestTemplate restTemplate = new RestTemplate();
        GitHubResponse response = restTemplate.getForObject(url, GitHubResponse.class);
        return response;
    }
}
