---
title: "Update office365ActivationsUserDetail"
description: "Update the properties of an office365ActivationsUserDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update office365ActivationsUserDetail
Namespace: microsoft.graph



Update the properties of an [office365ActivationsUserDetail](../resources/office365activationsuserdetail.md) object.

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
PATCH /office365ActivationsUserDetail
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [office365ActivationsUserDetail](../resources/office365activationsuserdetail.md) object.

The following table shows the properties that are required when you update the [office365ActivationsUserDetail](../resources/office365activationsuserdetail.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|userActivationCounts|[userActivationCounts](../resources/useractivationcounts.md) collection|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [office365ActivationsUserDetail](../resources/office365activationsuserdetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_office365activationsuserdetail"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/office365ActivationsUserDetail
Content-Type: application/json
Content-length: 276

{
  "@odata.type": "#microsoft.graph.office365ActivationsUserDetail",
  "displayName": "String",
  "reportRefreshDate": "Date",
  "userActivationCounts": [
    {
      "@odata.type": "microsoft.graph.userActivationCounts"
    }
  ],
  "userPrincipalName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
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
```

