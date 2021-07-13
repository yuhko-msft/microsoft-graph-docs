---
title: "Update scheduleChangeRequest"
description: "Update the properties of a scheduleChangeRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update scheduleChangeRequest
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [scheduleChangeRequest](../resources/schedulechangerequest.md) object.

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
PATCH /scheduleChangeRequest
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [scheduleChangeRequest](../resources/schedulechangerequest.md) object.

The following table shows the properties that are required when you update the [scheduleChangeRequest](../resources/schedulechangerequest.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|assignedTo|scheduleChangeRequestActor|**TODO: Add Description**. Possible values are: `sender`, `recipient`, `manager`, `system`, `unknownFutureValue`.|
|managerActionDateTime|DateTimeOffset|**TODO: Add Description**|
|managerActionMessage|String|**TODO: Add Description**|
|managerUserId|String|**TODO: Add Description**|
|senderDateTime|DateTimeOffset|**TODO: Add Description**|
|senderMessage|String|**TODO: Add Description**|
|senderUserId|String|**TODO: Add Description**|
|state|scheduleChangeState|**TODO: Add Description**. Possible values are: `pending`, `approved`, `declined`, `unknownFutureValue`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [scheduleChangeRequest](../resources/schedulechangerequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_schedulechangerequest"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/scheduleChangeRequest
Content-Type: application/json
Content-length: 405

{
  "@odata.type": "#microsoft.graph.scheduleChangeRequest",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "assignedTo": "String",
  "managerActionDateTime": "String (timestamp)",
  "managerActionMessage": "String",
  "managerUserId": "String",
  "senderDateTime": "String (timestamp)",
  "senderMessage": "String",
  "senderUserId": "String",
  "state": "String"
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
  "@odata.type": "#microsoft.graph.scheduleChangeRequest",
  "id": "185707bf-07bf-1857-bf07-5718bf075718",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "assignedTo": "String",
  "managerActionDateTime": "String (timestamp)",
  "managerActionMessage": "String",
  "managerUserId": "String",
  "senderDateTime": "String (timestamp)",
  "senderMessage": "String",
  "senderUserId": "String",
  "state": "String"
}
```

