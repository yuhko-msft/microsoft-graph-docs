---
title: "Create deviceManagementIntentAssignment"
description: "Create a new deviceManagementIntentAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementIntentAssignment
Namespace: microsoft.graph



Create a new deviceManagementIntentAssignment object.

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
POST /deviceManagement/intents/{deviceManagementIntentId}/assignments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementIntentAssignment](../resources/devicemanagementintentassignment.md) object.

The following table shows the properties that are required when you create the [deviceManagementIntentAssignment](../resources/devicemanagementintentassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The assignment target|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementIntentAssignment](../resources/devicemanagementintentassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementintentassignment_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/intents/{deviceManagementIntentId}/assignments
Content-Type: application/json
Content-length: 172

{
  "@odata.type": "#microsoft.graph.deviceManagementIntentAssignment",
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
  "@odata.type": "microsoft.graph.deviceManagementIntentAssignment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementIntentAssignment",
  "id": "4a6b5c6e-5c6e-4a6b-6e5c-6b4a6e5c6b4a",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

