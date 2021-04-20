---
title: "softwareUpdateCatalogEntry resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# softwareUpdateCatalogEntry resource type

Namespace: microsoft.graph.windowsUpdates

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**
This is an abstract type.


Inherits from [catalogEntry](../resources/windowsupdates-catalogentry.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List softwareUpdateCatalogEntries](../api/windowsupdates-softwareupdatecatalogentry-list.md)|[microsoft.graph.windowsUpdates.softwareUpdateCatalogEntry](../resources/windowsupdates-softwareupdatecatalogentry.md) collection|Get a list of the [softwareUpdateCatalogEntry](../resources/windowsupdates-softwareupdatecatalogentry.md) objects and their properties.|
|[Create softwareUpdateCatalogEntry](../api/windowsupdates-softwareupdatecatalogentry-create.md)|[microsoft.graph.windowsUpdates.softwareUpdateCatalogEntry](../resources/windowsupdates-softwareupdatecatalogentry.md)|Create a new [softwareUpdateCatalogEntry](../resources/windowsupdates-softwareupdatecatalogentry.md) object.|
|[Get softwareUpdateCatalogEntry](../api/windowsupdates-softwareupdatecatalogentry-get.md)|[microsoft.graph.windowsUpdates.softwareUpdateCatalogEntry](../resources/windowsupdates-softwareupdatecatalogentry.md)|Read the properties and relationships of a [softwareUpdateCatalogEntry](../resources/windowsupdates-softwareupdatecatalogentry.md) object.|
|[Update softwareUpdateCatalogEntry](../api/windowsupdates-softwareupdatecatalogentry-update.md)|[microsoft.graph.windowsUpdates.softwareUpdateCatalogEntry](../resources/windowsupdates-softwareupdatecatalogentry.md)|Update the properties of a [softwareUpdateCatalogEntry](../resources/windowsupdates-softwareupdatecatalogentry.md) object.|
|[Delete softwareUpdateCatalogEntry](../api/windowsupdates-softwareupdatecatalogentry-delete.md)|None|Deletes a [softwareUpdateCatalogEntry](../resources/windowsupdates-softwareupdatecatalogentry.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deployableUntilDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [catalogEntry](../resources/windowsupdates-catalogentry.md).|
|displayName|String|**TODO: Add Description** Inherited from [catalogEntry](../resources/windowsupdates-catalogentry.md).|
|id|String|**TODO: Add Description** Inherited from [catalogEntry](../resources/windowsupdates-catalogentry.md).|
|releaseDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [catalogEntry](../resources/windowsupdates-catalogentry.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsUpdates.softwareUpdateCatalogEntry",
  "baseType": "microsoft.graph.windowsUpdates.catalogEntry",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsUpdates.softwareUpdateCatalogEntry",
  "id": "String (identifier)",
  "displayName": "String",
  "deployableUntilDateTime": "String (timestamp)",
  "releaseDateTime": "String (timestamp)"
}
```

