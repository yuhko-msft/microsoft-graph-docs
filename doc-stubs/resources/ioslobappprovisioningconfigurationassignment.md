---
title: "iosLobAppProvisioningConfigurationAssignment resource type"
description: "A class containing the properties used for Group Assignment of an iOS LOB App Provisioning and Configuration."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosLobAppProvisioningConfigurationAssignment resource type

Namespace: microsoft.graph

A class containing the properties used for Group Assignment of an iOS LOB App Provisioning and Configuration.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List assignments](../api/ioslobappprovisioningconfiguration-list-assignments.md)|[iosLobAppProvisioningConfigurationAssignment](../resources/ioslobappprovisioningconfigurationassignment.md) collection|Get the iosLobAppProvisioningConfigurationAssignment resources from the assignments navigation property.|
|[Create assignments](../api/ioslobappprovisioningconfiguration-post-assignments.md)|[iosLobAppProvisioningConfigurationAssignment](../resources/ioslobappprovisioningconfigurationassignment.md)|Create a new iosLobAppProvisioningConfigurationAssignment object.|
|[Update assignments](../api/ioslobappprovisioningconfiguration-update-assignments.md)|[iosLobAppProvisioningConfigurationAssignment](../resources/ioslobappprovisioningconfigurationassignment.md)|Update the properties of an assignments object.|
|[Get assignments](../api/ioslobappprovisioningconfiguration-get-ioslobappprovisioningconfigurationassignment.md)|[iosLobAppProvisioningConfigurationAssignment](../resources/ioslobappprovisioningconfigurationassignment.md)|Read the properties and relationships of an [iosLobAppProvisioningConfigurationAssignment](../resources/ioslobappprovisioningconfigurationassignment.md) object.|
|[Delete assignments](../api/ioslobappprovisioningconfiguration-delete-assignments.md)|None|Delete an [iosLobAppProvisioningConfigurationAssignment](../resources/ioslobappprovisioningconfigurationassignment.md) object.|
|[List iosLobAppProvisioningConfigurationAssignments](../api/ioslobappprovisioningconfigurationassignment-list.md)|[iosLobAppProvisioningConfigurationAssignment](../resources/ioslobappprovisioningconfigurationassignment.md) collection|Get a list of the [iosLobAppProvisioningConfigurationAssignment](../resources/ioslobappprovisioningconfigurationassignment.md) objects and their properties.|
|[Create iosLobAppProvisioningConfigurationAssignment](../api/ioslobappprovisioningconfigurationassignment-create.md)|[iosLobAppProvisioningConfigurationAssignment](../resources/ioslobappprovisioningconfigurationassignment.md)|Create a new [iosLobAppProvisioningConfigurationAssignment](../resources/ioslobappprovisioningconfigurationassignment.md) object.|
|[Get iosLobAppProvisioningConfigurationAssignment](../api/ioslobappprovisioningconfigurationassignment-get.md)|[iosLobAppProvisioningConfigurationAssignment](../resources/ioslobappprovisioningconfigurationassignment.md)|Read the properties and relationships of an [iosLobAppProvisioningConfigurationAssignment](../resources/ioslobappprovisioningconfigurationassignment.md) object.|
|[Update iosLobAppProvisioningConfigurationAssignment](../api/ioslobappprovisioningconfigurationassignment-update.md)|[iosLobAppProvisioningConfigurationAssignment](../resources/ioslobappprovisioningconfigurationassignment.md)|Update the properties of an [iosLobAppProvisioningConfigurationAssignment](../resources/ioslobappprovisioningconfigurationassignment.md) object.|
|[Delete iosLobAppProvisioningConfigurationAssignment](../api/ioslobappprovisioningconfigurationassignment-delete.md)|None|Deletes an [iosLobAppProvisioningConfigurationAssignment](../resources/ioslobappprovisioningconfigurationassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|Key of the entity.|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The target group assignment defined by the admin.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.iosLobAppProvisioningConfigurationAssignment",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosLobAppProvisioningConfigurationAssignment",
  "id": "String (identifier)",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

