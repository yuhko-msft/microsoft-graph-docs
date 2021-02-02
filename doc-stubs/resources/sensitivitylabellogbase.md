---
title: "sensitivityLabelLogBase resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sensitivityLabelLogBase resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [auditLogBase](../resources/auditlogbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sensitivityLabelLogBases](../api/sensitivitylabellogbase-list.md)|[sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md) collection|Get a list of the [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md) objects and their properties.|
|[Create sensitivityLabelLogBase](../api/sensitivitylabellogbase-create.md)|[sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md)|Create a new [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md) object.|
|[Get sensitivityLabelLogBase](../api/sensitivitylabellogbase-get.md)|[sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md)|Read the properties and relationships of a [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md) object.|
|[Update sensitivityLabelLogBase](../api/sensitivitylabellogbase-update.md)|[sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md)|Update the properties of a [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md) object.|
|[Delete sensitivityLabelLogBase](../api/sensitivitylabellogbase-delete.md)|None|Deletes a [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|application|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|clientIP|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|deviceName|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|emailInfo|[emailInfo](../resources/emailinfo.md)|**TODO: Add Description**|
|extendedProperties|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|internalTarget|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|logType|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|operation|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|operationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|organizationId|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|platform|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|targetLocation|targetLocation|**TODO: Add Description**. Possible values are: `unknown`, `localMedia`, `removableMedia`, `fileshare`, `cloud`, `unknownFutureValue`.|
|userId|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sensitivityLabelLogBase",
  "baseType": "microsoft.graph.auditLogBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sensitivityLabelLogBase",
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
  ],
  "targetLocation": "String",
  "emailInfo": {
    "@odata.type": "microsoft.graph.emailInfo"
  }
}
```

