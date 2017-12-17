package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Identity;
import io.swagger.model.Link;
import java.util.List;
@Canonical
class ResourcesIdentity {

    List<Identity> content = new ArrayList<Identity>()

    List<Link> links = new ArrayList<Link>()
  

}

