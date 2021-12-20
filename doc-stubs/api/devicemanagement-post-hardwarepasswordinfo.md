---
title: "Create hardwarePasswordInfo"
description: "Create a new hardwarePasswordInfo object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create hardwarePasswordInfo
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [hardwarePasswordInfo](../resources/intune-hardwarepasswordinfo.md) object.

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
POST /deviceManagement/hardwarePasswordInfo
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [hardwarePasswordInfo](../resources/intune-hardwarepasswordinfo.md) object.

You can specify the following properties when creating a **hardwarePasswordInfo**.

|Property|Type|Description|
|:---|:---|:---|
|serialNumber|String|**TODO: Add Description** Required.|
|currentPassword|String|**TODO: Add Description** Optional.|
|previousPasswords|String collection|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [hardwarePasswordInfo](../resources/intune-hardwarepasswordinfo.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_hardwarepasswordinfo_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/hardwarePasswordInfo
Content-Type: application/json
Content-length: 169

{
  "@odata.type": "#microsoft.graph.hardwarePasswordInfo",
  "serialNumber": "String",
  "currentPassword": "String",
  "previousPasswords": [
    "String"
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.hardwarePasswordInfo"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.hardwarePasswordInfo",
  "id": "bbbbedb1-edb1-bbbb-b1ed-bbbbb1edbbbb",
  "serialNumber": "String",
  "currentPassword": "String",
  "previousPasswords": [
    "String"
  ]
}
```

