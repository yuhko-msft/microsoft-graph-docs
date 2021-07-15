---
title: "deviceManagementConfigurationReferredSettingInformation resource type"
description: "Referred setting information about reusable setting"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationReferredSettingInformation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Referred setting information about reusable setting

## Properties
|Property|Type|Description|
|:---|:---|:---|
|settingDefinitionId|String|Setting definition id that is being referred to a setting. Applicable for reusable setting|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationReferredSettingInformation"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationReferredSettingInformation",
  "settingDefinitionId": "String"
}
```

