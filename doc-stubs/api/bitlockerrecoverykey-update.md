---
title: "Update bitlockerRecoveryKey"
description: "Update the properties of a bitlockerRecoveryKey object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update bitlockerRecoveryKey
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [bitlockerRecoveryKey](../resources/bitlockerrecoverykey.md) object.

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
PATCH /me/informationProtection/bitlocker/recoveryKeys/{bitlockerRecoveryKeyId}
PATCH /users/{usersId}/informationProtection/bitlocker/recoveryKeys/{bitlockerRecoveryKeyId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [bitlockerRecoveryKey](../resources/bitlockerrecoverykey.md) object.

The following table shows the properties that are required when you update the [bitlockerRecoveryKey](../resources/bitlockerrecoverykey.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|deviceId|String|**TODO: Add Description**|
|key|String|**TODO: Add Description**|
|volumeType|volumeType|**TODO: Add Description**. Possible values are: `operatingSystemVolume`, `fixedDataVolume`, `removableDataVolume`, `unknownFutureValue`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [bitlockerRecoveryKey](../resources/bitlockerrecoverykey.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_bitlockerrecoverykey"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/me/informationProtection/bitlocker/recoveryKeys/{bitlockerRecoveryKeyId}
Content-Type: application/json
Content-length: 134

{
  "@odata.type": "#microsoft.graph.bitlockerRecoveryKey",
  "deviceId": "String",
  "key": "String",
  "volumeType": "String"
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
  "@odata.type": "#microsoft.graph.bitlockerRecoveryKey",
  "id": "bce76dbf-6dbf-bce7-bf6d-e7bcbf6de7bc",
  "createdDateTime": "String (timestamp)",
  "deviceId": "String",
  "key": "String",
  "volumeType": "String"
}
```

