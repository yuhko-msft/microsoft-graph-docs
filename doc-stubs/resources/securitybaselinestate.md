---
title: "securityBaselineState resource type"
description: "Security baseline state for a device."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# securityBaselineState resource type

Namespace: microsoft.graph



Security baseline state for a device.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List securityBaselineStates](../api/securitybaselinestate-list.md)|[securityBaselineState](../resources/securitybaselinestate.md) collection|Get a list of the [securityBaselineState](../resources/securitybaselinestate.md) objects and their properties.|
|[Create securityBaselineState](../api/securitybaselinestate-create.md)|[securityBaselineState](../resources/securitybaselinestate.md)|Create a new [securityBaselineState](../resources/securitybaselinestate.md) object.|
|[Get securityBaselineState](../api/securitybaselinestate-get.md)|[securityBaselineState](../resources/securitybaselinestate.md)|Read the properties and relationships of a [securityBaselineState](../resources/securitybaselinestate.md) object.|
|[Update securityBaselineState](../api/securitybaselinestate-update.md)|[securityBaselineState](../resources/securitybaselinestate.md)|Update the properties of a [securityBaselineState](../resources/securitybaselinestate.md) object.|
|[Delete securityBaselineState](../api/securitybaselinestate-delete.md)|None|Deletes a [securityBaselineState](../resources/securitybaselinestate.md) object.|
|[List settingStates](../api/securitybaselinestate-list-settingstates.md)|[securityBaselineSettingState](../resources/securitybaselinesettingstate.md) collection|Get the securityBaselineSettingState resources from the settingStates navigation property.|
|[Create securityBaselineSettingState](../api/securitybaselinestate-post-settingstates.md)|[securityBaselineSettingState](../resources/securitybaselinesettingstate.md)|Create a new securityBaselineSettingState object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|The display name of the security baseline|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|securityBaselineTemplateId|String|The security baseline template id|
|state|securityBaselineComplianceState|Security baseline compliance state. Possible values are: `unknown`, `secure`, `notApplicable`, `notSecure`, `error`, `conflict`.|
|userPrincipalName|String|User Principal Name|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|settingStates|[securityBaselineSettingState](../resources/securitybaselinesettingstate.md) collection|The security baseline state for different settings for a device|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.securityBaselineState",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.securityBaselineState",
  "id": "String (identifier)",
  "displayName": "String",
  "securityBaselineTemplateId": "String",
  "state": "String",
  "userPrincipalName": "String"
}
```

