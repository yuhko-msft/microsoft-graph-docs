---
title: "Update localizedReferenceDefinitionView"
description: "Update the properties of a localizedReferenceDefinitionView object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update localizedReferenceDefinitionView
Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [localizedReferenceDefinitionView](../resources/industrydata-localizedreferencedefinitionview.md) object.

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
PATCH /localizedReferenceDefinitionView
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
|code|String|Code value for the definition. Required.|
|displayName|String|Localized name of the definition. Optional.|
|namespace|String|Namespace of the definition. Required.|
|url|String|Reference url to the definition. Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [localizedReferenceDefinitionView](../resources/industrydata-localizedreferencedefinitionview.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_localizedreferencedefinitionview"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/localizedReferenceDefinitionView
Content-Type: application/json
Content-length: 182

{
  "@odata.type": "#microsoft.graph.industryData.localizedReferenceDefinitionView",
  "code": "String",
  "displayName": "String",
  "namespace": "String",
  "url": "String"
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
  "@odata.type": "#microsoft.graph.industryData.localizedReferenceDefinitionView",
  "code": "String",
  "displayName": "String",
  "namespace": "String",
  "url": "String"
}
```
