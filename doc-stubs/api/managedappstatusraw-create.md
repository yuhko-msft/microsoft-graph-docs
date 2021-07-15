---
title: "Create managedAppStatusRaw"
description: "Create a new managedAppStatusRaw object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create managedAppStatusRaw
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [managedAppStatusRaw](../resources/managedappstatusraw.md) object.

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
POST ** Collection URI for microsoft.graph.managedAppStatusRaw not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [managedAppStatusRaw](../resources/managedappstatusraw.md) object.

The following table shows the properties that are required when you create the [managedAppStatusRaw](../resources/managedappstatusraw.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|Friendly name of the status report. Inherited from [managedAppStatus](../resources/managedappstatus.md)|
|version|String|Version of the entity. Inherited from [managedAppStatus](../resources/managedappstatus.md)|
|content|[Json](../resources/json.md)|Status report content.|



## Response

If successful, this method returns a `201 Created` response code and a [managedAppStatusRaw](../resources/managedappstatusraw.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_managedappstatusraw_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.managedAppStatusRaw not found
Content-Type: application/json
Content-length: 178

{
  "@odata.type": "#microsoft.graph.managedAppStatusRaw",
  "displayName": "String",
  "version": "String",
  "content": {
    "@odata.type": "microsoft.graph.Json"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.managedAppStatusRaw"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.managedAppStatusRaw",
  "id": "00e4c4f8-c4f8-00e4-f8c4-e400f8c4e400",
  "displayName": "String",
  "version": "String",
  "content": {
    "@odata.type": "microsoft.graph.Json"
  }
}
```

