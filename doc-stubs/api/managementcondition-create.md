---
title: "Create managementCondition"
description: "Create a new managementCondition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create managementCondition
Namespace: microsoft.graph



Create a new [managementCondition](../resources/managementcondition.md) object.

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
POST /deviceManagement/managementConditions
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [managementCondition](../resources/managementcondition.md) object.

The following table shows the properties that are required when you create the [managementCondition](../resources/managementcondition.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|applicablePlatforms|devicePlatformType collection|The applicable platforms for this management condition. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `unknown`.|
|createdDateTime|DateTimeOffset|The time the management condition was created. Generated service side.|
|description|String|The admin defined description of the management condition.|
|displayName|String|The admin defined name of the management condition.|
|eTag|String|ETag of the management condition. Updated service side.|
|modifiedDateTime|DateTimeOffset|The time the management condition was last modified. Updated service side.|
|uniqueName|String|Unique name for the management condition. Used in management condition expressions.|



## Response

If successful, this method returns a `201 Created` response code and a [managementCondition](../resources/managementcondition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_managementcondition_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/managementConditions
Content-Type: application/json
Content-length: 213

{
  "@odata.type": "#microsoft.graph.managementCondition",
  "applicablePlatforms": [
    "String"
  ],
  "description": "String",
  "displayName": "String",
  "eTag": "String",
  "uniqueName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.managementCondition"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.managementCondition",
  "id": "a1d8366f-366f-a1d8-6f36-d8a16f36d8a1",
  "applicablePlatforms": [
    "String"
  ],
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "eTag": "String",
  "modifiedDateTime": "String (timestamp)",
  "uniqueName": "String"
}
```

