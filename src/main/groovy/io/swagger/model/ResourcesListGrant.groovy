package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Grant;
import io.swagger.model.Link;
import java.util.List;
@Canonical
class ResourcesListGrant {

    List<List<Grant>> content = new ArrayList<List<Grant>>()

    List<Link> links = new ArrayList<Link>()
  

}

