---
title: "Update groupPolicyConfiguration"
description: "Update the properties of a groupPolicyConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update groupPolicyConfiguration
Namespace: microsoft.graph



Update the properties of a [groupPolicyConfiguration](../resources/grouppolicyconfiguration.md) object.

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
PATCH /deviceManagement/groupPolicyConfigurations/{groupPolicyConfigurationId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyConfiguration](../resources/grouppolicyconfiguration.md) object.

The following table shows the properties that are required when you update the [groupPolicyConfiguration](../resources/grouppolicyconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|The date and time the object was created.|
|description|String|User provided description for the resource object.|
|displayName|String|User provided name for the resource object.|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified.|
|roleScopeTagIds|String collection|The list of scope tags for the configuration.|



## Response

If successful, this method returns a `200 OK` response code and an updated [groupPolicyConfiguration](../resources/grouppolicyconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_grouppolicyconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/groupPolicyConfigurations/{groupPolicyConfigurationId}
Content-Type: application/json
Content-length: 166

{
  "@odata.type": "#microsoft.graph.groupPolicyConfiguration",
  "description": "String",
  "displayName": "String",
  "roleScopeTagIds": [
    "String"
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.groupPolicyConfiguration",
  "id": "182d8a7a-8a7a-182d-7a8a-2d187a8a2d18",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ]
}
```

