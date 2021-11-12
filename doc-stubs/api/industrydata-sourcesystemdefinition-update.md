---
title: "Update sourceSystemDefinition"
description: "Update the properties of a sourceSystemDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update sourceSystemDefinition
Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md) object.

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
PATCH /industryData/sourceSystems/{sourceSystemDefinitionId}
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
|displayName|String|Name of the source system. Required.|
|vendor|String|Name of the vendor who supplies the source system. Optional.|
|directoryUserMatchingSettings|[microsoft.graph.industryData.directoryUserMatchAttributeSelection](../resources/industrydata-directoryusermatchattributeselection.md) collection|Settings for matching the user data from the source system with user data in Azure Active Directory. Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_sourcesystemdefinition"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/industryData/sourceSystems/{sourceSystemDefinitionId}
Content-Type: application/json
Content-length: 297

{
  "@odata.type": "#microsoft.graph.industryData.sourceSystemDefinition",
  "eTag": "String",
  "displayName": "String",
  "vendor": "String",
  "directoryUserMatchingSettings": [
    {
      "@odata.type": "microsoft.graph.industryData.directoryUserMatchAttributeSelection"
    }
  ]
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
  "@odata.type": "#microsoft.graph.industryData.sourceSystemDefinition",
  "eTag": "String",
  "displayName": "String",
  "vendor": "String",
  "directoryUserMatchingSettings": [
    {
      "@odata.type": "microsoft.graph.industryData.directoryUserMatchAttributeSelection"
    }
  ]
}
```
