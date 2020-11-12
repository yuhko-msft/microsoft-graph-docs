---
title: "invokeUserFlowAction resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# invokeUserFlowAction resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [authenticationAction](../resources/authenticationaction.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List invokeUserFlowActions](../api/invokeuserflowaction-list.md)|[invokeUserFlowAction](../resources/invokeuserflowaction.md) collection|Get a list of the [invokeUserFlowAction](../resources/invokeuserflowaction.md) objects and their properties.|
|[Create invokeUserFlowAction](../api/invokeuserflowaction-create.md)|[invokeUserFlowAction](../resources/invokeuserflowaction.md)|Create a new [invokeUserFlowAction](../resources/invokeuserflowaction.md) object.|
|[Get invokeUserFlowAction](../api/invokeuserflowaction-get.md)|[invokeUserFlowAction](../resources/invokeuserflowaction.md)|Read the properties and relationships of an [invokeUserFlowAction](../resources/invokeuserflowaction.md) object.|
|[Update invokeUserFlowAction](../api/invokeuserflowaction-update.md)|[invokeUserFlowAction](../resources/invokeuserflowaction.md)|Update the properties of an [invokeUserFlowAction](../resources/invokeuserflowaction.md) object.|
|[Delete invokeUserFlowAction](../api/invokeuserflowaction-delete.md)|None|Deletes an [invokeUserFlowAction](../resources/invokeuserflowaction.md) object.|
|[List userFlow](../api/invokeuserflowaction-list-userflow.md)|[b2xIdentityUserFlow](../resources/b2xidentityuserflow.md) collection|Get the b2xIdentityUserFlow resources from the userFlow navigation property.|
|[Add userFlow](../api/invokeuserflowaction-post-userflow.md)|[b2xIdentityUserFlow](../resources/b2xidentityuserflow.md)|Add userFlow by posting to the userFlow collection.|
|[Remove userFlow](../api/invokeuserflowaction-delete-userflow.md)|None|Remove a [b2xIdentityUserFlow](../resources/b2xidentityuserflow.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [authenticationAction](../resources/authenticationaction.md)|
|priority|Int32|**TODO: Add Description** Inherited from [authenticationAction](../resources/authenticationaction.md)|
|sourceFilter|[authenticationSourceFilter](../resources/authenticationsourcefilter.md)|**TODO: Add Description** Inherited from [authenticationAction](../resources/authenticationaction.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|userFlow|[b2xIdentityUserFlow](../resources/b2xidentityuserflow.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.invokeUserFlowAction",
  "baseType": "Microsoft.Cpim.Api.DataModels.authenticationAction",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.invokeUserFlowAction",
  "id": "String (identifier)",
  "priority": "Integer",
  "sourceFilter": {
    "@odata.type": "microsoft.graph.authenticationSourceFilter"
  }
}
```

