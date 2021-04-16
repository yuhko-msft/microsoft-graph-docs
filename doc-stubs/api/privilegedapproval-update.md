---
title: "Update privilegedApproval"
description: "Update the properties of a privilegedApproval object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update privilegedApproval
Namespace: microsoft.graph



Update the properties of a [privilegedApproval](../resources/privilegedapproval.md) object.

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
PATCH /privilegedApproval/{privilegedApprovalId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [privilegedApproval](../resources/privilegedapproval.md) object.

The following table shows the properties that are required when you update the [privilegedApproval](../resources/privilegedapproval.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|approvalDuration|Duration|**TODO: Add Description**|
|approvalState|approvalState|**TODO: Add Description**. Possible values are: `pending`, `approved`, `denied`, `aborted`, `canceled`.|
|approvalType|String|**TODO: Add Description**|
|approverReason|String|**TODO: Add Description**|
|endDateTime|DateTimeOffset|**TODO: Add Description**|
|requestorReason|String|**TODO: Add Description**|
|roleId|String|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description**|
|userId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [privilegedApproval](../resources/privilegedapproval.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_privilegedapproval"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/privilegedApproval/{privilegedApprovalId}
Content-Type: application/json
Content-length: 354

{
  "@odata.type": "#microsoft.graph.privilegedApproval",
  "approvalDuration": "String (duration)",
  "approvalState": "String",
  "approvalType": "String",
  "approverReason": "String",
  "endDateTime": "String (timestamp)",
  "requestorReason": "String",
  "roleId": "String",
  "startDateTime": "String (timestamp)",
  "userId": "String"
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
  "@odata.type": "#microsoft.graph.privilegedApproval",
  "id": "73477d78-7d78-7347-787d-4773787d4773",
  "approvalDuration": "String (duration)",
  "approvalState": "String",
  "approvalType": "String",
  "approverReason": "String",
  "endDateTime": "String (timestamp)",
  "requestorReason": "String",
  "roleId": "String",
  "startDateTime": "String (timestamp)",
  "userId": "String"
}
```

