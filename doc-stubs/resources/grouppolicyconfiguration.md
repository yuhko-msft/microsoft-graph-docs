---
title: "groupPolicyConfiguration resource type"
description: "The group policy configuration entity contains the configured values for one or more group policy definitions."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyConfiguration resource type

Namespace: microsoft.graph



The group policy configuration entity contains the configured values for one or more group policy definitions.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyConfigurations](../api/grouppolicyconfiguration-list.md)|[groupPolicyConfiguration](../resources/grouppolicyconfiguration.md) collection|Get a list of the [groupPolicyConfiguration](../resources/grouppolicyconfiguration.md) objects and their properties.|
|[Create groupPolicyConfiguration](../api/grouppolicyconfiguration-create.md)|[groupPolicyConfiguration](../resources/grouppolicyconfiguration.md)|Create a new [groupPolicyConfiguration](../resources/grouppolicyconfiguration.md) object.|
|[Get groupPolicyConfiguration](../api/grouppolicyconfiguration-get.md)|[groupPolicyConfiguration](../resources/grouppolicyconfiguration.md)|Read the properties and relationships of a [groupPolicyConfiguration](../resources/grouppolicyconfiguration.md) object.|
|[Update groupPolicyConfiguration](../api/grouppolicyconfiguration-update.md)|[groupPolicyConfiguration](../resources/grouppolicyconfiguration.md)|Update the properties of a [groupPolicyConfiguration](../resources/grouppolicyconfiguration.md) object.|
|[Delete groupPolicyConfiguration](../api/grouppolicyconfiguration-delete.md)|None|Deletes a [groupPolicyConfiguration](../resources/grouppolicyconfiguration.md) object.|
|[assign](../api/grouppolicyconfiguration-assign.md)|[groupPolicyConfigurationAssignment](../resources/grouppolicyconfigurationassignment.md) collection|**TODO: Add Description**|
|[updateDefinitionValues](../api/grouppolicyconfiguration-updatedefinitionvalues.md)|None|**TODO: Add Description**|
|[List assignments](../api/grouppolicyconfiguration-list-assignments.md)|[groupPolicyConfigurationAssignment](../resources/grouppolicyconfigurationassignment.md) collection|Get the groupPolicyConfigurationAssignment resources from the assignments navigation property.|
|[Create groupPolicyConfigurationAssignment](../api/grouppolicyconfiguration-post-assignments.md)|[groupPolicyConfigurationAssignment](../resources/grouppolicyconfigurationassignment.md)|Create a new groupPolicyConfigurationAssignment object.|
|[List definitionValues](../api/grouppolicyconfiguration-list-definitionvalues.md)|[groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md) collection|Get the groupPolicyDefinitionValue resources from the definitionValues navigation property.|
|[Create groupPolicyDefinitionValue](../api/grouppolicyconfiguration-post-definitionvalues.md)|[groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md)|Create a new groupPolicyDefinitionValue object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|The date and time the object was created.|
|description|String|User provided description for the resource object.|
|displayName|String|User provided name for the resource object.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified.|
|roleScopeTagIds|String collection|The list of scope tags for the configuration.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[groupPolicyConfigurationAssignment](../resources/grouppolicyconfigurationassignment.md) collection|The list of group assignments for the configuration.|
|definitionValues|[groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md) collection|The list of enabled or disabled group policy definition values for the configuration.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.groupPolicyConfiguration",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyConfiguration",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ]
}
```

