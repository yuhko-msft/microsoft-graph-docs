---
title: "Update emailFileAssessmentRequest"
description: "Update the properties of an emailFileAssessmentRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update emailFileAssessmentRequest
Namespace: microsoft.graph

Update the properties of an [emailFileAssessmentRequest](../resources/emailfileassessmentrequest.md) object.

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
PATCH ** Entity URI for microsoft.graph.emailFileAssessmentRequest not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [emailFileAssessmentRequest](../resources/emailfileassessmentrequest.md) object.

The following table shows the properties that are required when you create the [emailFileAssessmentRequest](../resources/emailfileassessmentrequest.md).

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
|recipientEmail|String|**TODO: Add Description**|
|destinationRoutingReason|mailDestinationRoutingReason|**TODO: Add Description**. Possible values are: `none`, `mailFlowRule`, `safeSender`, `blockedSender`, `advancedSpamFiltering`, `domainAllowList`, `domainBlockList`, `notInAddressBook`, `firstTimeSender`, `autoPurgeToInbox`, `autoPurgeToJunk`, `autoPurgeToDeleted`, `outbound`, `notJunk`, `junk`, `unknownFutureValue`.|
|contentData|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [emailFileAssessmentRequest](../resources/emailfileassessmentrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_emailfileassessmentrequest"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.emailFileAssessmentRequest not found
Content-Type: application/json
Content-length: 383

{
  "@odata.type": "#microsoft.graph.emailFileAssessmentRequest",
  "contentType": "String",
  "expectedAssessment": "String",
  "category": "String",
  "status": "String",
  "requestSource": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "recipientEmail": "String",
  "destinationRoutingReason": "String",
  "contentData": "String"
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
  "@odata.type": "#microsoft.graph.emailFileAssessmentRequest",
  "id": "0577a1bb-a1bb-0577-bba1-7705bba17705",
  "createdDateTime": "String (timestamp)",
  "contentType": "String",
  "expectedAssessment": "String",
  "category": "String",
  "status": "String",
  "requestSource": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "recipientEmail": "String",
  "destinationRoutingReason": "String",
  "contentData": "String"
}
```

