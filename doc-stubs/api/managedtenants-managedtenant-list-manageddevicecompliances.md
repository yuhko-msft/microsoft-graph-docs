---
title: "List managedDeviceCompliances"
description: "Get the managedDeviceCompliance resources from the managedDeviceCompliances navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List managedDeviceCompliances
Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the managedDeviceCompliance resources from the managedDeviceCompliances navigation property.

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
GET /tenantRelationships/managedTenants/managedDeviceCompliances
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

If successful, this method returns a `200 OK` response code and a collection of [managedDeviceCompliance](../resources/manageddevicecompliance.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_manageddevicecompliance"
}
-->
``` http
GET https://graph.microsoft.com/beta/tenantRelationships/managedTenants/managedDeviceCompliances
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.managedTenants.managedDeviceCompliance)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.managedTenants.managedDeviceCompliance",
      "id": "f712a1c4-a1c4-f712-c4a1-12f7c4a112f7",
      "complianceStatus": "String",
      "deviceType": "String",
      "inGracePeriodUntilDateTime": "String (timestamp)",
      "lastRefreshedDateTime": "String (timestamp)",
      "lastSyncDateTime": "String (timestamp)",
      "managedDeviceId": "String",
      "managedDeviceName": "String",
      "manufacturer": "String",
      "model": "String",
      "osDescription": "String",
      "osVersion": "String",
      "ownerType": "String",
      "tenantDisplayName": "String",
      "tenantId": "String"
    }
  ]
}
```

