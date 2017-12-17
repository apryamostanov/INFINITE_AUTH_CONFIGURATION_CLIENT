package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.DataField;
import java.util.List;
@Canonical
class Authentication {

  /* Defines the Granting Server -> Authentication Provider name */
  String authenticationName = null

  /* Functional key fields returned by Authentication module/Authentication provider to accessor */
  List<DataField> functionalFieldList = new ArrayList<DataField>()

  /* Authentication id, generated field */
  Long id = null

  /* Data Authorization key fields returned by Authentication module/Authentication provider to accessor */
  List<DataField> keyFieldList = new ArrayList<DataField>()

  /* Private portion of Authentication data, required to be provided by accessors */
  List<DataField> privateDataFieldList = new ArrayList<DataField>()

  /* Public portion of Authentication data, required to be provided by accessors */
  List<DataField> publicDataFieldList = new ArrayList<DataField>()
  

}

