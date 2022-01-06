---
title: "Update cloudPcSnapshot"
description: "Update the properties of a cloudPcSnapshot object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update cloudPcSnapshot
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [cloudPcSnapshot](../resources/cloudpcsnapshot.md) object.

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
PATCH /deviceManagement/virtualEndpoint/snapshots/{cloudPcSnapshotId}
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
|cloudPcId|String|**TODO: Add Description** Required.|
|status|cloudPcSnapshotStatus|**TODO: Add Description**. The possible values are: `ready`, `unknownFutureValue`. Optional.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|lastRestoredDateTime|DateTimeOffset|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [cloudPcSnapshot](../resources/cloudpcsnapshot.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_cloudpcsnapshot"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/virtualEndpoint/snapshots/{cloudPcSnapshotId}
Content-Type: application/json
Content-length: 155

{
  "@odata.type": "#microsoft.graph.cloudPcSnapshot",
  "cloudPcId": "String",
  "status": "String",
  "lastRestoredDateTime": "String (timestamp)"
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
  "@odata.type": "#microsoft.graph.cloudPcSnapshot",
  "id": "926ff3f0-f3f0-926f-f0f3-6f92f0f36f92",
  "cloudPcId": "String",
  "status": "String",
  "createdDateTime": "String (timestamp)",
  "lastRestoredDateTime": "String (timestamp)"
}
```

