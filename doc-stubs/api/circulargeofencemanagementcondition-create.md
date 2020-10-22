---
title: "Create circularGeofenceManagementCondition"
description: "Create a new circularGeofenceManagementCondition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create circularGeofenceManagementCondition
Namespace: microsoft.graph

Create a new [circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md) object.

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
POST ** Collection URI for microsoft.graph.circularGeofenceManagementCondition not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md) object.

The following table shows the properties that are required when you create the [circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md).

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
|latitude|Double|**TODO: Add Description**|
|longitude|Double|**TODO: Add Description**|
|radiusInMeters|Single|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_circulargeofencemanagementcondition_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.circularGeofenceManagementCondition not found
Content-Type: application/json
Content-length: 311

{
  "@odata.type": "#microsoft.graph.circularGeofenceManagementCondition",
  "uniqueName": "String",
  "displayName": "String",
  "description": "String",
  "eTag": "String",
  "applicablePlatforms": [
    "String"
  ],
  "latitude": "Double",
  "longitude": "Double",
  "radiusInMeters": "Single"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.circularGeofenceManagementCondition"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.circularGeofenceManagementCondition",
  "id": "406cf521-f521-406c-21f5-6c4021f56c40",
  "uniqueName": "String",
  "displayName": "String",
  "description": "String",
  "createdDateTime": "String (timestamp)",
  "modifiedDateTime": "String (timestamp)",
  "eTag": "String",
  "applicablePlatforms": [
    "String"
  ],
  "latitude": "Double",
  "longitude": "Double",
  "radiusInMeters": "Single"
}
```

