---
title: "Update embeddedSIMActivationCodePoolAssignment"
description: "Update the properties of an embeddedSIMActivationCodePoolAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update embeddedSIMActivationCodePoolAssignment
Namespace: microsoft.graph



Update the properties of an [embeddedSIMActivationCodePoolAssignment](../resources/embeddedsimactivationcodepoolassignment.md) object.

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
PATCH /deviceManagement/embeddedSIMActivationCodePools/{embeddedSIMActivationCodePoolId}/assignments/{embeddedSIMActivationCodePoolAssignmentId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [embeddedSIMActivationCodePoolAssignment](../resources/embeddedsimactivationcodepoolassignment.md) object.

The following table shows the properties that are required when you update the [embeddedSIMActivationCodePoolAssignment](../resources/embeddedsimactivationcodepoolassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The type of groups targeted by the embedded SIM activation code pool.|



## Response

If successful, this method returns a `200 OK` response code and an updated [embeddedSIMActivationCodePoolAssignment](../resources/embeddedsimactivationcodepoolassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_embeddedsimactivationcodepoolassignment"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/embeddedSIMActivationCodePools/{embeddedSIMActivationCodePoolId}/assignments/{embeddedSIMActivationCodePoolAssignmentId}
Content-Type: application/json
Content-length: 179

{
  "@odata.type": "#microsoft.graph.embeddedSIMActivationCodePoolAssignment",
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
  "@odata.type": "#microsoft.graph.embeddedSIMActivationCodePoolAssignment",
  "id": "ae15323c-323c-ae15-3c32-15ae3c3215ae",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

