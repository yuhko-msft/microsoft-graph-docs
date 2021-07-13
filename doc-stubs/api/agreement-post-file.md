---
title: "Create agreementFile"
description: "Create a new agreementFile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create agreementFile
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new agreementFile object.

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
POST /agreements/{agreementsId}/file
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [agreementFile](../resources/agreementfile.md) object.

The following table shows the properties that are required when you create the [agreementFile](../resources/agreementfile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [agreementFileProperties](../resources/agreementfileproperties.md)|
|displayName|String|**TODO: Add Description** Inherited from [agreementFileProperties](../resources/agreementfileproperties.md)|
|fileData|[agreementFileData](../resources/agreementfiledata.md)|**TODO: Add Description** Inherited from [agreementFileProperties](../resources/agreementfileproperties.md)|
|fileName|String|**TODO: Add Description** Inherited from [agreementFileProperties](../resources/agreementfileproperties.md)|
|isDefault|Boolean|**TODO: Add Description** Inherited from [agreementFileProperties](../resources/agreementfileproperties.md)|
|isMajorVersion|Boolean|**TODO: Add Description** Inherited from [agreementFileProperties](../resources/agreementfileproperties.md)|
|language|String|**TODO: Add Description** Inherited from [agreementFileProperties](../resources/agreementfileproperties.md)|



## Response

If successful, this method returns a `201 Created` response code and an [agreementFile](../resources/agreementfile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_agreementfile_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/agreements/{agreementsId}/file
Content-Type: application/json
Content-length: 271

{
  "@odata.type": "#microsoft.graph.agreementFile",
  "displayName": "String",
  "fileData": {
    "@odata.type": "microsoft.graph.agreementFileData"
  },
  "fileName": "String",
  "isDefault": "Boolean",
  "isMajorVersion": "Boolean",
  "language": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.agreementFile"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.agreementFile",
  "id": "6bc52e8b-2e8b-6bc5-8b2e-c56b8b2ec56b",
  "createdDateTime": "String (timestamp)",
  "displayName": "String",
  "fileData": {
    "@odata.type": "microsoft.graph.agreementFileData"
  },
  "fileName": "String",
  "isDefault": "Boolean",
  "isMajorVersion": "Boolean",
  "language": "String"
}
```

