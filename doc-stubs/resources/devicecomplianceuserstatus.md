---
title: "deviceComplianceUserStatus resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceComplianceUserStatus resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceComplianceUserStatus](../api/devicecomplianceuserstatus-list.md)|[deviceComplianceUserStatus](../resources/devicecomplianceuserstatus.md) collection|Get a list of the [deviceComplianceUserStatus](../resources/devicecomplianceuserstatus.md) objects and their properties.|
|[Create deviceComplianceUserStatus](../api/devicecomplianceuserstatus-create.md)|[deviceComplianceUserStatus](../resources/devicecomplianceuserstatus.md)|Create a new [deviceComplianceUserStatus](../resources/devicecomplianceuserstatus.md) object.|
|[Get deviceComplianceUserStatus](../api/devicecomplianceuserstatus-get.md)|[deviceComplianceUserStatus](../resources/devicecomplianceuserstatus.md)|Read the properties and relationships of a [deviceComplianceUserStatus](../resources/devicecomplianceuserstatus.md) object.|
|[Update deviceComplianceUserStatus](../api/devicecomplianceuserstatus-update.md)|[deviceComplianceUserStatus](../resources/devicecomplianceuserstatus.md)|Update the properties of a [deviceComplianceUserStatus](../resources/devicecomplianceuserstatus.md) object.|
|[Delete deviceComplianceUserStatus](../api/devicecomplianceuserstatus-delete.md)|None|Deletes a [deviceComplianceUserStatus](../resources/devicecomplianceuserstatus.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|devicesCount|Int32|Devices count for that user.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastReportedDateTime|DateTimeOffset|Last modified date time of the policy report.|
|status|complianceStatus|Compliance status of the policy report. Possible values are: `unknown`, `notApplicable`, `compliant`, `remediated`, `nonCompliant`, `error`, `conflict`, `notAssigned`.|
|userDisplayName|String|User name of the DevicePolicyStatus.|
|userPrincipalName|String|UserPrincipalName.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceComplianceUserStatus",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceComplianceUserStatus",
  "id": "String (identifier)",
  "devicesCount": "Integer",
  "lastReportedDateTime": "String (timestamp)",
  "status": "String",
  "userDisplayName": "String",
  "userPrincipalName": "String"
}
```

