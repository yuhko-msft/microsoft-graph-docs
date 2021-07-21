---
title: "deviceConfigurationUserStatus resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceConfigurationUserStatus resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceConfigurationUserStatus](../api/deviceconfigurationuserstatus-list.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get a list of the [deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) objects and their properties.|
|[Create deviceConfigurationUserStatus](../api/deviceconfigurationuserstatus-create.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new [deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) object.|
|[Get deviceConfigurationUserStatus](../api/deviceconfigurationuserstatus-get.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Read the properties and relationships of a [deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) object.|
|[Update deviceConfigurationUserStatus](../api/deviceconfigurationuserstatus-update.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Update the properties of a [deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) object.|
|[Delete deviceConfigurationUserStatus](../api/deviceconfigurationuserstatus-delete.md)|None|Deletes a [deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) object.|

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
  "@odata.type": "microsoft.graph.deviceConfigurationUserStatus",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceConfigurationUserStatus",
  "id": "String (identifier)",
  "devicesCount": "Integer",
  "lastReportedDateTime": "String (timestamp)",
  "status": "String",
  "userDisplayName": "String",
  "userPrincipalName": "String"
}
```

