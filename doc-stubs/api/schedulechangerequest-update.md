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

Update the properties of a [scheduleChangeRequest](../resources/schedulechangerequest.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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

The following table shows the properties that are required when you create the [scheduleChangeRequest](../resources/schedulechangerequest.md).

|Property|Type|Description|
|:---|:---|:---|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|assignedTo|scheduleChangeRequestActor|**TODO: Add Description**. Possible values are: `sender`, `recipient`, `manager`, `system`, `unknownFutureValue`.|
|state|scheduleChangeState|**TODO: Add Description**. Possible values are: `pending`, `approved`, `declined`, `unknownFutureValue`.|
|senderMessage|String|**TODO: Add Description**|
|senderDateTime|DateTimeOffset|**TODO: Add Description**|
|managerActionMessage|String|**TODO: Add Description**|
|managerActionDateTime|DateTimeOffset|**TODO: Add Description**|
|senderUserId|String|**TODO: Add Description**|
|managerUserId|String|**TODO: Add Description**|



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
  "state": "String",
  "senderMessage": "String",
  "senderDateTime": "String (timestamp)",
  "managerActionMessage": "String",
  "managerActionDateTime": "String (timestamp)",
  "senderUserId": "String",
  "managerUserId": "String"
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
  "@odata.type": "#microsoft.graph.scheduleChangeRequest",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "assignedTo": "String",
  "state": "String",
  "senderMessage": "String",
  "senderDateTime": "String (timestamp)",
  "managerActionMessage": "String",
  "managerActionDateTime": "String (timestamp)",
  "senderUserId": "String",
  "managerUserId": "String"
}
```

