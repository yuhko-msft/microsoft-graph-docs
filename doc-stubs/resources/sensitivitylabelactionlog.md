---
title: "sensitivityLabelActionLog resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sensitivityLabelActionLog resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sensitivityLabelActionLogs](../api/sensitivitylabelactionlog-list.md)|[sensitivityLabelActionLog](../resources/sensitivitylabelactionlog.md) collection|Get a list of the [sensitivityLabelActionLog](../resources/sensitivitylabelactionlog.md) objects and their properties.|
|[Create sensitivityLabelActionLog](../api/sensitivitylabelactionlog-create.md)|[sensitivityLabelActionLog](../resources/sensitivitylabelactionlog.md)|Create a new [sensitivityLabelActionLog](../resources/sensitivitylabelactionlog.md) object.|
|[Get sensitivityLabelActionLog](../api/sensitivitylabelactionlog-get.md)|[sensitivityLabelActionLog](../resources/sensitivitylabelactionlog.md)|Read the properties and relationships of a [sensitivityLabelActionLog](../resources/sensitivitylabelactionlog.md) object.|
|[Update sensitivityLabelActionLog](../api/sensitivitylabelactionlog-update.md)|[sensitivityLabelActionLog](../resources/sensitivitylabelactionlog.md)|Update the properties of a [sensitivityLabelActionLog](../resources/sensitivitylabelactionlog.md) object.|
|[Delete sensitivityLabelActionLog](../api/sensitivitylabelactionlog-delete.md)|None|Deletes a [sensitivityLabelActionLog](../resources/sensitivitylabelactionlog.md) object.|

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
|justification|String|**TODO: Add Description**|
|labelId|Guid|**TODO: Add Description**|
|logType|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|operation|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|operationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|organizationId|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|platform|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|policyId|Guid|**TODO: Add Description**|
|previousLabelId|Guid|**TODO: Add Description**|
|sensitivityChange|sensitivityChange|**TODO: Add Description**. Possible values are: `unchanged`, `upgraded`, `downgraded`, `unknownFutureValue`.|
|targetLocation|targetLocation|**TODO: Add Description** Inherited from [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md). Possible values are: `unknown`, `localMedia`, `removableMedia`, `fileshare`, `cloud`, `unknownFutureValue`.|
|trigger|sensitivityLabelActionTrigger|**TODO: Add Description**. Possible values are: `default`, `manual`, `recommended`, `automatic`, `unknownFutureValue`.|
|triggerDetail|sensitivityLabelActionTriggerDetail|**TODO: Add Description**. Possible values are: `none`, `automaticByPolicyMatch`, `automaticByReplyOrForward`, `automaticByHierarchy`, `unknownFutureValue`.|
|userId|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sensitivityLabelActionLog",
  "baseType": "microsoft.graph.sensitivityLabelLogBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sensitivityLabelActionLog",
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
  "trigger": "String",
  "triggerDetail": "String",
  "labelId": "Guid",
  "previousLabelId": "Guid",
  "justification": "String",
  "sensitivityChange": "String",
  "policyId": "Guid",
  "irmContentId": "Guid"
}
```

