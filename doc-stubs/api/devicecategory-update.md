---
title: "Update deviceCategory"
description: "Update the properties of a deviceCategory object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceCategory
Namespace: microsoft.graph



Update the properties of a [deviceCategory](../resources/devicecategory.md) object.

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
PATCH /deviceManagement/deviceCategories/{deviceCategoryId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceCategory](../resources/devicecategory.md) object.

The following table shows the properties that are required when you update the [deviceCategory](../resources/devicecategory.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|description|String|Optional description for the device category.|
|displayName|String|Display name for the device category.|
|roleScopeTagIds|String collection|Optional role scope tags for the device category.|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceCategory](../resources/devicecategory.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicecategory"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/deviceCategories/{deviceCategoryId}
Content-Type: application/json
Content-length: 156

{
  "@odata.type": "#microsoft.graph.deviceCategory",
  "description": "String",
  "displayName": "String",
  "roleScopeTagIds": [
    "String"
  ]
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
  "@odata.type": "#microsoft.graph.deviceCategory",
  "id": "4860f5ef-f5ef-4860-eff5-6048eff56048",
  "description": "String",
  "displayName": "String",
  "roleScopeTagIds": [
    "String"
  ]
}
```

