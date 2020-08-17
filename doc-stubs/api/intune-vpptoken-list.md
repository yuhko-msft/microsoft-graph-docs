---
title: "List vppTokens"
description: "Get a list of the vppToken objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List vppTokens
Namespace: microsoft.graph

Get a list of the [vppToken](../resources/vpptoken.md) objects and their properties.

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
GET /deviceAppManagement/vppTokens
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

If successful, this method returns a `200 OK` response code and a collection of [vppToken](../resources/vpptoken.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_vpptoken"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceAppManagement/vppTokens
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.vppToken)"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": [
    {
      "@odata.type": "#microsoft.graph.vppToken",
      "id": "3154a7da-a7da-3154-daa7-5431daa75431",
      "organizationName": "String",
      "vppTokenAccountType": "String",
      "appleId": "String",
      "expirationDateTime": "String (timestamp)",
      "lastSyncDateTime": "String (timestamp)",
      "token": "String",
      "lastModifiedDateTime": "String (timestamp)",
      "state": "String",
      "tokenActionResults": [
        {
          "@odata.type": "microsoft.graph.vppTokenActionResult"
        }
      ],
      "lastSyncStatus": "String",
      "automaticallyUpdateApps": "Boolean",
      "countryOrRegion": "String",
      "dataSharingConsentGranted": "Boolean",
      "displayName": "String",
      "locationName": "String",
      "claimTokenManagementFromExternalMdm": "Boolean",
      "roleScopeTagIds": [
        "String"
      ]
    }
  ]
}
```

