package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Accessor;
import io.swagger.model.ArrayList;
import io.swagger.model.Authentication;
import io.swagger.model.Link;
import java.util.List;
@Canonical
class ResourceIdentity {

    Accessor accessor = null

    List<Authentication> authenticationList = new ArrayList<Authentication>()

    Long id = null

    String identityName = null

    List<Link> links = new ArrayList<Link>()
  

}

