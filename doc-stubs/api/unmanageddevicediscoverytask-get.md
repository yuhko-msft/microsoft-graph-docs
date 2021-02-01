---
title: "Get unmanagedDeviceDiscoveryTask"
description: "Read the properties and relationships of an unmanagedDeviceDiscoveryTask object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get unmanagedDeviceDiscoveryTask
Namespace: microsoft.graph

Read the properties and relationships of an [unmanagedDeviceDiscoveryTask](../resources/unmanageddevicediscoverytask.md) object.

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
GET /unmanagedDeviceDiscoveryTask
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

If successful, this method returns a `200 OK` response code and an [unmanagedDeviceDiscoveryTask](../resources/unmanageddevicediscoverytask.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_unmanageddevicediscoverytask"
}
-->
``` http
GET https://graph.microsoft.com/beta/unmanagedDeviceDiscoveryTask
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.unmanagedDeviceDiscoveryTask"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.unmanagedDeviceDiscoveryTask",
    "id": "5718f574-f574-5718-74f5-185774f51857",
    "displayName": "String",
    "description": "String",
    "createdDateTime": "String (timestamp)",
    "dueDateTime": "String (timestamp)",
    "category": "String",
    "priority": "String",
    "creator": "String",
    "creatorNotes": "String",
    "assignedTo": "String",
    "status": "String",
    "unmanagedDevices": [
      {
        "@odata.type": "microsoft.graph.unmanagedDevice"
      }
    ]
  }
}
```

