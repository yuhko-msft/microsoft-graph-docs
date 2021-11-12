---
title: "Update referenceTranslation"
description: "Update the properties of a referenceTranslation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update referenceTranslation
Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [referenceTranslation](../resources/industrydata-referencetranslation.md) object.

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
PATCH /industryData/referenceDefinitions/{referenceDefinitionId}/translations/{referenceTranslationId}
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
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md). Optional.|
|createdDateTime|DateTimeOffset|The time the translation was created. Required.|
|language|String|The language the translation represents. IETF language tag format. Required.|
|displayName|String|The translated text. Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [referenceTranslation](../resources/industrydata-referencetranslation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_referencetranslation"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/industryData/referenceDefinitions/{referenceDefinitionId}/translations/{referenceTranslationId}
Content-Type: application/json
Content-length: 149

{
  "@odata.type": "#microsoft.graph.industryData.referenceTranslation",
  "eTag": "String",
  "language": "String",
  "displayName": "String"
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
  "@odata.type": "#microsoft.graph.industryData.referenceTranslation",
  "eTag": "String",
  "createdDateTime": "String (timestamp)",
  "language": "String",
  "displayName": "String"
}
```
