---
title: "List iosVppAppAssignedUserLicenses"
description: "Get a list of the iosVppAppAssignedUserLicense objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List iosVppAppAssignedUserLicenses
Namespace: microsoft.graph



Get a list of the [iosVppAppAssignedUserLicense](../resources/iosvppappassigneduserlicense.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.iosVppAppAssignedUserLicense not found
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

If successful, this method returns a `200 OK` response code and a collection of [iosVppAppAssignedUserLicense](../resources/iosvppappassigneduserlicense.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_iosvppappassigneduserlicense"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.iosVppAppAssignedUserLicense not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.iosVppAppAssignedUserLicense)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.iosVppAppAssignedUserLicense",
      "id": "c170228a-228a-c170-8a22-70c18a2270c1",
      "userEmailAddress": "String",
      "userId": "String",
      "userName": "String",
      "userPrincipalName": "String"
    }
  ]
}
```

