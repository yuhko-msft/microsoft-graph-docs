---
title: "windowsDriverUpdateProfile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsDriverUpdateProfile resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsDriverUpdateProfiles](../api/intune-windowsdriverupdateprofile-list.md)|[windowsDriverUpdateProfile](../resources/intune-windowsdriverupdateprofile.md) collection|Get a list of the [windowsDriverUpdateProfile](../resources/intune-windowsdriverupdateprofile.md) objects and their properties.|
|[Create windowsDriverUpdateProfile](../api/intune-windowsdriverupdateprofile-create.md)|[windowsDriverUpdateProfile](../resources/intune-windowsdriverupdateprofile.md)|Create a new [windowsDriverUpdateProfile](../resources/intune-windowsdriverupdateprofile.md) object.|
|[Get windowsDriverUpdateProfile](../api/intune-windowsdriverupdateprofile-get.md)|[windowsDriverUpdateProfile](../resources/intune-windowsdriverupdateprofile.md)|Read the properties and relationships of a [windowsDriverUpdateProfile](../resources/intune-windowsdriverupdateprofile.md) object.|
|[Update windowsDriverUpdateProfile](../api/intune-windowsdriverupdateprofile-update.md)|[windowsDriverUpdateProfile](../resources/intune-windowsdriverupdateprofile.md)|Update the properties of a [windowsDriverUpdateProfile](../resources/intune-windowsdriverupdateprofile.md) object.|
|[Delete windowsDriverUpdateProfile](../api/intune-windowsdriverupdateprofile-delete.md)|None|Deletes a [windowsDriverUpdateProfile](../resources/intune-windowsdriverupdateprofile.md) object.|
|[List assignments](../api/intune-windowsdriverupdateprofile-list-assignments.md)|[windowsDriverUpdateProfileAssignment](../resources/intune-windowsdriverupdateprofileassignment.md) collection|Get the windowsDriverUpdateProfileAssignment resources from the assignments navigation property.|
|[Create windowsDriverUpdateProfileAssignment](../api/intune-windowsdriverupdateprofile-post-assignments.md)|[windowsDriverUpdateProfileAssignment](../resources/intune-windowsdriverupdateprofileassignment.md)|Create a new windowsDriverUpdateProfileAssignment object.|
|[List driverInventories](../api/intune-windowsdriverupdateprofile-list-driverinventories.md)|[windowsDriverUpdateInventory](../resources/intune-windowsdriverupdateinventory.md) collection|Get the windowsDriverUpdateInventory resources from the driverInventories navigation property.|
|[Create windowsDriverUpdateInventory](../api/intune-windowsdriverupdateprofile-post-driverinventories.md)|[windowsDriverUpdateInventory](../resources/intune-windowsdriverupdateinventory.md)|Create a new windowsDriverUpdateInventory object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|approvalType|driverUpdateProfileApprovalType|**TODO: Add Description**. Possible values are: `manual`, `automatic`.|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|deploymentDeferralInDays|Int32|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|deviceReporting|Int32|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|newUpdates|Int32|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[windowsDriverUpdateProfileAssignment](../resources/intune-windowsdriverupdateprofileassignment.md) collection|**TODO: Add Description**|
|driverInventories|[windowsDriverUpdateInventory](../resources/intune-windowsdriverupdateinventory.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsDriverUpdateProfile",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsDriverUpdateProfile",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "approvalType": "String",
  "deviceReporting": "Integer",
  "newUpdates": "Integer",
  "deploymentDeferralInDays": "Integer",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ]
}
```

