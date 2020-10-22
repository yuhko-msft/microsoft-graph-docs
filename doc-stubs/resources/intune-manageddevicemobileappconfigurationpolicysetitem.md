---
title: "managedDeviceMobileAppConfigurationPolicySetItem resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedDeviceMobileAppConfigurationPolicySetItem resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [policySetItem](../resources/policysetitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedDeviceMobileAppConfigurationPolicySetItems](../api/intune-manageddevicemobileappconfigurationpolicysetitem-list.md)|[managedDeviceMobileAppConfigurationPolicySetItem](../resources/intune-manageddevicemobileappconfigurationpolicysetitem.md) collection|Get a list of the [managedDeviceMobileAppConfigurationPolicySetItem](../resources/manageddevicemobileappconfigurationpolicysetitem.md) objects and their properties.|
|[Create managedDeviceMobileAppConfigurationPolicySetItem](../api/intune-manageddevicemobileappconfigurationpolicysetitem-create.md)|[managedDeviceMobileAppConfigurationPolicySetItem](../resources/intune-manageddevicemobileappconfigurationpolicysetitem.md)|Create a new [managedDeviceMobileAppConfigurationPolicySetItem](../resources/intune-manageddevicemobileappconfigurationpolicysetitem.md) object.|
|[Get managedDeviceMobileAppConfigurationPolicySetItem](../api/intune-manageddevicemobileappconfigurationpolicysetitem-get.md)|[managedDeviceMobileAppConfigurationPolicySetItem](../resources/intune-manageddevicemobileappconfigurationpolicysetitem.md)|Read the properties and relationships of a [managedDeviceMobileAppConfigurationPolicySetItem](../resources/intune-manageddevicemobileappconfigurationpolicysetitem.md) object.|
|[Update managedDeviceMobileAppConfigurationPolicySetItem](../api/intune-manageddevicemobileappconfigurationpolicysetitem-update.md)|[managedDeviceMobileAppConfigurationPolicySetItem](../resources/intune-manageddevicemobileappconfigurationpolicysetitem.md)|Update the properties of a [managedDeviceMobileAppConfigurationPolicySetItem](../resources/intune-manageddevicemobileappconfigurationpolicysetitem.md) object.|
|[Delete managedDeviceMobileAppConfigurationPolicySetItem](../api/intune-manageddevicemobileappconfigurationpolicysetitem-delete.md)|None|Deletes a [managedDeviceMobileAppConfigurationPolicySetItem](../resources/intune-manageddevicemobileappconfigurationpolicysetitem.md) object.|

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

