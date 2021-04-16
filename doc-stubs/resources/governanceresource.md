---
title: "governanceResource resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# governanceResource resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List governanceResources](../api/governanceresource-list.md)|[governanceResource](../resources/governanceresource.md) collection|Get a list of the [governanceResource](../resources/governanceresource.md) objects and their properties.|
|[Create governanceResource](../api/governanceresource-post-governanceresources.md)|[governanceResource](../resources/governanceresource.md)|Create a new [governanceResource](../resources/governanceresource.md) object.|
|[Get governanceResource](../api/governanceresource-get.md)|[governanceResource](../resources/governanceresource.md)|Read the properties and relationships of a [governanceResource](../resources/governanceresource.md) object.|
|[Update governanceResource](../api/governanceresource-update.md)|[governanceResource](../resources/governanceresource.md)|Update the properties of a [governanceResource](../resources/governanceresource.md) object.|
|[Delete governanceResource](../api/governanceresource-delete.md)|None|Deletes a [governanceResource](../resources/governanceresource.md) object.|
|[register](../api/governanceresource-register.md)|None|**TODO: Add Description**|
|[List governanceResource](../api/governanceresource-list-parent.md)|[governanceResource](../resources/governanceresource.md) collection|Get the governanceResource resources from the parent navigation property.|
|[Create governanceResource](../api/governanceresource-post-parent.md)|[governanceResource](../resources/governanceresource.md)|Create a new governanceResource object.|
|[List roleAssignmentRequests](../api/governanceresource-list-roleassignmentrequests.md)|[governanceRoleAssignmentRequest](../resources/governanceroleassignmentrequest.md) collection|Get the governanceRoleAssignmentRequest resources from the roleAssignmentRequests navigation property.|
|[Create governanceRoleAssignmentRequest](../api/governanceresource-post-roleassignmentrequests.md)|[governanceRoleAssignmentRequest](../resources/governanceroleassignmentrequest.md)|Create a new governanceRoleAssignmentRequest object.|
|[List roleAssignments](../api/governanceresource-list-roleassignments.md)|[governanceRoleAssignment](../resources/governanceroleassignment.md) collection|Get the governanceRoleAssignment resources from the roleAssignments navigation property.|
|[Create governanceRoleAssignment](../api/governanceresource-post-roleassignments.md)|[governanceRoleAssignment](../resources/governanceroleassignment.md)|Create a new governanceRoleAssignment object.|
|[List roleDefinitions](../api/governanceresource-list-roledefinitions.md)|[governanceRoleDefinition](../resources/governanceroledefinition.md) collection|Get the governanceRoleDefinition resources from the roleDefinitions navigation property.|
|[Create governanceRoleDefinition](../api/governanceresource-post-roledefinitions.md)|[governanceRoleDefinition](../resources/governanceroledefinition.md)|Create a new governanceRoleDefinition object.|
|[List roleSettings](../api/governanceresource-list-rolesettings.md)|[governanceRoleSetting](../resources/governancerolesetting.md) collection|Get the governanceRoleSetting resources from the roleSettings navigation property.|
|[Create governanceRoleSetting](../api/governanceresource-post-rolesettings.md)|[governanceRoleSetting](../resources/governancerolesetting.md)|Create a new governanceRoleSetting object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|externalId|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|registeredDateTime|DateTimeOffset|**TODO: Add Description**|
|registeredRoot|String|**TODO: Add Description**|
|status|String|**TODO: Add Description**|
|type|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|parent|[governanceResource](../resources/governanceresource.md)|**TODO: Add Description**|
|roleAssignmentRequests|[governanceRoleAssignmentRequest](../resources/governanceroleassignmentrequest.md) collection|**TODO: Add Description**|
|roleAssignments|[governanceRoleAssignment](../resources/governanceroleassignment.md) collection|**TODO: Add Description**|
|roleDefinitions|[governanceRoleDefinition](../resources/governanceroledefinition.md) collection|**TODO: Add Description**|
|roleSettings|[governanceRoleSetting](../resources/governancerolesetting.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.governanceResource",
  "baseType": "microsoft.graph.entity",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.governanceResource",
  "id": "String (identifier)",
  "displayName": "String",
  "externalId": "String",
  "registeredDateTime": "String (timestamp)",
  "registeredRoot": "String",
  "status": "String",
  "type": "String"
}
```

