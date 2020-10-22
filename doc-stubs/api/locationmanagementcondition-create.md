---
title: "Create locationManagementCondition"
description: "Create a new locationManagementCondition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create locationManagementCondition
Namespace: microsoft.graph

Create a new [locationManagementCondition](../resources/locationmanagementcondition.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
POST ** Collection URI for microsoft.graph.locationManagementCondition not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [locationManagementCondition](../resources/locationmanagementcondition.md) object.

The following table shows the properties that are required when you create the [locationManagementCondition](../resources/locationmanagementcondition.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|uniqueName|String|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|displayName|String|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|description|String|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|modifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|eTag|String|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|applicablePlatforms|devicePlatformType collection|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md). Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `unknown`.|



## Response

If successful, this method returns a `201 Created` response code and a [locationManagementCondition](../resources/locationmanagementcondition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_locationmanagementcondition_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.locationManagementCondition not found
Content-Type: application/json
Content-length: 221

{
  "@odata.type": "#microsoft.graph.locationManagementCondition",
  "uniqueName": "String",
  "displayName": "String",
  "description": "String",
  "eTag": "String",
  "applicablePlatforms": [
    "String"
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.locationManagementCondition"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.locationManagementCondition",
  "id": "cd658d6c-8d6c-cd65-6c8d-65cd6c8d65cd",
  "uniqueName": "String",
  "displayName": "String",
  "description": "String",
  "createdDateTime": "String (timestamp)",
  "modifiedDateTime": "String (timestamp)",
  "eTag": "String",
  "applicablePlatforms": [
    "String"
  ]
}
```

