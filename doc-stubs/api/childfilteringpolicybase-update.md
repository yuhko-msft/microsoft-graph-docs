---
title: "Update childFilteringPolicyBase"
description: "Update the properties of a childFilteringPolicyBase object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update childFilteringPolicyBase
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [childFilteringPolicyBase](../resources/childfilteringpolicybase.md) object.

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
PATCH /childFilteringPolicyBase
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|name|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md). Optional.|
|description|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md). Optional.|
|priority|Int64|**TODO: Add Description** Required.|
|action|filteringPolicyAction|**TODO: Add Description**. The possible values are: `block`, `allow`, `alert`, `redirect`. Required.|
|state|enablementState|**TODO: Add Description**. The possible values are: `enabled`, `disabled`. Required.|
|loggingState|enablementState|**TODO: Add Description**. The possible values are: `enabled`, `disabled`. Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [childFilteringPolicyBase](../resources/childfilteringpolicybase.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_childfilteringpolicybase"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/childFilteringPolicyBase
Content-Type: application/json
Content-length: 215

{
  "@odata.type": "#microsoft.graph.childFilteringPolicyBase",
  "name": "String",
  "description": "String",
  "priority": "Integer",
  "action": "String",
  "state": "String",
  "loggingState": "String"
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
  "@odata.type": "#microsoft.graph.childFilteringPolicyBase",
  "id": "cfb9ba2c-ba2c-cfb9-2cba-b9cf2cbab9cf",
  "name": "String",
  "description": "String",
  "priority": "Integer",
  "action": "String",
  "state": "String",
  "loggingState": "String"
}
```

