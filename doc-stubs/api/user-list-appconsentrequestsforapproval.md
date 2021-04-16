---
title: "List appConsentRequestsForApproval"
description: "Get the appConsentRequest resources from the appConsentRequestsForApproval navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List appConsentRequestsForApproval
Namespace: microsoft.graph



Get the appConsentRequest resources from the appConsentRequestsForApproval navigation property.

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
GET /me/appConsentRequestsForApproval
GET /users/{usersId}/appConsentRequestsForApproval
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

If successful, this method returns a `200 OK` response code and a collection of [appConsentRequest](../resources/appconsentrequest.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_appconsentrequest"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/appConsentRequestsForApproval
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.appConsentRequest)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.appConsentRequest",
      "id": "dec911e9-11e9-dec9-e911-c9dee911c9de",
      "appDisplayName": "String",
      "appId": "String",
      "consentType": "String",
      "pendingScopes": [
        {
          "@odata.type": "microsoft.graph.appConsentRequestScope"
        }
      ]
    }
  ]
}
```

