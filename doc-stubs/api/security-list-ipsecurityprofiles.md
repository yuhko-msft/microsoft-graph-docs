---
title: "List ipSecurityProfiles"
description: "Get the ipSecurityProfile resources from the ipSecurityProfiles navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List ipSecurityProfiles
Namespace: microsoft.graph



Get the ipSecurityProfile resources from the ipSecurityProfiles navigation property.

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
GET /security/ipSecurityProfiles
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

If successful, this method returns a `200 OK` response code and a collection of [ipSecurityProfile](../resources/ipsecurityprofile.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_ipsecurityprofile"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/security/ipSecurityProfiles
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.ipSecurityProfile)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.ipSecurityProfile",
      "id": "82561bd4-1bd4-8256-d41b-5682d41b5682",
      "activityGroupNames": [
        "String"
      ],
      "address": "String",
      "azureSubscriptionId": "String",
      "azureTenantId": "String",
      "countHits": "Integer",
      "countHosts": "Integer",
      "firstSeenDateTime": "String (timestamp)",
      "ipCategories": [
        {
          "@odata.type": "microsoft.graph.ipCategory"
        }
      ],
      "ipReferenceData": [
        {
          "@odata.type": "microsoft.graph.ipReferenceData"
        }
      ],
      "lastSeenDateTime": "String (timestamp)",
      "riskScore": "String",
      "tags": [
        "String"
      ],
      "vendorInformation": {
        "@odata.type": "microsoft.graph.securityVendorInformation"
      }
    }
  ]
}
```

