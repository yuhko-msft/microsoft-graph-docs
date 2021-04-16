---
title: "privilegedAccess resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# privilegedAccess resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List privilegedAccesses](../api/privilegedaccess-list.md)|[privilegedAccess](../resources/privilegedaccess.md) collection|Get a list of the [privilegedAccess](../resources/privilegedaccess.md) objects and their properties.|
|[Create privilegedAccess](../api/privilegedaccess-post-privilegedaccess.md)|[privilegedAccess](../resources/privilegedaccess.md)|Create a new [privilegedAccess](../resources/privilegedaccess.md) object.|
|[Get privilegedAccess](../api/privilegedaccess-get.md)|[privilegedAccess](../resources/privilegedaccess.md)|Read the properties and relationships of a [privilegedAccess](../resources/privilegedaccess.md) object.|
|[Update privilegedAccess](../api/privilegedaccess-update.md)|[privilegedAccess](../resources/privilegedaccess.md)|Update the properties of a [privilegedAccess](../resources/privilegedaccess.md) object.|
|[Delete privilegedAccess](../api/privilegedaccess-delete.md)|None|Deletes a [privilegedAccess](../resources/privilegedaccess.md) object.|
|[List resources](../api/privilegedaccess-list-resources.md)|[governanceResource](../resources/governanceresource.md) collection|Get the governanceResource resources from the resources navigation property.|
|[Create governanceResource](../api/privilegedaccess-post-resources.md)|[governanceResource](../resources/governanceresource.md)|Create a new governanceResource object.|
|[List roleAssignmentRequests](../api/privilegedaccess-list-roleassignmentrequests.md)|[governanceRoleAssignmentRequest](../resources/governanceroleassignmentrequest.md) collection|Get the governanceRoleAssignmentRequest resources from the roleAssignmentRequests navigation property.|
|[Create governanceRoleAssignmentRequest](../api/privilegedaccess-post-roleassignmentrequests.md)|[governanceRoleAssignmentRequest](../resources/governanceroleassignmentrequest.md)|Create a new governanceRoleAssignmentRequest object.|
|[List roleAssignments](../api/privilegedaccess-list-roleassignments.md)|[governanceRoleAssignment](../resources/governanceroleassignment.md) collection|Get the governanceRoleAssignment resources from the roleAssignments navigation property.|
|[Create governanceRoleAssignment](../api/privilegedaccess-post-roleassignments.md)|[governanceRoleAssignment](../resources/governanceroleassignment.md)|Create a new governanceRoleAssignment object.|
|[List roleDefinitions](../api/privilegedaccess-list-roledefinitions.md)|[governanceRoleDefinition](../resources/governanceroledefinition.md) collection|Get the governanceRoleDefinition resources from the roleDefinitions navigation property.|
|[Create governanceRoleDefinition](../api/privilegedaccess-post-roledefinitions.md)|[governanceRoleDefinition](../resources/governanceroledefinition.md)|Create a new governanceRoleDefinition object.|
|[List roleSettings](../api/privilegedaccess-list-rolesettings.md)|[governanceRoleSetting](../resources/governancerolesetting.md) collection|Get the governanceRoleSetting resources from the roleSettings navigation property.|
|[Create governanceRoleSetting](../api/privilegedaccess-post-rolesettings.md)|[governanceRoleSetting](../resources/governancerolesetting.md)|Create a new governanceRoleSetting object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|resources|[governanceResource](../resources/governanceresource.md) collection|**TODO: Add Description**|
|roleAssignmentRequests|[governanceRoleAssignmentRequest](../resources/governanceroleassignmentrequest.md) collection|**TODO: Add Description**|
|roleAssignments|[governanceRoleAssignment](../resources/governanceroleassignment.md) collection|**TODO: Add Description**|
|roleDefinitions|[governanceRoleDefinition](../resources/governanceroledefinition.md) collection|**TODO: Add Description**|
|roleSettings|[governanceRoleSetting](../resources/governancerolesetting.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.privilegedAccess",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.privilegedAccess",
  "id": "String (identifier)",
  "displayName": "String"
}
```

