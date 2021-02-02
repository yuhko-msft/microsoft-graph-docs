---
title: "sensitivityLabelPolicyMatchLog resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sensitivityLabelPolicyMatchLog resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sensitivityLabelPolicyMatchLogs](../api/sensitivitylabelpolicymatchlog-list.md)|[sensitivityLabelPolicyMatchLog](../resources/sensitivitylabelpolicymatchlog.md) collection|Get a list of the [sensitivityLabelPolicyMatchLog](../resources/sensitivitylabelpolicymatchlog.md) objects and their properties.|
|[Create sensitivityLabelPolicyMatchLog](../api/sensitivitylabelpolicymatchlog-create.md)|[sensitivityLabelPolicyMatchLog](../resources/sensitivitylabelpolicymatchlog.md)|Create a new [sensitivityLabelPolicyMatchLog](../resources/sensitivitylabelpolicymatchlog.md) object.|
|[Get sensitivityLabelPolicyMatchLog](../api/sensitivitylabelpolicymatchlog-get.md)|[sensitivityLabelPolicyMatchLog](../resources/sensitivitylabelpolicymatchlog.md)|Read the properties and relationships of a [sensitivityLabelPolicyMatchLog](../resources/sensitivitylabelpolicymatchlog.md) object.|
|[Update sensitivityLabelPolicyMatchLog](../api/sensitivitylabelpolicymatchlog-update.md)|[sensitivityLabelPolicyMatchLog](../resources/sensitivitylabelpolicymatchlog.md)|Update the properties of a [sensitivityLabelPolicyMatchLog](../resources/sensitivitylabelpolicymatchlog.md) object.|
|[Delete sensitivityLabelPolicyMatchLog](../api/sensitivitylabelpolicymatchlog-delete.md)|None|Deletes a [sensitivityLabelPolicyMatchLog](../resources/sensitivitylabelpolicymatchlog.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|application|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|clientIP|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|currentLabelId|Guid|**TODO: Add Description**|
|deviceName|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|emailInfo|[emailInfo](../resources/emailinfo.md)|**TODO: Add Description** Inherited from [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md)|
|extendedProperties|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|internalTarget|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|labelId|Guid|**TODO: Add Description**|
|logType|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|operation|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|operationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|organizationId|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|platform|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|policyId|Guid|**TODO: Add Description**|
|targetLocation|targetLocation|**TODO: Add Description** Inherited from [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md). Possible values are: `unknown`, `localMedia`, `removableMedia`, `fileshare`, `cloud`, `unknownFutureValue`.|
|userId|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sensitivityLabelPolicyMatchLog",
  "baseType": "microsoft.graph.sensitivityLabelLogBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sensitivityLabelPolicyMatchLog",
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
  "policyId": "Guid",
  "labelId": "Guid",
  "currentLabelId": "Guid"
}
```

