---
title: "Create directoryAudit"
description: "Create a new directoryAudit object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create directoryAudit
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new directoryAudit object.

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
POST /auditLogs/directoryAudits
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [directoryAudit](../resources/directoryaudit.md) object.

The following table shows the properties that are required when you create the [directoryAudit](../resources/directoryaudit.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|activityDateTime|DateTimeOffset|**TODO: Add Description**|
|activityDisplayName|String|**TODO: Add Description**|
|additionalDetails|[keyValue](../resources/keyvalue.md) collection|**TODO: Add Description**|
|category|String|**TODO: Add Description**|
|correlationId|String|**TODO: Add Description**|
|initiatedBy|[auditActivityInitiator](../resources/auditactivityinitiator.md)|**TODO: Add Description**|
|loggedByService|String|**TODO: Add Description**|
|operationType|String|**TODO: Add Description**|
|result|operationResult|**TODO: Add Description**. Possible values are: `success`, `failure`, `timeout`, `unknownFutureValue`.|
|resultReason|String|**TODO: Add Description**|
|targetResources|[targetResource](../resources/targetresource.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [directoryAudit](../resources/directoryaudit.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_directoryaudit_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/auditLogs/directoryAudits
Content-Type: application/json
Content-length: 587

{
  "@odata.type": "#microsoft.graph.directoryAudit",
  "activityDateTime": "String (timestamp)",
  "activityDisplayName": "String",
  "additionalDetails": [
    {
      "@odata.type": "microsoft.graph.keyValue"
    }
  ],
  "category": "String",
  "correlationId": "String",
  "initiatedBy": {
    "@odata.type": "microsoft.graph.auditActivityInitiator"
  },
  "loggedByService": "String",
  "operationType": "String",
  "result": "String",
  "resultReason": "String",
  "targetResources": [
    {
      "@odata.type": "microsoft.graph.targetResource"
    }
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.directoryAudit"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.directoryAudit",
  "id": "1509b18e-b18e-1509-8eb1-09158eb10915",
  "activityDateTime": "String (timestamp)",
  "activityDisplayName": "String",
  "additionalDetails": [
    {
      "@odata.type": "microsoft.graph.keyValue"
    }
  ],
  "category": "String",
  "correlationId": "String",
  "initiatedBy": {
    "@odata.type": "microsoft.graph.auditActivityInitiator"
  },
  "loggedByService": "String",
  "operationType": "String",
  "result": "String",
  "resultReason": "String",
  "targetResources": [
    {
      "@odata.type": "microsoft.graph.targetResource"
    }
  ]
}
```

