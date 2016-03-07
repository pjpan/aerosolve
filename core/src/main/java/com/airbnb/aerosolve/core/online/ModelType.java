package com.airbnb.aerosolve.core.online;

import lombok.Getter;

public class ModelType {
  @Getter
  private final String configName;
  @Getter
  private final String key;

  @Getter
  private final String modelName;

  @Getter
  private final String path;

  public ModelType(String modelName, String configName, String key) {
    this.modelName = modelName;
    this.configName = configName;
    this.key = key;
    path = "appraiser/" + modelName;
  }
}
