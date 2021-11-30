---
title: "Update incomingFlow"
description: "Update the properties of an incomingFlow object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update incomingFlow
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [incomingFlow](../resources/incomingflow.md) object.

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
PATCH /industryData/incomingFlows/{incomingFlowId}
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
|dataDomain|incomingDomain|**TODO: Add Description**. The possible values are: `educationRostering`, `unknownFutureValue`. Required.|
|recurrenceEffectiveDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|recurrenceExpirationDateTime|DateTimeOffset|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [incomingFlow](../resources/incomingflow.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_incomingflow"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/industryData/incomingFlows/{incomingFlowId}
Content-Type: application/json
Content-length: 275

{
  "@odata.type": "#microsoft.graph.incomingFlow",
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.incomingFlow",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String",
  "dataDomain": "String",
  "recurrenceEffectiveDateTime": "String (timestamp)",
  "recurrenceExpirationDateTime": "String (timestamp)"
}
```

