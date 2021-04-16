---
title: "groupPolicyPresentationDropdownList resource type"
description: "Represents an ADMX dropdownList element and an ADMX enum element."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationDropdownList resource type

Namespace: microsoft.graph



Represents an ADMX dropdownList element and an ADMX enum element.


Inherits from [groupPolicyPresentation](../resources/grouppolicypresentation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationDropdownLists](../api/grouppolicypresentationdropdownlist-list.md)|[groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md) collection|Get a list of the [groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md) objects and their properties.|
|[Create groupPolicyPresentationDropdownList](../api/grouppolicypresentationdropdownlist-create.md)|[groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md)|Create a new [groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md) object.|
|[Get groupPolicyPresentationDropdownList](../api/grouppolicypresentationdropdownlist-get.md)|[groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md)|Read the properties and relationships of a [groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md) object.|
|[Update groupPolicyPresentationDropdownList](../api/grouppolicypresentationdropdownlist-update.md)|[groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md)|Update the properties of a [groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md) object.|
|[Delete groupPolicyPresentationDropdownList](../api/grouppolicypresentationdropdownlist-delete.md)|None|Deletes a [groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md) object.|
|[List groupPolicyDefinition](../api/grouppolicypresentationdropdownlist-list-definition.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md) collection|Get the groupPolicyDefinition resources from the definition navigation property.|
|[Add groupPolicyDefinition](../api/grouppolicypresentationdropdownlist-post-definition.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md)|Add definition by posting to the definition collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|defaultItem|[groupPolicyPresentationDropdownListItem](../resources/grouppolicypresentationdropdownlistitem.md)|Localized string value identifying the default choice of the list of items.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|items|[groupPolicyPresentationDropdownListItem](../resources/grouppolicypresentationdropdownlistitem.md) collection|Represents a set of localized display names and their associated values.|
|label|String|Localized text label for any presentation entity. The default value is empty. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|required|Boolean|Requirement to enter a value in the parameter box. The default value is false.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|definition|[groupPolicyDefinition](../resources/grouppolicydefinition.md)|The group policy definition associated with the presentation. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|

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

