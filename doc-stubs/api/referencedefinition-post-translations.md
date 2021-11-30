---
title: "Create referenceTranslation"
description: "Create a new referenceTranslation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create referenceTranslation
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [referenceTranslation](../resources/referencetranslation.md) object.

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
POST /industryData/referenceDefinitions/{referenceDefinitionId}/translations
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [referenceTranslation](../resources/referencetranslation.md) object.

You can specify the following properties when creating a **referenceTranslation**.

|Property|Type|Description|
|:---|:---|:---|
|eTag|String|**TODO: Add Description** Inherited from [mutableEntity](../resources/mutableentity.md). Optional.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|language|String|**TODO: Add Description** Required.|
|displayName|String|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [referenceTranslation](../resources/referencetranslation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_referencetranslation_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/industryData/referenceDefinitions/{referenceDefinitionId}/translations
Content-Type: application/json
Content-length: 143

{
  "@odata.type": "#microsoft.industryData.referenceTranslation",
  "eTag": "String",
  "language": "String",
  "displayName": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.industryData.referenceTranslation"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.industryData.referenceTranslation",
  "eTag": "String",
  "createdDateTime": "String (timestamp)",
  "language": "String",
  "displayName": "String"
}
```

