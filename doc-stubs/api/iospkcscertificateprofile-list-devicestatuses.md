---
title: "List deviceStatuses"
description: "Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List deviceStatuses
Namespace: microsoft.graph



Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.

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
GET /deviceManagement/deviceConfigurations/{deviceConfigurationId}/identityCertificate/deviceStatuses
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

If successful, this method returns a `200 OK` response code and a collection of [deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_deviceconfigurationdevicestatus"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/deviceConfigurations/{deviceConfigurationId}/identityCertificate/deviceStatuses
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.deviceConfigurationDeviceStatus)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.deviceConfigurationDeviceStatus",
      "id": "49f58c1d-8c1d-49f5-1d8c-f5491d8cf549",
      "complianceGracePeriodExpirationDateTime": "String (timestamp)",
      "deviceDisplayName": "String",
      "deviceModel": "String",
      "lastReportedDateTime": "String (timestamp)",
      "platform": "Integer",
      "status": "String",
      "userName": "String",
      "userPrincipalName": "String"
    }
  ]
}
```

