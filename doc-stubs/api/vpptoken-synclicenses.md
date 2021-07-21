---
title: "vppToken: syncLicenses"
description: "Syncs licenses associated with a specific appleVolumePurchaseProgramToken"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# vppToken: syncLicenses
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Syncs licenses associated with a specific appleVolumePurchaseProgramToken

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
POST /deviceAppManagement/vppTokens/{vppTokenId}/syncLicenses
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this action returns a `200 OK` response code and a [vppToken](../resources/vpptoken.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "vpptoken_synclicenses"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceAppManagement/vppTokens/{vppTokenId}/syncLicenses
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.vppToken"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.vppToken",
    "id": "String (identifier)",
    "appleId": "String",
    "automaticallyUpdateApps": "Boolean",
    "claimTokenManagementFromExternalMdm": "Boolean",
    "countryOrRegion": "String",
    "dataSharingConsentGranted": "Boolean",
    "displayName": "String",
    "expirationDateTime": "String (timestamp)",
    "lastModifiedDateTime": "String (timestamp)",
    "lastSyncDateTime": "String (timestamp)",
    "lastSyncStatus": "String",
    "locationName": "String",
    "organizationName": "String",
    "roleScopeTagIds": [
      "String"
    ],
    "state": "String",
    "token": "String",
    "tokenActionResults": [
      {
        "@odata.type": "microsoft.graph.vppTokenActionResult"
      }
    ],
    "vppTokenAccountType": "String"
  }
}
```

