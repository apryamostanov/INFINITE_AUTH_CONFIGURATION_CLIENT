package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.DataField;
import io.swagger.model.Grant;
import io.swagger.model.Link;
import io.swagger.model.Method;
import io.swagger.model.Resource;
import io.swagger.model.Url;
import java.util.List;
@Canonical
class ResourceGrant {

    Long id = null

    List<Link> links = new ArrayList<Link>()

    List<Method> methodList = new ArrayList<Method>()

    Grant parentGrant = null

    List<DataField> payloadKeyFieldList = new ArrayList<DataField>()

    Resource resource = null

    List<Url> searchUrlList = new ArrayList<Url>()

    Url url = null
  

}

