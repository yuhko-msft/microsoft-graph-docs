---
title: "accessPackageAssignmentRequest resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# accessPackageAssignmentRequest resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List accessPackageAssignmentRequests](../api/accesspackageassignmentrequest-list.md)|[accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md) collection|Get a list of the [accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md) objects and their properties.|
|[Create accessPackageAssignmentRequest](../api/accesspackageassignmentrequest-create.md)|[accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md)|Create a new [accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md) object.|
|[Get accessPackageAssignmentRequest](../api/accesspackageassignmentrequest-get.md)|[accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md)|Read the properties and relationships of an [accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md) object.|
|[Update accessPackageAssignmentRequest](../api/accesspackageassignmentrequest-update.md)|[accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md)|Update the properties of an [accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md) object.|
|[Delete accessPackageAssignmentRequest](../api/accesspackageassignmentrequest-delete.md)|None|Deletes an [accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md) object.|
|[cancel](../api/accesspackageassignmentrequest-cancel.md)|None|**TODO: Add Description**|
|[filterByCurrentUser](../api/accesspackageassignmentrequest-filterbycurrentuser.md)|[accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md) collection|**TODO: Add Description**|
|[List accessPackage](../api/accesspackageassignmentrequest-list-accesspackage.md)|[accessPackage](../resources/accesspackage.md) collection|Get the accessPackage resources from the accessPackage navigation property.|
|[Add accessPackage](../api/accesspackageassignmentrequest-post-accesspackage.md)|[accessPackage](../resources/accesspackage.md)|Add accessPackage by posting to the accessPackage collection.|
|[List accessPackageAssignment](../api/accesspackageassignmentrequest-list-accesspackageassignment.md)|[accessPackageAssignment](../resources/accesspackageassignment.md) collection|Get the accessPackageAssignment resources from the accessPackageAssignment navigation property.|
|[Create accessPackageAssignment](../api/accesspackageassignmentrequest-post-accesspackageassignment.md)|[accessPackageAssignment](../resources/accesspackageassignment.md)|Create a new accessPackageAssignment object.|
|[List accessPackageSubject](../api/accesspackageassignmentrequest-list-requestor.md)|[accessPackageSubject](../resources/accesspackagesubject.md) collection|Get the accessPackageSubject resources from the requestor navigation property.|
|[Create accessPackageSubject](../api/accesspackageassignmentrequest-post-requestor.md)|[accessPackageSubject](../resources/accesspackagesubject.md)|Create a new accessPackageSubject object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|answers|[accessPackageAnswer](../resources/accesspackageanswer.md) collection|**TODO: Add Description**|
|completedDate|DateTimeOffset|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isValidationOnly|Boolean|**TODO: Add Description**|
|justification|String|**TODO: Add Description**|
|requestState|String|**TODO: Add Description**|
|requestStatus|String|**TODO: Add Description**|
|requestType|String|**TODO: Add Description**|
|schedule|[requestSchedule](../resources/requestschedule.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|accessPackage|[accessPackage](../resources/accesspackage.md)|**TODO: Add Description**|
|accessPackageAssignment|[accessPackageAssignment](../resources/accesspackageassignment.md)|**TODO: Add Description**|
|requestor|[accessPackageSubject](../resources/accesspackagesubject.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.accessPackageAssignmentRequest",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.accessPackageAssignmentRequest",
  "id": "String (identifier)",
  "answers": [
    {
      "@odata.type": "microsoft.graph.accessPackageAnswerString"
    }
  ],
  "completedDate": "String (timestamp)",
  "createdDateTime": "String (timestamp)",
  "expirationDateTime": "String (timestamp)",
  "isValidationOnly": "Boolean",
  "justification": "String",
  "requestState": "String",
  "requestStatus": "String",
  "requestType": "String",
  "schedule": {
    "@odata.type": "microsoft.graph.requestSchedule"
  }
}
```

