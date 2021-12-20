---
title: "List userRunStates"
description: "Get the hardwareConfigurationUserState resources from the userRunStates navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List userRunStates
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the hardwareConfigurationUserState resources from the userRunStates navigation property.

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
GET /deviceManagement/hardwareConfigurations/{hardwareConfigurationId}/userRunStates
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

If successful, this method returns a `200 OK` response code and a collection of [hardwareConfigurationUserState](../resources/hardwareconfigurationuserstate.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_hardwareconfigurationuserstate"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceManagement/hardwareConfigurations/{hardwareConfigurationId}/userRunStates
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.hardwareConfigurationUserState)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.hardwareConfigurationUserState",
      "id": "ea870d5e-0d5e-ea87-5e0d-87ea5e0d87ea",
      "upn": "String",
      "userEmail": "String",
      "userName": "String",
      "lastStateUpdateDateTime": "String (timestamp)",
      "successfulDeviceCount": "Integer",
      "failedDeviceCount": "Integer",
      "pendingDeviceCount": "Integer",
      "errorDeviceCount": "Integer",
      "notApplicableDeviceCount": "Integer",
      "unknownDeviceCount": "Integer"
    }
  ]
}
```

