---
title: "Get cloudPcAuditEvent"
description: "Read the properties and relationships of a cloudPcAuditEvent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get cloudPcAuditEvent
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [cloudPcAuditEvent](../resources/cloudpcauditevent.md) object.

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
GET /deviceManagement/virtualEndpoint/auditEvents/{cloudPcAuditEventId}
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

If successful, this method returns a `200 OK` response code and a [cloudPcAuditEvent](../resources/cloudpcauditevent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_cloudpcauditevent"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceManagement/virtualEndpoint/auditEvents/{cloudPcAuditEventId}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.cloudPcAuditEvent"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.cloudPcAuditEvent",
    "id": "3eda168a-168a-3eda-8a16-da3e8a16da3e",
    "displayName": "String",
    "componentName": "String",
    "actor": {
      "@odata.type": "microsoft.graph.cloudPcAuditActor"
    },
    "activity": "String",
    "activityDateTime": "String (timestamp)",
    "activityType": "String",
    "activityOperationType": "String",
    "activityResult": "String",
    "correlationId": "String",
    "resources": [
      {
        "@odata.type": "microsoft.graph.cloudPcAuditResource"
      }
    ],
    "category": "String"
  }
}
```

