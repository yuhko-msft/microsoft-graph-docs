---
title: "List controls"
description: "Get the programControl resources from the controls navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List controls
Namespace: microsoft.graph



Get the programControl resources from the controls navigation property.

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
GET /programs/{programsId}/controls
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

If successful, this method returns a `200 OK` response code and a collection of [programControl](../resources/programcontrol.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_programcontrol"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/programs/{programsId}/controls
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.programControl)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.programControl",
      "id": "08ca1c4e-1c4e-08ca-4e1c-ca084e1cca08",
      "controlId": "String",
      "controlTypeId": "String",
      "createdDateTime": "String (timestamp)",
      "displayName": "String",
      "owner": {
        "@odata.type": "microsoft.graph.userIdentity"
      },
      "programId": "String",
      "resource": {
        "@odata.type": "microsoft.graph.programResource"
      },
      "status": "String"
    }
  ]
}
```

