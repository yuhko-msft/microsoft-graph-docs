---
title: "accessPackage: Search"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# accessPackage: Search
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
GET /identityGovernance/entitlementManagement/accessPackages/Search
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this function returns a `200 OK` response code and a [accessPackage](../resources/accesspackage.md) collection in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "accesspackage_search"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/identityGovernance/entitlementManagement/accessPackages/Search
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.accessPackage)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.accessPackage",
      "id": "String (identifier)",
      "catalogId": "String",
      "createdBy": "String",
      "createdDateTime": "String (timestamp)",
      "description": "String",
      "displayName": "String",
      "isHidden": "Boolean",
      "isRoleScopesVisible": "Boolean",
      "modifiedBy": "String",
      "modifiedDateTime": "String (timestamp)"
    }
  ]
}
```

