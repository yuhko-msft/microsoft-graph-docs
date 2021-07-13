---
title: "managedEBook resource type"
description: "An abstract class containing the base properties for Managed eBook."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedEBook resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

An abstract class containing the base properties for Managed eBook.
This is an abstract type.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedEBooks](../api/managedebook-list.md)|[managedEBook](../resources/managedebook.md) collection|Get a list of the [managedEBook](../resources/managedebook.md) objects and their properties.|
|[Create managedEBook](../api/managedebook-create.md)|[managedEBook](../resources/managedebook.md)|Create a new [managedEBook](../resources/managedebook.md) object.|
|[Get managedEBook](../api/managedebook-get.md)|[managedEBook](../resources/managedebook.md)|Read the properties and relationships of a [managedEBook](../resources/managedebook.md) object.|
|[Update managedEBook](../api/managedebook-update.md)|[managedEBook](../resources/managedebook.md)|Update the properties of a [managedEBook](../resources/managedebook.md) object.|
|[Delete managedEBook](../api/managedebook-delete.md)|None|Deletes a [managedEBook](../resources/managedebook.md) object.|
|[assign](../api/managedebook-assign.md)|None|**TODO: Add Description**|
|[List assignments](../api/managedebook-list-assignments.md)|[managedEBookAssignment](../resources/managedebookassignment.md) collection|Get the managedEBookAssignment resources from the assignments navigation property.|
|[Create managedEBookAssignment](../api/managedebook-post-assignments.md)|[managedEBookAssignment](../resources/managedebookassignment.md)|Create a new managedEBookAssignment object.|
|[List categories](../api/managedebook-list-categories.md)|[managedEBookCategory](../resources/managedebookcategory.md) collection|Get the managedEBookCategory resources from the categories navigation property.|
|[Add managedEBookCategory](../api/managedebook-post-categories.md)|[managedEBookCategory](../resources/managedebookcategory.md)|Add categories by posting to the categories collection.|
|[List deviceStates](../api/managedebook-list-devicestates.md)|[deviceInstallState](../resources/deviceinstallstate.md) collection|Get the deviceInstallState resources from the deviceStates navigation property.|
|[Create deviceInstallState](../api/managedebook-post-devicestates.md)|[deviceInstallState](../resources/deviceinstallstate.md)|Create a new deviceInstallState object.|
|[List eBookInstallSummary](../api/managedebook-list-installsummary.md)|[eBookInstallSummary](../resources/ebookinstallsummary.md) collection|Get the eBookInstallSummary resources from the installSummary navigation property.|
|[Create eBookInstallSummary](../api/managedebook-post-installsummary.md)|[eBookInstallSummary](../resources/ebookinstallsummary.md)|Create a new eBookInstallSummary object.|
|[List userStateSummary](../api/managedebook-list-userstatesummary.md)|[userInstallStateSummary](../resources/userinstallstatesummary.md) collection|Get the userInstallStateSummary resources from the userStateSummary navigation property.|
|[Create userInstallStateSummary](../api/managedebook-post-userstatesummary.md)|[userInstallStateSummary](../resources/userinstallstatesummary.md)|Create a new userInstallStateSummary object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|The date and time when the eBook file was created.|
|description|String|Description.|
|displayName|String|Name of the eBook.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|informationUrl|String|The more information Url.|
|largeCover|[mimeContent](../resources/mimecontent.md)|Book cover.|
|lastModifiedDateTime|DateTimeOffset|The date and time when the eBook was last modified.|
|privacyInformationUrl|String|The privacy statement Url.|
|publishedDateTime|DateTimeOffset|The date and time when the eBook was published.|
|publisher|String|Publisher.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[managedEBookAssignment](../resources/managedebookassignment.md) collection|The list of assignments for this eBook.|
|categories|[managedEBookCategory](../resources/managedebookcategory.md) collection|The list of categories for this eBook.|
|deviceStates|[deviceInstallState](../resources/deviceinstallstate.md) collection|The list of installation states for this eBook.|
|installSummary|[eBookInstallSummary](../resources/ebookinstallsummary.md)|Mobile App Install Summary.|
|userStateSummary|[userInstallStateSummary](../resources/userinstallstatesummary.md) collection|The list of installation states for this eBook.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedEBook",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedEBook",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "informationUrl": "String",
  "largeCover": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "privacyInformationUrl": "String",
  "publishedDateTime": "String (timestamp)",
  "publisher": "String"
}
```

