---
title: "Create policySet"
description: "Create a new policySet object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create policySet
Namespace: microsoft.graph



Create a new policySet object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /deviceAppManagement/policySets
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [policySet](../resources/policyset.md) object.

The following table shows the properties that are required when you create the [policySet](../resources/policyset.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|Creation time of the PolicySet.|
|description|String|Description of the PolicySet.|
|displayName|String|DisplayName of the PolicySet.|
|errorCode|errorCode|Error code if any occured. Possible values are: `noError`, `unauthorized`, `notFound`, `deleted`.|
|guidedDeploymentTags|String collection|Tags of the guided deployment|
|lastModifiedDateTime|DateTimeOffset|Last modified time of the PolicySet.|
|roleScopeTags|String collection|RoleScopeTags of the PolicySet|
|status|policySetStatus|Validation/assignment status of the PolicySet. Possible values are: `unknown`, `validating`, `partialSuccess`, `success`, `error`, `notAssigned`.|



## Response

If successful, this method returns a `201 Created` response code and a [policySet](../resources/policyset.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_policyset_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceAppManagement/policySets
Content-Type: application/json
Content-length: 247

{
  "@odata.type": "#microsoft.graph.policySet",
  "description": "String",
  "displayName": "String",
  "errorCode": "String",
  "guidedDeploymentTags": [
    "String"
  ],
  "roleScopeTags": [
    "String"
  ],
  "status": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.policySet"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.policySet",
  "id": "0b36ce60-ce60-0b36-60ce-360b60ce360b",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "errorCode": "String",
  "guidedDeploymentTags": [
    "String"
  ],
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTags": [
    "String"
  ],
  "status": "String"
}
```

