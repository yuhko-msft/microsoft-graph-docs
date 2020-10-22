---
title: "managedAppProtectionPolicySetItem resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedAppProtectionPolicySetItem resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [policySetItem](../resources/policysetitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedAppProtectionPolicySetItems](../api/intune-managedappprotectionpolicysetitem-list.md)|[managedAppProtectionPolicySetItem](../resources/intune-managedappprotectionpolicysetitem.md) collection|Get a list of the [managedAppProtectionPolicySetItem](../resources/managedappprotectionpolicysetitem.md) objects and their properties.|
|[Create managedAppProtectionPolicySetItem](../api/intune-managedappprotectionpolicysetitem-create.md)|[managedAppProtectionPolicySetItem](../resources/intune-managedappprotectionpolicysetitem.md)|Create a new [managedAppProtectionPolicySetItem](../resources/intune-managedappprotectionpolicysetitem.md) object.|
|[Get managedAppProtectionPolicySetItem](../api/intune-managedappprotectionpolicysetitem-get.md)|[managedAppProtectionPolicySetItem](../resources/intune-managedappprotectionpolicysetitem.md)|Read the properties and relationships of a [managedAppProtectionPolicySetItem](../resources/intune-managedappprotectionpolicysetitem.md) object.|
|[Update managedAppProtectionPolicySetItem](../api/intune-managedappprotectionpolicysetitem-update.md)|[managedAppProtectionPolicySetItem](../resources/intune-managedappprotectionpolicysetitem.md)|Update the properties of a [managedAppProtectionPolicySetItem](../resources/intune-managedappprotectionpolicysetitem.md) object.|
|[Delete managedAppProtectionPolicySetItem](../api/intune-managedappprotectionpolicysetitem-delete.md)|None|Deletes a [managedAppProtectionPolicySetItem](../resources/intune-managedappprotectionpolicysetitem.md) object.|

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
|targetedAppManagementLevels|String|**TODO: Add Description**|

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
  "lastModifiedDateTime": "String (timestamp)",
  "payloadId": "String",
  "itemType": "String",
  "displayName": "String",
  "status": "String",
  "errorCode": "String",
  "guidedDeploymentTags": [
    "String"
  ],
  "targetedAppManagementLevels": "String"
}
```

