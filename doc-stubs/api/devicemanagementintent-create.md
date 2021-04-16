---
title: "Create deviceManagementIntent"
description: "Create a new deviceManagementIntent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementIntent
Namespace: microsoft.graph



Create a new [deviceManagementIntent](../resources/devicemanagementintent.md) object.

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
POST /deviceManagement/intents
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementIntent](../resources/devicemanagementintent.md) object.

The following table shows the properties that are required when you create the [deviceManagementIntent](../resources/devicemanagementintent.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|description|String|The user given description|
|displayName|String|The user given display name|
|isAssigned|Boolean|Signifies whether or not the intent is assigned to users|
|lastModifiedDateTime|DateTimeOffset|When the intent was last modified|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|
|templateId|String|The ID of the template this intent was created from (if any)|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementIntent](../resources/devicemanagementintent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementintent_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/intents
Content-Type: application/json
Content-length: 219

{
  "@odata.type": "#microsoft.graph.deviceManagementIntent",
  "description": "String",
  "displayName": "String",
  "isAssigned": "Boolean",
  "roleScopeTagIds": [
    "String"
  ],
  "templateId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementIntent"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementIntent",
  "id": "851c98b0-98b0-851c-b098-1c85b0981c85",
  "description": "String",
  "displayName": "String",
  "isAssigned": "Boolean",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "templateId": "String"
}
```

