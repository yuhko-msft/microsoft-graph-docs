---
title: "macOSAssociatedDomainsItem resource type"
description: "A mapping of application identifiers to associated domains."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSAssociatedDomainsItem resource type

Namespace: microsoft.graph



A mapping of application identifiers to associated domains.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applicationIdentifier|String|The application identifier of the app to associate domains with.|
|directDownloadsEnabled|Boolean|Determines whether data should be downloaded directly or via a CDN.|
|domains|String collection|The list of domains to associate.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.macOSAssociatedDomainsItem"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSAssociatedDomainsItem",
  "applicationIdentifier": "String",
  "directDownloadsEnabled": "Boolean",
  "domains": [
    "String"
  ]
}
```

