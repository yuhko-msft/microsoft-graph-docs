---
title: "Update accessPackageAssignment"
description: "Update the properties of an accessPackageAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update accessPackageAssignment
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [accessPackageAssignment](../resources/accesspackageassignment.md) object.

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
PATCH /accessPackageAssignments/{accessPackageAssignmentsId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [accessPackageAssignment](../resources/accesspackageassignment.md) object.

The following table shows the properties that are required when you update the [accessPackageAssignment](../resources/accesspackageassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|accessPackageId|String|**TODO: Add Description**|
|assignmentPolicyId|String|**TODO: Add Description**|
|assignmentState|String|**TODO: Add Description**|
|assignmentStatus|String|**TODO: Add Description**|
|catalogId|String|**TODO: Add Description**|
|expiredDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|isExtended|Boolean|**TODO: Add Description**|
|schedule|[Microsoft.IGAELM.EC.FrontEnd.ExternalModel.requestSchedule](../resources/requestschedule.md)|**TODO: Add Description**|
|targetId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [accessPackageAssignment](../resources/accesspackageassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_accesspackageassignment"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/accessPackageAssignments/{accessPackageAssignmentsId}
Content-Type: application/json
Content-length: 397

{
  "@odata.type": "#microsoft.graph.accessPackageAssignment",
  "accessPackageId": "String",
  "assignmentPolicyId": "String",
  "assignmentState": "String",
  "assignmentStatus": "String",
  "catalogId": "String",
  "expiredDateTime": "String (timestamp)",
  "isExtended": "Boolean",
  "schedule": {
    "@odata.type": "microsoft.graph.requestSchedule"
  },
  "targetId": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.accessPackageAssignment",
  "accessPackageId": "String",
  "assignmentPolicyId": "String",
  "assignmentState": "String",
  "assignmentStatus": "String",
  "catalogId": "String",
  "expiredDateTime": "String (timestamp)",
  "id": "3a83e87f-e87f-3a83-7fe8-833a7fe8833a",
  "isExtended": "Boolean",
  "schedule": {
    "@odata.type": "microsoft.graph.requestSchedule"
  },
  "targetId": "String"
}
```

