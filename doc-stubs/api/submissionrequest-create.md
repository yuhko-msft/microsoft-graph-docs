---
title: "Create submissionRequest"
description: "Create a new submissionRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create submissionRequest
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [submissionRequest](../resources/submissionrequest.md) object.

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
POST ** Collection URI for microsoft.graph.submissionRequest not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [submissionRequest](../resources/submissionrequest.md) object.

The following table shows the properties that are required when you create the [submissionRequest](../resources/submissionrequest.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|contentType|submissionContentType|**TODO: Add Description**. The possible values are: `mail`, `url`, `file`.|
|category|submissionCategory|**TODO: Add Description**. The possible values are: `notJunk`, `spam`, `phishing`, `malware`.|
|reason|submissionReason|**TODO: Add Description**. The possible values are: `shouldBlock`, `shouldUnblock`.|
|status|submissionStatus|**TODO: Add Description**. The possible values are: `pending`, `completed`.|
|channel|submissionChannel|**TODO: Add Description**. The possible values are: `user`, `admin`.|
|createdBy|String|**TODO: Add Description**|
|result|[submissionResult](../resources/submissionresult.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [submissionRequest](../resources/submissionrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_submissionrequest_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.submissionRequest not found
Content-Type: application/json
Content-length: 284

{
  "@odata.type": "#microsoft.graph.submissionRequest",
  "contentType": "String",
  "category": "String",
  "reason": "String",
  "status": "String",
  "channel": "String",
  "createdBy": "String",
  "result": {
    "@odata.type": "microsoft.graph.submissionResult"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.submissionRequest"
}
-->
``` http
HTTP/1.1 201 Created
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
  "createdBy": "String",
  "result": {
    "@odata.type": "microsoft.graph.submissionResult"
  }
}
```

