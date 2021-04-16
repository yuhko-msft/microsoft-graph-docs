---
title: "externalConnection resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# externalConnection resource type

Namespace: microsoft.graph.externalConnectors



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List externalConnections](../api/externalconnection-list.md)|[externalConnection](../resources/externalconnectors-externalconnection.md) collection|Get a list of the [externalConnection](../resources/externalconnection.md) objects and their properties.|
|[Create externalConnection](../api/externalconnectors-externalconnection-post-connections.md)|[externalConnection](../resources/externalconnectors-externalconnection.md)|Create a new [externalConnection](../resources/externalconnectors-externalconnection.md) object.|
|[Get externalConnection](../api/externalconnectors-externalconnection-get.md)|[externalConnection](../resources/externalconnectors-externalconnection.md)|Read the properties and relationships of an [externalConnection](../resources/externalconnectors-externalconnection.md) object.|
|[Update externalConnection](../api/externalconnectors-externalconnection-update.md)|[externalConnection](../resources/externalconnectors-externalconnection.md)|Update the properties of an [externalConnection](../resources/externalconnectors-externalconnection.md) object.|
|[Delete externalConnection](../api/externalconnectors-externalconnection-delete.md)|None|Deletes an [externalConnection](../resources/externalconnectors-externalconnection.md) object.|
|[List groups](../api/externalconnectors-externalconnection-list-groups.md)|[externalGroup](../resources/externalconnectors-externalgroup.md) collection|Get the externalGroup resources from the groups navigation property.|
|[Create externalGroup](../api/externalconnectors-externalconnection-post-groups.md)|[externalGroup](../resources/externalconnectors-externalgroup.md)|Create a new externalGroup object.|
|[List items](../api/externalconnectors-externalconnection-list-items.md)|[externalItem](../resources/externalconnectors-externalitem.md) collection|Get the externalItem resources from the items navigation property.|
|[Create externalItem](../api/externalconnectors-externalconnection-post-items.md)|[externalItem](../resources/externalconnectors-externalitem.md)|Create a new externalItem object.|
|[List operations](../api/externalconnectors-externalconnection-list-operations.md)|[connectionOperation](../resources/externalconnectors-connectionoperation.md) collection|Get the connectionOperation resources from the operations navigation property.|
|[Create connectionOperation](../api/externalconnectors-externalconnection-post-operations.md)|[connectionOperation](../resources/externalconnectors-connectionoperation.md)|Create a new connectionOperation object.|
|[List schema](../api/externalconnectors-externalconnection-list-schema.md)|[schema](../resources/externalconnectors-schema.md) collection|Get the schema resources from the schema navigation property.|
|[Create schema](../api/externalconnectors-externalconnection-post-schema.md)|[schema](../resources/externalconnectors-schema.md)|Create a new schema object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activitySettings|[activitySettings](../resources/externalconnectors-activitysettings.md)|**TODO: Add Description**|
|complianceSettings|[complianceSettings](../resources/externalconnectors-compliancesettings.md)|**TODO: Add Description**|
|configuration|[configuration](../resources/externalconnectors-configuration.md)|**TODO: Add Description**|
|connectorId|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/externalconnectors-entity.md)|
|name|String|**TODO: Add Description**|
|searchSettings|[searchSettings](../resources/externalconnectors-searchsettings.md)|**TODO: Add Description**|
|state|connectionState|**TODO: Add Description**. Possible values are: `draft`, `ready`, `obsolete`, `limitExceeded`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|activities|[externalActivity](../resources/externalconnectors-externalactivity.md) collection|**TODO: Add Description**|
|groups|[externalGroup](../resources/externalconnectors-externalgroup.md) collection|**TODO: Add Description**|
|items|[externalItem](../resources/externalconnectors-externalitem.md) collection|**TODO: Add Description**|
|operations|[connectionOperation](../resources/externalconnectors-connectionoperation.md) collection|**TODO: Add Description**|
|schema|[schema](../resources/externalconnectors-schema.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.externalConnectors.externalConnection",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.externalConnectors.externalConnection",
  "id": "String (identifier)",
  "activitySettings": {
    "@odata.type": "microsoft.graph.externalConnectors.activitySettings"
  },
  "complianceSettings": {
    "@odata.type": "microsoft.graph.externalConnectors.complianceSettings"
  },
  "configuration": {
    "@odata.type": "microsoft.graph.externalConnectors.configuration"
  },
  "connectorId": "String",
  "description": "String",
  "name": "String",
  "searchSettings": {
    "@odata.type": "microsoft.graph.externalConnectors.searchSettings"
  },
  "state": "String"
}
```

