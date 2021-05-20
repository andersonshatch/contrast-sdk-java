package com.contrastsecurity.models.oss.dependencytree;

import lombok.Data;

@Data
public final class DependencyTreeBody {
    final private String appID;
    final private String cliVersion;
    final private Snapshot snapshot;
}