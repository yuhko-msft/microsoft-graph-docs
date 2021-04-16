---
title: "Create projectParticipation"
description: "Create a new projectParticipation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create projectParticipation
Namespace: microsoft.graph



Create a new [projectParticipation](../resources/projectparticipation.md) object.

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
POST /me/profile/projects
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [projectParticipation](../resources/projectparticipation.md) object.

The following table shows the properties that are required when you create the [projectParticipation](../resources/projectparticipation.md).

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
|categories|String collection|**TODO: Add Description**|
|client|[companyDetail](../resources/companydetail.md)|**TODO: Add Description**|
|collaborationTags|String collection|**TODO: Add Description**|
|colleagues|[relatedPerson](../resources/relatedperson.md) collection|**TODO: Add Description**|
|detail|[positionDetail](../resources/positiondetail.md)|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|sponsors|[relatedPerson](../resources/relatedperson.md) collection|**TODO: Add Description**|
|thumbnailUrl|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [projectParticipation](../resources/projectparticipation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_projectparticipation_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/me/profile/projects
Content-Type: application/json
Content-length: 825

{
  "@odata.type": "#microsoft.graph.projectParticipation",
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
  "categories": [
    "String"
  ],
  "client": {
    "@odata.type": "microsoft.graph.companyDetail"
  },
  "collaborationTags": [
    "String"
  ],
  "colleagues": [
    {
      "@odata.type": "microsoft.graph.relatedPerson"
    }
  ],
  "detail": {
    "@odata.type": "microsoft.graph.positionDetail"
  },
  "displayName": "String",
  "sponsors": [
    {
      "@odata.type": "microsoft.graph.relatedPerson"
    }
  ],
  "thumbnailUrl": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.projectParticipation"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.projectParticipation",
  "id": "8cb8e3d7-e3d7-8cb8-d7e3-b88cd7e3b88c",
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
  "categories": [
    "String"
  ],
  "client": {
    "@odata.type": "microsoft.graph.companyDetail"
  },
  "collaborationTags": [
    "String"
  ],
  "colleagues": [
    {
      "@odata.type": "microsoft.graph.relatedPerson"
    }
  ],
  "detail": {
    "@odata.type": "microsoft.graph.positionDetail"
  },
  "displayName": "String",
  "sponsors": [
    {
      "@odata.type": "microsoft.graph.relatedPerson"
    }
  ],
  "thumbnailUrl": "String"
}
```

