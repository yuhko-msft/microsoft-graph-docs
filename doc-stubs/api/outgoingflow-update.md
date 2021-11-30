---
title: "Update outgoingFlow"
description: "Update the properties of an outgoingFlow object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update outgoingFlow
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [outgoingFlow](../resources/outgoingflow.md) object.

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
PATCH ** Entity URI for microsoft.industryData.outgoingFlow not found
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
|eTag|String|**TODO: Add Description** Inherited from [mutableEntity](../resources/mutableentity.md). Optional.|
|displayName|String|**TODO: Add Description** Inherited from [runProcess](../resources/runprocess.md). Required.|
|readinessStatus|readinessStatus|**TODO: Add Description** Inherited from [runProcess](../resources/runprocess.md). The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`. Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [outgoingFlow](../resources/outgoingflow.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_outgoingflow"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.industryData.outgoingFlow not found
Content-Type: application/json
Content-length: 135

{
  "@odata.type": "#microsoft.graph.outgoingFlow",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String"
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
  "@odata.type": "#microsoft.graph.outgoingFlow",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String"
}
```

