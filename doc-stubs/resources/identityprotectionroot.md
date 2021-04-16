---
title: "identityProtectionRoot resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# identityProtectionRoot resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get identityProtectionRoot](../api/identityprotectionroot-get.md)|[identityProtectionRoot](../resources/identityprotectionroot.md)|Read the properties and relationships of an [identityProtectionRoot](../resources/identityprotectionroot.md) object.|
|[Update identityProtectionRoot](../api/identityprotectionroot-update.md)|[identityProtectionRoot](../resources/identityprotectionroot.md)|Update the properties of an [identityProtectionRoot](../resources/identityprotectionroot.md) object.|
|[List riskDetections](../api/identityprotectionroot-list-riskdetections.md)|[riskDetection](../resources/riskdetection.md) collection|Get the riskDetection resources from the riskDetections navigation property.|
|[Create riskDetection](../api/identityprotectionroot-post-riskdetections.md)|[riskDetection](../resources/riskdetection.md)|Create a new riskDetection object.|
|[List riskyUsers](../api/identityprotectionroot-list-riskyusers.md)|[riskyUser](../resources/riskyuser.md) collection|Get the riskyUser resources from the riskyUsers navigation property.|
|[Create riskyUser](../api/identityprotectionroot-post-riskyusers.md)|[riskyUser](../resources/riskyuser.md)|Create a new riskyUser object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|riskDetections|[riskDetection](../resources/riskdetection.md) collection|**TODO: Add Description**|
|riskyUsers|[riskyUser](../resources/riskyuser.md) collection|**TODO: Add Description**|
|settings|[settingsRoot](../resources/settingsroot.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.identityProtectionRoot",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.identityProtectionRoot"
}
```

