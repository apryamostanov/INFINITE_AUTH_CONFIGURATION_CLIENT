package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Endpoint;
import io.swagger.model.Link;
import java.util.List;
@Canonical
class ResourcesListEndpoint {

    List<List<Endpoint>> content = new ArrayList<List<Endpoint>>()

    List<Link> links = new ArrayList<Link>()
  

}

