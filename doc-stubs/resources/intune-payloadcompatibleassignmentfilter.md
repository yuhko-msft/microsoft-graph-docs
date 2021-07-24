---
title: "payloadCompatibleAssignmentFilter resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# payloadCompatibleAssignmentFilter resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [deviceAndAppManagementAssignmentFilter](../resources/intune-deviceandappmanagementassignmentfilter.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List payloadCompatibleAssignmentFilters](../api/intune-payloadcompatibleassignmentfilter-list.md)|[payloadCompatibleAssignmentFilter](../resources/intune-payloadcompatibleassignmentfilter.md) collection|Get a list of the [payloadCompatibleAssignmentFilter](../resources/intune-payloadcompatibleassignmentfilter.md) objects and their properties.|
|[Create payloadCompatibleAssignmentFilter](../api/intune-payloadcompatibleassignmentfilter-create.md)|[payloadCompatibleAssignmentFilter](../resources/intune-payloadcompatibleassignmentfilter.md)|Create a new [payloadCompatibleAssignmentFilter](../resources/intune-payloadcompatibleassignmentfilter.md) object.|
|[Get payloadCompatibleAssignmentFilter](../api/intune-payloadcompatibleassignmentfilter-get.md)|[payloadCompatibleAssignmentFilter](../resources/intune-payloadcompatibleassignmentfilter.md)|Read the properties and relationships of a [payloadCompatibleAssignmentFilter](../resources/intune-payloadcompatibleassignmentfilter.md) object.|
|[Update payloadCompatibleAssignmentFilter](../api/intune-payloadcompatibleassignmentfilter-update.md)|[payloadCompatibleAssignmentFilter](../resources/intune-payloadcompatibleassignmentfilter.md)|Update the properties of a [payloadCompatibleAssignmentFilter](../resources/intune-payloadcompatibleassignmentfilter.md) object.|
|[Delete payloadCompatibleAssignmentFilter](../api/intune-payloadcompatibleassignmentfilter-delete.md)|None|Deletes a [payloadCompatibleAssignmentFilter](../resources/intune-payloadcompatibleassignmentfilter.md) object.|
|[getSupportedProperties](../api/intune-payloadcompatibleassignmentfilter-getsupportedproperties.md)|[assignmentFilterSupportedProperty](../resources/intune-assignmentfiltersupportedproperty.md) collection|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceAndAppManagementAssignmentFilter](../resources/intune-deviceandappmanagementassignmentfilter.md).|
|description|String|**TODO: Add Description** Inherited from [deviceAndAppManagementAssignmentFilter](../resources/intune-deviceandappmanagementassignmentfilter.md).|
|displayName|String|**TODO: Add Description** Inherited from [deviceAndAppManagementAssignmentFilter](../resources/intune-deviceandappmanagementassignmentfilter.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceAndAppManagementAssignmentFilter](../resources/intune-deviceandappmanagementassignmentfilter.md).|
|payloadType|assignmentFilterPayloadType|**TODO: Add Description**. Possible values are: `notSet`, `enrollmentRestrictions`.|
|platform|devicePlatformType|**TODO: Add Description** Inherited from [deviceAndAppManagementAssignmentFilter](../resources/intune-deviceandappmanagementassignmentfilter.md). Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `unknown`, `androidAOSP`.|
|roleScopeTags|String collection|**TODO: Add Description** Inherited from [deviceAndAppManagementAssignmentFilter](../resources/intune-deviceandappmanagementassignmentfilter.md).|
|rule|String|**TODO: Add Description** Inherited from [deviceAndAppManagementAssignmentFilter](../resources/intune-deviceandappmanagementassignmentfilter.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.payloadCompatibleAssignmentFilter",
  "baseType": "microsoft.graph.deviceAndAppManagementAssignmentFilter",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.payloadCompatibleAssignmentFilter",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "displayName": "String",
  "description": "String",
  "platform": "String",
  "rule": "String",
  "roleScopeTags": [
    "String"
  ],
  "payloadType": "String"
}
```

