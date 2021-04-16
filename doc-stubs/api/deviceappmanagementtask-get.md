---
title: "Get deviceAppManagementTask"
description: "Read the properties and relationships of a deviceAppManagementTask object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get deviceAppManagementTask
Namespace: microsoft.graph



Read the properties and relationships of a [deviceAppManagementTask](../resources/deviceappmanagementtask.md) object.

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
GET /deviceAppManagement/deviceAppManagementTasks/{deviceAppManagementTaskId}
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

If successful, this method returns a `200 OK` response code and a [deviceAppManagementTask](../resources/deviceappmanagementtask.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_deviceappmanagementtask"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceAppManagement/deviceAppManagementTasks/{deviceAppManagementTaskId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceAppManagementTask"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.deviceAppManagementTask",
    "id": "42ba064e-064e-42ba-4e06-ba424e06ba42",
    "assignedTo": "String",
    "category": "String",
    "createdDateTime": "String (timestamp)",
    "creator": "String",
    "creatorNotes": "String",
    "description": "String",
    "displayName": "String",
    "dueDateTime": "String (timestamp)",
    "priority": "String",
    "status": "String"
  }
}
```

