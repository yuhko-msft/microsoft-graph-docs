---
title: "List accessPackageResourceScopes"
description: "Get the accessPackageResourceScope resources from the accessPackageResourceScopes navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List accessPackageResourceScopes
Namespace: microsoft.graph

Get the accessPackageResourceScope resources from the accessPackageResourceScopes navigation property.

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
GET /identityGovernance/entitlementManagement/accessPackageCatalogs/{accessPackageCatalogId}/accessPackageResourceScopes
GET /identityGovernance/entitlementManagement/accessPackageCatalogs/{accessPackageCatalogId}/accessPackageResources/{accessPackageResourceId}/accessPackageResourceScopes
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

If successful, this method returns a `200 OK` response code and a collection of [accessPackageResourceScope](../resources/accesspackageresourcescope.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_accesspackageresourcescope"
}
-->
``` http
GET https://graph.microsoft.com/beta/identityGovernance/entitlementManagement/accessPackageCatalogs/{accessPackageCatalogId}/accessPackageResourceScopes
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(Microsoft.IGAELM.EC.FrontEnd.ExternalModel.accessPackageResourceScope)"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": [
    {
      "@odata.type": "#Microsoft.IGAELM.EC.FrontEnd.ExternalModel.accessPackageResourceScope",
      "id": "886609c0-09c0-8866-c009-6688c0096688",
      "displayName": "String",
      "description": "String",
      "originId": "String",
      "originSystem": "String",
      "roleOriginId": "String",
      "isRootScope": "Boolean",
      "url": "String"
    }
  ]
}
```

