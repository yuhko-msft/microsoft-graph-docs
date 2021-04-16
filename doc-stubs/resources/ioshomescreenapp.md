---
title: "iosHomeScreenApp resource type"
description: "Represents an icon for an app on the Home Screen"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosHomeScreenApp resource type

Namespace: microsoft.graph



Represents an icon for an app on the Home Screen


Inherits from [iosHomeScreenItem](../resources/ioshomescreenitem.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|bundleID|String|BundleID of the app if isWebClip is false or the URL of a web clip if isWebClip is true.|
|displayName|String|Name of the app Inherited from [iosHomeScreenItem](../resources/ioshomescreenitem.md)|
|isWebClip|Boolean|When true, the bundle ID will be handled as a URL for a web clip.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosHomeScreenApp"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosHomeScreenApp",
  "displayName": "String",
  "bundleID": "String",
  "isWebClip": "Boolean"
}
```

