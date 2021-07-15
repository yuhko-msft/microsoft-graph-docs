---
title: "List secureScoreControlProfiles"
description: "Get a list of the secureScoreControlProfile objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List secureScoreControlProfiles
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of the [secureScoreControlProfile](../resources/securescorecontrolprofile.md) objects and their properties.

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
GET /security/secureScoreControlProfiles
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

If successful, this method returns a `200 OK` response code and a collection of [secureScoreControlProfile](../resources/securescorecontrolprofile.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_securescorecontrolprofile"
}
-->
``` http
GET https://graph.microsoft.com/beta/security/secureScoreControlProfiles
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.secureScoreControlProfile)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.secureScoreControlProfile",
      "id": "bdfaaee2-aee2-bdfa-e2ae-fabde2aefabd",
      "actionType": "String",
      "actionUrl": "String",
      "azureTenantId": "String",
      "complianceInformation": [
        {
          "@odata.type": "microsoft.graph.complianceInformation"
        }
      ],
      "controlCategory": "String",
      "controlStateUpdates": [
        {
          "@odata.type": "microsoft.graph.secureScoreControlStateUpdate"
        }
      ],
      "deprecated": "Boolean",
      "implementationCost": "String",
      "lastModifiedDateTime": "String (timestamp)",
      "maxScore": "Double",
      "rank": "Integer",
      "remediation": "String",
      "remediationImpact": "String",
      "service": "String",
      "threats": [
        "String"
      ],
      "tier": "String",
      "title": "String",
      "userImpact": "String",
      "vendorInformation": {
        "@odata.type": "microsoft.graph.securityVendorInformation"
      }
    }
  ]
}
```

