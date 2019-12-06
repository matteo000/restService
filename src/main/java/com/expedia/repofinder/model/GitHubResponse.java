package com.expedia.repofinder.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
public class GitHubResponse {

    @JsonProperty("items")
    private Set<Project> projects;
}
