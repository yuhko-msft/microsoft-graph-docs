---
title: "List mailMessages"
description: "Get a list of the mailMessage objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List mailMessages
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of the [mailMessage](../resources/mailmessage.md) objects and their properties.

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
GET /security/emailSecurityEvents/mailMessages
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

If successful, this method returns a `200 OK` response code and a collection of [mailMessage](../resources/mailmessage.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_mailmessage"
}
-->
``` http
GET https://graph.microsoft.com/beta/security/emailSecurityEvents/mailMessages
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.mailMessage)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.mailMessage",
      "id": "fcb46c3e-6c3e-fcb4-3e6c-b4fc3e6cb4fc",
      "createdDateTime": "String (timestamp)",
      "networkMessageId": "String",
      "internetMessageId": "String",
      "senderEmailFromAddress": "String",
      "senderFromAddress": "String",
      "senderDisplayName": "String",
      "returnPath": "String",
      "senderIPv4": "String",
      "recipientEmailAddress": "String",
      "subject": "String",
      "emailClusterId": "String",
      "directionality": "String",
      "originalDeliveryLocation": "String",
      "originalDeliveryAction": "String",
      "latestDeliveryLocation": "String",
      "threatType": "String",
      "detectionMethod": "String",
      "threatDetail": {
        "@odata.type": "microsoft.graph.threatDetail"
      },
      "pishConfidenceLevel": "String",
      "spamConfidenceLevel": "String",
      "policyAction": "String",
      "policy": "String",
      "attachmentCount": "String",
      "urlCount": "String",
      "language": "String",
      "connector": "String",
      "recipientTag": "String",
      "senderTag": "String",
      "alertId": "String",
      "submissionId": "String",
      "junkMailboxRule": "String",
      "bulkComplaintLevel": "String",
      "domainBasedMessageAuthentication": "String",
      "domainKeysIdentifiedMail": "String",
      "senderPolicyFramework": "String",
      "compositeAuthentication": "String",
      "attachment": [
        {
          "@odata.type": "microsoft.graph.securityEmailAttachments"
        }
      ],
      "url": [
        {
          "@odata.type": "microsoft.graph.securityEmailUrls"
        }
      ],
      "distributionList": "String",
      "senderEmailFromDomain": "String",
      "senderFromDomain": "String",
      "domainOwner": "String",
      "domainCreationDate": "String",
      "location": "String",
      "exchangeTransportRule": "String"
    }
  ]
}
```

