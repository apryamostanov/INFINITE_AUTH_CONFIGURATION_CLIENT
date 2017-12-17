package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Version;
@Canonical
class Endpoint {

    Version apiVersion = null

    String endpointName = null

    Long id = null
  

}

