---
title: "Update mobileAppCategory"
description: "Update the properties of a mobileAppCategory object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update mobileAppCategory
Namespace: microsoft.graph

Update the properties of a [mobileAppCategory](../resources/mobileappcategory.md) object.

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
PATCH /deviceAppManagement/mobileAppCategories/{mobileAppCategoryId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mobileAppCategory](../resources/mobileappcategory.md) object.

The following table shows the properties that are required when you create the [mobileAppCategory](../resources/mobileappcategory.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|The key of the entity.|
|displayName|String|The name of the app category.|
|lastModifiedDateTime|DateTimeOffset|The date and time the mobileAppCategory was last modified.|



## Response

If successful, this method returns a `200 OK` response code and an updated [mobileAppCategory](../resources/mobileappcategory.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_mobileappcategory"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceAppManagement/mobileAppCategories/{mobileAppCategoryId}
Content-Type: application/json
Content-length: 87

{
  "@odata.type": "#microsoft.graph.mobileAppCategory",
  "displayName": "String"
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
  "@odata.type": "#microsoft.graph.mobileAppCategory",
  "id": "d38f4c77-4c77-d38f-774c-8fd3774c8fd3",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

