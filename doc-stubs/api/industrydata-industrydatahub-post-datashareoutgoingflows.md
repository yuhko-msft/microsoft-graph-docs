---
title: "Create dataShareOutgoingFlow"
description: "Create a new dataShareOutgoingFlow object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create dataShareOutgoingFlow
Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [dataShareOutgoingFlow](../resources/industrydata-datashareoutgoingflow.md) object.

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
POST /industryData/dataShareOutgoingFlows
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [dataShareOutgoingFlow](../resources/industrydata-datashareoutgoingflow.md) object.

You can specify the following properties when creating a **dataShareOutgoingFlow**.

|Property|Type|Description|
|:---|:---|:---|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md). Optional.|
|displayName|String|Name of the process. Inherited from [process](../resources/industrydata-process.md). Required.|
|readinessStatus|readinessStatus|The state of the process from creation through to ready to do work. Inherited from [process](../resources/industrydata-process.md). The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`. Required.|
|inviteeUserIds|String collection|The list of Azure Active Directory identifiers to invite to accept the share.  Must be Global Administrators in the tenant.
Currently only accepts a single identifier. Required.|
|sharingState|dataShareSharingState|The status of the Azure Data Share flow after the invitation has been sent. The possible values are: `pending`, `running`, `problem`, `unknownFutureValue`. Required.|
|shareName|String|The name of the share that will bew mentioned in the invitation. Required.|



## Response

If successful, this method returns a `201 Created` response code and a [dataShareOutgoingFlow](../resources/industrydata-datashareoutgoingflow.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_datashareoutgoingflow_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/industryData/dataShareOutgoingFlows
Content-Type: application/json
Content-length: 255

{
  "@odata.type": "#microsoft.graph.industryData.dataShareOutgoingFlow",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String",
  "inviteeUserIds": [
    "String"
  ],
  "sharingState": "String",
  "shareName": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.industryData.dataShareOutgoingFlow"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.industryData.dataShareOutgoingFlow",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String",
  "inviteeUserIds": [
    "String"
  ],
  "sharingState": "String",
  "shareName": "String"
}
```

