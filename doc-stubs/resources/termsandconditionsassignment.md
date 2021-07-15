---
title: "termsAndConditionsAssignment resource type"
description: "A termsAndConditionsAssignment entity represents the assignment of a given Terms and Conditions (TandC) policy to a given group. Users in the group will be required to accept the terms in order to have devices enrolled into Intune."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# termsAndConditionsAssignment resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A termsAndConditionsAssignment entity represents the assignment of a given Terms and Conditions (TandC) policy to a given group. Users in the group will be required to accept the terms in order to have devices enrolled into Intune.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List termsAndConditionsAssignments](../api/termsandconditionsassignment-list.md)|[termsAndConditionsAssignment](../resources/termsandconditionsassignment.md) collection|Get a list of the [termsAndConditionsAssignment](../resources/termsandconditionsassignment.md) objects and their properties.|
|[Create termsAndConditionsAssignment](../api/termsandconditionsassignment-create.md)|[termsAndConditionsAssignment](../resources/termsandconditionsassignment.md)|Create a new [termsAndConditionsAssignment](../resources/termsandconditionsassignment.md) object.|
|[Get termsAndConditionsAssignment](../api/termsandconditionsassignment-get.md)|[termsAndConditionsAssignment](../resources/termsandconditionsassignment.md)|Read the properties and relationships of a [termsAndConditionsAssignment](../resources/termsandconditionsassignment.md) object.|
|[Update termsAndConditionsAssignment](../api/termsandconditionsassignment-update.md)|[termsAndConditionsAssignment](../resources/termsandconditionsassignment.md)|Update the properties of a [termsAndConditionsAssignment](../resources/termsandconditionsassignment.md) object.|
|[Delete termsAndConditionsAssignment](../api/termsandconditionsassignment-delete.md)|None|Deletes a [termsAndConditionsAssignment](../resources/termsandconditionsassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|Assignment target that the TandC policy is assigned to.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.termsAndConditionsAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.termsAndConditionsAssignment",
  "id": "String (identifier)",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

