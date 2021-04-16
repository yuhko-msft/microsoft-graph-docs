---
title: "Create deviceManagementTemplateSettingCategory"
description: "Create a new deviceManagementTemplateSettingCategory object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementTemplateSettingCategory
Namespace: microsoft.graph



Create a new deviceManagementTemplateSettingCategory object.

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
POST /deviceManagement/templates/{deviceManagementTemplateId}/categories
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementTemplateSettingCategory](../resources/devicemanagementtemplatesettingcategory.md) object.

The following table shows the properties that are required when you create the [deviceManagementTemplateSettingCategory](../resources/devicemanagementtemplatesettingcategory.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|The category name Inherited from [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md)|
|hasRequiredSetting|Boolean|The category contains top level required setting Inherited from [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md)|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementTemplateSettingCategory](../resources/devicemanagementtemplatesettingcategory.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementtemplatesettingcategory_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/templates/{deviceManagementTemplateId}/categories
Content-Type: application/json
Content-length: 145

{
  "@odata.type": "#microsoft.graph.deviceManagementTemplateSettingCategory",
  "displayName": "String",
  "hasRequiredSetting": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementTemplateSettingCategory"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementTemplateSettingCategory",
  "id": "f9d8f956-f956-f9d8-56f9-d8f956f9d8f9",
  "displayName": "String",
  "hasRequiredSetting": "Boolean"
}
```

