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
class ResourceRule {

    Accessor accessor = null

    Authorization authorization = null

    Integer durationSeconds = null

    Long id = null

    Identity identity = null

    List<Link> links = new ArrayList<Link>()

    Integer lookupPriority = null

    Integer maxUsageCount = null

    Integer refreshAllowed = null

    Integer refreshDurationSeconds = null

    Scope scope = null
  

}

