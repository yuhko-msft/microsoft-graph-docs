---
title: "Update openTypeExtension"
description: "Update the properties of an openTypeExtension object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update openTypeExtension
Namespace: microsoft.graph

Update the properties of an [openTypeExtension](../resources/opentypeextension.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
PATCH /openTypeExtension
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [openTypeExtension](../resources/opentypeextension.md) object.

The following table shows the properties that are required when you create the [openTypeExtension](../resources/opentypeextension.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|extensionName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [openTypeExtension](../resources/opentypeextension.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_opentypeextension"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/openTypeExtension
Content-Type: application/json
Content-length: 89

{
  "@odata.type": "#microsoft.graph.openTypeExtension",
  "extensionName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.openTypeExtension",
  "id": "0cb36e1d-6e1d-0cb3-1d6e-b30c1d6eb30c",
  "extensionName": "String"
}
```

