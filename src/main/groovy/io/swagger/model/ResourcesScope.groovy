package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Link;
import io.swagger.model.Scope;
import java.util.List;
@Canonical
class ResourcesScope {

    List<Scope> content = new ArrayList<Scope>()

    List<Link> links = new ArrayList<Link>()
  

}

