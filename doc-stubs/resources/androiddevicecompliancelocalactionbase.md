---
title: "androidDeviceComplianceLocalActionBase resource type"
description: "Local Action Configuration"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidDeviceComplianceLocalActionBase resource type

Namespace: microsoft.graph



Local Action Configuration


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidDeviceComplianceLocalActionBases](../api/androiddevicecompliancelocalactionbase-list.md)|[androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md) collection|Get a list of the [androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md) objects and their properties.|
|[Create androidDeviceComplianceLocalActionBase](../api/androiddevicecompliancelocalactionbase-create.md)|[androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md)|Create a new [androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md) object.|
|[Get androidDeviceComplianceLocalActionBase](../api/androiddevicecompliancelocalactionbase-get.md)|[androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md)|Read the properties and relationships of an [androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md) object.|
|[Update androidDeviceComplianceLocalActionBase](../api/androiddevicecompliancelocalactionbase-update.md)|[androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md)|Update the properties of an [androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md) object.|
|[Delete androidDeviceComplianceLocalActionBase](../api/androiddevicecompliancelocalactionbase-delete.md)|None|Deletes an [androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|gracePeriodInMinutes|Int32|Number of minutes to wait till a local action is enforced. Valid values 0 to 2147483647|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.androidDeviceComplianceLocalActionBase",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidDeviceComplianceLocalActionBase",
  "id": "String (identifier)",
  "gracePeriodInMinutes": "Integer"
}
```

