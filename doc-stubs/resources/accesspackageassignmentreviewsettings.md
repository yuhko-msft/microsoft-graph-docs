---
title: "accessPackageAssignmentReviewSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# accessPackageAssignmentReviewSettings resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|expirationBehavior|accessReviewExpirationBehavior|**TODO: Add Description**. The possible values are: `keepAccess`, `removeAccess`, `acceptAccessRecommendation`, `unknownFutureValue`.|
|fallbackReviewers|[subjectSet](../resources/subjectset.md) collection|**TODO: Add Description**|
|isEnabled|Boolean|**TODO: Add Description**|
|isRecommendationEnabled|Boolean|**TODO: Add Description**|
|isReviewerJustificationRequired|Boolean|**TODO: Add Description**|
|isSelfReview|Boolean|**TODO: Add Description**|
|primaryReviewers|[subjectSet](../resources/subjectset.md) collection|**TODO: Add Description**|
|schedule|[entitlementManagementSchedule](../resources/entitlementmanagementschedule.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.accessPackageAssignmentReviewSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.accessPackageAssignmentReviewSettings",
  "isEnabled": "Boolean",
  "schedule": {
    "@odata.type": "microsoft.graph.entitlementManagementSchedule"
  },
  "isSelfReview": "Boolean",
  "primaryReviewers": [
    {
      "@odata.type": "microsoft.graph.singleUser"
    }
  ],
  "fallbackReviewers": [
    {
      "@odata.type": "microsoft.graph.singleUser"
    }
  ],
  "expirationBehavior": "String",
  "isRecommendationEnabled": "Boolean",
  "isReviewerJustificationRequired": "Boolean"
}
```

