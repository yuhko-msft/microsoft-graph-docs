---
title: "Get sensitivityLabelLogBase"
description: "Read the properties and relationships of a sensitivityLabelLogBase object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get sensitivityLabelLogBase
Namespace: microsoft.graph

Read the properties and relationships of a [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md) object.

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
GET /sensitivityLabelLogBase
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

If successful, this method returns a `200 OK` response code and a [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_sensitivitylabellogbase"
}
-->
``` http
GET https://graph.microsoft.com/beta/sensitivityLabelLogBase
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.sensitivityLabelLogBase"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.sensitivityLabelLogBase",
    "id": "d4f1c7d7-c7d7-d4f1-d7c7-f1d4d7c7f1d4",
    "userId": "String",
    "organizationId": "String",
    "operationDateTime": "String (timestamp)",
    "clientIP": "String",
    "application": "String",
    "platform": "String",
    "deviceName": "String",
    "logType": "String",
    "operation": "String",
    "internalTarget": "String",
    "extendedProperties": [
      {
        "@odata.type": "microsoft.graph.keyValuePair"
      }
    ],
    "targetLocation": "String",
    "emailInfo": {
      "@odata.type": "microsoft.graph.emailInfo"
    }
  }
}
```

