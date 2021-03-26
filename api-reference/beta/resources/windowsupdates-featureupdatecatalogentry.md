---
title: "featureUpdateCatalogEntry resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# featureUpdateCatalogEntry resource type

Namespace: microsoft.graph.windowsUpdates

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Metadata for a Windows 10 feature update that can be approved for deployment.


Inherits from [softwareUpdateCatalogEntry](../resources/windowsupdates-softwareupdatecatalogentry.md).


## Properties
|Property|Type|Description|
|:---|:---|:---|
|deployableUntilDateTime|DateTimeOffset|The date on which the content was or will no longer be available to deploy using the service. Read-only. Inherited from [catalogEntry](../resources/windowsupdates-catalogentry.md)|
|displayName|String|	The display name of the content. Read-only. Inherited from [catalogEntry](../resources/windowsupdates-catalogentry.md)|
|id|String|The unique identifier for the catalog entry. Read-only. Inherited from [catalogEntry](../resources/windowsupdates-catalogentry.md)|
|releaseDateTime|DateTimeOffset|The date on which the content was or will be released. Read-only. Inherited from [catalogEntry](../resources/windowsupdates-catalogentry.md)|
|version|String|The version of the feature update. Read-only.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsUpdates.featureUpdateCatalogEntry",
  "baseType": "microsoft.graph.windowsUpdates.softwareUpdateCatalogEntry",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsUpdates.featureUpdateCatalogEntry",
  "id": "String (identifier)",
  "displayName": "String",
  "releaseDateTime": "String (timestamp)",
  "deployableUntilDateTime": "String (timestamp)",
  "version": "String"
}
```

