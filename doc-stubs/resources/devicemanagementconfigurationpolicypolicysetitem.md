---
title: "deviceManagementConfigurationPolicyPolicySetItem resource type"
description: "A class containing the properties used for DeviceManagementConfiguration PolicySetItem."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationPolicyPolicySetItem resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A class containing the properties used for DeviceManagementConfiguration PolicySetItem.


Inherits from [policySetItem](../resources/policysetitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementConfigurationPolicyPolicySetItems](../api/devicemanagementconfigurationpolicypolicysetitem-list.md)|[deviceManagementConfigurationPolicyPolicySetItem](../resources/devicemanagementconfigurationpolicypolicysetitem.md) collection|Get a list of the [deviceManagementConfigurationPolicyPolicySetItem](../resources/devicemanagementconfigurationpolicypolicysetitem.md) objects and their properties.|
|[Create deviceManagementConfigurationPolicyPolicySetItem](../api/devicemanagementconfigurationpolicypolicysetitem-create.md)|[deviceManagementConfigurationPolicyPolicySetItem](../resources/devicemanagementconfigurationpolicypolicysetitem.md)|Create a new [deviceManagementConfigurationPolicyPolicySetItem](../resources/devicemanagementconfigurationpolicypolicysetitem.md) object.|
|[Get deviceManagementConfigurationPolicyPolicySetItem](../api/devicemanagementconfigurationpolicypolicysetitem-get.md)|[deviceManagementConfigurationPolicyPolicySetItem](../resources/devicemanagementconfigurationpolicypolicysetitem.md)|Read the properties and relationships of a [deviceManagementConfigurationPolicyPolicySetItem](../resources/devicemanagementconfigurationpolicypolicysetitem.md) object.|
|[Update deviceManagementConfigurationPolicyPolicySetItem](../api/devicemanagementconfigurationpolicypolicysetitem-update.md)|[deviceManagementConfigurationPolicyPolicySetItem](../resources/devicemanagementconfigurationpolicypolicysetitem.md)|Update the properties of a [deviceManagementConfigurationPolicyPolicySetItem](../resources/devicemanagementconfigurationpolicypolicysetitem.md) object.|
|[Delete deviceManagementConfigurationPolicyPolicySetItem](../api/devicemanagementconfigurationpolicypolicysetitem-delete.md)|None|Deletes a [deviceManagementConfigurationPolicyPolicySetItem](../resources/devicemanagementconfigurationpolicypolicysetitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|Creation time of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md).|
|displayName|String|DisplayName of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md).|
|errorCode|errorCode|Error code if any occured. Inherited from [policySetItem](../resources/policysetitem.md). Possible values are: `noError`, `unauthorized`, `notFound`, `deleted`.|
|guidedDeploymentTags|String collection|Tags of the guided deployment Inherited from [policySetItem](../resources/policysetitem.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|itemType|String|policySetType of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md).|
|lastModifiedDateTime|DateTimeOffset|Last modified time of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md).|
|payloadId|String|PayloadId of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md).|
|status|policySetStatus|Status of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md). Possible values are: `unknown`, `validating`, `partialSuccess`, `success`, `error`, `notAssigned`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationPolicyPolicySetItem",
  "baseType": "microsoft.graph.policySetItem",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationPolicyPolicySetItem",
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

