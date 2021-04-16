---
title: "groupPolicyPresentationCheckBox resource type"
description: "Represents an ADMX checkBox element and an ADMX boolean element."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationCheckBox resource type

Namespace: microsoft.graph



Represents an ADMX checkBox element and an ADMX boolean element.


Inherits from [groupPolicyPresentation](../resources/grouppolicypresentation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationCheckBoxes](../api/grouppolicypresentationcheckbox-list.md)|[groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md) collection|Get a list of the [groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md) objects and their properties.|
|[Create groupPolicyPresentationCheckBox](../api/grouppolicypresentationcheckbox-create.md)|[groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md)|Create a new [groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md) object.|
|[Get groupPolicyPresentationCheckBox](../api/grouppolicypresentationcheckbox-get.md)|[groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md)|Read the properties and relationships of a [groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md) object.|
|[Update groupPolicyPresentationCheckBox](../api/grouppolicypresentationcheckbox-update.md)|[groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md)|Update the properties of a [groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md) object.|
|[Delete groupPolicyPresentationCheckBox](../api/grouppolicypresentationcheckbox-delete.md)|None|Deletes a [groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md) object.|
|[List groupPolicyDefinition](../api/grouppolicypresentationcheckbox-list-definition.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md) collection|Get the groupPolicyDefinition resources from the definition navigation property.|
|[Add groupPolicyDefinition](../api/grouppolicypresentationcheckbox-post-definition.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md)|Add definition by posting to the definition collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|defaultChecked|Boolean|Default value for the check box. The default value is false.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|Localized text label for any presentation entity. The default value is empty. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|definition|[groupPolicyDefinition](../resources/grouppolicydefinition.md)|The group policy definition associated with the presentation. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|

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

