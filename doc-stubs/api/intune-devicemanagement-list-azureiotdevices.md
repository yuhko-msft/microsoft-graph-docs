---
title: "List azureIOTDevices"
description: "Get the azureIOTDevice resources from the azureIOTDevices navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List azureIOTDevices
Namespace: microsoft.graph

Get the azureIOTDevice resources from the azureIOTDevices navigation property.

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
GET /deviceManagement/azureIOTDevices
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

If successful, this method returns a `200 OK` response code and a collection of [azureIOTDevice](../resources/azureiotdevice.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_azureiotdevice"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceManagement/azureIOTDevices
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.azureIOTDevice)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.azureIOTDevice",
      "id": "2699c61b-c61b-2699-1bc6-99261bc69926",
      "deviceId": "String",
      "desiredProperties": [
        {
          "@odata.type": "microsoft.graph.azureIOTProperty"
        }
      ],
      "reportedProperties": [
        {
          "@odata.type": "microsoft.graph.azureIOTProperty"
        }
      ],
      "tags": [
        {
          "@odata.type": "microsoft.graph.azureIOTProperty"
        }
      ]
    }
  ]
}
```

