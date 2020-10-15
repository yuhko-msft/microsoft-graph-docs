---
title: "WorkspaceResponseModel resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# WorkspaceResponseModel resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List WorkspaceResponseModels](../api/workspaceresponsemodel-list.md)|[WorkspaceResponseModel](../resources/workspaceresponsemodel.md) collection|Get a list of the [WorkspaceResponseModel](../resources/workspaceresponsemodel.md) objects and their properties.|
|[Create WorkspaceResponseModel](../api/workspaceresponsemodel-post-workspaces.md)|[WorkspaceResponseModel](../resources/workspaceresponsemodel.md)|Create a new [WorkspaceResponseModel](../resources/workspaceresponsemodel.md) object.|
|[Get WorkspaceResponseModel](../api/workspaceresponsemodel-get.md)|[WorkspaceResponseModel](../resources/workspaceresponsemodel.md)|Read the properties and relationships of a [WorkspaceResponseModel](../resources/workspaceresponsemodel.md) object.|
|[Update WorkspaceResponseModel](../api/workspaceresponsemodel-update.md)|[WorkspaceResponseModel](../resources/workspaceresponsemodel.md)|Update the properties of a [WorkspaceResponseModel](../resources/workspaceresponsemodel.md) object.|
|[Delete WorkspaceResponseModel](../api/workspaceresponsemodel-delete.md)|None|Deletes a [WorkspaceResponseModel](../resources/workspaceresponsemodel.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceName|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|image|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|servicePlanId|String|**TODO: Add Description**|
|servicePlanName|String|**TODO: Add Description**|
|status|String|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.WorkspaceResponseModel",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.WorkspaceResponseModel",
  "id": "String (identifier)",
  "image": "String",
  "servicePlanName": "String",
  "deviceName": "String",
  "servicePlanId": "String",
  "displayName": "String",
  "status": "String",
  "userPrincipalName": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

