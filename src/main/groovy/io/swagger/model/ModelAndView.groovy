package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.View;
import java.util.List;
@Canonical
class ModelAndView {

    Boolean empty = null

    Object model = null

    Map<String, Object> modelMap = new HashMap<String, Object>()

    Boolean reference = null

    String status = null

    View view = null

    String viewName = null
  

}

