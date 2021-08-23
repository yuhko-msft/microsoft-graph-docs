---
title: "Update insightsSettings"
description: "Update the properties of an insightsSettings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update insightsSettings
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [insightsSettings](../resources/insightssettings.md) object.

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
PATCH /organization/{organizationId}/settings/itemInsights
PATCH /organization/{organizationId}/settings/peopleInsights
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [insightsSettings](../resources/insightssettings.md) object.

The following table shows the properties that are required when you update the [insightsSettings](../resources/insightssettings.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isEnabledInOrganization|Boolean|**TODO: Add Description**|
|disabledForGroup|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [insightsSettings](../resources/insightssettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_insightssettings"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/organization/{organizationId}/settings/itemInsights
Content-Type: application/json
Content-length: 132

{
  "@odata.type": "#microsoft.graph.insightsSettings",
  "isEnabledInOrganization": "Boolean",
  "disabledForGroup": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.insightsSettings",
  "id": "22a84cc6-4cc6-22a8-c64c-a822c64ca822",
  "isEnabledInOrganization": "Boolean",
  "disabledForGroup": "String"
}
```

