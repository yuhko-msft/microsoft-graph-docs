---
title: "Create wellKnownTaskList"
description: "Create a new wellKnownTaskList object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create wellKnownTaskList
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new wellKnownTaskList object.

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
POST /user/tasks/lists
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [wellKnownTaskList](../resources/wellknowntasklist.md) object.

The following table shows the properties that are required when you create the [wellKnownTaskList](../resources/wellknowntasklist.md).

|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Inherited from [baseTaskList](../resources/basetasklist.md)|
|id|String|**TODO: Add Description** Inherited from [baseTaskList](../resources/basetasklist.md)|
|wellKnownListName|wellKnownListName_v2|**TODO: Add Description**. The possible values are: `none`, `defaultList`, `flaggedEmails`, `unknownFutureValue`.|



## Response

If successful, this method returns a `201 Created` response code and a [wellKnownTaskList](../resources/wellknowntasklist.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_wellknowntasklist_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/user/tasks/lists
Content-Type: application/json
Content-length: 121

{
  "@odata.type": "#microsoft.graph.wellKnownTaskList",
  "displayName": "String",
  "wellKnownListName": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.wellKnownTaskList"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.wellKnownTaskList",
  "displayName": "String",
  "id": "748857e3-57e3-7488-e357-8874e3578874",
  "wellKnownListName": "String"
}
```

