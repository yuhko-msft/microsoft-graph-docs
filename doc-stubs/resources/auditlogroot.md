---
title: "auditLogRoot resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# auditLogRoot resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get auditLogRoot](../api/auditlogroot-get.md)|[auditLogRoot](../resources/auditlogroot.md)|Read the properties and relationships of an [auditLogRoot](../resources/auditlogroot.md) object.|
|[Update auditLogRoot](../api/auditlogroot-update.md)|[auditLogRoot](../resources/auditlogroot.md)|Update the properties of an [auditLogRoot](../resources/auditlogroot.md) object.|
|[List sensitivityLabelActionLogs](../api/auditlogroot-list-sensitivitylabelactionlogs.md)|[sensitivityLabelActionLog](../resources/sensitivitylabelactionlog.md) collection|Get the sensitivityLabelActionLog resources from the sensitivityLabelActionLogs navigation property.|
|[Create sensitivityLabelActionLog](../api/auditlogroot-post-sensitivitylabelactionlogs.md)|[sensitivityLabelActionLog](../resources/sensitivitylabelactionlog.md)|Create a new sensitivityLabelActionLog object.|
|[List sensitivityLabeledFileActionLogs](../api/auditlogroot-list-sensitivitylabeledfileactionlogs.md)|[sensitivityLabeledFileActionLog](../resources/sensitivitylabeledfileactionlog.md) collection|Get the sensitivityLabeledFileActionLog resources from the sensitivityLabeledFileActionLogs navigation property.|
|[Create sensitivityLabeledFileActionLog](../api/auditlogroot-post-sensitivitylabeledfileactionlogs.md)|[sensitivityLabeledFileActionLog](../resources/sensitivitylabeledfileactionlog.md)|Create a new sensitivityLabeledFileActionLog object.|
|[List sensitivityLabelPolicyMatchLogs](../api/auditlogroot-list-sensitivitylabelpolicymatchlogs.md)|[sensitivityLabelPolicyMatchLog](../resources/sensitivitylabelpolicymatchlog.md) collection|Get the sensitivityLabelPolicyMatchLog resources from the sensitivityLabelPolicyMatchLogs navigation property.|
|[Create sensitivityLabelPolicyMatchLog](../api/auditlogroot-post-sensitivitylabelpolicymatchlogs.md)|[sensitivityLabelPolicyMatchLog](../resources/sensitivitylabelpolicymatchlog.md)|Create a new sensitivityLabelPolicyMatchLog object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|directoryAudits|[directoryAudit](../resources/directoryaudit.md) collection|**TODO: Add Description**|
|directoryProvisioning|[provisioningObjectSummary](../resources/provisioningobjectsummary.md) collection|**TODO: Add Description**|
|provisioning|[provisioningObjectSummary](../resources/provisioningobjectsummary.md) collection|**TODO: Add Description**|
|restrictedSignIns|[restrictedSignIn](../resources/restrictedsignin.md) collection|**TODO: Add Description**|
|sensitivityLabelActionLogs|[sensitivityLabelActionLog](../resources/sensitivitylabelactionlog.md) collection|**TODO: Add Description**|
|sensitivityLabeledFileActionLogs|[sensitivityLabeledFileActionLog](../resources/sensitivitylabeledfileactionlog.md) collection|**TODO: Add Description**|
|sensitivityLabelPolicyMatchLogs|[sensitivityLabelPolicyMatchLog](../resources/sensitivitylabelpolicymatchlog.md) collection|**TODO: Add Description**|
|signIns|[signIn](../resources/signin.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.auditLogRoot",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.auditLogRoot"
}
```

