---
title: "List sensitivityLabelPolicyMatchLogs"
description: "Get a list of the sensitivityLabelPolicyMatchLog objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List sensitivityLabelPolicyMatchLogs
Namespace: microsoft.graph

Get a list of the [sensitivityLabelPolicyMatchLog](../resources/sensitivitylabelpolicymatchlog.md) objects and their properties.

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
GET /auditLogs/sensitivityLabelPolicyMatchLogs
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

If successful, this method returns a `200 OK` response code and a collection of [sensitivityLabelPolicyMatchLog](../resources/sensitivitylabelpolicymatchlog.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_sensitivitylabelpolicymatchlog"
}
-->
``` http
GET https://graph.microsoft.com/beta/auditLogs/sensitivityLabelPolicyMatchLogs
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.sensitivityLabelPolicyMatchLog)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.sensitivityLabelPolicyMatchLog",
      "id": "eab4d398-d398-eab4-98d3-b4ea98d3b4ea",
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
      },
      "policyId": "Guid",
      "labelId": "Guid",
      "currentLabelId": "Guid"
    }
  ]
}
```

