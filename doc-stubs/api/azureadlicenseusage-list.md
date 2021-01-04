---
title: "List azureADLicenseUsages"
description: "Get a list of the azureADLicenseUsage objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List azureADLicenseUsages
Namespace: microsoft.graph

Get a list of the [azureADLicenseUsage](../resources/azureadlicenseusage.md) objects and their properties.

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
GET ** Collection URI for Microsoft.AAD.Reporting.azureADLicenseUsage not found
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

If successful, this method returns a `200 OK` response code and a collection of [azureADLicenseUsage](../resources/azureadlicenseusage.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_azureadlicenseusage"
}
-->
``` http
GET https://graph.microsoft.com/beta** Collection URI for Microsoft.AAD.Reporting.azureADLicenseUsage not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(Microsoft.AAD.Reporting.azureADLicenseUsage)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#Microsoft.AAD.Reporting.azureADLicenseUsage",
      "id": "eb9d1f5e-1f5e-eb9d-5e1f-9deb5e1f9deb",
      "snapshotDateTime": "String (timestamp)",
      "licenseInfoDetails": [
        {
          "@odata.type": "microsoft.graph.licenseInfoDetail"
        }
      ]
    }
  ]
}
```

