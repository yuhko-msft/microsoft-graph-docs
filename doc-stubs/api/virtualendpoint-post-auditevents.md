---
title: "Create cloudPcAuditEvent"
description: "Create a new cloudPcAuditEvent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create cloudPcAuditEvent
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new cloudPcAuditEvent object.

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
POST /deviceManagement/virtualEndpoint/auditEvents
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [cloudPcAuditEvent](../resources/cloudpcauditevent.md) object.

The following table shows the properties that are required when you create the [cloudPcAuditEvent](../resources/cloudpcauditevent.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|activity|String|**TODO: Add Description**|
|activityDateTime|DateTimeOffset|**TODO: Add Description**|
|activityOperationType|cloudPcAuditActivityOperationType|**TODO: Add Description**. Possible values are: `create`, `delete`, `patch`, `other`.|
|activityResult|cloudPcAuditActivityResult|**TODO: Add Description**. Possible values are: `success`, `clientError`, `failure`, `timeout`, `other`.|
|activityType|String|**TODO: Add Description**|
|actor|[cloudPcAuditActor](../resources/cloudpcauditactor.md)|**TODO: Add Description**|
|category|cloudPcAuditCategory|**TODO: Add Description**. Possible values are: `cloudPC`, `other`.|
|componentName|String|**TODO: Add Description**|
|correlationId|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|resources|[cloudPcAuditResource](../resources/cloudpcauditresource.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [cloudPcAuditEvent](../resources/cloudpcauditevent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_cloudpcauditevent_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/virtualEndpoint/auditEvents
Content-Type: application/json
Content-length: 515

{
  "@odata.type": "#microsoft.graph.cloudPcAuditEvent",
  "activity": "String",
  "activityDateTime": "String (timestamp)",
  "activityOperationType": "String",
  "activityResult": "String",
  "activityType": "String",
  "actor": {
    "@odata.type": "microsoft.graph.cloudPcAuditActor"
  },
  "category": "String",
  "componentName": "String",
  "correlationId": "String",
  "displayName": "String",
  "resources": [
    {
      "@odata.type": "microsoft.graph.cloudPcAuditResource"
    }
  ]
}
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
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.cloudPcAuditEvent",
  "id": "076eeaef-eaef-076e-efea-6e07efea6e07",
  "activity": "String",
  "activityDateTime": "String (timestamp)",
  "activityOperationType": "String",
  "activityResult": "String",
  "activityType": "String",
  "actor": {
    "@odata.type": "microsoft.graph.cloudPcAuditActor"
  },
  "category": "String",
  "componentName": "String",
  "correlationId": "String",
  "displayName": "String",
  "resources": [
    {
      "@odata.type": "microsoft.graph.cloudPcAuditResource"
    }
  ]
}
```

