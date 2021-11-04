---
title: "Create filteringRuleSingleDestination"
description: "Create a new filteringRuleSingleDestination object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create filteringRuleSingleDestination
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [filteringRuleSingleDestination](../resources/filteringrulesingledestination.md) object.

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
POST /filteringRuleDestinationGroup/destinations
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [filteringRuleSingleDestination](../resources/filteringrulesingledestination.md) object.

You can specify the following properties when creating a **filteringRuleSingleDestination**.

|Property|Type|Description|
|:---|:---|:---|
|name|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md). Optional.|
|description|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md). Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [filteringRuleSingleDestination](../resources/filteringrulesingledestination.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_filteringrulesingledestination_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/filteringRuleDestinationGroup/destinations
Content-Type: application/json
Content-length: 121

{
  "@odata.type": "#microsoft.graph.filteringRuleSingleDestination",
  "name": "String",
  "description": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.filteringRuleSingleDestination"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.filteringRuleSingleDestination",
  "id": "cd4ff1e9-f1e9-cd4f-e9f1-4fcde9f14fcd",
  "name": "String",
  "description": "String"
}
```

