---
title: "Create dataConnector"
description: "Create a new dataConnector object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create dataConnector
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [dataConnector](../resources/dataconnector.md) object.

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
POST /industryData/dataConnectors
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [dataConnector](../resources/dataconnector.md) object.

You can specify the following properties when creating a **dataConnector**.

|Property|Type|Description|
|:---|:---|:---|
|eTag|String|**TODO: Add Description** Inherited from [mutableEntity](../resources/mutableentity.md). Optional.|
|displayName|String|**TODO: Add Description** Required.|



## Response

If successful, this method returns a `201 Created` response code and a [dataConnector](../resources/dataconnector.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_dataconnector_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/industryData/dataConnectors
Content-Type: application/json
Content-length: 111

{
  "@odata.type": "#microsoft.industryData.dataConnector",
  "eTag": "String",
  "displayName": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.industryData.dataConnector"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.industryData.dataConnector",
  "eTag": "String",
  "displayName": "String"
}
```

