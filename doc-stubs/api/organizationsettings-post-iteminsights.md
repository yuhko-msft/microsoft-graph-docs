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

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new itemInsightsSettings object.

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
POST /organization/settings/itemInsights
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
|isEnabledInOrganization|Boolean|**TODO: Add Description**|
|disabledForGroup|String|**TODO: Add Description**|



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
POST https://graph.microsoft.com/beta/organization/settings/itemInsights
Content-Type: application/json
Content-length: 170

{
  "@odata.type": "#Microsoft.Fast.PI.ViewGenerator.V2.Profile.Models.itemInsightsSettings",
  "isEnabledInOrganization": "Boolean",
  "disabledForGroup": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Fast.PI.ViewGenerator.V2.Profile.Models.itemInsightsSettings"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.Fast.PI.ViewGenerator.V2.Profile.Models.itemInsightsSettings",
  "isEnabledInOrganization": "Boolean",
  "disabledForGroup": "String"
}
```

