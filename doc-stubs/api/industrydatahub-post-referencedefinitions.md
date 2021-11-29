---
title: "Create referenceDefinition"
description: "Create a new referenceDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create referenceDefinition
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [referenceDefinition](../resources/referencedefinition.md) object.

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
POST /industryData/referenceDefinitions
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [referenceDefinition](../resources/referencedefinition.md) object.

You can specify the following properties when creating a **referenceDefinition**.

|Property|Type|Description|
|:---|:---|:---|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md). Optional.|
|namespace|String|Namespace for the definition. Required.|
|referenceType|String|Type of for the definition. The set of definitions sharing a type form the value set for that type. Required.|
|code|String|Code value for the definition.  Must be unique within the referenceType. Required.|
|createdDateTime|DateTimeOffset|Time the definition was created. Required.|
|sortOrder|String|Ordering index to present the definitions within a type consistently in user interfaces. Required.|



## Response

If successful, this method returns a `201 Created` response code and a [referenceDefinition](../resources/referencedefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_referencedefinition_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/industryData/referenceDefinitions
Content-Type: application/json
Content-length: 192

{
  "@odata.type": "#microsoft.industryData.referenceDefinition",
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
  "truncated": true,
  "@odata.type": "microsoft.industryData.referenceDefinition"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.industryData.referenceDefinition",
  "id": "694488ea-88ea-6944-ea88-4469ea884469",
  "eTag": "String",
  "namespace": "String",
  "referenceType": "String",
  "code": "String",
  "createdDateTime": "String (timestamp)",
  "sortOrder": "String"
}
```

