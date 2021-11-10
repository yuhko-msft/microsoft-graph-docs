---
title: "emailEventRoot: getListEmails"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# emailEventRoot: getListEmails
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

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
GET /security/emailEvent/getListEmails
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this function returns a `200 OK` response code and a [email](../resources/email.md) collection in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "emaileventroot_getlistemails"
}
-->
``` http
GET https://graph.microsoft.com/beta/security/emailEvent/getListEmails
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.email)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.email",
      "id": "String (identifier)",
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
      "clusterId": "String",
      "directionality": "String",
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
      "dmarc": "String",
      "dkim": "String",
      "spf": "String",
      "compositeAuthentication": "String",
      "attachment": "String",
      "url": "String",
      "override": "String",
      "distributionList": "String",
      "senderEmailFromDomain": "String",
      "senderFromDomain": "String",
      "domainOwner": "String",
      "domainCreationDate": "String",
      "location": "String",
      "exchangeTransportRule": "String",
      "originalDeliveryLocation": "String"
    }
  ]
}
```

