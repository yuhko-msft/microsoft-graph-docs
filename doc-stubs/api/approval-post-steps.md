---
title: "Create approvalStep"
description: "Create a new approvalStep object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create approvalStep
Namespace: microsoft.graph



Create a new approvalStep object.

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
POST /users/{usersId}/appConsentRequestsForApproval/{appConsentRequestId}/userConsentRequests/{userConsentRequestId}/approval/steps
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [approvalStep](../resources/approvalstep.md) object.

The following table shows the properties that are required when you create the [approvalStep](../resources/approvalstep.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|assignedToMe|Boolean|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|justification|String|**TODO: Add Description**|
|reviewedBy|[identity](../resources/identity.md)|**TODO: Add Description**|
|reviewedDateTime|DateTimeOffset|**TODO: Add Description**|
|reviewResult|String|**TODO: Add Description**|
|status|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [approvalStep](../resources/approvalstep.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_approvalstep_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/users/{usersId}/appConsentRequestsForApproval/{appConsentRequestId}/userConsentRequests/{userConsentRequestId}/approval/steps
Content-Type: application/json
Content-length: 311

{
  "@odata.type": "#microsoft.graph.approvalStep",
  "assignedToMe": "Boolean",
  "displayName": "String",
  "justification": "String",
  "reviewedBy": {
    "@odata.type": "microsoft.graph.identity"
  },
  "reviewedDateTime": "String (timestamp)",
  "reviewResult": "String",
  "status": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.approvalStep"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.approvalStep",
  "id": "93028536-8536-9302-3685-029336850293",
  "assignedToMe": "Boolean",
  "displayName": "String",
  "justification": "String",
  "reviewedBy": {
    "@odata.type": "microsoft.graph.identity"
  },
  "reviewedDateTime": "String (timestamp)",
  "reviewResult": "String",
  "status": "String"
}
```

