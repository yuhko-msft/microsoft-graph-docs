---
title: "Update deviceManagementIntegerSettingInstance"
description: "Update the properties of a deviceManagementIntegerSettingInstance object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementIntegerSettingInstance
Namespace: microsoft.graph



Update the properties of a [deviceManagementIntegerSettingInstance](../resources/devicemanagementintegersettinginstance.md) object.

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
PATCH /deviceManagementIntegerSettingInstance
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementIntegerSettingInstance](../resources/devicemanagementintegersettinginstance.md) object.

The following table shows the properties that are required when you update the [deviceManagementIntegerSettingInstance](../resources/devicemanagementintegersettinginstance.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|definitionId|String|The ID of the setting definition for this instance Inherited from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|
|valueJson|String|JSON representation of the value Inherited from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|
|value|Int32|The integer value|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementIntegerSettingInstance](../resources/devicemanagementintegersettinginstance.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementintegersettinginstance"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagementIntegerSettingInstance
Content-Type: application/json
Content-length: 158

{
  "@odata.type": "#microsoft.graph.deviceManagementIntegerSettingInstance",
  "definitionId": "String",
  "valueJson": "String",
  "value": "Integer"
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
  "@odata.type": "#microsoft.graph.deviceManagementIntegerSettingInstance",
  "id": "136924d1-24d1-1369-d124-6913d1246913",
  "definitionId": "String",
  "valueJson": "String",
  "value": "Integer"
}
```

