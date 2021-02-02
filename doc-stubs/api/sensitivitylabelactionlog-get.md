---
title: "Get sensitivityLabelActionLog"
description: "Read the properties and relationships of a sensitivityLabelActionLog object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get sensitivityLabelActionLog
Namespace: microsoft.graph

Read the properties and relationships of a [sensitivityLabelActionLog](../resources/sensitivitylabelactionlog.md) object.

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
GET /auditLogs/sensitivityLabelActionLogs/{sensitivityLabelActionLogId}
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

If successful, this method returns a `200 OK` response code and a [sensitivityLabelActionLog](../resources/sensitivitylabelactionlog.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_sensitivitylabelactionlog"
}
-->
``` http
GET https://graph.microsoft.com/beta/auditLogs/sensitivityLabelActionLogs/{sensitivityLabelActionLogId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.sensitivityLabelActionLog"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.sensitivityLabelActionLog",
    "id": "2133c0c6-c0c6-2133-c6c0-3321c6c03321",
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
    "trigger": "String",
    "triggerDetail": "String",
    "labelId": "Guid",
    "previousLabelId": "Guid",
    "justification": "String",
    "sensitivityChange": "String",
    "policyId": "Guid",
    "irmContentId": "Guid"
  }
}
```

