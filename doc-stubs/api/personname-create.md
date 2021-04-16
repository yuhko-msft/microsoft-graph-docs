---
title: "Create personName"
description: "Create a new personName object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create personName
Namespace: microsoft.graph



Create a new [personName](../resources/personname.md) object.

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
POST /me/profile/names
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [personName](../resources/personname.md) object.

The following table shows the properties that are required when you create the [personName](../resources/personname.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|allowedAudiences|allowedAudiences|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md). Possible values are: `me`, `family`, `contacts`, `groupMembers`, `organization`, `federatedOrganizations`, `everyone`, `unknownFutureValue`.|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|inference|[inferenceData](../resources/inferencedata.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|isSearchable|Boolean|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|source|[personDataSources](../resources/persondatasources.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|displayName|String|**TODO: Add Description**|
|first|String|**TODO: Add Description**|
|initials|String|**TODO: Add Description**|
|languageTag|String|**TODO: Add Description**|
|last|String|**TODO: Add Description**|
|maiden|String|**TODO: Add Description**|
|middle|String|**TODO: Add Description**|
|nickname|String|**TODO: Add Description**|
|pronunciation|[personNamePronounciation](../resources/personnamepronounciation.md)|**TODO: Add Description**|
|suffix|String|**TODO: Add Description**|
|title|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [personName](../resources/personname.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_personname_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/me/profile/names
Content-Type: application/json
Content-length: 673

{
  "@odata.type": "#microsoft.graph.personName",
  "allowedAudiences": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "inference": {
    "@odata.type": "microsoft.graph.inferenceData"
  },
  "isSearchable": "Boolean",
  "source": {
    "@odata.type": "microsoft.graph.personDataSources"
  },
  "displayName": "String",
  "first": "String",
  "initials": "String",
  "languageTag": "String",
  "last": "String",
  "maiden": "String",
  "middle": "String",
  "nickname": "String",
  "pronunciation": {
    "@odata.type": "microsoft.graph.personNamePronounciation"
  },
  "suffix": "String",
  "title": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.personName"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.personName",
  "id": "80d4716e-716e-80d4-6e71-d4806e71d480",
  "allowedAudiences": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "inference": {
    "@odata.type": "microsoft.graph.inferenceData"
  },
  "isSearchable": "Boolean",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "source": {
    "@odata.type": "microsoft.graph.personDataSources"
  },
  "displayName": "String",
  "first": "String",
  "initials": "String",
  "languageTag": "String",
  "last": "String",
  "maiden": "String",
  "middle": "String",
  "nickname": "String",
  "pronunciation": {
    "@odata.type": "microsoft.graph.personNamePronounciation"
  },
  "suffix": "String",
  "title": "String"
}
```

