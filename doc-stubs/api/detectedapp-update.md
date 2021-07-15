---
title: "Update detectedApp"
description: "Update the properties of a detectedApp object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update detectedApp
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [detectedApp](../resources/detectedapp.md) object.

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
PATCH /deviceManagement/detectedApps/{detectedAppId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [detectedApp](../resources/detectedapp.md) object.

The following table shows the properties that are required when you update the [detectedApp](../resources/detectedapp.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceCount|Int32|The number of devices that have installed this application|
|displayName|String|Name of the discovered application. Read-only|
|sizeInByte|Int64|Discovered application size in bytes. Read-only|
|version|String|Version of the discovered application. Read-only|



## Response

If successful, this method returns a `200 OK` response code and an updated [detectedApp](../resources/detectedapp.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_detectedapp"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/detectedApps/{detectedAppId}
Content-Type: application/json
Content-length: 162

{
  "@odata.type": "#microsoft.graph.detectedApp",
  "deviceCount": "Integer",
  "displayName": "String",
  "sizeInByte": "Integer",
  "version": "String"
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
  "@odata.type": "#microsoft.graph.detectedApp",
  "id": "084126c1-26c1-0841-c126-4108c1264108",
  "deviceCount": "Integer",
  "displayName": "String",
  "sizeInByte": "Integer",
  "version": "String"
}
```

