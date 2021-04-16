---
title: "contact resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# contact resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [outlookItem](../resources/outlookitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List contacts](../api/contact-list.md)|[contact](../resources/contact.md) collection|Get a list of the [contact](../resources/contact.md) objects and their properties.|
|[Create contact](../api/contact-create.md)|[contact](../resources/contact.md)|Create a new [contact](../resources/contact.md) object.|
|[Get contact](../api/contact-get.md)|[contact](../resources/contact.md)|Read the properties and relationships of a [contact](../resources/contact.md) object.|
|[Update contact](../api/contact-update.md)|[contact](../resources/contact.md)|Update the properties of a [contact](../resources/contact.md) object.|
|[Delete contact](../api/contact-delete.md)|None|Deletes a [contact](../resources/contact.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|assistantName|String|**TODO: Add Description**|
|birthday|DateTimeOffset|**TODO: Add Description**|
|categories|String collection|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|changeKey|String|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|children|String collection|**TODO: Add Description**|
|companyName|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|department|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|emailAddresses|[typedEmailAddress](../resources/typedemailaddress.md) collection|**TODO: Add Description**|
|fileAs|String|**TODO: Add Description**|
|flag|[followupFlag](../resources/followupflag.md)|**TODO: Add Description**|
|gender|String|**TODO: Add Description**|
|generation|String|**TODO: Add Description**|
|givenName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|imAddresses|String collection|**TODO: Add Description**|
|initials|String|**TODO: Add Description**|
|isFavorite|Boolean|**TODO: Add Description**|
|jobTitle|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|manager|String|**TODO: Add Description**|
|middleName|String|**TODO: Add Description**|
|nickName|String|**TODO: Add Description**|
|officeLocation|String|**TODO: Add Description**|
|parentFolderId|String|**TODO: Add Description**|
|personalNotes|String|**TODO: Add Description**|
|phones|[phone](../resources/phone.md) collection|**TODO: Add Description**|
|postalAddresses|[physicalAddress](../resources/physicaladdress.md) collection|**TODO: Add Description**|
|profession|String|**TODO: Add Description**|
|spouseName|String|**TODO: Add Description**|
|surname|String|**TODO: Add Description**|
|title|String|**TODO: Add Description**|
|websites|[website](../resources/website.md) collection|**TODO: Add Description**|
|weddingAnniversary|Date|**TODO: Add Description**|
|yomiCompanyName|String|**TODO: Add Description**|
|yomiGivenName|String|**TODO: Add Description**|
|yomiSurname|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|extensions|[extension](../resources/extension.md) collection|**TODO: Add Description**|
|multiValueExtendedProperties|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection|**TODO: Add Description**|
|photo|[profilePhoto](../resources/profilephoto.md)|**TODO: Add Description**|
|singleValueExtendedProperties|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.contact",
  "baseType": "microsoft.graph.outlookItem",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.contact",
  "id": "String (identifier)",
  "categories": [
    "String"
  ],
  "changeKey": "String",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "assistantName": "String",
  "birthday": "String (timestamp)",
  "children": [
    "String"
  ],
  "companyName": "String",
  "department": "String",
  "displayName": "String",
  "emailAddresses": [
    {
      "@odata.type": "microsoft.graph.typedEmailAddress"
    }
  ],
  "fileAs": "String",
  "flag": {
    "@odata.type": "microsoft.graph.followupFlag"
  },
  "gender": "String",
  "generation": "String",
  "givenName": "String",
  "imAddresses": [
    "String"
  ],
  "initials": "String",
  "isFavorite": "Boolean",
  "jobTitle": "String",
  "manager": "String",
  "middleName": "String",
  "nickName": "String",
  "officeLocation": "String",
  "parentFolderId": "String",
  "personalNotes": "String",
  "phones": [
    {
      "@odata.type": "microsoft.graph.phone"
    }
  ],
  "postalAddresses": [
    {
      "@odata.type": "microsoft.graph.physicalAddress"
    }
  ],
  "profession": "String",
  "spouseName": "String",
  "surname": "String",
  "title": "String",
  "websites": [
    {
      "@odata.type": "microsoft.graph.website"
    }
  ],
  "weddingAnniversary": "Date",
  "yomiCompanyName": "String",
  "yomiGivenName": "String",
  "yomiSurname": "String"
}
```

