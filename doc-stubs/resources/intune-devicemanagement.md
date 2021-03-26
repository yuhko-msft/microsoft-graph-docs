---
title: "deviceManagement resource type"
description: "Singleton that acts as container for a collection of Resource Access entities."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagement resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Singleton that acts as container for a collection of Resource Access entities.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get deviceManagement](../api/intune-devicemanagement-get.md)|[deviceManagement](../resources/intune-devicemanagement.md)|Read the properties and relationships of a [deviceManagement](../resources/intune-devicemanagement.md) object.|
|[Update deviceManagement](../api/intune-devicemanagement-update.md)|[deviceManagement](../resources/intune-devicemanagement.md)|Update the properties of a [deviceManagement](../resources/intune-devicemanagement.md) object.|
|[List chromeOSOnboardingSettings](../api/intune-devicemanagement-list-chromeosonboardingsettings.md)|[chromeOSOnboardingSettings](../resources/intune-chromeosonboardingsettings.md) collection|Get the chromeOSOnboardingSettings resources from the chromeOSOnboardingSettings navigation property.|
|[Create chromeOSOnboardingSettings](../api/intune-devicemanagement-post-chromeosonboardingsettings.md)|[chromeOSOnboardingSettings](../resources/intune-chromeosonboardingsettings.md)|Create a new chromeOSOnboardingSettings object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|chromeOSOnboardingSettings|[chromeOSOnboardingSettings](../resources/intune-chromeosonboardingsettings.md) collection|Collection of ChromeOSOnboardingSettings settings associated with account.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagement",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagement"
}
```

