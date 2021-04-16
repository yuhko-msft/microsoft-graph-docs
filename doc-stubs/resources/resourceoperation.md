---
title: "resourceOperation resource type"
description: "Describes the resourceOperation resource (entity) of the Microsoft Graph API (REST), which supports Intune workflows related to role-based access control (RBAC)."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# resourceOperation resource type

Namespace: microsoft.graph



Describes the resourceOperation resource (entity) of the Microsoft Graph API (REST), which supports Intune workflows related to role-based access control (RBAC).


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List resourceOperations](../api/resourceoperation-list.md)|[resourceOperation](../resources/resourceoperation.md) collection|Get a list of the [resourceOperation](../resources/resourceoperation.md) objects and their properties.|
|[Create resourceOperation](../api/resourceoperation-create.md)|[resourceOperation](../resources/resourceoperation.md)|Create a new [resourceOperation](../resources/resourceoperation.md) object.|
|[Get resourceOperation](../api/resourceoperation-get.md)|[resourceOperation](../resources/resourceoperation.md)|Read the properties and relationships of a [resourceOperation](../resources/resourceoperation.md) object.|
|[Update resourceOperation](../api/resourceoperation-update.md)|[resourceOperation](../resources/resourceoperation.md)|Update the properties of a [resourceOperation](../resources/resourceoperation.md) object.|
|[Delete resourceOperation](../api/resourceoperation-delete.md)|None|Deletes a [resourceOperation](../resources/resourceoperation.md) object.|
|[getScopesForUser](../api/resourceoperation-getscopesforuser.md)|String collection|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|actionName|String|Type of action this operation is going to perform. The actionName should be concise and limited to as few words as possible.|
|description|String|Description of the resource operation. The description is used in mouse-over text for the operation when shown in the Azure Portal.|
|enabledForScopeValidation|Boolean|Determines whether the Permission is validated for Scopes defined per Role Assignment.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|resource|String|Resource category to which this Operation belongs.|
|resourceName|String|Name of the Resource this operation is performed on.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.resourceOperation",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.resourceOperation",
  "id": "String (identifier)",
  "actionName": "String",
  "description": "String",
  "enabledForScopeValidation": "Boolean",
  "resource": "String",
  "resourceName": "String"
}
```

