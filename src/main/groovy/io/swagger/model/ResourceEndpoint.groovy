package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Link;
import io.swagger.model.Version;
import java.util.List;
@Canonical
class ResourceEndpoint {

    Version apiVersion = null

    String endpointName = null

    Long id = null

    List<Link> links = new ArrayList<Link>()
  

}

