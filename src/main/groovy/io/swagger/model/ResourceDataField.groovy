package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Link;
import java.util.List;
@Canonical
class ResourceDataField {

    String fieldName = null

    String fieldValue = null

    Long id = null

    List<Link> links = new ArrayList<Link>()
  

}

