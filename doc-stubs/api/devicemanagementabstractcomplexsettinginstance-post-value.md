---
title: "Add deviceManagementSettingInstance"
description: "Add value by posting to the value collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add deviceManagementSettingInstance
Namespace: microsoft.graph



Add value by posting to the value collection.

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
POST /deviceManagementAbstractComplexSettingInstance/value/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) object.

The following table shows the properties that are required when you create the [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|definitionId|String|The ID of the setting definition for this instance|
|valueJson|String|JSON representation of the value|



## Response

If successful, this method returns a `204 No Content` response code and a [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementsettinginstance_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagementAbstractComplexSettingInstance/value/$ref
Content-Type: application/json
Content-length: 128

{
  "@odata.type": "#microsoft.graph.deviceManagementSettingInstance",
  "definitionId": "String",
  "valueJson": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementSettingInstance"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementSettingInstance",
  "id": "a6191013-1013-a619-1310-19a6131019a6",
  "definitionId": "String",
  "valueJson": "String"
}
```

