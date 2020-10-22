---
title: "groupPolicyPresentationDropdownList resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationDropdownList resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [groupPolicyPresentation](../resources/grouppolicypresentation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationDropdownLists](../api/grouppolicypresentationdropdownlist-list.md)|[groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md) collection|Get a list of the [groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md) objects and their properties.|
|[Create groupPolicyPresentationDropdownList](../api/grouppolicypresentationdropdownlist-create.md)|[groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md)|Create a new [groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md) object.|
|[Get groupPolicyPresentationDropdownList](../api/grouppolicypresentationdropdownlist-get.md)|[groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md)|Read the properties and relationships of a [groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md) object.|
|[Update groupPolicyPresentationDropdownList](../api/grouppolicypresentationdropdownlist-update.md)|[groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md)|Update the properties of a [groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md) object.|
|[Delete groupPolicyPresentationDropdownList](../api/grouppolicypresentationdropdownlist-delete.md)|None|Deletes a [groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md) object.|
|[List definition](../api/grouppolicypresentationdropdownlist-list-definition.md)|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md) collection|Get the groupPolicyDefinition resources from the definition navigation property.|
|[Add definition](../api/grouppolicypresentationdropdownlist-post-definition.md)|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md)|Add definition by posting to the definition collection.|
|[Remove definition](../api/grouppolicypresentationdropdownlist-delete-definition.md)|None|Remove a [groupPolicyDefinition](../resources/intune-grouppolicydefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|defaultItem|[groupPolicyPresentationDropdownListItem](../resources/intune-grouppolicypresentationdropdownlistitem.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|items|[groupPolicyPresentationDropdownListItem](../resources/intune-grouppolicypresentationdropdownlistitem.md) collection|**TODO: Add Description**|
|label|String|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|
|required|Boolean|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|definition|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md)|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.groupPolicyPresentationDropdownList",
  "baseType": "microsoft.graph.groupPolicyPresentation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationDropdownList",
  "id": "String (identifier)",
  "label": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "defaultItem": {
    "@odata.type": "microsoft.graph.groupPolicyPresentationDropdownListItem"
  },
  "items": [
    {
      "@odata.type": "microsoft.graph.groupPolicyPresentationDropdownListItem"
    }
  ],
  "required": "Boolean"
}
```

