---
title: "Create appConsentRequest"
description: "Create a new appConsentRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create appConsentRequest
Namespace: microsoft.graph



Create a new appConsentRequest object.

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
POST /me/appConsentRequestsForApproval
POST /users/{usersId}/appConsentRequestsForApproval
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [appConsentRequest](../resources/appconsentrequest.md) object.

The following table shows the properties that are required when you create the [appConsentRequest](../resources/appconsentrequest.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|appDisplayName|String|**TODO: Add Description**|
|appId|String|**TODO: Add Description**|
|consentType|String|**TODO: Add Description**|
|pendingScopes|[appConsentRequestScope](../resources/appconsentrequestscope.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [appConsentRequest](../resources/appconsentrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_appconsentrequest_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/me/appConsentRequestsForApproval
Content-Type: application/json
Content-length: 245

{
  "@odata.type": "#microsoft.graph.appConsentRequest",
  "appDisplayName": "String",
  "appId": "String",
  "consentType": "String",
  "pendingScopes": [
    {
      "@odata.type": "microsoft.graph.appConsentRequestScope"
    }
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.appConsentRequest"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

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
```

