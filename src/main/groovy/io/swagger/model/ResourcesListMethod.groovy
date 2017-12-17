package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Link;
import io.swagger.model.Method;
import java.util.List;
@Canonical
class ResourcesListMethod {

    List<List<Method>> content = new ArrayList<List<Method>>()

    List<Link> links = new ArrayList<Link>()
  

}

