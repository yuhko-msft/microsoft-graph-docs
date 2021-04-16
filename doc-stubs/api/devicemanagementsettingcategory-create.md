---
title: "Create deviceManagementSettingCategory"
description: "Create a new deviceManagementSettingCategory object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementSettingCategory
Namespace: microsoft.graph



Create a new [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md) object.

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
POST /deviceManagement/categories
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md) object.

The following table shows the properties that are required when you create the [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|The category name|
|hasRequiredSetting|Boolean|The category contains top level required setting|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementsettingcategory_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/categories
Content-Type: application/json
Content-length: 137

{
  "@odata.type": "#microsoft.graph.deviceManagementSettingCategory",
  "displayName": "String",
  "hasRequiredSetting": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementSettingCategory"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementSettingCategory",
  "id": "8efbf629-f629-8efb-29f6-fb8e29f6fb8e",
  "displayName": "String",
  "hasRequiredSetting": "Boolean"
}
```

