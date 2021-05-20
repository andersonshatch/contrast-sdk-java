package com.contrastsecurity.models.oss.dependencytree;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public final class JavaContainer {
    @SerializedName("mavenDependencyTrees")
    final Map<String, Map<String, DependencyDetails>> trees;
}
