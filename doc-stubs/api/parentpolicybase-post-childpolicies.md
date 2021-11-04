---
title: "Create childPolicyBase"
description: "Create a new childPolicyBase object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create childPolicyBase
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [childPolicyBase](../resources/childpolicybase.md) object.

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
POST /parentPolicyBase/childPolicies
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [childPolicyBase](../resources/childpolicybase.md) object.

You can specify the following properties when creating a **childPolicyBase**.

|Property|Type|Description|
|:---|:---|:---|
|name|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md). Optional.|
|description|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md). Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [childPolicyBase](../resources/childpolicybase.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_childpolicybase_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/parentPolicyBase/childPolicies
Content-Type: application/json
Content-length: 106

{
  "@odata.type": "#microsoft.graph.childPolicyBase",
  "name": "String",
  "description": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.childPolicyBase"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.childPolicyBase",
  "id": "1deee46f-e46f-1dee-6fe4-ee1d6fe4ee1d",
  "name": "String",
  "description": "String"
}
```

