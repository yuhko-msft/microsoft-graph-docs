---
title: "Update windowsQualityUpdateProfileAssignment"
description: "Update the properties of a windowsQualityUpdateProfileAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsQualityUpdateProfileAssignment
Namespace: microsoft.graph



Update the properties of a [windowsQualityUpdateProfileAssignment](../resources/windowsqualityupdateprofileassignment.md) object.

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
PATCH /deviceManagement/windowsQualityUpdateProfiles/{windowsQualityUpdateProfileId}/assignments/{windowsQualityUpdateProfileAssignmentId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsQualityUpdateProfileAssignment](../resources/windowsqualityupdateprofileassignment.md) object.

The following table shows the properties that are required when you update the [windowsQualityUpdateProfileAssignment](../resources/windowsqualityupdateprofileassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The assignment target that the feature update profile is assigned to.|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsQualityUpdateProfileAssignment](../resources/windowsqualityupdateprofileassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowsqualityupdateprofileassignment"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/windowsQualityUpdateProfiles/{windowsQualityUpdateProfileId}/assignments/{windowsQualityUpdateProfileAssignmentId}
Content-Type: application/json
Content-length: 177

{
  "@odata.type": "#microsoft.graph.windowsQualityUpdateProfileAssignment",
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
  "@odata.type": "#microsoft.graph.windowsQualityUpdateProfileAssignment",
  "id": "76236157-6157-7623-5761-237657612376",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

