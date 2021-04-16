---
title: "Get office365ActivationsUserDetail"
description: "Read the properties and relationships of an office365ActivationsUserDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get office365ActivationsUserDetail
Namespace: microsoft.graph



Read the properties and relationships of an [office365ActivationsUserDetail](../resources/office365activationsuserdetail.md) object.

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
GET /office365ActivationsUserDetail
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

If successful, this method returns a `200 OK` response code and an [office365ActivationsUserDetail](../resources/office365activationsuserdetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_office365activationsuserdetail"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/office365ActivationsUserDetail
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.office365ActivationsUserDetail"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.office365ActivationsUserDetail",
    "id": "ffe59830-9830-ffe5-3098-e5ff3098e5ff",
    "displayName": "String",
    "reportRefreshDate": "Date",
    "userActivationCounts": [
      {
        "@odata.type": "microsoft.graph.userActivationCounts"
      }
    ],
    "userPrincipalName": "String"
  }
}
```

