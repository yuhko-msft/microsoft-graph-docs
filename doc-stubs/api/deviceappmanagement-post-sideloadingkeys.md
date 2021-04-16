---
title: "Create sideLoadingKey"
description: "Create a new sideLoadingKey object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create sideLoadingKey
Namespace: microsoft.graph



Create a new sideLoadingKey object.

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
POST /deviceAppManagement/sideLoadingKeys
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [sideLoadingKey](../resources/sideloadingkey.md) object.

The following table shows the properties that are required when you create the [sideLoadingKey](../resources/sideloadingkey.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|description|String|Side Loading Key description displayed to the ITPro Admins..|
|displayName|String|Side Loading Key Name displayed to the ITPro Admins.|
|lastUpdatedDateTime|String|Side Loading Key Last Updated Date displayed to the ITPro Admins.|
|totalActivation|Int32|Side Loading Key Total Activation displayed to the ITPro Admins.|
|value|String|Side Loading Key Value, it is 5x5 value, seperated by hiphens.|



## Response

If successful, this method returns a `201 Created` response code and a [sideLoadingKey](../resources/sideloadingkey.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_sideloadingkey_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceAppManagement/sideLoadingKeys
Content-Type: application/json
Content-length: 203

{
  "@odata.type": "#microsoft.graph.sideLoadingKey",
  "description": "String",
  "displayName": "String",
  "lastUpdatedDateTime": "String",
  "totalActivation": "Integer",
  "value": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.sideLoadingKey"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.sideLoadingKey",
  "id": "f2ae6332-6332-f2ae-3263-aef23263aef2",
  "description": "String",
  "displayName": "String",
  "lastUpdatedDateTime": "String",
  "totalActivation": "Integer",
  "value": "String"
}
```

