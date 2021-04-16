---
title: "contactFolder resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# contactFolder resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List contactFolders](../api/contactfolder-list.md)|[contactFolder](../resources/contactfolder.md) collection|Get a list of the [contactFolder](../resources/contactfolder.md) objects and their properties.|
|[Create contactFolder](../api/contactfolder-create.md)|[contactFolder](../resources/contactfolder.md)|Create a new [contactFolder](../resources/contactfolder.md) object.|
|[Get contactFolder](../api/contactfolder-get.md)|[contactFolder](../resources/contactfolder.md)|Read the properties and relationships of a [contactFolder](../resources/contactfolder.md) object.|
|[Update contactFolder](../api/contactfolder-update.md)|[contactFolder](../resources/contactfolder.md)|Update the properties of a [contactFolder](../resources/contactfolder.md) object.|
|[Delete contactFolder](../api/contactfolder-delete.md)|None|Deletes a [contactFolder](../resources/contactfolder.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|parentFolderId|String|**TODO: Add Description**|
|wellKnownName|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|childFolders|[contactFolder](../resources/contactfolder.md) collection|**TODO: Add Description**|
|contacts|[contact](../resources/contact.md) collection|**TODO: Add Description**|
|multiValueExtendedProperties|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection|**TODO: Add Description**|
|singleValueExtendedProperties|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.contactFolder",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.contactFolder",
  "id": "String (identifier)",
  "displayName": "String",
  "parentFolderId": "String",
  "wellKnownName": "String"
}
```

