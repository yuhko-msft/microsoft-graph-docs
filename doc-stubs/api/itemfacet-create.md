---
title: "Create itemFacet"
description: "Create a new itemFacet object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create itemFacet
Namespace: microsoft.graph



Create a new [itemFacet](../resources/itemfacet.md) object.

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
POST ** Collection URI for microsoft.graph.itemFacet not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [itemFacet](../resources/itemfacet.md) object.

The following table shows the properties that are required when you create the [itemFacet](../resources/itemfacet.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|allowedAudiences|allowedAudiences|**TODO: Add Description**. Possible values are: `me`, `family`, `contacts`, `groupMembers`, `organization`, `federatedOrganizations`, `everyone`, `unknownFutureValue`.|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|inference|[inferenceData](../resources/inferencedata.md)|**TODO: Add Description**|
|isSearchable|Boolean|**TODO: Add Description**|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|source|[personDataSources](../resources/persondatasources.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [itemFacet](../resources/itemfacet.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_itemfacet_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.itemFacet not found
Content-Type: application/json
Content-length: 341

{
  "@odata.type": "#microsoft.graph.itemFacet",
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
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.itemFacet"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.itemFacet",
  "id": "d188b229-b229-d188-29b2-88d129b288d1",
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
  }
}
```

