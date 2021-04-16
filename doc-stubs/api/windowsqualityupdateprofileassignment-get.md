---
title: "Get windowsQualityUpdateProfileAssignment"
description: "Read the properties and relationships of a windowsQualityUpdateProfileAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get windowsQualityUpdateProfileAssignment
Namespace: microsoft.graph



Read the properties and relationships of a [windowsQualityUpdateProfileAssignment](../resources/windowsqualityupdateprofileassignment.md) object.

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
GET /deviceManagement/windowsQualityUpdateProfiles/{windowsQualityUpdateProfileId}/assignments/{windowsQualityUpdateProfileAssignmentId}
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

If successful, this method returns a `200 OK` response code and a [windowsQualityUpdateProfileAssignment](../resources/windowsqualityupdateprofileassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_windowsqualityupdateprofileassignment"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/windowsQualityUpdateProfiles/{windowsQualityUpdateProfileId}/assignments/{windowsQualityUpdateProfileAssignmentId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsQualityUpdateProfileAssignment"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.windowsQualityUpdateProfileAssignment",
    "id": "76236157-6157-7623-5761-237657612376",
    "target": {
      "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
    }
  }
}
```

