---
title: "Create incomingFlow"
description: "Create a new incomingFlow object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create incomingFlow
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [incomingFlow](../resources/incomingflow.md) object.

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
POST /industryData/incomingFlows
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [incomingFlow](../resources/incomingflow.md) object.

You can specify the following properties when creating an **incomingFlow**.

|Property|Type|Description|
|:---|:---|:---|
|eTag|String|**TODO: Add Description** Inherited from [mutableEntity](../resources/mutableentity.md). Optional.|
|displayName|String|**TODO: Add Description** Inherited from [runProcess](../resources/runprocess.md). Required.|
|readinessStatus|readinessStatus|**TODO: Add Description** Inherited from [runProcess](../resources/runprocess.md). The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`. Required.|
|dataDomain|incomingDomain|**TODO: Add Description**. The possible values are: `educationRostering`, `unknownFutureValue`. Required.|
|recurrenceEffectiveDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|recurrenceExpirationDateTime|DateTimeOffset|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and an [incomingFlow](../resources/incomingflow.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_incomingflow_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/industryData/incomingFlows
Content-Type: application/json
Content-length: 282

{
  "@odata.type": "#microsoft.industryData.incomingFlow",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String",
  "dataDomain": "String",
  "recurrenceEffectiveDateTime": "String (timestamp)",
  "recurrenceExpirationDateTime": "String (timestamp)"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.industryData.incomingFlow"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.industryData.incomingFlow",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String",
  "dataDomain": "String",
  "recurrenceEffectiveDateTime": "String (timestamp)",
  "recurrenceExpirationDateTime": "String (timestamp)"
}
```

