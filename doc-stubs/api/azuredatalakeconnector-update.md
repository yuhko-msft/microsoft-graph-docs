---
title: "Update azureDataLakeConnector"
description: "Update the properties of an azureDataLakeConnector object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update azureDataLakeConnector
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [azureDataLakeConnector](../resources/azuredatalakeconnector.md) object.

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
PATCH ** Entity URI for microsoft.industryData.azureDataLakeConnector not found
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
|displayName|String|Name of the data connector. Inherited from [dataConnector](../resources/dataconnector.md). Required.|
|formatSettings|[microsoft.industryData.fileFormatSettings](../resources/fileformatsettings.md)|The file format settings for the dataconnector Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [azureDataLakeConnector](../resources/azuredatalakeconnector.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_azuredatalakeconnector"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.industryData.azureDataLakeConnector not found
Content-Type: application/json
Content-length: 199

{
  "@odata.type": "#microsoft.graph.azureDataLakeConnector",
  "eTag": "String",
  "displayName": "String",
  "formatSettings": {
    "@odata.type": "microsoft.graph.fileFormatSettings"
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
  "@odata.type": "#microsoft.graph.azureDataLakeConnector",
  "id": "b70729c8-29c8-b707-c829-07b7c82907b7",
  "eTag": "String",
  "displayName": "String",
  "formatSettings": {
    "@odata.type": "microsoft.graph.fileFormatSettings"
  }
}
```

