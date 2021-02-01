---
title: "deviceManagementAutopilotPolicyStatusDetail resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementAutopilotPolicyStatusDetail resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementAutopilotPolicyStatusDetails](../api/intune-devicemanagementautopilotpolicystatusdetail-list.md)|[deviceManagementAutopilotPolicyStatusDetail](../resources/intune-devicemanagementautopilotpolicystatusdetail.md) collection|Get a list of the [deviceManagementAutopilotPolicyStatusDetail](../resources/devicemanagementautopilotpolicystatusdetail.md) objects and their properties.|
|[Create deviceManagementAutopilotPolicyStatusDetail](../api/intune-devicemanagementautopilotpolicystatusdetail-create.md)|[deviceManagementAutopilotPolicyStatusDetail](../resources/intune-devicemanagementautopilotpolicystatusdetail.md)|Create a new [deviceManagementAutopilotPolicyStatusDetail](../resources/intune-devicemanagementautopilotpolicystatusdetail.md) object.|
|[Get deviceManagementAutopilotPolicyStatusDetail](../api/intune-devicemanagementautopilotpolicystatusdetail-get.md)|[deviceManagementAutopilotPolicyStatusDetail](../resources/intune-devicemanagementautopilotpolicystatusdetail.md)|Read the properties and relationships of a [deviceManagementAutopilotPolicyStatusDetail](../resources/intune-devicemanagementautopilotpolicystatusdetail.md) object.|
|[Update deviceManagementAutopilotPolicyStatusDetail](../api/intune-devicemanagementautopilotpolicystatusdetail-update.md)|[deviceManagementAutopilotPolicyStatusDetail](../resources/intune-devicemanagementautopilotpolicystatusdetail.md)|Update the properties of a [deviceManagementAutopilotPolicyStatusDetail](../resources/intune-devicemanagementautopilotpolicystatusdetail.md) object.|
|[Delete deviceManagementAutopilotPolicyStatusDetail](../api/intune-devicemanagementautopilotpolicystatusdetail-delete.md)|None|Deletes a [deviceManagementAutopilotPolicyStatusDetail](../resources/intune-devicemanagementautopilotpolicystatusdetail.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|complianceStatus|deviceManagementAutopilotPolicyComplianceStatus|**TODO: Add Description**. Possible values are: `unknown`, `compliant`, `installed`, `notCompliant`, `notInstalled`, `error`.|
|displayName|String|**TODO: Add Description**|
|errorCode|Int32|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastReportedDateTime|DateTimeOffset|**TODO: Add Description**|
|policyType|deviceManagementAutopilotPolicyType|**TODO: Add Description**. Possible values are: `unknown`, `application`, `appModel`, `configurationPolicy`.|
|trackedOnEnrollmentStatus|Boolean|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementAutopilotPolicyStatusDetail",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementAutopilotPolicyStatusDetail",
  "id": "String (identifier)",
  "displayName": "String",
  "policyType": "String",
  "complianceStatus": "String",
  "trackedOnEnrollmentStatus": "Boolean",
  "lastReportedDateTime": "String (timestamp)",
  "errorCode": "Integer"
}
```

