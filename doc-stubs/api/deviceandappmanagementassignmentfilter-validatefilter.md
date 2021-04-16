---
title: "deviceAndAppManagementAssignmentFilter: validateFilter"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# deviceAndAppManagementAssignmentFilter: validateFilter
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
POST /deviceManagement/assignmentFilters/validateFilter
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
|deviceAndAppManagementAssignmentFilter|[deviceAndAppManagementAssignmentFilter](../resources/deviceandappmanagementassignmentfilter.md)|**TODO: Add Description**|



## Response

If successful, this action returns a `200 OK` response code and a [assignmentFilterValidationResult](../resources/assignmentfiltervalidationresult.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "deviceandappmanagementassignmentfilter_validatefilter"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/assignmentFilters/validateFilter

Content-Type: application/json
Content-length: 423

{
  "deviceAndAppManagementAssignmentFilter": {
    "@odata.type": "#microsoft.graph.deviceAndAppManagementAssignmentFilter",
    "id": "String (identifier)",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "displayName": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "platform": "String",
    "roleScopeTags": [
      "String"
    ],
    "rule": "String"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.assignmentFilterValidationResult"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "microsoft.graph.assignmentFilterValidationResult"
  }
}
```

