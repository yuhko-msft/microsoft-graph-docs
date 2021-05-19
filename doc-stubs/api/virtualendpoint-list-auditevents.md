---
title: "List auditEvents"
description: "Get the cloudPcAuditEvent resources from the auditEvents navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List auditEvents
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the cloudPcAuditEvent resources from the auditEvents navigation property.

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
GET /deviceManagement/virtualEndpoint/auditEvents
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

If successful, this method returns a `200 OK` response code and a collection of [cloudPcAuditEvent](../resources/cloudpcauditevent.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_cloudpcauditevent"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceManagement/virtualEndpoint/auditEvents
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.cloudPcAuditEvent)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.cloudPcAuditEvent",
      "id": "0fedf0ee-f0ee-0fed-eef0-ed0feef0ed0f",
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
  ]
}
```

