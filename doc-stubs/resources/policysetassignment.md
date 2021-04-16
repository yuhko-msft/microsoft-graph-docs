---
title: "policySetAssignment resource type"
description: "A class containing the properties used for PolicySet Assignment."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# policySetAssignment resource type

Namespace: microsoft.graph



A class containing the properties used for PolicySet Assignment.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List policySetAssignments](../api/policysetassignment-list.md)|[policySetAssignment](../resources/policysetassignment.md) collection|Get a list of the [policySetAssignment](../resources/policysetassignment.md) objects and their properties.|
|[Create policySetAssignment](../api/policysetassignment-create.md)|[policySetAssignment](../resources/policysetassignment.md)|Create a new [policySetAssignment](../resources/policysetassignment.md) object.|
|[Get policySetAssignment](../api/policysetassignment-get.md)|[policySetAssignment](../resources/policysetassignment.md)|Read the properties and relationships of a [policySetAssignment](../resources/policysetassignment.md) object.|
|[Update policySetAssignment](../api/policysetassignment-update.md)|[policySetAssignment](../resources/policysetassignment.md)|Update the properties of a [policySetAssignment](../resources/policysetassignment.md) object.|
|[Delete policySetAssignment](../api/policysetassignment-delete.md)|None|Deletes a [policySetAssignment](../resources/policysetassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|Last modified time of the PolicySetAssignment.|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The target group of PolicySetAssignment|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.policySetAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.policySetAssignment",
  "id": "String (identifier)",
  "lastModifiedDateTime": "String (timestamp)",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

