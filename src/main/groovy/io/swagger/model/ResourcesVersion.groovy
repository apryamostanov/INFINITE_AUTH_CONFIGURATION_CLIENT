package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Link;
import io.swagger.model.Version;
import java.util.List;
@Canonical
class ResourcesVersion {

    List<Version> content = new ArrayList<Version>()

    List<Link> links = new ArrayList<Link>()
  

}

