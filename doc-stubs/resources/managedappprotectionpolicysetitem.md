---
title: "managedAppProtectionPolicySetItem resource type"
description: "A class containing the properties used for managed app protection PolicySetItem."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedAppProtectionPolicySetItem resource type

Namespace: microsoft.graph



A class containing the properties used for managed app protection PolicySetItem.


Inherits from [policySetItem](../resources/policysetitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedAppProtectionPolicySetItems](../api/managedappprotectionpolicysetitem-list.md)|[managedAppProtectionPolicySetItem](../resources/managedappprotectionpolicysetitem.md) collection|Get a list of the [managedAppProtectionPolicySetItem](../resources/managedappprotectionpolicysetitem.md) objects and their properties.|
|[Create managedAppProtectionPolicySetItem](../api/managedappprotectionpolicysetitem-create.md)|[managedAppProtectionPolicySetItem](../resources/managedappprotectionpolicysetitem.md)|Create a new [managedAppProtectionPolicySetItem](../resources/managedappprotectionpolicysetitem.md) object.|
|[Get managedAppProtectionPolicySetItem](../api/managedappprotectionpolicysetitem-get.md)|[managedAppProtectionPolicySetItem](../resources/managedappprotectionpolicysetitem.md)|Read the properties and relationships of a [managedAppProtectionPolicySetItem](../resources/managedappprotectionpolicysetitem.md) object.|
|[Update managedAppProtectionPolicySetItem](../api/managedappprotectionpolicysetitem-update.md)|[managedAppProtectionPolicySetItem](../resources/managedappprotectionpolicysetitem.md)|Update the properties of a [managedAppProtectionPolicySetItem](../resources/managedappprotectionpolicysetitem.md) object.|
|[Delete managedAppProtectionPolicySetItem](../api/managedappprotectionpolicysetitem-delete.md)|None|Deletes a [managedAppProtectionPolicySetItem](../resources/managedappprotectionpolicysetitem.md) object.|

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
|targetedAppManagementLevels|String|TargetedAppManagementLevels of the ManagedAppPolicySetItem.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedAppProtectionPolicySetItem",
  "baseType": "microsoft.graph.policySetItem",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedAppProtectionPolicySetItem",
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
  "status": "String",
  "targetedAppManagementLevels": "String"
}
```

