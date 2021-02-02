---
title: "auditLogBase resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# auditLogBase resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List auditLogBases](../api/auditlogbase-list.md)|[auditLogBase](../resources/auditlogbase.md) collection|Get a list of the [auditLogBase](../resources/auditlogbase.md) objects and their properties.|
|[Create auditLogBase](../api/auditlogbase-create.md)|[auditLogBase](../resources/auditlogbase.md)|Create a new [auditLogBase](../resources/auditlogbase.md) object.|
|[Get auditLogBase](../api/auditlogbase-get.md)|[auditLogBase](../resources/auditlogbase.md)|Read the properties and relationships of an [auditLogBase](../resources/auditlogbase.md) object.|
|[Update auditLogBase](../api/auditlogbase-update.md)|[auditLogBase](../resources/auditlogbase.md)|Update the properties of an [auditLogBase](../resources/auditlogbase.md) object.|
|[Delete auditLogBase](../api/auditlogbase-delete.md)|None|Deletes an [auditLogBase](../resources/auditlogbase.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|application|String|**TODO: Add Description**|
|clientIP|String|**TODO: Add Description**|
|deviceName|String|**TODO: Add Description**|
|extendedProperties|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|internalTarget|String|**TODO: Add Description**|
|logType|String|**TODO: Add Description**|
|operation|String|**TODO: Add Description**|
|operationDateTime|DateTimeOffset|**TODO: Add Description**|
|organizationId|String|**TODO: Add Description**|
|platform|String|**TODO: Add Description**|
|userId|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.auditLogBase",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.auditLogBase",
  "id": "String (identifier)",
  "userId": "String",
  "organizationId": "String",
  "operationDateTime": "String (timestamp)",
  "clientIP": "String",
  "application": "String",
  "platform": "String",
  "deviceName": "String",
  "logType": "String",
  "operation": "String",
  "internalTarget": "String",
  "extendedProperties": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ]
}
```

