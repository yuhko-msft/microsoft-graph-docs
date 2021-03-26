---
title: "qualityUpdateCatalogEntry resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# qualityUpdateCatalogEntry resource type

Namespace: microsoft.graph.windowsUpdates

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Metadata for a Windows quality update that can be approved for deployment.


Inherits from [softwareUpdateCatalogEntry](../resources/windowsupdates-softwareupdatecatalogentry.md).

<!-- ## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List qualityUpdateCatalogEntries](../api/qualityupdatecatalogentry-list.md)|[qualityUpdateCatalogEntry](../resources/windowsupdates-qualityupdatecatalogentry.md) collection|Get a list of the [qualityUpdateCatalogEntry](../resources/qualityupdatecatalogentry.md) objects and their properties.| -->

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deployableUntilDateTime|DateTimeOffset|The date on which the content was or will no longer be available to deploy using the service. Read-only. Inherited from [catalogEntry](../resources/windowsupdates-catalogentry.md)|
|display|String|The display name of the content. Read-only.|
|displayName|String|The display name of the content. Read-only. Inherited from [catalogEntry](../resources/windowsupdates-catalogentry.md)|
|id|String|The unique identifier for the catalog entry. Read-only. Inherited from [catalogEntry](../resources/windowsupdates-catalogentry.md)|
|isExpeditable|Boolean|Indicates whether the content can be deployed as an expedited quality update. Read-only.|
|qualityUpdateClassification|qualityUpdateClassification|The classification on the quality update. Read-only. Possible values are: `all`, `security`, `nonSecurity`.|
|rank|Int32|The rank of the content.|
|releaseDateTime|DateTimeOffset|The date on which the content was or will be released. Read-only. Inherited from [catalogEntry](../resources/windowsupdates-catalogentry.md)|

<!-- ## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|fixedIssues|[fixedIssueCatalogEntry](../resources/windowsupdates-fixedissuecatalogentry.md) collection|**TODO: Add Description**|
|patchedVulnerabilities|[patchedVulnerabilityCatalogEntry](../resources/windowsupdates-patchedvulnerabilitycatalogentry.md) collection|**TODO: Add Description**| -->

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsUpdates.qualityUpdateCatalogEntry",
  "baseType": "microsoft.graph.windowsUpdates.softwareUpdateCatalogEntry",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsUpdates.qualityUpdateCatalogEntry",
  "id": "String (identifier)",
  "displayName": "String",
  "releaseDateTime": "String (timestamp)",
  "deployableUntilDateTime": "String (timestamp)",
  "isExpeditable": "Boolean",
  "rank": "Integer",
  "display": "String",
  "qualityUpdateClassification": "String"
}
```

