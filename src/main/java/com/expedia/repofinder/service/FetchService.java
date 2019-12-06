package com.expedia.repofinder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expedia.repofinder.dao.GitHubDao;
import com.expedia.repofinder.model.GitHubResponse;

@Service
public class FetchService {

    @Autowired
    GitHubDao gitHubDao;

    public GitHubResponse initializeFetch(String index, String token) {
        return gitHubDao.retrieveRepositories(index, token);
    }
}
