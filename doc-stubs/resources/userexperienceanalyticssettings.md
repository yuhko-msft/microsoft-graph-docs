---
title: "userExperienceAnalyticsSettings resource type"
description: "The user experience analytics insight is the recomendation to improve the user experience analytics score."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsSettings resource type

Namespace: microsoft.graph



The user experience analytics insight is the recomendation to improve the user experience analytics score.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|configurationManagerDataConnectorConfigured|Boolean|True if Tenant attach is configured. If configured then SCCM tenant attached devices will show up in UXA reporting.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsSettings",
  "configurationManagerDataConnectorConfigured": "Boolean"
}
```

