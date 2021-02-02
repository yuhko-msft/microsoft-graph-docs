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
|[List deviceComplianceDeviceStatus](../api/intune-devicecompliancedevicestatus-list.md)|[deviceComplianceDeviceStatus](../resources/intune-devicecompliancedevicestatus.md) collection|Get a list of the [deviceComplianceDeviceStatus](../resources/devicecompliancedevicestatus.md) objects and their properties.|
|[Create deviceComplianceDeviceStatus](../api/intune-devicecompliancedevicestatus-create.md)|[deviceComplianceDeviceStatus](../resources/intune-devicecompliancedevicestatus.md)|Create a new [deviceComplianceDeviceStatus](../resources/intune-devicecompliancedevicestatus.md) object.|
|[Get deviceComplianceDeviceStatus](../api/intune-devicecompliancedevicestatus-get.md)|[deviceComplianceDeviceStatus](../resources/intune-devicecompliancedevicestatus.md)|Read the properties and relationships of a [deviceComplianceDeviceStatus](../resources/intune-devicecompliancedevicestatus.md) object.|
|[Update deviceComplianceDeviceStatus](../api/intune-devicecompliancedevicestatus-update.md)|[deviceComplianceDeviceStatus](../resources/intune-devicecompliancedevicestatus.md)|Update the properties of a [deviceComplianceDeviceStatus](../resources/intune-devicecompliancedevicestatus.md) object.|
|[Delete deviceComplianceDeviceStatus](../api/intune-devicecompliancedevicestatus-delete.md)|None|Deletes a [deviceComplianceDeviceStatus](../resources/intune-devicecompliancedevicestatus.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|complianceGracePeriodExpirationDateTime|DateTimeOffset|**TODO: Add Description**|
|deviceDisplayName|String|**TODO: Add Description**|
|deviceModel|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastReportedDateTime|DateTimeOffset|**TODO: Add Description**|
|platform|Int32|**TODO: Add Description**|
|retireAfterDateTime|DateTimeOffset|**TODO: Add Description**|
|status|complianceStatus|**TODO: Add Description**. Possible values are: `unknown`, `notApplicable`, `compliant`, `remediated`, `nonCompliant`, `error`, `conflict`, `notAssigned`.|
|userName|String|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|

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
  "retireAfterDateTime": "String (timestamp)",
  "deviceDisplayName": "String",
  "userName": "String",
  "deviceModel": "String",
  "platform": "Integer",
  "complianceGracePeriodExpirationDateTime": "String (timestamp)",
  "status": "String",
  "lastReportedDateTime": "String (timestamp)",
  "userPrincipalName": "String"
}
```

