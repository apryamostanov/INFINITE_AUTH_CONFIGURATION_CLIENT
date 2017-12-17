package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Link;
import io.swagger.model.Resource;
import java.util.List;
@Canonical
class ResourcesResource {

    List<Resource> content = new ArrayList<Resource>()

    List<Link> links = new ArrayList<Link>()
  

}

