package com.contrastsecurity.models.oss.dependencytree;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public
final class DependencyDetails {
    private String artifactID;
    private Map<String, String> edges = new HashMap<>();
    private String group;
    private String packaging;
    private String scope;
    private String type;
    private String version;

    public void addEdge(String edgeDescriptor) {
        edges.put(edgeDescriptor, edgeDescriptor); //both key and value seem to be the same always?
    }
}