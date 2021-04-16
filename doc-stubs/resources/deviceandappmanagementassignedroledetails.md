---
title: "deviceAndAppManagementAssignedRoleDetails resource type"
description: "The set of Role Definitions and Role Assignments assigned to a user."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceAndAppManagementAssignedRoleDetails resource type

Namespace: microsoft.graph



The set of Role Definitions and Role Assignments assigned to a user.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|roleAssignmentIds|String collection|Role Assignment IDs for the specifc Role Assignments assigned to a user.|
|roleDefinitionIds|String collection|Role Definition IDs for the specifc Role Definitions assigned to a user.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceAndAppManagementAssignedRoleDetails"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceAndAppManagementAssignedRoleDetails",
  "roleAssignmentIds": [
    "String"
  ],
  "roleDefinitionIds": [
    "String"
  ]
}
```

