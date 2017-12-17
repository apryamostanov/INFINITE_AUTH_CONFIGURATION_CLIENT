package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Accessor;
import io.swagger.model.ArrayList;
import io.swagger.model.Link;
import java.util.List;
@Canonical
class ResourcesAccessor {

    List<Accessor> content = new ArrayList<Accessor>()

    List<Link> links = new ArrayList<Link>()
  

}

