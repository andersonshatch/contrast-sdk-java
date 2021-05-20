package com.contrastsecurity.models.oss.dependencytree;

import java.util.HashMap;
import java.util.Map;

import org.apache.maven.artifact.Artifact;

import lombok.Data;

@Data
public
final class DependencyDetails {
    final private String group;
    final private String artifactID;
    final private String packaging;
    final private String version;
    final private String scope;
    final private String type;
    final private Map<String, String> edges = new HashMap<>();

    public DependencyDetails(Artifact a, String type) {
        this.group = a.getGroupId();
        this.artifactID = a.getArtifactId();
        this.packaging = a.getType();
        this.version = a.getVersion();
        this.scope = a.getScope();
        this.type = type;
    }

    public void addEdge(String edgeDescriptor) {
        edges.put(edgeDescriptor, edgeDescriptor); //both key and value seem to be the same always?
    }
}