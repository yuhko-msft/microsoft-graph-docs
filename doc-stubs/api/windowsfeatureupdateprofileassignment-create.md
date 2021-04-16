---
title: "Create windowsFeatureUpdateProfileAssignment"
description: "Create a new windowsFeatureUpdateProfileAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsFeatureUpdateProfileAssignment
Namespace: microsoft.graph



Create a new [windowsFeatureUpdateProfileAssignment](../resources/windowsfeatureupdateprofileassignment.md) object.

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
POST /deviceManagement/windowsFeatureUpdateProfiles/{windowsFeatureUpdateProfileId}/assignments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsFeatureUpdateProfileAssignment](../resources/windowsfeatureupdateprofileassignment.md) object.

The following table shows the properties that are required when you create the [windowsFeatureUpdateProfileAssignment](../resources/windowsfeatureupdateprofileassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The assignment target that the feature update profile is assigned to.|



## Response

If successful, this method returns a `201 Created` response code and a [windowsFeatureUpdateProfileAssignment](../resources/windowsfeatureupdateprofileassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsfeatureupdateprofileassignment_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/windowsFeatureUpdateProfiles/{windowsFeatureUpdateProfileId}/assignments
Content-Type: application/json
Content-length: 177

{
  "@odata.type": "#microsoft.graph.windowsFeatureUpdateProfileAssignment",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsFeatureUpdateProfileAssignment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsFeatureUpdateProfileAssignment",
  "id": "d9f2e0dd-e0dd-d9f2-dde0-f2d9dde0f2d9",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

