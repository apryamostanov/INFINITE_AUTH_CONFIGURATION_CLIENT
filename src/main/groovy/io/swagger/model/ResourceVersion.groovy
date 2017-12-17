package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Link;
import io.swagger.model.Resource;
import io.swagger.model.Version;
import java.util.List;
@Canonical
class ResourceVersion {

    Long id = null

    List<Link> links = new ArrayList<Link>()

    Version parentVersion = null

    List<Resource> resourceList = new ArrayList<Resource>()

    String versionName = null
  

}

