---
title: "List history of riskyServicePrincipal"
description: "Get the riskyServicePrincipalHistoryItem resources from the history navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List history
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the risk history of a [riskyServicePrincipal](../resources/riskyServicePrincipal.md) resource.

>**Note:** Using the riskyServicePrincipal API requires an Azure AD Premium P2 license.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|IdentityRiskyServicePrincipal.Read.All, IdentityRiskyServicePrincipal.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|IdentityRiskyServicePrincipal.Read.All, IdentityRiskyServicePrincipal.ReadWrite.All|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /identityProtection/riskyServicePrincipals/{riskyServicePrincipalId}/history 
```
## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [riskyServicePrincipalHistoryItem](../resources/riskyserviceprincipalhistoryitem.md) objects in the response body.

## Example

### Request
<!-- {
  "blockType": "request",
  "name": "list_riskyserviceprincipalhistoryitem"
}
-->
``` http
GET https://graph.microsoft.com/beta/identityProtection/riskyServicePrincipals/{riskyServicePrincipalId}/history
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.riskyServicePrincipalHistoryItem)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.riskyServicePrincipalHistoryItem",
      "id": "fd6ec3bb-c3bb-fd6e-bbc3-6efdbbc36efd",
      "accountEnabled": "Boolean",
      "isProcessing": "Boolean",
      "riskLastUpdatedDateTime": "String (timestamp)",
      "riskLevel": "String",
      "riskState": "String",
      "riskDetail": "String",
      "displayName": "String",
      "appId": "String",
      "servicePrincipalType": "String",
      "servicePrincipalId": "String",
      "initiatedBy": "String",
      "activity": {
        "@odata.type": "microsoft.graph.riskServicePrincipalActivity"
      }
    }
  ]
}
```

