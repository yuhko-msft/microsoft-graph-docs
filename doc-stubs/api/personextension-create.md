---
title: "Create personExtension"
description: "Create a new personExtension object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create personExtension
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [personExtension](../resources/personextension.md) object.

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
POST /user/{userId}/profile/extensions
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [personExtension](../resources/personextension.md) object.

The following table shows the properties that are required when you create the [personExtension](../resources/personextension.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [extension](../resources/extension.md)|



## Response

If successful, this method returns a `201 Created` response code and a [personExtension](../resources/personextension.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_personextension_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/user/{userId}/profile/extensions
Content-Type: application/json
Content-length: 91

{
  "@odata.type": "#Microsoft.Fast.PI.ViewGenerator.V2.Profile.Models.personExtension"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Fast.PI.ViewGenerator.V2.Profile.Models.personExtension"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.Fast.PI.ViewGenerator.V2.Profile.Models.personExtension",
  "id": "eed0c924-c924-eed0-24c9-d0ee24c9d0ee"
}
```

