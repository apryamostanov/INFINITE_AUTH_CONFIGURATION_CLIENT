package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Accessor;
import io.swagger.model.Endpoint;
import io.swagger.model.Version;
@Canonical
class Accessor {

  /* Output field. Internal name of the accessor record. */
  String accessorName = null

  /* Matching field. API version (combination of minor and major versions). Allows overriding authorization rules level of specific API version. Supported wildcard value \"null\". Same value should be in Authorization Validation web app endpoint configuration. */
  Version apiVersion = null

  /* Matching field. Client software name, hardcoded on the client side. E.g. name of the app. Supported wildcard value \"Any\". */
  String appName = null

  /* Matching field. Client software platform name (iOS, Android, React), hardcoded on the client side. E.g. name of the app. Supported wildcard value \"Any\". */
  String appVersion = null

  /* Matching field. Endpoint ID/object as configured on web app instance (granting server). Allows overriding authorization rules level of specific endpoint. Supported wildcard value \"null\". Same value should be in Authorization Validation web app endpoint configuration. */
  Endpoint endpoint = null

    String fiid = null

  /* Accessor id, generated field */
  Long id = null

  /* Optional output field. Indicates that this specific accessor is banned - for Accessor authentication provider. E.g. to restrict clients with outdated unsupported API versions */
  Integer isForbidden = null

  /* Internal field. Priority for Accessor identity provider matching. All accessor definitions are sorted with this field - and those with higher priority - matched first within Accessor authentication provider */
  Integer lookupPriority = null

  /* Optional output field. Indicates the accessor record containing configuration groups (Authorizations, Identities, Scopes) - which are not defined at this child accessor level */
  Accessor parentAccessor = null

  /* Matching field. Client software platform name (iOS, Android, React), hardcoded on the client side. E.g. name of the app. Supported wildcard value \"Any\". */
  String platform = null

  /* Matching field. Application product. Allows overriding authorization rules level of specific product. Supported wildcard value \"Any\". */
  String product = null

  /* Matching field. Application product group. Allows overriding authorization rules level of specific product group. Supported wildcard value \"Any\". */
  String productGroup = null

  /* Matching field. Application user. Allows overriding authorization rules level of specific user. Supported wildcard value \"Any\". */
  String user = null
  

}

