---
title: "configManagerCollection resource type"
description: "A ConfigManager defined collection of devices or users."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# configManagerCollection resource type

Namespace: microsoft.graph



A ConfigManager defined collection of devices or users.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List configManagerCollections](../api/configmanagercollection-list.md)|[configManagerCollection](../resources/configmanagercollection.md) collection|Get a list of the [configManagerCollection](../resources/configmanagercollection.md) objects and their properties.|
|[Create configManagerCollection](../api/configmanagercollection-create.md)|[configManagerCollection](../resources/configmanagercollection.md)|Create a new [configManagerCollection](../resources/configmanagercollection.md) object.|
|[Get configManagerCollection](../api/configmanagercollection-get.md)|[configManagerCollection](../resources/configmanagercollection.md)|Read the properties and relationships of a [configManagerCollection](../resources/configmanagercollection.md) object.|
|[Update configManagerCollection](../api/configmanagercollection-update.md)|[configManagerCollection](../resources/configmanagercollection.md)|Update the properties of a [configManagerCollection](../resources/configmanagercollection.md) object.|
|[Delete configManagerCollection](../api/configmanagercollection-delete.md)|None|Deletes a [configManagerCollection](../resources/configmanagercollection.md) object.|
|[getPolicySummary](../api/configmanagercollection-getpolicysummary.md)|[configManagerPolicySummary](../resources/configmanagerpolicysummary.md)|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|collectionIdentifier|String|The collection identifier in SCCM.|
|createdDateTime|DateTimeOffset|The created date.|
|displayName|String|The DisplayName.|
|hierarchyIdentifier|String|The Hierarchy Identifier.|
|hierarchyName|String|The HierarchyName.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|The last modified date.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.configManagerCollection",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.configManagerCollection",
  "id": "String (identifier)",
  "collectionIdentifier": "String",
  "createdDateTime": "String (timestamp)",
  "displayName": "String",
  "hierarchyIdentifier": "String",
  "hierarchyName": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

