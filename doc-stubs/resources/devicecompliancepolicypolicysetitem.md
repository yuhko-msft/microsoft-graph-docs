---
title: "deviceCompliancePolicyPolicySetItem resource type"
description: "A class containing the properties used for device compliance policy PolicySetItem."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceCompliancePolicyPolicySetItem resource type

Namespace: microsoft.graph



A class containing the properties used for device compliance policy PolicySetItem.


Inherits from [policySetItem](../resources/policysetitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceCompliancePolicyPolicySetItems](../api/devicecompliancepolicypolicysetitem-list.md)|[deviceCompliancePolicyPolicySetItem](../resources/devicecompliancepolicypolicysetitem.md) collection|Get a list of the [deviceCompliancePolicyPolicySetItem](../resources/devicecompliancepolicypolicysetitem.md) objects and their properties.|
|[Create deviceCompliancePolicyPolicySetItem](../api/devicecompliancepolicypolicysetitem-create.md)|[deviceCompliancePolicyPolicySetItem](../resources/devicecompliancepolicypolicysetitem.md)|Create a new [deviceCompliancePolicyPolicySetItem](../resources/devicecompliancepolicypolicysetitem.md) object.|
|[Get deviceCompliancePolicyPolicySetItem](../api/devicecompliancepolicypolicysetitem-get.md)|[deviceCompliancePolicyPolicySetItem](../resources/devicecompliancepolicypolicysetitem.md)|Read the properties and relationships of a [deviceCompliancePolicyPolicySetItem](../resources/devicecompliancepolicypolicysetitem.md) object.|
|[Update deviceCompliancePolicyPolicySetItem](../api/devicecompliancepolicypolicysetitem-update.md)|[deviceCompliancePolicyPolicySetItem](../resources/devicecompliancepolicypolicysetitem.md)|Update the properties of a [deviceCompliancePolicyPolicySetItem](../resources/devicecompliancepolicypolicysetitem.md) object.|
|[Delete deviceCompliancePolicyPolicySetItem](../api/devicecompliancepolicypolicysetitem-delete.md)|None|Deletes a [deviceCompliancePolicyPolicySetItem](../resources/devicecompliancepolicypolicysetitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|Creation time of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|displayName|String|DisplayName of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|errorCode|errorCode|Error code if any occured. Inherited from [policySetItem](../resources/policysetitem.md). Possible values are: `noError`, `unauthorized`, `notFound`, `deleted`.|
|guidedDeploymentTags|String collection|Tags of the guided deployment Inherited from [policySetItem](../resources/policysetitem.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|itemType|String|policySetType of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|lastModifiedDateTime|DateTimeOffset|Last modified time of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|payloadId|String|PayloadId of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|status|policySetStatus|Status of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md). Possible values are: `unknown`, `validating`, `partialSuccess`, `success`, `error`, `notAssigned`.|

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
  "displayName": "String",
  "errorCode": "String",
  "guidedDeploymentTags": [
    "String"
  ],
  "itemType": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "payloadId": "String",
  "status": "String"
}
```

