---
title: "Create filteringPolicyRule"
description: "Create a new filteringPolicyRule object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create filteringPolicyRule
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [filteringPolicyRule](../resources/filteringpolicyrule.md) object.

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
POST /childFilteringPolicyBase/rules
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [filteringPolicyRule](../resources/filteringpolicyrule.md) object.

You can specify the following properties when creating a **filteringPolicyRule**.

|Property|Type|Description|
|:---|:---|:---|
|name|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md). Optional.|
|description|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md). Optional.|
|destinationType|destinationType|**TODO: Add Description**. The possible values are: `ipGroup`. Required.|
|ports|String|**TODO: Add Description** Required.|
|protocol|urlProtocolType|**TODO: Add Description**. The possible values are: `http`, `https`. Required.|



## Response

If successful, this method returns a `201 Created` response code and a [filteringPolicyRule](../resources/filteringpolicyrule.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_filteringpolicyrule_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/childFilteringPolicyBase/rules
Content-Type: application/json
Content-length: 189

{
  "@odata.type": "#microsoft.graph.filteringPolicyRule",
  "name": "String",
  "description": "String",
  "destinationType": "String",
  "ports": "String",
  "protocol": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.filteringPolicyRule"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.filteringPolicyRule",
  "id": "d64b70cf-70cf-d64b-cf70-4bd6cf704bd6",
  "name": "String",
  "description": "String",
  "destinationType": "String",
  "ports": "String",
  "protocol": "String"
}
```

