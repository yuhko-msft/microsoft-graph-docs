---
title: "messageRule resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# messageRule resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List messageRules](../api/mailfolder-list-messagerules.md)|[messageRule](../resources/messagerule.md) collection|Get the messageRules from the messageRules navigation property.|
|[Create messageRules](../api/mailfolder-post-messagerules.md)|[messageRule](../resources/messagerule.md)|Create a new messageRules object.|
|[Update messageRules](../api/mailfolder-update-messagerules.md)|[messageRule](../resources/messagerule.md)|Update the properties of a messageRules object.|
|[Get messageRules](../api/mailfolder-get-messagerule.md)|[messageRule](../resources/messagerule.md)|Read the properties and relationships of a [messageRule](../resources/messagerule.md) object.|
|[Delete messageRules](../api/mailfolder-delete-messagerules.md)|None|Delete a [messageRule](../resources/messagerule.md) object.|
|[List messageRules](../api/messagerule-list.md)|[messageRule](../resources/messagerule.md) collection|Get a list of the [messageRule](../resources/messagerule.md) objects and their properties.|
|[Create messageRule](../api/messagerule-create.md)|[messageRule](../resources/messagerule.md)|Create a new [messageRule](../resources/messagerule.md) object.|
|[Get messageRule](../api/messagerule-get.md)|[messageRule](../resources/messagerule.md)|Read the properties and relationships of a [messageRule](../resources/messagerule.md) object.|
|[Update messageRule](../api/messagerule-update.md)|[messageRule](../resources/messagerule.md)|Update the properties of a [messageRule](../resources/messagerule.md) object.|
|[Delete messageRule](../api/messagerule-delete.md)|None|Deletes a [messageRule](../resources/messagerule.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|actions|[messageRuleActions](../resources/messageruleactions.md)|**TODO: Add Description**|
|conditions|[messageRulePredicates](../resources/messagerulepredicates.md)|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|exceptions|[messageRulePredicates](../resources/messagerulepredicates.md)|**TODO: Add Description**|
|hasError|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isEnabled|Boolean|**TODO: Add Description**|
|isReadOnly|Boolean|**TODO: Add Description**|
|sequence|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.messageRule",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.messageRule",
  "id": "String (identifier)",
  "displayName": "String",
  "sequence": "Integer",
  "conditions": {
    "@odata.type": "microsoft.graph.messageRulePredicates"
  },
  "actions": {
    "@odata.type": "microsoft.graph.messageRuleActions"
  },
  "exceptions": {
    "@odata.type": "microsoft.graph.messageRulePredicates"
  },
  "isEnabled": "Boolean",
  "hasError": "Boolean",
  "isReadOnly": "Boolean"
}
```

