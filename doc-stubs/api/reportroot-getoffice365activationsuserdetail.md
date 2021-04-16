---
title: "reportRoot: getOffice365ActivationsUserDetail"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# reportRoot: getOffice365ActivationsUserDetail
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
GET /reports/getOffice365ActivationsUserDetail
GET /print/reports/getOffice365ActivationsUserDetail
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this function returns a `200 OK` response code and a [office365ActivationsUserDetail](../resources/office365activationsuserdetail.md) collection in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "reportroot_getoffice365activationsuserdetail"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/reports/getOffice365ActivationsUserDetail
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.office365ActivationsUserDetail)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.office365ActivationsUserDetail",
      "id": "String (identifier)",
      "displayName": "String",
      "reportRefreshDate": "Date",
      "userActivationCounts": [
        {
          "@odata.type": "microsoft.graph.userActivationCounts"
        }
      ],
      "userPrincipalName": "String"
    }
  ]
}
```

