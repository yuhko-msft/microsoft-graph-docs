---
title: "governanceRoleAssignment resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# governanceRoleAssignment resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List governanceRoleAssignments](../api/governanceroleassignment-list.md)|[governanceRoleAssignment](../resources/governanceroleassignment.md) collection|Get a list of the [governanceRoleAssignment](../resources/governanceroleassignment.md) objects and their properties.|
|[Create governanceRoleAssignment](../api/governanceroleassignment-post-governanceroleassignments.md)|[governanceRoleAssignment](../resources/governanceroleassignment.md)|Create a new [governanceRoleAssignment](../resources/governanceroleassignment.md) object.|
|[Get governanceRoleAssignment](../api/governanceroleassignment-get.md)|[governanceRoleAssignment](../resources/governanceroleassignment.md)|Read the properties and relationships of a [governanceRoleAssignment](../resources/governanceroleassignment.md) object.|
|[Update governanceRoleAssignment](../api/governanceroleassignment-update.md)|[governanceRoleAssignment](../resources/governanceroleassignment.md)|Update the properties of a [governanceRoleAssignment](../resources/governanceroleassignment.md) object.|
|[Delete governanceRoleAssignment](../api/governanceroleassignment-delete.md)|None|Deletes a [governanceRoleAssignment](../resources/governanceroleassignment.md) object.|
|[export](../api/governanceroleassignment-export.md)|String collection|**TODO: Add Description**|
|[List governanceRoleAssignment](../api/governanceroleassignment-list-linkedeligibleroleassignment.md)|[governanceRoleAssignment](../resources/governanceroleassignment.md) collection|Get the governanceRoleAssignment resources from the linkedEligibleRoleAssignment navigation property.|
|[Add governanceRoleAssignment](../api/governanceroleassignment-post-linkedeligibleroleassignment.md)|[governanceRoleAssignment](../resources/governanceroleassignment.md)|Add linkedEligibleRoleAssignment by posting to the linkedEligibleRoleAssignment collection.|
|[List governanceResource](../api/governanceroleassignment-list-resource.md)|[governanceResource](../resources/governanceresource.md) collection|Get the governanceResource resources from the resource navigation property.|
|[Create governanceResource](../api/governanceroleassignment-post-resource.md)|[governanceResource](../resources/governanceresource.md)|Create a new governanceResource object.|
|[List governanceRoleDefinition](../api/governanceroleassignment-list-roledefinition.md)|[governanceRoleDefinition](../resources/governanceroledefinition.md) collection|Get the governanceRoleDefinition resources from the roleDefinition navigation property.|
|[Create governanceRoleDefinition](../api/governanceroleassignment-post-roledefinition.md)|[governanceRoleDefinition](../resources/governanceroledefinition.md)|Create a new governanceRoleDefinition object.|
|[List governanceSubject](../api/governanceroleassignment-list-subject.md)|[governanceSubject](../resources/governancesubject.md) collection|Get the governanceSubject resources from the subject navigation property.|
|[Create governanceSubject](../api/governanceroleassignment-post-subject.md)|[governanceSubject](../resources/governancesubject.md)|Create a new governanceSubject object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|assignmentState|String|**TODO: Add Description**|
|endDateTime|DateTimeOffset|**TODO: Add Description**|
|externalId|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|linkedEligibleRoleAssignmentId|String|**TODO: Add Description**|
|memberType|String|**TODO: Add Description**|
|resourceId|String|**TODO: Add Description**|
|roleDefinitionId|String|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description**|
|status|String|**TODO: Add Description**|
|subjectId|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|linkedEligibleRoleAssignment|[governanceRoleAssignment](../resources/governanceroleassignment.md)|**TODO: Add Description**|
|resource|[governanceResource](../resources/governanceresource.md)|**TODO: Add Description**|
|roleDefinition|[governanceRoleDefinition](../resources/governanceroledefinition.md)|**TODO: Add Description**|
|subject|[governanceSubject](../resources/governancesubject.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.governanceRoleAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.governanceRoleAssignment",
  "id": "String (identifier)",
  "assignmentState": "String",
  "endDateTime": "String (timestamp)",
  "externalId": "String",
  "linkedEligibleRoleAssignmentId": "String",
  "memberType": "String",
  "resourceId": "String",
  "roleDefinitionId": "String",
  "startDateTime": "String (timestamp)",
  "status": "String",
  "subjectId": "String"
}
```

