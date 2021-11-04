---
title: "Create customSecurityAttributeDefinition"
description: "Create a new customSecurityAttributeDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create customSecurityAttributeDefinition
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [customSecurityAttributeDefinition](../resources/customsecurityattributedefinition.md) object.

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
POST /directory/customSecurityAttributeDefinitions
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [customSecurityAttributeDefinition](../resources/customsecurityattributedefinition.md) object.

You can specify the following properties when creating a **customSecurityAttributeDefinition**.

|Property|Type|Description|
|:---|:---|:---|
|advancedOptions|[Microsoft.DirectoryServices.keyValue](../resources/keyvalue.md) collection|**TODO: Add Description** Required.|
|attributeSet|String|**TODO: Add Description** Required.|
|description|String|**TODO: Add Description** Optional.|
|isCollection|Boolean|**TODO: Add Description** Required.|
|isSearchable|Boolean|**TODO: Add Description** Optional.|
|name|String|**TODO: Add Description** Required.|
|status|String|**TODO: Add Description** Required.|
|type|String|**TODO: Add Description** Required.|
|usePreDefinedValuesOnly|Boolean|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [customSecurityAttributeDefinition](../resources/customsecurityattributedefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_customsecurityattributedefinition_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/directory/customSecurityAttributeDefinitions
Content-Type: application/json
Content-length: 403

{
  "@odata.type": "#Microsoft.DirectoryServices.customSecurityAttributeDefinition",
  "advancedOptions": [
    {
      "@odata.type": "microsoft.graph.keyValue"
    }
  ],
  "attributeSet": "String",
  "description": "String",
  "isCollection": "Boolean",
  "isSearchable": "Boolean",
  "name": "String",
  "status": "String",
  "type": "String",
  "usePreDefinedValuesOnly": "Boolean"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.customSecurityAttributeDefinition"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.DirectoryServices.customSecurityAttributeDefinition",
  "advancedOptions": [
    {
      "@odata.type": "microsoft.graph.keyValue"
    }
  ],
  "attributeSet": "String",
  "description": "String",
  "id": "7642ec7b-ec7b-7642-7bec-42767bec4276",
  "isCollection": "Boolean",
  "isSearchable": "Boolean",
  "name": "String",
  "status": "String",
  "type": "String",
  "usePreDefinedValuesOnly": "Boolean"
}
```

