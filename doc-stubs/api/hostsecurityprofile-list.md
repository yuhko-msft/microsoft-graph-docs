---
title: "List hostSecurityProfiles"
description: "Get a list of the hostSecurityProfile objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List hostSecurityProfiles
Namespace: microsoft.graph



Get a list of the [hostSecurityProfile](../resources/hostsecurityprofile.md) objects and their properties.

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
GET /security/hostSecurityProfiles
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

If successful, this method returns a `200 OK` response code and a collection of [hostSecurityProfile](../resources/hostsecurityprofile.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_hostsecurityprofile"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/security/hostSecurityProfiles
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.hostSecurityProfile)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.hostSecurityProfile",
      "id": "e9a42d3b-2d3b-e9a4-3b2d-a4e93b2da4e9",
      "azureSubscriptionId": "String",
      "azureTenantId": "String",
      "firstSeenDateTime": "String (timestamp)",
      "fqdn": "String",
      "isAzureAdJoined": "Boolean",
      "isAzureAdRegistered": "Boolean",
      "isHybridAzureDomainJoined": "Boolean",
      "lastSeenDateTime": "String (timestamp)",
      "logonUsers": [
        {
          "@odata.type": "microsoft.graph.logonUser"
        }
      ],
      "netBiosName": "String",
      "networkInterfaces": [
        {
          "@odata.type": "microsoft.graph.networkInterface"
        }
      ],
      "os": "String",
      "osVersion": "String",
      "parentHost": "String",
      "relatedHostIds": [
        "String"
      ],
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

