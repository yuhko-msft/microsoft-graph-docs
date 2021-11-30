---
title: "Create runProcess"
description: "Create a new runProcess object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create runProcess
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [runProcess](../resources/runprocess.md) object.

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
POST ** Collection URI for microsoft.industryData.runProcess not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [runProcess](../resources/runprocess.md) object.

You can specify the following properties when creating a **runProcess**.

|Property|Type|Description|
|:---|:---|:---|
|eTag|String|**TODO: Add Description** Inherited from [mutableEntity](../resources/mutableentity.md). Optional.|
|displayName|String|**TODO: Add Description** Required.|
|readinessStatus|readinessStatus|**TODO: Add Description**. The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`. Required.|



## Response

If successful, this method returns a `201 Created` response code and a [runProcess](../resources/runprocess.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_runprocess_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.industryData.runProcess not found
Content-Type: application/json
Content-length: 140

{
  "@odata.type": "#microsoft.industryData.runProcess",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.industryData.runProcess"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.industryData.runProcess",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String"
}
```

