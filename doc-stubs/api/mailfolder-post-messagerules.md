---
title: "Create messageRule"
description: "Create a new messageRule object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create messageRule
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new messageRule object.

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
POST /users/{usersId}/mailFolders/{mailFolderId}/messageRules
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [messageRule](../resources/messagerule.md) object.

The following table shows the properties that are required when you create the [messageRule](../resources/messagerule.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|actions|[messageRuleActions](../resources/messageruleactions.md)|**TODO: Add Description**|
|conditions|[messageRulePredicates](../resources/messagerulepredicates.md)|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|exceptions|[messageRulePredicates](../resources/messagerulepredicates.md)|**TODO: Add Description**|
|hasError|Boolean|**TODO: Add Description**|
|isEnabled|Boolean|**TODO: Add Description**|
|isReadOnly|Boolean|**TODO: Add Description**|
|sequence|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [messageRule](../resources/messagerule.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_messagerule_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/users/{usersId}/mailFolders/{mailFolderId}/messageRules
Content-Type: application/json
Content-length: 437

{
  "@odata.type": "#microsoft.graph.messageRule",
  "actions": {
    "@odata.type": "microsoft.graph.messageRuleActions"
  },
  "conditions": {
    "@odata.type": "microsoft.graph.messageRulePredicates"
  },
  "displayName": "String",
  "exceptions": {
    "@odata.type": "microsoft.graph.messageRulePredicates"
  },
  "hasError": "Boolean",
  "isEnabled": "Boolean",
  "isReadOnly": "Boolean",
  "sequence": "Integer"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.messageRule"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.messageRule",
  "id": "ea5b1a3e-1a3e-ea5b-3e1a-5bea3e1a5bea",
  "actions": {
    "@odata.type": "microsoft.graph.messageRuleActions"
  },
  "conditions": {
    "@odata.type": "microsoft.graph.messageRulePredicates"
  },
  "displayName": "String",
  "exceptions": {
    "@odata.type": "microsoft.graph.messageRulePredicates"
  },
  "hasError": "Boolean",
  "isEnabled": "Boolean",
  "isReadOnly": "Boolean",
  "sequence": "Integer"
}
```

