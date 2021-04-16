---
title: "configurationManagerCollectionAssignmentTarget resource type"
description: "Represents an assignment to a Configuration Manager Collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# configurationManagerCollectionAssignmentTarget resource type

Namespace: microsoft.graph



Represents an assignment to a Configuration Manager Collection.


Inherits from [deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|collectionId|String|The collection Id that is the target of the assignment.|
|deviceAndAppManagementAssignmentFilterId|String|The Id of the filter for the target assignment. Inherited from [deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|
|deviceAndAppManagementAssignmentFilterType|deviceAndAppManagementAssignmentFilterType|The type of filter of the target assignment i.e. Exclude or Include. Inherited from [deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md). Possible values are: `none`, `include`, `exclude`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.configurationManagerCollectionAssignmentTarget"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.configurationManagerCollectionAssignmentTarget",
  "deviceAndAppManagementAssignmentFilterId": "String",
  "deviceAndAppManagementAssignmentFilterType": "String",
  "collectionId": "String"
}
```

