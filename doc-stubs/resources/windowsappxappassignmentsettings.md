---
title: "windowsAppXAppAssignmentSettings resource type"
description: "Contains properties used when assigning a Windows AppX mobile app to a group."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsAppXAppAssignmentSettings resource type

Namespace: microsoft.graph



Contains properties used when assigning a Windows AppX mobile app to a group.


Inherits from [mobileAppAssignmentSettings](../resources/mobileappassignmentsettings.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|useDeviceContext|Boolean|Whether or not to use device execution context for Windows AppX mobile app.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.windowsAppXAppAssignmentSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsAppXAppAssignmentSettings",
  "useDeviceContext": "Boolean"
}
```

