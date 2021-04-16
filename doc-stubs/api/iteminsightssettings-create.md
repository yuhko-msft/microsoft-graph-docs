---
title: "Create itemInsightsSettings"
description: "Create a new itemInsightsSettings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create itemInsightsSettings
Namespace: microsoft.graph



Create a new [itemInsightsSettings](../resources/iteminsightssettings.md) object.

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
POST ** Collection URI for microsoft.graph.itemInsightsSettings not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [itemInsightsSettings](../resources/iteminsightssettings.md) object.

The following table shows the properties that are required when you create the [itemInsightsSettings](../resources/iteminsightssettings.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|disabledForGroup|String|**TODO: Add Description**|
|isEnabledInOrganization|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [itemInsightsSettings](../resources/iteminsightssettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_iteminsightssettings_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.itemInsightsSettings not found
Content-Type: application/json
Content-length: 136

{
  "@odata.type": "#microsoft.graph.itemInsightsSettings",
  "disabledForGroup": "String",
  "isEnabledInOrganization": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.itemInsightsSettings"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.itemInsightsSettings",
  "id": "b012c028-c028-b012-28c0-12b028c012b0",
  "disabledForGroup": "String",
  "isEnabledInOrganization": "Boolean"
}
```

