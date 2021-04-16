---
title: "List commands"
description: "Get the command resources from the commands navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List commands
Namespace: microsoft.graph



Get the command resources from the commands navigation property.

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
GET /devices/{devicesId}/commands
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

If successful, this method returns a `200 OK` response code and a collection of [command](../resources/command.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_command"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/devices/{devicesId}/commands
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.command)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.command",
      "id": "770e5f3e-5f3e-770e-3e5f-0e773e5f0e77",
      "appServiceName": "String",
      "error": "String",
      "packageFamilyName": "String",
      "payload": {
        "@odata.type": "microsoft.graph.payloadRequest"
      },
      "permissionTicket": "String",
      "postBackUri": "String",
      "status": "String",
      "type": "String"
    }
  ]
}
```

