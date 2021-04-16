---
title: "Update policySetAssignment"
description: "Update the properties of a policySetAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update policySetAssignment
Namespace: microsoft.graph



Update the properties of a [policySetAssignment](../resources/policysetassignment.md) object.

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
PATCH /deviceAppManagement/policySets/{policySetId}/assignments/{policySetAssignmentId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [policySetAssignment](../resources/policysetassignment.md) object.

The following table shows the properties that are required when you update the [policySetAssignment](../resources/policysetassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|Last modified time of the PolicySetAssignment.|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The target group of PolicySetAssignment|



## Response

If successful, this method returns a `200 OK` response code and an updated [policySetAssignment](../resources/policysetassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_policysetassignment"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceAppManagement/policySets/{policySetId}/assignments/{policySetAssignmentId}
Content-Type: application/json
Content-length: 159

{
  "@odata.type": "#microsoft.graph.policySetAssignment",
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
  "@odata.type": "#microsoft.graph.policySetAssignment",
  "id": "4698f1f9-f1f9-4698-f9f1-9846f9f19846",
  "lastModifiedDateTime": "String (timestamp)",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

