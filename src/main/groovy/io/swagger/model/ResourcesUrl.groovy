package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Link;
import io.swagger.model.Url;
import java.util.List;
@Canonical
class ResourcesUrl {

    List<Url> content = new ArrayList<Url>()

    List<Link> links = new ArrayList<Link>()
  

}

