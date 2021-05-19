---
title: "Update cloudPcAuditEvent"
description: "Update the properties of a cloudPcAuditEvent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update cloudPcAuditEvent
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [cloudPcAuditEvent](../resources/cloudpcauditevent.md) object.

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
PATCH /deviceManagement/virtualEndpoint/auditEvents/{cloudPcAuditEventId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [cloudPcAuditEvent](../resources/cloudpcauditevent.md) object.

The following table shows the properties that are required when you update the [cloudPcAuditEvent](../resources/cloudpcauditevent.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|componentName|String|**TODO: Add Description**|
|actor|[cloudPcAuditActor](../resources/cloudpcauditactor.md)|**TODO: Add Description**|
|activity|String|**TODO: Add Description**|
|activityDateTime|DateTimeOffset|**TODO: Add Description**|
|activityType|String|**TODO: Add Description**|
|activityOperationType|cloudPcAuditActivityOperationType|**TODO: Add Description**. Possible values are: `create`, `delete`, `patch`, `other`.|
|activityResult|cloudPcAuditActivityResult|**TODO: Add Description**. Possible values are: `success`, `clientError`, `failure`, `timeout`, `other`.|
|correlationId|String|**TODO: Add Description**|
|resources|[cloudPcAuditResource](../resources/cloudpcauditresource.md) collection|**TODO: Add Description**|
|category|cloudPcAuditCategory|**TODO: Add Description**. Possible values are: `cloudPC`, `other`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [cloudPcAuditEvent](../resources/cloudpcauditevent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_cloudpcauditevent"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/virtualEndpoint/auditEvents/{cloudPcAuditEventId}
Content-Type: application/json
Content-length: 515

{
  "@odata.type": "#microsoft.graph.cloudPcAuditEvent",
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
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

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
```

