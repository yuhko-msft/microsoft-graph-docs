---
title: "deviceCompliancePolicyState resource type"
description: "Device Compliance Policy State for a given device."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceCompliancePolicyState resource type

Namespace: microsoft.graph



Device Compliance Policy State for a given device.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceCompliancePolicyStates](../api/devicecompliancepolicystate-list.md)|[deviceCompliancePolicyState](../resources/devicecompliancepolicystate.md) collection|Get a list of the [deviceCompliancePolicyState](../resources/devicecompliancepolicystate.md) objects and their properties.|
|[Create deviceCompliancePolicyState](../api/devicecompliancepolicystate-create.md)|[deviceCompliancePolicyState](../resources/devicecompliancepolicystate.md)|Create a new [deviceCompliancePolicyState](../resources/devicecompliancepolicystate.md) object.|
|[Get deviceCompliancePolicyState](../api/devicecompliancepolicystate-get.md)|[deviceCompliancePolicyState](../resources/devicecompliancepolicystate.md)|Read the properties and relationships of a [deviceCompliancePolicyState](../resources/devicecompliancepolicystate.md) object.|
|[Update deviceCompliancePolicyState](../api/devicecompliancepolicystate-update.md)|[deviceCompliancePolicyState](../resources/devicecompliancepolicystate.md)|Update the properties of a [deviceCompliancePolicyState](../resources/devicecompliancepolicystate.md) object.|
|[Delete deviceCompliancePolicyState](../api/devicecompliancepolicystate-delete.md)|None|Deletes a [deviceCompliancePolicyState](../resources/devicecompliancepolicystate.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|The name of the policy for this policyBase|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|platformType|policyPlatformType|Platform type that the policy applies to. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `windows10XProfile`, `all`.|
|settingCount|Int32|Count of how many setting a policy holds|
|settingStates|[deviceCompliancePolicySettingState](../resources/devicecompliancepolicysettingstate.md) collection|**TODO: Add Description**|
|state|complianceStatus|The compliance state of the policy. Possible values are: `unknown`, `notApplicable`, `compliant`, `remediated`, `nonCompliant`, `error`, `conflict`, `notAssigned`.|
|userId|String|User unique identifier, must be Guid|
|userPrincipalName|String|User Principal Name|
|version|Int32|The version of the policy|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceCompliancePolicyState",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceCompliancePolicyState",
  "id": "String (identifier)",
  "displayName": "String",
  "platformType": "String",
  "settingCount": "Integer",
  "settingStates": [
    {
      "@odata.type": "microsoft.graph.deviceCompliancePolicySettingState"
    }
  ],
  "state": "String",
  "userId": "String",
  "userPrincipalName": "String",
  "version": "Integer"
}
```

