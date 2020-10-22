---
title: "groupPolicyPresentationListBox resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationListBox resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [groupPolicyPresentation](../resources/grouppolicypresentation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationListBoxes](../api/grouppolicypresentationlistbox-list.md)|[groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md) collection|Get a list of the [groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md) objects and their properties.|
|[Create groupPolicyPresentationListBox](../api/grouppolicypresentationlistbox-create.md)|[groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md)|Create a new [groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md) object.|
|[Get groupPolicyPresentationListBox](../api/grouppolicypresentationlistbox-get.md)|[groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md)|Read the properties and relationships of a [groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md) object.|
|[Update groupPolicyPresentationListBox](../api/grouppolicypresentationlistbox-update.md)|[groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md)|Update the properties of a [groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md) object.|
|[Delete groupPolicyPresentationListBox](../api/grouppolicypresentationlistbox-delete.md)|None|Deletes a [groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md) object.|
|[List definition](../api/grouppolicypresentationlistbox-list-definition.md)|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md) collection|Get the groupPolicyDefinition resources from the definition navigation property.|
|[Add definition](../api/grouppolicypresentationlistbox-post-definition.md)|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md)|Add definition by posting to the definition collection.|
|[Remove definition](../api/grouppolicypresentationlistbox-delete-definition.md)|None|Remove a [groupPolicyDefinition](../resources/intune-grouppolicydefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|explicitValue|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|
|valuePrefix|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|definition|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md)|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.groupPolicyPresentationListBox",
  "baseType": "microsoft.graph.groupPolicyPresentation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationListBox",
  "id": "String (identifier)",
  "label": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "explicitValue": "Boolean",
  "valuePrefix": "String"
}
```

