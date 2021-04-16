---
title: "List assignments"
description: "Get the deviceManagementScriptAssignment resources from the assignments navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List assignments
Namespace: microsoft.graph



Get the deviceManagementScriptAssignment resources from the assignments navigation property.

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
GET /deviceManagement/deviceManagementScripts/{deviceManagementScriptId}/assignments
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [deviceManagementScriptAssignment](../resources/devicemanagementscriptassignment.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_devicemanagementscriptassignment"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/deviceManagementScripts/{deviceManagementScriptId}/assignments
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.deviceManagementScriptAssignment)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.deviceManagementScriptAssignment",
      "id": "53c05c9d-5c9d-53c0-9d5c-c0539d5cc053",
      "target": {
        "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
      }
    }
  ]
}
```

