---
title: "Create embeddedSIMActivationCodePoolAssignment"
description: "Create a new embeddedSIMActivationCodePoolAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create embeddedSIMActivationCodePoolAssignment
Namespace: microsoft.graph



Create a new [embeddedSIMActivationCodePoolAssignment](../resources/embeddedsimactivationcodepoolassignment.md) object.

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
POST /deviceManagement/embeddedSIMActivationCodePools/{embeddedSIMActivationCodePoolId}/assignments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [embeddedSIMActivationCodePoolAssignment](../resources/embeddedsimactivationcodepoolassignment.md) object.

The following table shows the properties that are required when you create the [embeddedSIMActivationCodePoolAssignment](../resources/embeddedsimactivationcodepoolassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The type of groups targeted by the embedded SIM activation code pool.|



## Response

If successful, this method returns a `201 Created` response code and an [embeddedSIMActivationCodePoolAssignment](../resources/embeddedsimactivationcodepoolassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_embeddedsimactivationcodepoolassignment_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/embeddedSIMActivationCodePools/{embeddedSIMActivationCodePoolId}/assignments
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
  "truncated": true,
  "@odata.type": "microsoft.graph.embeddedSIMActivationCodePoolAssignment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.embeddedSIMActivationCodePoolAssignment",
  "id": "ae15323c-323c-ae15-3c32-15ae3c3215ae",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

