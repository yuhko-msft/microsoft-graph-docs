---
title: "deviceManagementTroubleshootingErrorResource resource type"
description: "Object representing a link to troubleshooting information, the link could be to the Azure Portal or a Microsoft doc."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementTroubleshootingErrorResource resource type

Namespace: microsoft.graph



Object representing a link to troubleshooting information, the link could be to the Azure Portal or a Microsoft doc.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|link|String|The link to the web resource. Can contain any of the following formatters: {{UPN}}, {{DeviceGUID}}, {{UserGUID}}|
|text|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementTroubleshootingErrorResource"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementTroubleshootingErrorResource",
  "link": "String",
  "text": "String"
}
```

