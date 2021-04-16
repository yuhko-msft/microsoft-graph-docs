---
title: "Update auditEvent"
description: "Update the properties of an auditEvent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update auditEvent
Namespace: microsoft.graph



Update the properties of an [auditEvent](../resources/auditevent.md) object.

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
PATCH /deviceManagement/auditEvents/{auditEventId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [auditEvent](../resources/auditevent.md) object.

The following table shows the properties that are required when you update the [auditEvent](../resources/auditevent.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|activity|String|Friendly name of the activity.|
|activityDateTime|DateTimeOffset|The date time in UTC when the activity was performed.|
|activityOperationType|String|The HTTP operation type of the activity.|
|activityResult|String|The result of the activity.|
|activityType|String|The type of activity that was being performed.|
|actor|[auditActor](../resources/auditactor.md)|AAD user and application that are associated with the audit event.|
|category|String|Audit category.|
|componentName|String|Component name.|
|correlationId|Guid|The client request Id that is used to correlate activity within the system.|
|displayName|String|Event display name.|
|resources|[auditResource](../resources/auditresource.md) collection|Resources being modified.|



## Response

If successful, this method returns a `200 OK` response code and an updated [auditEvent](../resources/auditevent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_auditevent"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/auditEvents/{auditEventId}
Content-Type: application/json
Content-length: 492

{
  "@odata.type": "#microsoft.graph.auditEvent",
  "activity": "String",
  "activityDateTime": "String (timestamp)",
  "activityOperationType": "String",
  "activityResult": "String",
  "activityType": "String",
  "actor": {
    "@odata.type": "microsoft.graph.auditActor"
  },
  "category": "String",
  "componentName": "String",
  "correlationId": "Guid",
  "displayName": "String",
  "resources": [
    {
      "@odata.type": "microsoft.graph.auditResource"
    }
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.auditEvent",
  "id": "0e62bf01-bf01-0e62-01bf-620e01bf620e",
  "activity": "String",
  "activityDateTime": "String (timestamp)",
  "activityOperationType": "String",
  "activityResult": "String",
  "activityType": "String",
  "actor": {
    "@odata.type": "microsoft.graph.auditActor"
  },
  "category": "String",
  "componentName": "String",
  "correlationId": "Guid",
  "displayName": "String",
  "resources": [
    {
      "@odata.type": "microsoft.graph.auditResource"
    }
  ]
}
```

