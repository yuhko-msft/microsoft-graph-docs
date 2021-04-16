---
title: "Create deviceManagementCollectionSettingInstance"
description: "Create a new deviceManagementCollectionSettingInstance object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementCollectionSettingInstance
Namespace: microsoft.graph



Create a new [deviceManagementCollectionSettingInstance](../resources/devicemanagementcollectionsettinginstance.md) object.

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
POST ** Collection URI for microsoft.graph.deviceManagementCollectionSettingInstance not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementCollectionSettingInstance](../resources/devicemanagementcollectionsettinginstance.md) object.

The following table shows the properties that are required when you create the [deviceManagementCollectionSettingInstance](../resources/devicemanagementcollectionsettinginstance.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|definitionId|String|The ID of the setting definition for this instance Inherited from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|
|valueJson|String|JSON representation of the value Inherited from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementCollectionSettingInstance](../resources/devicemanagementcollectionsettinginstance.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementcollectionsettinginstance_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.deviceManagementCollectionSettingInstance not found
Content-Type: application/json
Content-length: 138

{
  "@odata.type": "#microsoft.graph.deviceManagementCollectionSettingInstance",
  "definitionId": "String",
  "valueJson": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementCollectionSettingInstance"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementCollectionSettingInstance",
  "id": "5b62163f-163f-5b62-3f16-625b3f16625b",
  "definitionId": "String",
  "valueJson": "String"
}
```

