package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Authentication;
import io.swagger.model.Link;
import java.util.List;
@Canonical
class ResourcesListAuthentication {

    List<List<Authentication>> content = new ArrayList<List<Authentication>>()

    List<Link> links = new ArrayList<Link>()
  

}

