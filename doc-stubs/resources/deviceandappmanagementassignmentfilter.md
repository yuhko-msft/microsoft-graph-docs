---
title: "deviceAndAppManagementAssignmentFilter resource type"
description: "A class containing the properties used for Assignment Filter."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceAndAppManagementAssignmentFilter resource type

Namespace: microsoft.graph



A class containing the properties used for Assignment Filter.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceAndAppManagementAssignmentFilters](../api/deviceandappmanagementassignmentfilter-list.md)|[deviceAndAppManagementAssignmentFilter](../resources/deviceandappmanagementassignmentfilter.md) collection|Get a list of the [deviceAndAppManagementAssignmentFilter](../resources/deviceandappmanagementassignmentfilter.md) objects and their properties.|
|[Create deviceAndAppManagementAssignmentFilter](../api/deviceandappmanagementassignmentfilter-create.md)|[deviceAndAppManagementAssignmentFilter](../resources/deviceandappmanagementassignmentfilter.md)|Create a new [deviceAndAppManagementAssignmentFilter](../resources/deviceandappmanagementassignmentfilter.md) object.|
|[Get deviceAndAppManagementAssignmentFilter](../api/deviceandappmanagementassignmentfilter-get.md)|[deviceAndAppManagementAssignmentFilter](../resources/deviceandappmanagementassignmentfilter.md)|Read the properties and relationships of a [deviceAndAppManagementAssignmentFilter](../resources/deviceandappmanagementassignmentfilter.md) object.|
|[Update deviceAndAppManagementAssignmentFilter](../api/deviceandappmanagementassignmentfilter-update.md)|[deviceAndAppManagementAssignmentFilter](../resources/deviceandappmanagementassignmentfilter.md)|Update the properties of a [deviceAndAppManagementAssignmentFilter](../resources/deviceandappmanagementassignmentfilter.md) object.|
|[Delete deviceAndAppManagementAssignmentFilter](../api/deviceandappmanagementassignmentfilter-delete.md)|None|Deletes a [deviceAndAppManagementAssignmentFilter](../resources/deviceandappmanagementassignmentfilter.md) object.|
|[enable](../api/deviceandappmanagementassignmentfilter-enable.md)|None|**TODO: Add Description**|
|[validateFilter](../api/deviceandappmanagementassignmentfilter-validatefilter.md)|[assignmentFilterValidationResult](../resources/assignmentfiltervalidationresult.md)|**TODO: Add Description**|
|[getState](../api/deviceandappmanagementassignmentfilter-getstate.md)|[assignmentFilterState](../resources/assignmentfilterstate.md)|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|Creation time of the Assignment Filter.|
|description|String|Description of the Assignment Filter.|
|displayName|String|DisplayName of the Assignment Filter.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|Last modified time of the Assignment Filter.|
|platform|devicePlatformType|Platform type of the devices on which the Assignment Filter will be applicable. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `unknown`.|
|roleScopeTags|String collection|RoleScopeTags of the Assignment Filter.|
|rule|String|Rule definition of the Assignment Filter.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentFilter",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceAndAppManagementAssignmentFilter",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "platform": "String",
  "roleScopeTags": [
    "String"
  ],
  "rule": "String"
}
```

