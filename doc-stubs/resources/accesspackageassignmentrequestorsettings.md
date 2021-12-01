---
title: "accessPackageAssignmentRequestorSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# accessPackageAssignmentRequestorSettings resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowCustomAssignmentSchedule|Boolean|**TODO: Add Description**|
|enableOnBehalfRequestorsToAddAccess|Boolean|**TODO: Add Description**|
|enableOnBehalfRequestorsToRemoveAccess|Boolean|**TODO: Add Description**|
|enableOnBehalfRequestorsToUpdateAccess|Boolean|**TODO: Add Description**|
|enableTargetsToSelfAddAccess|Boolean|**TODO: Add Description**|
|enableTargetsToSelfRemoveAccess|Boolean|**TODO: Add Description**|
|enableTargetsToSelfUpdateAccess|Boolean|**TODO: Add Description**|
|onBehalfRequestors|[subjectSet](../resources/subjectset.md) collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.accessPackageAssignmentRequestorSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.accessPackageAssignmentRequestorSettings",
  "enableTargetsToSelfAddAccess": "Boolean",
  "enableTargetsToSelfUpdateAccess": "Boolean",
  "enableTargetsToSelfRemoveAccess": "Boolean",
  "allowCustomAssignmentSchedule": "Boolean",
  "enableOnBehalfRequestorsToAddAccess": "Boolean",
  "enableOnBehalfRequestorsToUpdateAccess": "Boolean",
  "enableOnBehalfRequestorsToRemoveAccess": "Boolean",
  "onBehalfRequestors": [
    {
      "@odata.type": "microsoft.graph.singleUser"
    }
  ]
}
```

