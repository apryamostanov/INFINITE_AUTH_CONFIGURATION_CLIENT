package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Accessor;
import io.swagger.model.Authorization;
import io.swagger.model.Identity;
import io.swagger.model.MetaClass;
import io.swagger.model.Scope;
@Canonical
class Rule {

    Accessor accessor = null

    Authorization authorization = null

    Integer durationSeconds = null

    Long id = null

    Identity identity = null

    Integer lookupPriority = null

    Integer maxUsageCount = null

    MetaClass metaClass = null

    Integer refreshAllowed = null

    Integer refreshDurationSeconds = null

    Scope scope = null
  

}

