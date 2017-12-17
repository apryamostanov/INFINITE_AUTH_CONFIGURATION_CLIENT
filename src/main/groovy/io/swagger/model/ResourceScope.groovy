package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Accessor;
import io.swagger.model.ArrayList;
import io.swagger.model.Grant;
import io.swagger.model.Link;
import java.util.List;
@Canonical
class ResourceScope {

    Accessor accessor = null

    List<Grant> grantList = new ArrayList<Grant>()

    Long id = null

    List<Link> links = new ArrayList<Link>()

    String scopeName = null
  

}

