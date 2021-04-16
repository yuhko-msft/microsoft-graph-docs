---
title: "dataSharingConsent: consentToDataSharing"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# dataSharingConsent: consentToDataSharing
Namespace: microsoft.graph



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
POST /deviceManagement/dataSharingConsents/{dataSharingConsentId}/consentToDataSharing
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this action returns a `200 OK` response code and a [dataSharingConsent](../resources/datasharingconsent.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "datasharingconsent_consenttodatasharing"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/dataSharingConsents/{dataSharingConsentId}/consentToDataSharing
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.dataSharingConsent"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.dataSharingConsent",
    "id": "String (identifier)",
    "grantDateTime": "String (timestamp)",
    "granted": "Boolean",
    "grantedByUpn": "String",
    "grantedByUserId": "String",
    "serviceDisplayName": "String",
    "termsUrl": "String"
  }
}
```

