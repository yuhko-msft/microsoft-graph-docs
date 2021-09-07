---
title: "Update fileSubmissionRequest"
description: "Update the properties of a fileSubmissionRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update fileSubmissionRequest
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [fileSubmissionRequest](../resources/filesubmissionrequest.md) object.

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
PATCH /fileSubmissionRequest
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [fileSubmissionRequest](../resources/filesubmissionrequest.md) object.

The following table shows the properties that are required when you update the [fileSubmissionRequest](../resources/filesubmissionrequest.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md)|
|contentType|submissionContentType|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `mail`, `url`, `file`.|
|category|submissionCategory|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`.|
|reason|submissionReason|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `shouldBlock`, `shouldUnblock`.|
|status|submissionStatus|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `pending`, `completed`.|
|channel|submissionChannel|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `user`, `admin`.|
|createdBy|String|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md)|
|result|[submissionResult](../resources/submissionresult.md)|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md)|
|fileName|String|**TODO: Add Description**|
|contentData|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [fileSubmissionRequest](../resources/filesubmissionrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_filesubmissionrequest"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/fileSubmissionRequest
Content-Type: application/json
Content-length: 341

{
  "@odata.type": "#microsoft.graph.fileSubmissionRequest",
  "contentType": "String",
  "category": "String",
  "reason": "String",
  "status": "String",
  "channel": "String",
  "createdBy": "String",
  "result": {
    "@odata.type": "microsoft.graph.submissionResult"
  },
  "fileName": "String",
  "contentData": "String"
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
  "@odata.type": "#microsoft.graph.fileSubmissionRequest",
  "id": "040d71f0-71f0-040d-f071-0d04f0710d04",
  "createdDateTime": "String (timestamp)",
  "contentType": "String",
  "category": "String",
  "reason": "String",
  "status": "String",
  "channel": "String",
  "createdBy": "String",
  "result": {
    "@odata.type": "microsoft.graph.submissionResult"
  },
  "fileName": "String",
  "contentData": "String"
}
```

