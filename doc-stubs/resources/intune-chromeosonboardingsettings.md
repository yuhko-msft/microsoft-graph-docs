---
title: "chromeOSOnboardingSettings resource type"
description: "Entity that represents a Chromebook tenant settings"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# chromeOSOnboardingSettings resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Entity that represents a Chromebook tenant settings

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List chromeOSOnboardingSettings](../api/intune-chromeosonboardingsettings-list.md)|[chromeOSOnboardingSettings](../resources/intune-chromeosonboardingsettings.md) collection|Get a list of the [chromeOSOnboardingSettings](../resources/chromeosonboardingsettings.md) objects and their properties.|
|[Create chromeOSOnboardingSettings](../api/intune-chromeosonboardingsettings-create.md)|[chromeOSOnboardingSettings](../resources/intune-chromeosonboardingsettings.md)|Create a new [chromeOSOnboardingSettings](../resources/intune-chromeosonboardingsettings.md) object.|
|[Get chromeOSOnboardingSettings](../api/intune-chromeosonboardingsettings-get.md)|[chromeOSOnboardingSettings](../resources/intune-chromeosonboardingsettings.md)|Read the properties and relationships of a [chromeOSOnboardingSettings](../resources/intune-chromeosonboardingsettings.md) object.|
|[Update chromeOSOnboardingSettings](../api/intune-chromeosonboardingsettings-update.md)|[chromeOSOnboardingSettings](../resources/intune-chromeosonboardingsettings.md)|Update the properties of a [chromeOSOnboardingSettings](../resources/intune-chromeosonboardingsettings.md) object.|
|[Delete chromeOSOnboardingSettings](../api/intune-chromeosonboardingsettings-delete.md)|None|Deletes a [chromeOSOnboardingSettings](../resources/intune-chromeosonboardingsettings.md) object.|
|[connect](../api/intune-chromeosonboardingsettings-connect.md)|chromeOSOnboardingStatus|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|The ChromebookTenant's Id|
|lastDirectorySyncDateTime|DateTimeOffset|The ChromebookTenant's LastDirectorySyncDateTime|
|lastModifiedDateTime|DateTimeOffset|The ChromebookTenant's LastModifiedDateTime|
|onboardingStatus|onboardingStatus|The ChromebookTenant's OnboardingStatus. Possible values are: `unknown`, `inprogress`, `onboarded`, `failed`.|
|ownerUserPrincipalName|String|The ChromebookTenant's OwnerUserPrincipalName|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.chromeOSOnboardingSettings",
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

