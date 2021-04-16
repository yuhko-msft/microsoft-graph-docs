---
title: "Create deviceManagementAbstractComplexSettingInstance"
description: "Create a new deviceManagementAbstractComplexSettingInstance object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementAbstractComplexSettingInstance
Namespace: microsoft.graph



Create a new [deviceManagementAbstractComplexSettingInstance](../resources/devicemanagementabstractcomplexsettinginstance.md) object.

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
POST ** Collection URI for microsoft.graph.deviceManagementAbstractComplexSettingInstance not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementAbstractComplexSettingInstance](../resources/devicemanagementabstractcomplexsettinginstance.md) object.

The following table shows the properties that are required when you create the [deviceManagementAbstractComplexSettingInstance](../resources/devicemanagementabstractcomplexsettinginstance.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|definitionId|String|The ID of the setting definition for this instance Inherited from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|
|valueJson|String|JSON representation of the value Inherited from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|
|implementationId|String|The definition ID for the chosen implementation of this complex setting|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementAbstractComplexSettingInstance](../resources/devicemanagementabstractcomplexsettinginstance.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementabstractcomplexsettinginstance_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.deviceManagementAbstractComplexSettingInstance not found
Content-Type: application/json
Content-length: 176

{
  "@odata.type": "#microsoft.graph.deviceManagementAbstractComplexSettingInstance",
  "definitionId": "String",
  "valueJson": "String",
  "implementationId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementAbstractComplexSettingInstance"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementAbstractComplexSettingInstance",
  "id": "6a59b6a1-b6a1-6a59-a1b6-596aa1b6596a",
  "definitionId": "String",
  "valueJson": "String",
  "implementationId": "String"
}
```

