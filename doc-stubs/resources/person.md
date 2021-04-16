---
title: "person resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# person resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List people](../api/person-list.md)|[person](../resources/person.md) collection|Get a list of the [person](../resources/person.md) objects and their properties.|
|[Create person](../api/person-create.md)|[person](../resources/person.md)|Create a new [person](../resources/person.md) object.|
|[Get person](../api/person-get.md)|[person](../resources/person.md)|Read the properties and relationships of a [person](../resources/person.md) object.|
|[Update person](../api/person-update.md)|[person](../resources/person.md)|Update the properties of a [person](../resources/person.md) object.|
|[Delete person](../api/person-delete.md)|None|Deletes a [person](../resources/person.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|birthday|String|**TODO: Add Description**|
|companyName|String|**TODO: Add Description**|
|department|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|emailAddresses|[rankedEmailAddress](../resources/rankedemailaddress.md) collection|**TODO: Add Description**|
|givenName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isFavorite|Boolean|**TODO: Add Description**|
|mailboxType|String|**TODO: Add Description**|
|officeLocation|String|**TODO: Add Description**|
|personNotes|String|**TODO: Add Description**|
|personType|String|**TODO: Add Description**|
|phones|[phone](../resources/phone.md) collection|**TODO: Add Description**|
|postalAddresses|[location](../resources/location.md) collection|**TODO: Add Description**|
|profession|String|**TODO: Add Description**|
|sources|[personDataSource](../resources/persondatasource.md) collection|**TODO: Add Description**|
|surname|String|**TODO: Add Description**|
|title|String|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|websites|[website](../resources/website.md) collection|**TODO: Add Description**|
|yomiCompany|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.person",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.person",
  "id": "String (identifier)",
  "birthday": "String",
  "companyName": "String",
  "department": "String",
  "displayName": "String",
  "emailAddresses": [
    {
      "@odata.type": "microsoft.graph.rankedEmailAddress"
    }
  ],
  "givenName": "String",
  "isFavorite": "Boolean",
  "mailboxType": "String",
  "officeLocation": "String",
  "personNotes": "String",
  "personType": "String",
  "phones": [
    {
      "@odata.type": "microsoft.graph.phone"
    }
  ],
  "postalAddresses": [
    {
      "@odata.type": "microsoft.graph.location"
    }
  ],
  "profession": "String",
  "sources": [
    {
      "@odata.type": "microsoft.graph.personDataSource"
    }
  ],
  "surname": "String",
  "title": "String",
  "userPrincipalName": "String",
  "websites": [
    {
      "@odata.type": "microsoft.graph.website"
    }
  ],
  "yomiCompany": "String"
}
```

