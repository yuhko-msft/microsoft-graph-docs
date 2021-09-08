---
title: "Update submissionRequest"
description: "Update the properties of a submissionRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update submissionRequest
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [submissionRequest](../resources/submissionrequest.md) object.

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
PATCH /submissionRequests/{submissionRequestsId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [submissionRequest](../resources/submissionrequest.md) object.

The following table shows the properties that are required when you update the [submissionRequest](../resources/submissionrequest.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|contentType|submissionContentType|**TODO: Add Description**. The possible values are: `mail`, `url`, `file`, `unknownFutureValue`.|
|category|submissionCategory|**TODO: Add Description**. The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|reason|submissionReason|**TODO: Add Description**. The possible values are: `shouldBlock`, `shouldAllow`, `undefined`, `unknownFutureValue`.|
|status|submissionStatus|**TODO: Add Description**. The possible values are: `pending`, `completed`, `unknownFutureValue`.|
|channel|submissionChannel|**TODO: Add Description**. The possible values are: `user`, `admin`, `unknownFutureValue`.|
|createdBy|[submissionUserIdentity](../resources/submissionuseridentity.md)|**TODO: Add Description**|
|result|[submissionResult](../resources/submissionresult.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [submissionRequest](../resources/submissionrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_submissionrequest"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/submissionRequests/{submissionRequestsId}
Content-Type: application/json
Content-length: 343

{
  "@odata.type": "#microsoft.graph.submissionRequest",
  "contentType": "String",
  "category": "String",
  "reason": "String",
  "status": "String",
  "channel": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.submissionUserIdentity"
  },
  "result": {
    "@odata.type": "microsoft.graph.submissionResult"
  }
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
  "@odata.type": "#microsoft.graph.submissionRequest",
  "id": "c3406bf1-6bf1-c340-f16b-40c3f16b40c3",
  "createdDateTime": "String (timestamp)",
  "contentType": "String",
  "category": "String",
  "reason": "String",
  "status": "String",
  "channel": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.submissionUserIdentity"
  },
  "result": {
    "@odata.type": "microsoft.graph.submissionResult"
  }
}
```

