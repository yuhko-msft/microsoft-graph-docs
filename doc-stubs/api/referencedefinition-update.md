---
title: "Update referenceDefinition"
description: "Update the properties of a referenceDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update referenceDefinition
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [referenceDefinition](../resources/referencedefinition.md) object.

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
PATCH /industryData/referenceDefinitions/{referenceDefinitionId}
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
|eTag|String|**TODO: Add Description** Inherited from [mutableEntity](../resources/mutableentity.md). Optional.|
|namespace|String|**TODO: Add Description** Required.|
|referenceType|String|**TODO: Add Description** Required.|
|code|String|**TODO: Add Description** Required.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|sortOrder|String|**TODO: Add Description** Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [referenceDefinition](../resources/referencedefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_referencedefinition"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/industryData/referenceDefinitions/{referenceDefinitionId}
Content-Type: application/json
Content-length: 185

{
  "@odata.type": "#microsoft.graph.referenceDefinition",
  "eTag": "String",
  "namespace": "String",
  "referenceType": "String",
  "code": "String",
  "sortOrder": "String"
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
  "@odata.type": "#microsoft.graph.referenceDefinition",
  "eTag": "String",
  "namespace": "String",
  "referenceType": "String",
  "code": "String",
  "createdDateTime": "String (timestamp)",
  "sortOrder": "String"
}
```

