---
title: "userInstallStateSummary resource type"
description: "Contains properties for the installation state summary for a user."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userInstallStateSummary resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Contains properties for the installation state summary for a user.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userInstallStateSummaries](../api/userinstallstatesummary-list.md)|[userInstallStateSummary](../resources/userinstallstatesummary.md) collection|Get a list of the [userInstallStateSummary](../resources/userinstallstatesummary.md) objects and their properties.|
|[Create userInstallStateSummary](../api/userinstallstatesummary-create.md)|[userInstallStateSummary](../resources/userinstallstatesummary.md)|Create a new [userInstallStateSummary](../resources/userinstallstatesummary.md) object.|
|[Get userInstallStateSummary](../api/userinstallstatesummary-get.md)|[userInstallStateSummary](../resources/userinstallstatesummary.md)|Read the properties and relationships of a [userInstallStateSummary](../resources/userinstallstatesummary.md) object.|
|[Update userInstallStateSummary](../api/userinstallstatesummary-update.md)|[userInstallStateSummary](../resources/userinstallstatesummary.md)|Update the properties of a [userInstallStateSummary](../resources/userinstallstatesummary.md) object.|
|[Delete userInstallStateSummary](../api/userinstallstatesummary-delete.md)|None|Deletes a [userInstallStateSummary](../resources/userinstallstatesummary.md) object.|
|[List deviceStates](../api/userinstallstatesummary-list-devicestates.md)|[deviceInstallState](../resources/deviceinstallstate.md) collection|Get the deviceInstallState resources from the deviceStates navigation property.|
|[Create deviceInstallState](../api/userinstallstatesummary-post-devicestates.md)|[deviceInstallState](../resources/deviceinstallstate.md)|Create a new deviceInstallState object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|failedDeviceCount|Int32|Failed Device Count.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|installedDeviceCount|Int32|Installed Device Count.|
|notInstalledDeviceCount|Int32|Not installed device count.|
|userName|String|User name.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|deviceStates|[deviceInstallState](../resources/deviceinstallstate.md) collection|The install state of the eBook.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userInstallStateSummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userInstallStateSummary",
  "id": "String (identifier)",
  "failedDeviceCount": "Integer",
  "installedDeviceCount": "Integer",
  "notInstalledDeviceCount": "Integer",
  "userName": "String"
}
```

