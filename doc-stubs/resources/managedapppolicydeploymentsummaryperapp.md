---
title: "managedAppPolicyDeploymentSummaryPerApp resource type"
description: "Represents policy deployment summary per app."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedAppPolicyDeploymentSummaryPerApp resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents policy deployment summary per app.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|configurationAppliedUserCount|Int32|Number of users the policy is applied.|
|mobileAppIdentifier|[mobileAppIdentifier](../resources/mobileappidentifier.md)|Deployment of an app.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.managedAppPolicyDeploymentSummaryPerApp"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedAppPolicyDeploymentSummaryPerApp",
  "configurationAppliedUserCount": "Integer",
  "mobileAppIdentifier": {
    "@odata.type": "microsoft.graph.mobileAppIdentifier"
  }
}
```

