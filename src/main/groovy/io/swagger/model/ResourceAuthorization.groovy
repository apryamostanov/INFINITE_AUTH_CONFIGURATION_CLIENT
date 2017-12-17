package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Accessor;
import io.swagger.model.ArrayList;
import io.swagger.model.Authorization;
import io.swagger.model.Identity;
import io.swagger.model.Link;
import io.swagger.model.Scope;
import java.util.List;
@Canonical
class ResourceAuthorization {

    Accessor accessor = null

    String authorizationName = null

    Long id = null

    List<Identity> identityList = new ArrayList<Identity>()

    List<Link> links = new ArrayList<Link>()

    Authorization prerequisiteAuthorization = null

    List<Scope> scopeList = new ArrayList<Scope>()
  

}

