---
title: "Update incomingApiFlow"
description: "Update the properties of an incomingApiFlow object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update incomingApiFlow
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [incomingApiFlow](../resources/incomingapiflow.md) object.

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
PATCH ** Entity URI for microsoft.industryData.incomingApiFlow not found
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
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md). Optional.|
|displayName|String|Name of the process. Inherited from [process](../resources/process.md). Required.|
|readinessStatus|readinessStatus|The state of the process from creation through to ready to do work. Inherited from [process](../resources/process.md). The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`. Required.|
|dataDomain|incomingDomain|The broad category of data that is being imported by this flow. Inherited from [incomingFlow](../resources/incomingflow.md). The possible values are: `educationRostering`, `unknownFutureValue`. Required.|
|recurrenceEffectiveDateTime|DateTimeOffset|The start of the time window when the flow is allowed to run. ISO 8601 format. Inherited from [incomingFlow](../resources/incomingflow.md). Required.|
|recurrenceExpirationDateTime|DateTimeOffset|The end of the time window when the flow is allowed to run. ISO 8601 format. Inherited from [incomingFlow](../resources/incomingflow.md). Optional.|
|apiFilter|[microsoft.industryData.apiFilter](../resources/apifilter.md)|A filter to reduce the amount of data imported via the API. Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [incomingApiFlow](../resources/incomingapiflow.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_incomingapiflow"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.industryData.incomingApiFlow not found
Content-Type: application/json
Content-length: 350

{
  "@odata.type": "#microsoft.graph.incomingApiFlow",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String",
  "dataDomain": "String",
  "recurrenceEffectiveDateTime": "String (timestamp)",
  "recurrenceExpirationDateTime": "String (timestamp)",
  "apiFilter": {
    "@odata.type": "microsoft.graph.apiFilter"
  }
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
  "@odata.type": "#microsoft.graph.incomingApiFlow",
  "id": "e7247382-7382-e724-8273-24e7827324e7",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String",
  "dataDomain": "String",
  "recurrenceEffectiveDateTime": "String (timestamp)",
  "recurrenceExpirationDateTime": "String (timestamp)",
  "apiFilter": {
    "@odata.type": "microsoft.graph.apiFilter"
  }
}
```

