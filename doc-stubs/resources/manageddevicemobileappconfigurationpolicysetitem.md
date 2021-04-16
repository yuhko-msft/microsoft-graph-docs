---
title: "managedDeviceMobileAppConfigurationPolicySetItem resource type"
description: "A class containing the properties used for managed device mobile app configuration PolicySetItem."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedDeviceMobileAppConfigurationPolicySetItem resource type

Namespace: microsoft.graph



A class containing the properties used for managed device mobile app configuration PolicySetItem.


Inherits from [policySetItem](../resources/policysetitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedDeviceMobileAppConfigurationPolicySetItems](../api/manageddevicemobileappconfigurationpolicysetitem-list.md)|[managedDeviceMobileAppConfigurationPolicySetItem](../resources/manageddevicemobileappconfigurationpolicysetitem.md) collection|Get a list of the [managedDeviceMobileAppConfigurationPolicySetItem](../resources/manageddevicemobileappconfigurationpolicysetitem.md) objects and their properties.|
|[Create managedDeviceMobileAppConfigurationPolicySetItem](../api/manageddevicemobileappconfigurationpolicysetitem-create.md)|[managedDeviceMobileAppConfigurationPolicySetItem](../resources/manageddevicemobileappconfigurationpolicysetitem.md)|Create a new [managedDeviceMobileAppConfigurationPolicySetItem](../resources/manageddevicemobileappconfigurationpolicysetitem.md) object.|
|[Get managedDeviceMobileAppConfigurationPolicySetItem](../api/manageddevicemobileappconfigurationpolicysetitem-get.md)|[managedDeviceMobileAppConfigurationPolicySetItem](../resources/manageddevicemobileappconfigurationpolicysetitem.md)|Read the properties and relationships of a [managedDeviceMobileAppConfigurationPolicySetItem](../resources/manageddevicemobileappconfigurationpolicysetitem.md) object.|
|[Update managedDeviceMobileAppConfigurationPolicySetItem](../api/manageddevicemobileappconfigurationpolicysetitem-update.md)|[managedDeviceMobileAppConfigurationPolicySetItem](../resources/manageddevicemobileappconfigurationpolicysetitem.md)|Update the properties of a [managedDeviceMobileAppConfigurationPolicySetItem](../resources/manageddevicemobileappconfigurationpolicysetitem.md) object.|
|[Delete managedDeviceMobileAppConfigurationPolicySetItem](../api/manageddevicemobileappconfigurationpolicysetitem-delete.md)|None|Deletes a [managedDeviceMobileAppConfigurationPolicySetItem](../resources/manageddevicemobileappconfigurationpolicysetitem.md) object.|

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
  "@odata.type": "microsoft.graph.managedDeviceMobileAppConfigurationPolicySetItem",
  "baseType": "microsoft.graph.policySetItem",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedDeviceMobileAppConfigurationPolicySetItem",
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

