---
title: "groupPolicyPresentationListBox resource type"
description: "Represents an ADMX listBox element and an ADMX list element."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationListBox resource type

Namespace: microsoft.graph



Represents an ADMX listBox element and an ADMX list element.


Inherits from [groupPolicyPresentation](../resources/grouppolicypresentation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationListBoxes](../api/grouppolicypresentationlistbox-list.md)|[groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md) collection|Get a list of the [groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md) objects and their properties.|
|[Create groupPolicyPresentationListBox](../api/grouppolicypresentationlistbox-create.md)|[groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md)|Create a new [groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md) object.|
|[Get groupPolicyPresentationListBox](../api/grouppolicypresentationlistbox-get.md)|[groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md)|Read the properties and relationships of a [groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md) object.|
|[Update groupPolicyPresentationListBox](../api/grouppolicypresentationlistbox-update.md)|[groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md)|Update the properties of a [groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md) object.|
|[Delete groupPolicyPresentationListBox](../api/grouppolicypresentationlistbox-delete.md)|None|Deletes a [groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md) object.|
|[List groupPolicyDefinition](../api/grouppolicypresentationlistbox-list-definition.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md) collection|Get the groupPolicyDefinition resources from the definition navigation property.|
|[Add groupPolicyDefinition](../api/grouppolicypresentationlistbox-post-definition.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md)|Add definition by posting to the definition collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|explicitValue|Boolean|If this option is specified true the user must specify the registry subkey value and the registry subkey name. The list box shows two columns, one for the name and one for the data. The default value is false.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|Localized text label for any presentation entity. The default value is empty. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|valuePrefix|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|definition|[groupPolicyDefinition](../resources/grouppolicydefinition.md)|The group policy definition associated with the presentation. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|

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

