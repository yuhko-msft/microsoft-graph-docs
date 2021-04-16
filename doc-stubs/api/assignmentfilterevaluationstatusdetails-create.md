---
title: "Create assignmentFilterEvaluationStatusDetails"
description: "Create a new assignmentFilterEvaluationStatusDetails object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create assignmentFilterEvaluationStatusDetails
Namespace: microsoft.graph



Create a new [assignmentFilterEvaluationStatusDetails](../resources/assignmentfilterevaluationstatusdetails.md) object.

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
POST /me/managedDevices/{managedDeviceId}/assignmentFilterEvaluationStatusDetails
POST /users/{usersId}/managedDevices/{managedDeviceId}/assignmentFilterEvaluationStatusDetails
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [assignmentFilterEvaluationStatusDetails](../resources/assignmentfilterevaluationstatusdetails.md) object.

The following table shows the properties that are required when you create the [assignmentFilterEvaluationStatusDetails](../resources/assignmentfilterevaluationstatusdetails.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|payloadId|String|PayloadId on which filter has been applied.|



## Response

If successful, this method returns a `201 Created` response code and an [assignmentFilterEvaluationStatusDetails](../resources/assignmentfilterevaluationstatusdetails.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_assignmentfilterevaluationstatusdetails_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/me/managedDevices/{managedDeviceId}/assignmentFilterEvaluationStatusDetails
Content-Type: application/json
Content-length: 107

{
  "@odata.type": "#microsoft.graph.assignmentFilterEvaluationStatusDetails",
  "payloadId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.assignmentFilterEvaluationStatusDetails"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.assignmentFilterEvaluationStatusDetails",
  "id": "192b4505-4505-192b-0545-2b1905452b19",
  "payloadId": "String"
}
```

