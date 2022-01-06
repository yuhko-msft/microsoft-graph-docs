---
title: "Create cloudPcSnapshot"
description: "Create a new cloudPcSnapshot object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create cloudPcSnapshot
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [cloudPcSnapshot](../resources/cloudpcsnapshot.md) object.

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
POST /deviceManagement/virtualEndpoint/snapshots
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [cloudPcSnapshot](../resources/cloudpcsnapshot.md) object.

You can specify the following properties when creating a **cloudPcSnapshot**.

|Property|Type|Description|
|:---|:---|:---|
|cloudPcId|String|**TODO: Add Description** Required.|
|status|cloudPcSnapshotStatus|**TODO: Add Description**. The possible values are: `ready`, `unknownFutureValue`. Optional.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|lastRestoredDateTime|DateTimeOffset|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [cloudPcSnapshot](../resources/cloudpcsnapshot.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_cloudpcsnapshot_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/virtualEndpoint/snapshots
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
  "truncated": true,
  "@odata.type": "microsoft.graph.cloudPcSnapshot"
}
-->
``` http
HTTP/1.1 201 Created
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

