package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.DataField;
import io.swagger.model.Link;
import java.util.List;
@Canonical
class ResourcesDataField {

    List<DataField> content = new ArrayList<DataField>()

    List<Link> links = new ArrayList<Link>()
  

}

