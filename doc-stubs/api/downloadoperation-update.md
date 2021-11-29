---
title: "Update downloadOperation"
description: "Update the properties of a downloadOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update downloadOperation
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [downloadOperation](../resources/downloadoperation.md) object.

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
PATCH /downloadOperation
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
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md). Optional.|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md). Optional.|
|status|longRunningOperationStatus|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md). The possible values are: `notstarted`, `running`, `succeeded`, `failed`. Optional.|
|statusDetail|String|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md). Optional.|
|resourceLocation|String|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md). Optional.|
|resourceContent|Stream|Url to retrieve the downloaded content. Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [downloadOperation](../resources/downloadoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_downloadoperation"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/downloadOperation
Content-Type: application/json
Content-length: 223

{
  "@odata.type": "#microsoft.graph.downloadOperation",
  "lastActionDateTime": "String (timestamp)",
  "status": "String",
  "statusDetail": "String",
  "resourceLocation": "String",
  "resourceContent": "Stream"
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
  "@odata.type": "#microsoft.graph.downloadOperation",
  "id": "e887707b-707b-e887-7b70-87e87b7087e8",
  "createdDateTime": "String (timestamp)",
  "lastActionDateTime": "String (timestamp)",
  "status": "String",
  "statusDetail": "String",
  "resourceLocation": "String",
  "resourceContent": "Stream"
}
```

