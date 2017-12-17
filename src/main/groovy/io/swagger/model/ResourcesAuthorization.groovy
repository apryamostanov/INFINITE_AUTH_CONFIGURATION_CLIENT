package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Authorization;
import io.swagger.model.Link;
import java.util.List;
@Canonical
class ResourcesAuthorization {

    List<Authorization> content = new ArrayList<Authorization>()

    List<Link> links = new ArrayList<Link>()
  

}

