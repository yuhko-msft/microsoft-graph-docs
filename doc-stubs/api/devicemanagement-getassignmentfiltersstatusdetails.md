---
title: "deviceManagement: getAssignmentFiltersStatusDetails"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# deviceManagement: getAssignmentFiltersStatusDetails
Namespace: microsoft.graph



**TODO: Add Description**

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
POST /deviceManagement/getAssignmentFiltersStatusDetails
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|managedDeviceId|String|**TODO: Add Description**|
|payloadId|String|**TODO: Add Description**|
|userId|String|**TODO: Add Description**|
|assignmentFilterIds|String collection|**TODO: Add Description**|
|top|Int32|**TODO: Add Description**|
|skip|Int32|**TODO: Add Description**|



## Response

If successful, this action returns a `200 OK` response code and a [assignmentFilterStatusDetails](../resources/assignmentfilterstatusdetails.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "devicemanagement_getassignmentfiltersstatusdetails"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/getAssignmentFiltersStatusDetails

Content-Type: application/json
Content-length: 175

{
  "managedDeviceId": "String",
  "payloadId": "String",
  "userId": "String",
  "assignmentFilterIds": [
    "String"
  ],
  "top": "Integer",
  "skip": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.assignmentFilterStatusDetails"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "microsoft.graph.assignmentFilterStatusDetails"
  }
}
```

