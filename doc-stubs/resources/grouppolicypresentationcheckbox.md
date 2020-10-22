---
title: "groupPolicyPresentationCheckBox resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationCheckBox resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [groupPolicyPresentation](../resources/grouppolicypresentation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationCheckBoxes](../api/grouppolicypresentationcheckbox-list.md)|[groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md) collection|Get a list of the [groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md) objects and their properties.|
|[Create groupPolicyPresentationCheckBox](../api/grouppolicypresentationcheckbox-create.md)|[groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md)|Create a new [groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md) object.|
|[Get groupPolicyPresentationCheckBox](../api/grouppolicypresentationcheckbox-get.md)|[groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md)|Read the properties and relationships of a [groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md) object.|
|[Update groupPolicyPresentationCheckBox](../api/grouppolicypresentationcheckbox-update.md)|[groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md)|Update the properties of a [groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md) object.|
|[Delete groupPolicyPresentationCheckBox](../api/grouppolicypresentationcheckbox-delete.md)|None|Deletes a [groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md) object.|
|[List definition](../api/grouppolicypresentationcheckbox-list-definition.md)|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md) collection|Get the groupPolicyDefinition resources from the definition navigation property.|
|[Add definition](../api/grouppolicypresentationcheckbox-post-definition.md)|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md)|Add definition by posting to the definition collection.|
|[Remove definition](../api/grouppolicypresentationcheckbox-delete-definition.md)|None|Remove a [groupPolicyDefinition](../resources/intune-grouppolicydefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|defaultChecked|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|definition|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md)|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.groupPolicyPresentationCheckBox",
  "baseType": "microsoft.graph.groupPolicyPresentation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationCheckBox",
  "id": "String (identifier)",
  "label": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "defaultChecked": "Boolean"
}
```

