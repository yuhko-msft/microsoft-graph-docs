---
title: "Create printTaskTrigger"
description: "Create a new printTaskTrigger object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create printTaskTrigger
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [printTaskTrigger](../resources/printtasktrigger.md) object.

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
POST /print/printers/{printerId}/taskTriggers
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [printTaskTrigger](../resources/printtasktrigger.md) object.

The following table shows the properties that are required when you create the [printTaskTrigger](../resources/printtasktrigger.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|event|printEvent|**TODO: Add Description**. Possible values are: `jobStarted`, `unknownFutureValue`.|



## Response

If successful, this method returns a `201 Created` response code and a [printTaskTrigger](../resources/printtasktrigger.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_printtasktrigger_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/print/printers/{printerId}/taskTriggers
Content-Type: application/json
Content-length: 80

{
  "@odata.type": "#microsoft.graph.printTaskTrigger",
  "event": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.printTaskTrigger"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.printTaskTrigger",
  "id": "754c916d-916d-754c-6d91-4c756d914c75",
  "event": "String"
}
```

