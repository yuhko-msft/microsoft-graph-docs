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

Create a new [urlAssessmentRequest](../resources/urlassessmentrequest.md) object.

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
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md)|
|contentType|threatAssessmentContentType|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md). Possible values are: `mail`, `url`, `file`.|
|expectedAssessment|threatExpectedAssessment|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md). Possible values are: `block`, `unblock`.|
|category|threatCategory|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md). Possible values are: `undefined`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|status|threatAssessmentStatus|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md). Possible values are: `pending`, `completed`.|
|requestSource|threatAssessmentRequestSource|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md). Possible values are: `undefined`, `user`, `administrator`.|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md)|
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
  "contentType": "String",
  "expectedAssessment": "String",
  "category": "String",
  "status": "String",
  "requestSource": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "url": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
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
  "id": "c168de8a-de8a-c168-8ade-68c18ade68c1",
  "createdDateTime": "String (timestamp)",
  "contentType": "String",
  "expectedAssessment": "String",
  "category": "String",
  "status": "String",
  "requestSource": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "url": "String"
}
```

