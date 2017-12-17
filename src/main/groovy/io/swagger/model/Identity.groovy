package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Accessor;
import io.swagger.model.ArrayList;
import io.swagger.model.Authentication;
import java.util.List;
@Canonical
class Identity {

    Accessor accessor = null

    List<Authentication> authenticationList = new ArrayList<Authentication>()

    Long id = null

    String identityName = null
  

}

