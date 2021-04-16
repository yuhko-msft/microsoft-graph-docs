---
title: "Update deviceManagementIntentSettingCategory"
description: "Update the properties of a deviceManagementIntentSettingCategory object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementIntentSettingCategory
Namespace: microsoft.graph



Update the properties of a [deviceManagementIntentSettingCategory](../resources/devicemanagementintentsettingcategory.md) object.

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
PATCH /deviceManagement/intents/{deviceManagementIntentId}/categories/{deviceManagementIntentSettingCategoryId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementIntentSettingCategory](../resources/devicemanagementintentsettingcategory.md) object.

The following table shows the properties that are required when you update the [deviceManagementIntentSettingCategory](../resources/devicemanagementintentsettingcategory.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|The category name Inherited from [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md)|
|hasRequiredSetting|Boolean|The category contains top level required setting Inherited from [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md)|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementIntentSettingCategory](../resources/devicemanagementintentsettingcategory.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementintentsettingcategory"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/intents/{deviceManagementIntentId}/categories/{deviceManagementIntentSettingCategoryId}
Content-Type: application/json
Content-length: 143

{
  "@odata.type": "#microsoft.graph.deviceManagementIntentSettingCategory",
  "displayName": "String",
  "hasRequiredSetting": "Boolean"
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
  "@odata.type": "#microsoft.graph.deviceManagementIntentSettingCategory",
  "id": "abe8bdde-bdde-abe8-debd-e8abdebde8ab",
  "displayName": "String",
  "hasRequiredSetting": "Boolean"
}
```

