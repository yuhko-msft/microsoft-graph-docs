---
title: "policySet resource type"
description: "A class containing the properties used for PolicySet."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# policySet resource type

Namespace: microsoft.graph



A class containing the properties used for PolicySet.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List policySets](../api/policyset-list.md)|[policySet](../resources/policyset.md) collection|Get a list of the [policySet](../resources/policyset.md) objects and their properties.|
|[Create policySet](../api/policyset-create.md)|[policySet](../resources/policyset.md)|Create a new [policySet](../resources/policyset.md) object.|
|[Get policySet](../api/policyset-get.md)|[policySet](../resources/policyset.md)|Read the properties and relationships of a [policySet](../resources/policyset.md) object.|
|[Update policySet](../api/policyset-update.md)|[policySet](../resources/policyset.md)|Update the properties of a [policySet](../resources/policyset.md) object.|
|[Delete policySet](../api/policyset-delete.md)|None|Deletes a [policySet](../resources/policyset.md) object.|
|[getPolicySets](../api/policyset-getpolicysets.md)|[policySet](../resources/policyset.md) collection|**TODO: Add Description**|
|[update](../api/policyset-update.md)|None|**TODO: Add Description**|
|[List assignments](../api/policyset-list-assignments.md)|[policySetAssignment](../resources/policysetassignment.md) collection|Get the policySetAssignment resources from the assignments navigation property.|
|[Create policySetAssignment](../api/policyset-post-assignments.md)|[policySetAssignment](../resources/policysetassignment.md)|Create a new policySetAssignment object.|
|[List items](../api/policyset-list-items.md)|[policySetItem](../resources/policysetitem.md) collection|Get the policySetItem resources from the items navigation property.|
|[Create policySetItem](../api/policyset-post-items.md)|[policySetItem](../resources/policysetitem.md)|Create a new policySetItem object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|Creation time of the PolicySet.|
|description|String|Description of the PolicySet.|
|displayName|String|DisplayName of the PolicySet.|
|errorCode|errorCode|Error code if any occured. Possible values are: `noError`, `unauthorized`, `notFound`, `deleted`.|
|guidedDeploymentTags|String collection|Tags of the guided deployment|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|Last modified time of the PolicySet.|
|roleScopeTags|String collection|RoleScopeTags of the PolicySet|
|status|policySetStatus|Validation/assignment status of the PolicySet. Possible values are: `unknown`, `validating`, `partialSuccess`, `success`, `error`, `notAssigned`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[policySetAssignment](../resources/policysetassignment.md) collection|Assignments of the PolicySet.|
|items|[policySetItem](../resources/policysetitem.md) collection|Items of the PolicySet with maximum count 100.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.policySet",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.policySet",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "errorCode": "String",
  "guidedDeploymentTags": [
    "String"
  ],
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTags": [
    "String"
  ],
  "status": "String"
}
```

