---
title: "List hardwareConfigurationRunSummaries"
description: "Get a list of the hardwareConfigurationRunSummary objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List hardwareConfigurationRunSummaries
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of the [hardwareConfigurationRunSummary](../resources/intune-hardwareconfigurationrunsummary.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.hardwareConfigurationRunSummary not found
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

If successful, this method returns a `200 OK` response code and a collection of [hardwareConfigurationRunSummary](../resources/hardwareconfigurationrunsummary.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_hardwareconfigurationrunsummary"
}
-->
``` http
GET https://graph.microsoft.com/beta** Collection URI for microsoft.graph.hardwareConfigurationRunSummary not found
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.hardwareConfigurationRunSummary)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.hardwareConfigurationRunSummary",
      "id": "3bf7d848-d848-3bf7-48d8-f73b48d8f73b",
      "successfulDeviceCount": "Integer",
      "failedDeviceCount": "Integer",
      "pendingDeviceCount": "Integer",
      "errorDeviceCount": "Integer",
      "notApplicableDeviceCount": "Integer",
      "unknownDeviceCount": "Integer",
      "successfulUserCount": "Integer",
      "failedUserCount": "Integer",
      "pendingUserCount": "Integer",
      "errorUserCount": "Integer",
      "notApplicableUserCount": "Integer",
      "unknownUserCount": "Integer",
      "lastRunDateTime": "String (timestamp)"
    }
  ]
}
```

