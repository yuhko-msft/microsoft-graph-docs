---
title: "deviceCompliancePolicyPolicySetItem resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceCompliancePolicyPolicySetItem resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [policySetItem](../resources/policysetitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceCompliancePolicyPolicySetItems](../api/intune-devicecompliancepolicypolicysetitem-list.md)|[deviceCompliancePolicyPolicySetItem](../resources/intune-devicecompliancepolicypolicysetitem.md) collection|Get a list of the [deviceCompliancePolicyPolicySetItem](../resources/devicecompliancepolicypolicysetitem.md) objects and their properties.|
|[Create deviceCompliancePolicyPolicySetItem](../api/intune-devicecompliancepolicypolicysetitem-create.md)|[deviceCompliancePolicyPolicySetItem](../resources/intune-devicecompliancepolicypolicysetitem.md)|Create a new [deviceCompliancePolicyPolicySetItem](../resources/intune-devicecompliancepolicypolicysetitem.md) object.|
|[Get deviceCompliancePolicyPolicySetItem](../api/intune-devicecompliancepolicypolicysetitem-get.md)|[deviceCompliancePolicyPolicySetItem](../resources/intune-devicecompliancepolicypolicysetitem.md)|Read the properties and relationships of a [deviceCompliancePolicyPolicySetItem](../resources/intune-devicecompliancepolicypolicysetitem.md) object.|
|[Update deviceCompliancePolicyPolicySetItem](../api/intune-devicecompliancepolicypolicysetitem-update.md)|[deviceCompliancePolicyPolicySetItem](../resources/intune-devicecompliancepolicypolicysetitem.md)|Update the properties of a [deviceCompliancePolicyPolicySetItem](../resources/intune-devicecompliancepolicypolicysetitem.md) object.|
|[Delete deviceCompliancePolicyPolicySetItem](../api/intune-devicecompliancepolicypolicysetitem-delete.md)|None|Deletes a [deviceCompliancePolicyPolicySetItem](../resources/intune-devicecompliancepolicypolicysetitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|displayName|String|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|errorCode|errorCode|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md). Possible values are: `noError`, `unauthorized`, `notFound`, `deleted`.|
|guidedDeploymentTags|String collection|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|itemType|String|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|payloadId|String|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|status|policySetStatus|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md). Possible values are: `unknown`, `validating`, `partialSuccess`, `success`, `error`, `notAssigned`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceCompliancePolicyPolicySetItem",
  "baseType": "microsoft.graph.policySetItem",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceCompliancePolicyPolicySetItem",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "payloadId": "String",
  "itemType": "String",
  "displayName": "String",
  "status": "String",
  "errorCode": "String",
  "guidedDeploymentTags": [
    "String"
  ]
}
```

