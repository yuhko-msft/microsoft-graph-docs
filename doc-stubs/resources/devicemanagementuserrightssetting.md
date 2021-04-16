---
title: "deviceManagementUserRightsSetting resource type"
description: "Represents a user rights setting."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementUserRightsSetting resource type

Namespace: microsoft.graph



Represents a user rights setting.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|localUsersOrGroups|[deviceManagementUserRightsLocalUserOrGroup](../resources/devicemanagementuserrightslocaluserorgroup.md) collection|Representing a collection of local users or groups which will be set on device if the state of this setting is Allowed. This collection can contain a maximum of 500 elements.|
|state|stateManagementSetting|Representing the current state of this user rights setting. Possible values are: `notConfigured`, `blocked`, `allowed`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementUserRightsSetting",
  "localUsersOrGroups": [
    {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsLocalUserOrGroup"
    }
  ],
  "state": "String"
}
```

