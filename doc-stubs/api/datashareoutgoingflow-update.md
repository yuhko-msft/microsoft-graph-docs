---
title: "Update dataShareOutgoingFlow"
description: "Update the properties of a dataShareOutgoingFlow object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update dataShareOutgoingFlow
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [dataShareOutgoingFlow](../resources/datashareoutgoingflow.md) object.

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
PATCH /industryData/dataShareOutgoingFlows/{dataShareOutgoingFlowId}
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
|inviteeUserIds|String collection|The list of Azure Active Directory identifiers to invite to accept the share.  Must be Global Administrators in the tenant.
Currently only accepts a single identifier. Required.|
|sharingState|dataShareSharingState|The status of the Azure Data Share flow after the invitation has been sent. The possible values are: `pending`, `running`, `problem`, `unknownFutureValue`. Required.|
|shareName|String|The name of the share that will bew mentioned in the invitation. Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [dataShareOutgoingFlow](../resources/datashareoutgoingflow.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_datashareoutgoingflow"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/industryData/dataShareOutgoingFlows/{dataShareOutgoingFlowId}
Content-Type: application/json
Content-length: 242

{
  "@odata.type": "#microsoft.graph.dataShareOutgoingFlow",
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.dataShareOutgoingFlow",
  "id": "3baf174c-174c-3baf-4c17-af3b4c17af3b",
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

