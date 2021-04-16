---
title: "deviceComplianceDeviceStatus resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceComplianceDeviceStatus resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceComplianceDeviceStatus](../api/devicecompliancedevicestatus-list.md)|[deviceComplianceDeviceStatus](../resources/devicecompliancedevicestatus.md) collection|Get a list of the [deviceComplianceDeviceStatus](../resources/devicecompliancedevicestatus.md) objects and their properties.|
|[Create deviceComplianceDeviceStatus](../api/devicecompliancedevicestatus-create.md)|[deviceComplianceDeviceStatus](../resources/devicecompliancedevicestatus.md)|Create a new [deviceComplianceDeviceStatus](../resources/devicecompliancedevicestatus.md) object.|
|[Get deviceComplianceDeviceStatus](../api/devicecompliancedevicestatus-get.md)|[deviceComplianceDeviceStatus](../resources/devicecompliancedevicestatus.md)|Read the properties and relationships of a [deviceComplianceDeviceStatus](../resources/devicecompliancedevicestatus.md) object.|
|[Update deviceComplianceDeviceStatus](../api/devicecompliancedevicestatus-update.md)|[deviceComplianceDeviceStatus](../resources/devicecompliancedevicestatus.md)|Update the properties of a [deviceComplianceDeviceStatus](../resources/devicecompliancedevicestatus.md) object.|
|[Delete deviceComplianceDeviceStatus](../api/devicecompliancedevicestatus-delete.md)|None|Deletes a [deviceComplianceDeviceStatus](../resources/devicecompliancedevicestatus.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|complianceGracePeriodExpirationDateTime|DateTimeOffset|The DateTime when device compliance grace period expires|
|deviceDisplayName|String|Device name of the DevicePolicyStatus.|
|deviceModel|String|The device model that is being reported|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastReportedDateTime|DateTimeOffset|Last modified date time of the policy report.|
|platform|Int32|Platform of the device that is being reported|
|status|complianceStatus|Compliance status of the policy report. Possible values are: `unknown`, `notApplicable`, `compliant`, `remediated`, `nonCompliant`, `error`, `conflict`, `notAssigned`.|
|userName|String|The User Name that is being reported|
|userPrincipalName|String|UserPrincipalName.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceComplianceDeviceStatus",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceComplianceDeviceStatus",
  "id": "String (identifier)",
  "complianceGracePeriodExpirationDateTime": "String (timestamp)",
  "deviceDisplayName": "String",
  "deviceModel": "String",
  "lastReportedDateTime": "String (timestamp)",
  "platform": "Integer",
  "status": "String",
  "userName": "String",
  "userPrincipalName": "String"
}
```

