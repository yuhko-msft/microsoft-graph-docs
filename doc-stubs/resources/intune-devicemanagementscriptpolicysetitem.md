---
title: "deviceManagementScriptPolicySetItem resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementScriptPolicySetItem resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [policySetItem](../resources/policysetitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementScriptPolicySetItems](../api/intune-devicemanagementscriptpolicysetitem-list.md)|[deviceManagementScriptPolicySetItem](../resources/intune-devicemanagementscriptpolicysetitem.md) collection|Get a list of the [deviceManagementScriptPolicySetItem](../resources/devicemanagementscriptpolicysetitem.md) objects and their properties.|
|[Create deviceManagementScriptPolicySetItem](../api/intune-devicemanagementscriptpolicysetitem-create.md)|[deviceManagementScriptPolicySetItem](../resources/intune-devicemanagementscriptpolicysetitem.md)|Create a new [deviceManagementScriptPolicySetItem](../resources/intune-devicemanagementscriptpolicysetitem.md) object.|
|[Get deviceManagementScriptPolicySetItem](../api/intune-devicemanagementscriptpolicysetitem-get.md)|[deviceManagementScriptPolicySetItem](../resources/intune-devicemanagementscriptpolicysetitem.md)|Read the properties and relationships of a [deviceManagementScriptPolicySetItem](../resources/intune-devicemanagementscriptpolicysetitem.md) object.|
|[Update deviceManagementScriptPolicySetItem](../api/intune-devicemanagementscriptpolicysetitem-update.md)|[deviceManagementScriptPolicySetItem](../resources/intune-devicemanagementscriptpolicysetitem.md)|Update the properties of a [deviceManagementScriptPolicySetItem](../resources/intune-devicemanagementscriptpolicysetitem.md) object.|
|[Delete deviceManagementScriptPolicySetItem](../api/intune-devicemanagementscriptpolicysetitem-delete.md)|None|Deletes a [deviceManagementScriptPolicySetItem](../resources/intune-devicemanagementscriptpolicysetitem.md) object.|

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
  "@odata.type": "microsoft.graph.deviceManagementScriptPolicySetItem",
  "baseType": "microsoft.graph.policySetItem",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementScriptPolicySetItem",
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

