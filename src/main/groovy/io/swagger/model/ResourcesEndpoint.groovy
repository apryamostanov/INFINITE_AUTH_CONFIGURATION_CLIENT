package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Endpoint;
import io.swagger.model.Link;
import java.util.List;
@Canonical
class ResourcesEndpoint {

    List<Endpoint> content = new ArrayList<Endpoint>()

    List<Link> links = new ArrayList<Link>()
  

}

