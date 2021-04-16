---
title: "Get siteSource"
description: "Read the properties and relationships of a siteSource object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get siteSource
Namespace: microsoft.graph.ediscovery



Read the properties and relationships of a [siteSource](../resources/ediscovery-sitesource.md) object.

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
GET /compliance/ediscovery/cases/{caseId}/custodians/{custodianId}/siteSources/{siteSourceId}
GET /compliance/ediscovery/cases/{caseId}/legalHolds/{legalHoldId}/siteSources/{siteSourceId}
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

If successful, this method returns a `200 OK` response code and a [siteSource](../resources/ediscovery-sitesource.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_sitesource"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/compliance/ediscovery/cases/{caseId}/custodians/{custodianId}/siteSources/{siteSourceId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.ediscovery.siteSource"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.ediscovery.siteSource",
    "id": "d50c92d0-92d0-d50c-d092-0cd5d0920cd5",
    "createdBy": {
      "@odata.type": "microsoft.graph.identitySet"
    },
    "createdDateTime": "String (timestamp)",
    "displayName": "String"
  }
}
```

