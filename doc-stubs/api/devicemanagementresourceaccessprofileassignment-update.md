---
title: "Update deviceManagementResourceAccessProfileAssignment"
description: "Update the properties of a deviceManagementResourceAccessProfileAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementResourceAccessProfileAssignment
Namespace: microsoft.graph



Update the properties of a [deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) object.

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
PATCH /deviceManagement/resourceAccessProfiles/{deviceManagementResourceAccessProfileBaseId}/assignments/{deviceManagementResourceAccessProfileAssignmentId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) object.

The following table shows the properties that are required when you update the [deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|intent|deviceManagementResourceAccessProfileIntent|The assignment intent for the resource access profile. Possible values are: `apply`, `remove`.|
|sourceId|String|The identifier of the source of the assignment.|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The assignment target for the resource access profile.|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementresourceaccessprofileassignment"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/resourceAccessProfiles/{deviceManagementResourceAccessProfileBaseId}/assignments/{deviceManagementResourceAccessProfileAssignmentId}
Content-Type: application/json
Content-length: 235

{
  "@odata.type": "#microsoft.graph.deviceManagementResourceAccessProfileAssignment",
  "intent": "String",
  "sourceId": "String",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
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
  "@odata.type": "#microsoft.graph.deviceManagementResourceAccessProfileAssignment",
  "id": "a943abc6-abc6-a943-c6ab-43a9c6ab43a9",
  "intent": "String",
  "sourceId": "String",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

