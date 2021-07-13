---
title: "Create urlAssessmentRequest"
description: "Create a new urlAssessmentRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create urlAssessmentRequest
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [urlAssessmentRequest](../resources/urlassessmentrequest.md) object.

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
POST ** Collection URI for microsoft.graph.urlAssessmentRequest not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [urlAssessmentRequest](../resources/urlassessmentrequest.md) object.

The following table shows the properties that are required when you create the [urlAssessmentRequest](../resources/urlassessmentrequest.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|category|threatCategory|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md). Possible values are: `undefined`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|contentType|threatAssessmentContentType|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md). Possible values are: `mail`, `url`, `file`.|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md)|
|expectedAssessment|threatExpectedAssessment|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md). Possible values are: `block`, `unblock`.|
|requestSource|threatAssessmentRequestSource|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md). Possible values are: `undefined`, `user`, `administrator`.|
|status|threatAssessmentStatus|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md). Possible values are: `pending`, `completed`.|
|url|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [urlAssessmentRequest](../resources/urlassessmentrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_urlassessmentrequest_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.urlAssessmentRequest not found
Content-Type: application/json
Content-length: 297

{
  "@odata.type": "#microsoft.graph.urlAssessmentRequest",
  "category": "String",
  "contentType": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "expectedAssessment": "String",
  "requestSource": "String",
  "status": "String",
  "url": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.urlAssessmentRequest"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.urlAssessmentRequest",
  "id": "cf66c8c4-c8c4-cf66-c4c8-66cfc4c866cf",
  "category": "String",
  "contentType": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "expectedAssessment": "String",
  "requestSource": "String",
  "status": "String",
  "url": "String"
}
```

