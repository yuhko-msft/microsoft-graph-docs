---
title: "Create insightsSettings"
description: "Create a new insightsSettings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create insightsSettings
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new insightsSettings object.

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
POST /organization/{organizationId}/settings/peopleInsights
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [insightsSettings](../resources/insightssettings.md) object.

The following table shows the properties that are required when you create the [insightsSettings](../resources/insightssettings.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isEnabledInOrganization|Boolean|**TODO: Add Description**|
|disabledForGroup|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [insightsSettings](../resources/insightssettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_insightssettings_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/organization/{organizationId}/settings/peopleInsights
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
  "truncated": true,
  "@odata.type": "microsoft.graph.insightsSettings"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.insightsSettings",
  "id": "22a84cc6-4cc6-22a8-c64c-a822c64ca822",
  "isEnabledInOrganization": "Boolean",
  "disabledForGroup": "String"
}
```

