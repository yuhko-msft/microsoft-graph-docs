---
title: "Get vulnerableManagedDevice"
description: "Read the properties and relationships of a vulnerableManagedDevice object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get vulnerableManagedDevice
Namespace: microsoft.graph

Read the properties and relationships of a [vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
GET /securityConfigurationTask/managedDevices/{vulnerableManagedDeviceId}
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

If successful, this method returns a `200 OK` response code and a [vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_vulnerablemanageddevice"
}
-->
``` http
GET https://graph.microsoft.com/beta/securityConfigurationTask/managedDevices/{vulnerableManagedDeviceId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.vulnerableManagedDevice"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.vulnerableManagedDevice",
    "id": "e8d73bef-3bef-e8d7-ef3b-d7e8ef3bd7e8",
    "managedDeviceId": "String",
    "displayName": "String",
    "lastSyncDateTime": "String (timestamp)"
  }
}
```

