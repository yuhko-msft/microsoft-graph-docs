---
title: "mobileAppProvisioningConfigGroupAssignment resource type"
description: "Contains the properties used to assign an App provisioning configuration to a group."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileAppProvisioningConfigGroupAssignment resource type

Namespace: microsoft.graph

Contains the properties used to assign an App provisioning configuration to a group.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupAssignments](../api/ioslobappprovisioningconfiguration-list-groupassignments.md)|[mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md) collection|Get the mobileAppProvisioningConfigGroupAssignment resources from the groupAssignments navigation property.|
|[Create groupAssignments](../api/ioslobappprovisioningconfiguration-post-groupassignments.md)|[mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md)|Create a new mobileAppProvisioningConfigGroupAssignment object.|
|[Update groupAssignments](../api/ioslobappprovisioningconfiguration-update-groupassignments.md)|[mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md)|Update the properties of a groupAssignments object.|
|[Get groupAssignments](../api/ioslobappprovisioningconfiguration-get-mobileappprovisioningconfiggroupassignment.md)|[mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md)|Read the properties and relationships of a [mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md) object.|
|[Delete groupAssignments](../api/ioslobappprovisioningconfiguration-delete-groupassignments.md)|None|Delete a [mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md) object.|
|[List mobileAppProvisioningConfigGroupAssignments](../api/mobileappprovisioningconfiggroupassignment-list.md)|[mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md) collection|Get a list of the [mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md) objects and their properties.|
|[Create mobileAppProvisioningConfigGroupAssignment](../api/mobileappprovisioningconfiggroupassignment-create.md)|[mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md)|Create a new [mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md) object.|
|[Get mobileAppProvisioningConfigGroupAssignment](../api/mobileappprovisioningconfiggroupassignment-get.md)|[mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md)|Read the properties and relationships of a [mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md) object.|
|[Update mobileAppProvisioningConfigGroupAssignment](../api/mobileappprovisioningconfiggroupassignment-update.md)|[mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md)|Update the properties of a [mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md) object.|
|[Delete mobileAppProvisioningConfigGroupAssignment](../api/mobileappprovisioningconfiggroupassignment-delete.md)|None|Deletes a [mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|Key of the entity.|
|targetGroupId|String|The ID of the AAD group in which the app provisioning configuration is being targeted.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mobileAppProvisioningConfigGroupAssignment",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileAppProvisioningConfigGroupAssignment",
  "targetGroupId": "String",
  "id": "String (identifier)"
}
```

