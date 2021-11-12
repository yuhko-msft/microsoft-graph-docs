---
title: "Update sftpFileDataConnector"
description: "Update the properties of a sftpFileDataConnector object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update sftpFileDataConnector
Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [sftpFileDataConnector](../resources/industrydata-sftpfiledataconnector.md) object.

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
PATCH ** Entity URI for microsoft.graph.industryData.sftpFileDataConnector not found
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
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md). Optional.|
|displayName|String|Name of the data connector. Inherited from [dataConnector](../resources/industrydata-dataconnector.md). Required.|
|credential|[microsoft.graph.industryData.credential](../resources/industrydata-credential.md)|Credential to connect to the SFTP server. Required.|
|sftpAddress|String|Address of the SFTP server. Required.|
|formatSettings|[microsoft.graph.industryData.fileFormatSettings](../resources/industrydata-fileformatsettings.md)|File format settings Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [sftpFileDataConnector](../resources/industrydata-sftpfiledataconnector.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_sftpfiledataconnector"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.industryData.sftpFileDataConnector not found
Content-Type: application/json
Content-length: 339

{
  "@odata.type": "#microsoft.graph.industryData.sftpFileDataConnector",
  "eTag": "String",
  "displayName": "String",
  "credential": {
    "@odata.type": "microsoft.graph.industryData.credential"
  },
  "sftpAddress": "String",
  "formatSettings": {
    "@odata.type": "microsoft.graph.industryData.fileFormatSettings"
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
  "@odata.type": "#microsoft.graph.industryData.sftpFileDataConnector",
  "eTag": "String",
  "displayName": "String",
  "credential": {
    "@odata.type": "microsoft.graph.industryData.credential"
  },
  "sftpAddress": "String",
  "formatSettings": {
    "@odata.type": "microsoft.graph.industryData.fileFormatSettings"
  }
}
```

