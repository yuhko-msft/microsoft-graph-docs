---
title: "deviceHealthScript resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceHealthScript resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceHealthScripts](../api/intune-devicehealthscript-list.md)|[deviceHealthScript](../resources/intune-devicehealthscript.md) collection|Get a list of the [deviceHealthScript](../resources/devicehealthscript.md) objects and their properties.|
|[Create deviceHealthScript](../api/intune-devicehealthscript-create.md)|[deviceHealthScript](../resources/intune-devicehealthscript.md)|Create a new [deviceHealthScript](../resources/intune-devicehealthscript.md) object.|
|[Get deviceHealthScript](../api/intune-devicehealthscript-get.md)|[deviceHealthScript](../resources/intune-devicehealthscript.md)|Read the properties and relationships of a [deviceHealthScript](../resources/intune-devicehealthscript.md) object.|
|[Update deviceHealthScript](../api/intune-devicehealthscript-update.md)|[deviceHealthScript](../resources/intune-devicehealthscript.md)|Update the properties of a [deviceHealthScript](../resources/intune-devicehealthscript.md) object.|
|[Delete deviceHealthScript](../api/intune-devicehealthscript-delete.md)|None|Deletes a [deviceHealthScript](../resources/intune-devicehealthscript.md) object.|
|[extractParametersFromScript](../api/intune-devicehealthscript-extractparametersfromscript.md)|[scriptParameter](../resources/intune-scriptparameter.md) collection|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|detectionScriptContent|Binary|**TODO: Add Description**|
|detectionScriptParameters|[deviceHealthScriptParameter](../resources/intune-devicehealthscriptparameter.md) collection|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|enforceSignatureCheck|Boolean|**TODO: Add Description**|
|highestAvailableVersion|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isGlobalScript|Boolean|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|publisher|String|**TODO: Add Description**|
|remediationScriptContent|Binary|**TODO: Add Description**|
|remediationScriptParameters|[deviceHealthScriptParameter](../resources/intune-devicehealthscriptparameter.md) collection|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description**|
|runAs32Bit|Boolean|**TODO: Add Description**|
|runAsAccount|runAsAccountType|**TODO: Add Description**. Possible values are: `system`, `user`.|
|version|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceHealthScriptAssignment](../resources/intune-devicehealthscriptassignment.md) collection|**TODO: Add Description**|
|deviceRunStates|[deviceHealthScriptDeviceState](../resources/intune-devicehealthscriptdevicestate.md) collection|**TODO: Add Description**|
|runSummary|[deviceHealthScriptRunSummary](../resources/intune-devicehealthscriptrunsummary.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceHealthScript",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceHealthScript",
  "id": "String (identifier)",
  "publisher": "String",
  "version": "String",
  "displayName": "String",
  "description": "String",
  "detectionScriptContent": "Binary",
  "remediationScriptContent": "Binary",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "runAsAccount": "String",
  "enforceSignatureCheck": "Boolean",
  "runAs32Bit": "Boolean",
  "roleScopeTagIds": [
    "String"
  ],
  "isGlobalScript": "Boolean",
  "highestAvailableVersion": "String",
  "detectionScriptParameters": [
    {
      "@odata.type": "microsoft.graph.deviceHealthScriptStringParameter"
    }
  ],
  "remediationScriptParameters": [
    {
      "@odata.type": "microsoft.graph.deviceHealthScriptStringParameter"
    }
  ]
}
```

