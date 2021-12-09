---
title: "security: softDelete"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# security: softDelete
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
POST /secuirty/softDelete
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|remediationName|String|**TODO: Add Description**|
|severity|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|emailList|[mailMessage](../resources/mailmessage.md) collection|**TODO: Add Description**|



## Response

If successful, this action returns a `200 OK` response code and a [remediationResponse](../resources/remediationresponse.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "security_softdelete"
}
-->
``` http
POST https://graph.microsoft.com/beta/secuirty/softDelete
Content-Type: application/json
Content-length: 2086

{
  "remediationName": "String",
  "severity": "String",
  "description": "String",
  "emailList": [
    {
      "@odata.type": "#microsoft.graph.mailMessage",
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


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.remediationResponse"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "microsoft.graph.remediationResponse"
  }
}
```

