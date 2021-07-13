---
title: "Create schemaExtension"
description: "Create a new schemaExtension object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create schemaExtension
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [schemaExtension](../resources/schemaextension.md) object.

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
POST /schemaExtensions
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [schemaExtension](../resources/schemaextension.md) object.

The following table shows the properties that are required when you create the [schemaExtension](../resources/schemaextension.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|description|String|**TODO: Add Description**|
|owner|String|**TODO: Add Description**|
|properties|[extensionSchemaProperty](../resources/extensionschemaproperty.md) collection|**TODO: Add Description**|
|status|String|**TODO: Add Description**|
|targetTypes|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [schemaExtension](../resources/schemaextension.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_schemaextension_from_schemaextensions"
}
-->
``` http
POST https://graph.microsoft.com/beta/schemaExtensions
Content-Type: application/json
Content-length: 273

{
  "@odata.type": "#microsoft.graph.schemaExtension",
  "description": "String",
  "owner": "String",
  "properties": [
    {
      "@odata.type": "microsoft.graph.extensionSchemaProperty"
    }
  ],
  "status": "String",
  "targetTypes": [
    "String"
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.schemaExtension"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.schemaExtension",
  "id": "65df5ce5-5ce5-65df-e55c-df65e55cdf65",
  "description": "String",
  "owner": "String",
  "properties": [
    {
      "@odata.type": "microsoft.graph.extensionSchemaProperty"
    }
  ],
  "status": "String",
  "targetTypes": [
    "String"
  ]
}
```

