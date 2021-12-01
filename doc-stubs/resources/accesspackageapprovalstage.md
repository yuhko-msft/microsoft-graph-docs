---
title: "accessPackageApprovalStage resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# accessPackageApprovalStage resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|durationBeforeAutomaticDenial|Duration|**TODO: Add Description**|
|durationBeforeEscalation|Duration|**TODO: Add Description**|
|escalationApprovers|[subjectSet](../resources/subjectset.md) collection|**TODO: Add Description**|
|fallbackEscalationApprovers|[subjectSet](../resources/subjectset.md) collection|**TODO: Add Description**|
|fallbackPrimaryApprovers|[subjectSet](../resources/subjectset.md) collection|**TODO: Add Description**|
|isApproverJustificationRequired|Boolean|**TODO: Add Description**|
|isEscalationEnabled|Boolean|**TODO: Add Description**|
|primaryApprovers|[subjectSet](../resources/subjectset.md) collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.accessPackageApprovalStage"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.accessPackageApprovalStage",
  "durationBeforeAutomaticDenial": "String (duration)",
  "isApproverJustificationRequired": "Boolean",
  "isEscalationEnabled": "Boolean",
  "durationBeforeEscalation": "String (duration)",
  "primaryApprovers": [
    {
      "@odata.type": "microsoft.graph.singleUser"
    }
  ],
  "fallbackPrimaryApprovers": [
    {
      "@odata.type": "microsoft.graph.singleUser"
    }
  ],
  "escalationApprovers": [
    {
      "@odata.type": "microsoft.graph.singleUser"
    }
  ],
  "fallbackEscalationApprovers": [
    {
      "@odata.type": "microsoft.graph.singleUser"
    }
  ]
}
```

