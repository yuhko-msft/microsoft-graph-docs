---
title: "deviceManagementAutopilotPolicyStatusDetail resource type"
description: "Policy status detail item contained by an autopilot event."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementAutopilotPolicyStatusDetail resource type

Namespace: microsoft.graph



Policy status detail item contained by an autopilot event.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementAutopilotPolicyStatusDetails](../api/devicemanagementautopilotpolicystatusdetail-list.md)|[deviceManagementAutopilotPolicyStatusDetail](../resources/devicemanagementautopilotpolicystatusdetail.md) collection|Get a list of the [deviceManagementAutopilotPolicyStatusDetail](../resources/devicemanagementautopilotpolicystatusdetail.md) objects and their properties.|
|[Create deviceManagementAutopilotPolicyStatusDetail](../api/devicemanagementautopilotpolicystatusdetail-create.md)|[deviceManagementAutopilotPolicyStatusDetail](../resources/devicemanagementautopilotpolicystatusdetail.md)|Create a new [deviceManagementAutopilotPolicyStatusDetail](../resources/devicemanagementautopilotpolicystatusdetail.md) object.|
|[Get deviceManagementAutopilotPolicyStatusDetail](../api/devicemanagementautopilotpolicystatusdetail-get.md)|[deviceManagementAutopilotPolicyStatusDetail](../resources/devicemanagementautopilotpolicystatusdetail.md)|Read the properties and relationships of a [deviceManagementAutopilotPolicyStatusDetail](../resources/devicemanagementautopilotpolicystatusdetail.md) object.|
|[Update deviceManagementAutopilotPolicyStatusDetail](../api/devicemanagementautopilotpolicystatusdetail-update.md)|[deviceManagementAutopilotPolicyStatusDetail](../resources/devicemanagementautopilotpolicystatusdetail.md)|Update the properties of a [deviceManagementAutopilotPolicyStatusDetail](../resources/devicemanagementautopilotpolicystatusdetail.md) object.|
|[Delete deviceManagementAutopilotPolicyStatusDetail](../api/devicemanagementautopilotpolicystatusdetail-delete.md)|None|Deletes a [deviceManagementAutopilotPolicyStatusDetail](../resources/devicemanagementautopilotpolicystatusdetail.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|complianceStatus|deviceManagementAutopilotPolicyComplianceStatus|The policy compliance status. Possible values are: `unknown`, `compliant`, `installed`, `notCompliant`, `notInstalled`, `error`.|
|displayName|String|The friendly name of the policy.|
|errorCode|Int32|The errorode associated with the compliance or enforcement status of the policy. Error code for enforcement status takes precedence if it exists.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastReportedDateTime|DateTimeOffset|Timestamp of the reported policy status|
|policyType|deviceManagementAutopilotPolicyType|The type of policy. Possible values are: `unknown`, `application`, `appModel`, `configurationPolicy`.|
|trackedOnEnrollmentStatus|Boolean|Indicates if this prolicy was tracked as part of the autopilot bootstrap enrollment sync session|

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
  "complianceStatus": "String",
  "displayName": "String",
  "errorCode": "Integer",
  "lastReportedDateTime": "String (timestamp)",
  "policyType": "String",
  "trackedOnEnrollmentStatus": "Boolean"
}
```

