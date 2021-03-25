---
title: "chromeOSOnboardingSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# chromeOSOnboardingSettings resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List chromeOSOnboardingSettings](../api/chromeosonboardingsettings-list.md)|[chromeOSOnboardingSettings](../resources/chromeosonboardingsettings.md) collection|Get a list of the [chromeOSOnboardingSettings](../resources/chromeosonboardingsettings.md) objects and their properties.|
|[Create chromeOSOnboardingSettings](../api/chromeosonboardingsettings-create.md)|[chromeOSOnboardingSettings](../resources/chromeosonboardingsettings.md)|Create a new [chromeOSOnboardingSettings](../resources/chromeosonboardingsettings.md) object.|
|[Get chromeOSOnboardingSettings](../api/chromeosonboardingsettings-get.md)|[chromeOSOnboardingSettings](../resources/chromeosonboardingsettings.md)|Read the properties and relationships of a [chromeOSOnboardingSettings](../resources/chromeosonboardingsettings.md) object.|
|[Update chromeOSOnboardingSettings](../api/chromeosonboardingsettings-update.md)|[chromeOSOnboardingSettings](../resources/chromeosonboardingsettings.md)|Update the properties of a [chromeOSOnboardingSettings](../resources/chromeosonboardingsettings.md) object.|
|[Delete chromeOSOnboardingSettings](../api/chromeosonboardingsettings-delete.md)|None|Deletes a [chromeOSOnboardingSettings](../resources/chromeosonboardingsettings.md) object.|
|[connect](../api/chromeosonboardingsettings-connect.md)|chromeOSOnboardingStatus|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastDirectorySyncDateTime|DateTimeOffset|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|onboardingStatus|onboardingStatus|**TODO: Add Description**. Possible values are: `unknown`, `inprogress`, `onboarded`, `failed`.|
|ownerUserPrincipalName|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.chromeOSOnboardingSettings",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.chromeOSOnboardingSettings",
  "id": "String (identifier)",
  "ownerUserPrincipalName": "String",
  "onboardingStatus": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "lastDirectorySyncDateTime": "String (timestamp)"
}
```

