---
title: "deploymentStateReason resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deploymentStateReason resource type

Namespace: microsoft.graph.windowsUpdates

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A reason for a particular deployment state.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|Describes the reason in more detail. Read-only.|
|value|deploymentStateReasonValue|Specifies a reason for the deployment state. Read-only. Possible values are: `scheduledByOfferWindow`, `scheduledByLinkedDeployment`, `offeringByRequest`, `pausedByRequest`, `pausedByMonitoring`, `faultedBySettingsIncompatibility`, `faultedByContentUnavailable`, `faultedByContentOutdated`, `archivedByRequest`, `archivedByRevokedApproval`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.windowsUpdates.deploymentStateReason"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsUpdates.deploymentStateReason",
  "value": "String",
  "description": "String"
}
```

