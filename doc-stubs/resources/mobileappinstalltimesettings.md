---
title: "mobileAppInstallTimeSettings resource type"
description: "Contains properties used to determine when to offer an app to devices and when to install the app on devices."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileAppInstallTimeSettings resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Contains properties used to determine when to offer an app to devices and when to install the app on devices.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deadlineDateTime|DateTimeOffset|The time at which the app should be installed.|
|startDateTime|DateTimeOffset|The time at which the app should be available for installation.|
|useLocalTime|Boolean|Whether the local device time or UTC time should be used when determining the available and deadline times.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.mobileAppInstallTimeSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileAppInstallTimeSettings",
  "deadlineDateTime": "String (timestamp)",
  "startDateTime": "String (timestamp)",
  "useLocalTime": "Boolean"
}
```

