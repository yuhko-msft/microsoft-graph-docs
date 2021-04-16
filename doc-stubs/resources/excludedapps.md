---
title: "excludedApps resource type"
description: "Contains properties for Excluded Office365 Apps."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# excludedApps resource type

Namespace: microsoft.graph



Contains properties for Excluded Office365 Apps.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|access|Boolean|The value for if MS Office Access should be excluded or not.|
|bing|Boolean|The value for if Microsoft Search as default should be excluded or not.|
|excel|Boolean|The value for if MS Office Excel should be excluded or not.|
|groove|Boolean|The value for if MS Office OneDrive for Business - Groove should be excluded or not.|
|infoPath|Boolean|The value for if MS Office InfoPath should be excluded or not.|
|lync|Boolean|The value for if MS Office Skype for Business - Lync should be excluded or not.|
|oneDrive|Boolean|The value for if MS Office OneDrive should be excluded or not.|
|oneNote|Boolean|The value for if MS Office OneNote should be excluded or not.|
|outlook|Boolean|The value for if MS Office Outlook should be excluded or not.|
|powerPoint|Boolean|The value for if MS Office PowerPoint should be excluded or not.|
|publisher|Boolean|The value for if MS Office Publisher should be excluded or not.|
|sharePointDesigner|Boolean|The value for if MS Office SharePointDesigner should be excluded or not.|
|teams|Boolean|The value for if MS Office Teams should be excluded or not.|
|visio|Boolean|The value for if MS Office Visio should be excluded or not.|
|word|Boolean|The value for if MS Office Word should be excluded or not.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.excludedApps"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.excludedApps",
  "access": "Boolean",
  "bing": "Boolean",
  "excel": "Boolean",
  "groove": "Boolean",
  "infoPath": "Boolean",
  "lync": "Boolean",
  "oneDrive": "Boolean",
  "oneNote": "Boolean",
  "outlook": "Boolean",
  "powerPoint": "Boolean",
  "publisher": "Boolean",
  "sharePointDesigner": "Boolean",
  "teams": "Boolean",
  "visio": "Boolean",
  "word": "Boolean"
}
```

