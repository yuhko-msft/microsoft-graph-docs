---
title: "Create groupPolicyConfiguration"
description: "Create a new groupPolicyConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create groupPolicyConfiguration
Namespace: microsoft.graph



Create a new groupPolicyConfiguration object.

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
POST /deviceManagement/groupPolicyConfigurations
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyConfiguration](../resources/grouppolicyconfiguration.md) object.

The following table shows the properties that are required when you create the [groupPolicyConfiguration](../resources/grouppolicyconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|The date and time the object was created.|
|description|String|User provided description for the resource object.|
|displayName|String|User provided name for the resource object.|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified.|
|roleScopeTagIds|String collection|The list of scope tags for the configuration.|



## Response

If successful, this method returns a `201 Created` response code and a [groupPolicyConfiguration](../resources/grouppolicyconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_grouppolicyconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/groupPolicyConfigurations
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
  "truncated": true,
  "@odata.type": "microsoft.graph.groupPolicyConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
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

