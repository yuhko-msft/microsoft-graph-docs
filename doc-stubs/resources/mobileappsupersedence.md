---
title: "mobileAppSupersedence resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileAppSupersedence resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [mobileAppRelationship](../resources/mobileapprelationship.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mobileAppSupersedences](../api/mobileappsupersedence-list.md)|[mobileAppSupersedence](../resources/mobileappsupersedence.md) collection|Get a list of the [mobileAppSupersedence](../resources/mobileappsupersedence.md) objects and their properties.|
|[Create mobileAppSupersedence](../api/mobileappsupersedence-create.md)|[mobileAppSupersedence](../resources/mobileappsupersedence.md)|Create a new [mobileAppSupersedence](../resources/mobileappsupersedence.md) object.|
|[Get mobileAppSupersedence](../api/mobileappsupersedence-get.md)|[mobileAppSupersedence](../resources/mobileappsupersedence.md)|Read the properties and relationships of a [mobileAppSupersedence](../resources/mobileappsupersedence.md) object.|
|[Update mobileAppSupersedence](../api/mobileappsupersedence-update.md)|[mobileAppSupersedence](../resources/mobileappsupersedence.md)|Update the properties of a [mobileAppSupersedence](../resources/mobileappsupersedence.md) object.|
|[Delete mobileAppSupersedence](../api/mobileappsupersedence-delete.md)|None|Deletes a [mobileAppSupersedence](../resources/mobileappsupersedence.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|supersededAppCount|Int32|**TODO: Add Description**|
|supersedenceType|mobileAppSupersedenceType|**TODO: Add Description**. Possible values are: `update`, `replace`.|
|supersedingAppCount|Int32|**TODO: Add Description**|
|targetDisplayName|String|**TODO: Add Description** Inherited from [mobileAppRelationship](../resources/intune-mobileapprelationship.md)|
|targetId|String|**TODO: Add Description** Inherited from [mobileAppRelationship](../resources/intune-mobileapprelationship.md)|
|targetType|mobileAppRelationshipType|**TODO: Add Description** Inherited from [mobileAppRelationship](../resources/intune-mobileapprelationship.md). Possible values are: `child`, `parent`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mobileAppSupersedence",
  "baseType": "microsoft.graph.mobileAppRelationship",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileAppSupersedence",
  "id": "String (identifier)",
  "targetId": "String",
  "targetDisplayName": "String",
  "targetType": "String",
  "supersedenceType": "String",
  "supersededAppCount": "Integer",
  "supersedingAppCount": "Integer"
}
```

