---
title: "List emailThreatSubmissionPolicies"
description: "Get the emailThreatSubmissionPolicy resources from the emailThreatSubmissionPolicies navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List emailThreatSubmissionPolicies
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the emailThreatSubmissionPolicy resources from the emailThreatSubmissionPolicies navigation property.

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
GET /submission/emailThreatSubmissionPolicies
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [emailThreatSubmissionPolicy](../resources/emailthreatsubmissionpolicy.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_emailthreatsubmissionpolicy"
}
-->
``` http
GET https://graph.microsoft.com/beta/submission/emailThreatSubmissionPolicies
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.emailThreatSubmissionPolicy)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.emailThreatSubmissionPolicy",
      "id": "333b345b-345b-333b-5b34-3b335b343b33",
      "isReportToMicrosoftEnabled": "Boolean",
      "isReportToCustomizedAddressEnabled": "Boolean",
      "isReportToThirdPartyAddressEnabled": "Boolean",
      "isAskMeEnabled": "Boolean",
      "isAlwaysReportEnabled": "Boolean",
      "isNeverReportEnabled": "Boolean",
      "onlyShowCustomizedMessageForPhishing": "Boolean",
      "isCustomizedMessageEnabled": "Boolean",
      "preSubmitMessageTitle": "String",
      "preSubmitMessage": "String",
      "postSubmitMessageTitle": "String",
      "postSubmitMessage": "String",
      "customizedReportRecipientAddress": "String",
      "thirdPartyReportRecipientAddress": "String",
      "isReviewEmailNotificationEnabled": "Boolean",
      "isCustomizedNotificationSenderEnabled": "Boolean",
      "isOrganizationBrandingEnabled": "Boolean",
      "junkReviewResultMessage": "String",
      "notJunkReviewResultMessage": "String",
      "phishingReviewResultMessage": "String",
      "reviewNotificationFooterMessage": "String",
      "customizedNotificationSenderAddress": "String",
      "isReportFromQuarantineEnabled": "Boolean"
    }
  ]
}
```

