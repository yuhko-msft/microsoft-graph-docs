---
title: "iosLobAppProvisioningConfigurationPolicySetItem resource type"
description: "A class containing the properties used for iOS lob app provisioning configuration PolicySetItem."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosLobAppProvisioningConfigurationPolicySetItem resource type

Namespace: microsoft.graph



A class containing the properties used for iOS lob app provisioning configuration PolicySetItem.


Inherits from [policySetItem](../resources/policysetitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosLobAppProvisioningConfigurationPolicySetItems](../api/ioslobappprovisioningconfigurationpolicysetitem-list.md)|[iosLobAppProvisioningConfigurationPolicySetItem](../resources/ioslobappprovisioningconfigurationpolicysetitem.md) collection|Get a list of the [iosLobAppProvisioningConfigurationPolicySetItem](../resources/ioslobappprovisioningconfigurationpolicysetitem.md) objects and their properties.|
|[Create iosLobAppProvisioningConfigurationPolicySetItem](../api/ioslobappprovisioningconfigurationpolicysetitem-create.md)|[iosLobAppProvisioningConfigurationPolicySetItem](../resources/ioslobappprovisioningconfigurationpolicysetitem.md)|Create a new [iosLobAppProvisioningConfigurationPolicySetItem](../resources/ioslobappprovisioningconfigurationpolicysetitem.md) object.|
|[Get iosLobAppProvisioningConfigurationPolicySetItem](../api/ioslobappprovisioningconfigurationpolicysetitem-get.md)|[iosLobAppProvisioningConfigurationPolicySetItem](../resources/ioslobappprovisioningconfigurationpolicysetitem.md)|Read the properties and relationships of an [iosLobAppProvisioningConfigurationPolicySetItem](../resources/ioslobappprovisioningconfigurationpolicysetitem.md) object.|
|[Update iosLobAppProvisioningConfigurationPolicySetItem](../api/ioslobappprovisioningconfigurationpolicysetitem-update.md)|[iosLobAppProvisioningConfigurationPolicySetItem](../resources/ioslobappprovisioningconfigurationpolicysetitem.md)|Update the properties of an [iosLobAppProvisioningConfigurationPolicySetItem](../resources/ioslobappprovisioningconfigurationpolicysetitem.md) object.|
|[Delete iosLobAppProvisioningConfigurationPolicySetItem](../api/ioslobappprovisioningconfigurationpolicysetitem-delete.md)|None|Deletes an [iosLobAppProvisioningConfigurationPolicySetItem](../resources/ioslobappprovisioningconfigurationpolicysetitem.md) object.|

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
  "@odata.type": "microsoft.graph.iosLobAppProvisioningConfigurationPolicySetItem",
  "baseType": "microsoft.graph.policySetItem",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosLobAppProvisioningConfigurationPolicySetItem",
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

