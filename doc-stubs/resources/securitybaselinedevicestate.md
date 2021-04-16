---
title: "securityBaselineDeviceState resource type"
description: "The security baseline compliance state summary of the security baseline for a device."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# securityBaselineDeviceState resource type

Namespace: microsoft.graph



The security baseline compliance state summary of the security baseline for a device.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List securityBaselineDeviceStates](../api/securitybaselinedevicestate-list.md)|[securityBaselineDeviceState](../resources/securitybaselinedevicestate.md) collection|Get a list of the [securityBaselineDeviceState](../resources/securitybaselinedevicestate.md) objects and their properties.|
|[Create securityBaselineDeviceState](../api/securitybaselinedevicestate-create.md)|[securityBaselineDeviceState](../resources/securitybaselinedevicestate.md)|Create a new [securityBaselineDeviceState](../resources/securitybaselinedevicestate.md) object.|
|[Get securityBaselineDeviceState](../api/securitybaselinedevicestate-get.md)|[securityBaselineDeviceState](../resources/securitybaselinedevicestate.md)|Read the properties and relationships of a [securityBaselineDeviceState](../resources/securitybaselinedevicestate.md) object.|
|[Update securityBaselineDeviceState](../api/securitybaselinedevicestate-update.md)|[securityBaselineDeviceState](../resources/securitybaselinedevicestate.md)|Update the properties of a [securityBaselineDeviceState](../resources/securitybaselinedevicestate.md) object.|
|[Delete securityBaselineDeviceState](../api/securitybaselinedevicestate-delete.md)|None|Deletes a [securityBaselineDeviceState](../resources/securitybaselinedevicestate.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceDisplayName|String|Display name of the device|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastReportedDateTime|DateTimeOffset|Last modified date time of the policy report|
|managedDeviceId|String|Intune device id|
|state|securityBaselineComplianceState|Security baseline compliance state. Possible values are: `unknown`, `secure`, `notApplicable`, `notSecure`, `error`, `conflict`.|
|userPrincipalName|String|User Principal Name|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.securityBaselineDeviceState",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.securityBaselineDeviceState",
  "id": "String (identifier)",
  "deviceDisplayName": "String",
  "lastReportedDateTime": "String (timestamp)",
  "managedDeviceId": "String",
  "state": "String",
  "userPrincipalName": "String"
}
```

