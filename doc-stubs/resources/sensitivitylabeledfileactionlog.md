---
title: "sensitivityLabeledFileActionLog resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sensitivityLabeledFileActionLog resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sensitivityLabeledFileActionLogs](../api/sensitivitylabeledfileactionlog-list.md)|[sensitivityLabeledFileActionLog](../resources/sensitivitylabeledfileactionlog.md) collection|Get a list of the [sensitivityLabeledFileActionLog](../resources/sensitivitylabeledfileactionlog.md) objects and their properties.|
|[Create sensitivityLabeledFileActionLog](../api/sensitivitylabeledfileactionlog-create.md)|[sensitivityLabeledFileActionLog](../resources/sensitivitylabeledfileactionlog.md)|Create a new [sensitivityLabeledFileActionLog](../resources/sensitivitylabeledfileactionlog.md) object.|
|[Get sensitivityLabeledFileActionLog](../api/sensitivitylabeledfileactionlog-get.md)|[sensitivityLabeledFileActionLog](../resources/sensitivitylabeledfileactionlog.md)|Read the properties and relationships of a [sensitivityLabeledFileActionLog](../resources/sensitivitylabeledfileactionlog.md) object.|
|[Update sensitivityLabeledFileActionLog](../api/sensitivitylabeledfileactionlog-update.md)|[sensitivityLabeledFileActionLog](../resources/sensitivitylabeledfileactionlog.md)|Update the properties of a [sensitivityLabeledFileActionLog](../resources/sensitivitylabeledfileactionlog.md) object.|
|[Delete sensitivityLabeledFileActionLog](../api/sensitivitylabeledfileactionlog-delete.md)|None|Deletes a [sensitivityLabeledFileActionLog](../resources/sensitivitylabeledfileactionlog.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|application|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|clientIP|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|deviceName|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|emailInfo|[emailInfo](../resources/emailinfo.md)|**TODO: Add Description** Inherited from [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md)|
|extendedProperties|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|internalTarget|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|irmContentId|Guid|**TODO: Add Description**|
|labelId|Guid|**TODO: Add Description**|
|logType|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|operation|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|operationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|organizationId|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|platform|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|previousTarget|String|**TODO: Add Description**|
|targetLocation|targetLocation|**TODO: Add Description** Inherited from [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md). Possible values are: `unknown`, `localMedia`, `removableMedia`, `fileshare`, `cloud`, `unknownFutureValue`.|
|userId|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sensitivityLabeledFileActionLog",
  "baseType": "microsoft.graph.sensitivityLabelLogBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sensitivityLabeledFileActionLog",
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
  },
  "labelId": "Guid",
  "previousTarget": "String",
  "irmContentId": "Guid"
}
```

