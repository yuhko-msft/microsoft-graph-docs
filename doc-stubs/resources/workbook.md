---
title: "workbook resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbook resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbooks](../api/workbook-list.md)|[workbook](../resources/workbook.md) collection|Get a list of the [workbook](../resources/workbook.md) objects and their properties.|
|[Create workbook](../api/workbook-create.md)|[workbook](../resources/workbook.md)|Create a new [workbook](../resources/workbook.md) object.|
|[Get workbook](../api/workbook-get.md)|[workbook](../resources/workbook.md)|Read the properties and relationships of a [workbook](../resources/workbook.md) object.|
|[Update workbook](../api/workbook-update.md)|[workbook](../resources/workbook.md)|Update the properties of a [workbook](../resources/workbook.md) object.|
|[Delete workbook](../api/workbook-delete.md)|None|Deletes a [workbook](../resources/workbook.md) object.|
|[closeSession](../api/workbook-closesession.md)|None|**TODO: Add Description**|
|[createSession](../api/workbook-createsession.md)|[workbookSessionInfo](../resources/workbooksessioninfo.md)|**TODO: Add Description**|
|[refreshSession](../api/workbook-refreshsession.md)|None|**TODO: Add Description**|
|[sessionInfoResource](../api/workbook-sessioninforesource.md)|[workbookSessionInfo](../resources/workbooksessioninfo.md)|**TODO: Add Description**|
|[List workbookApplication](../api/workbook-list-application.md)|[workbookApplication](../resources/workbookapplication.md) collection|Get the workbookApplication resources from the application navigation property.|
|[Create workbookApplication](../api/workbook-post-application.md)|[workbookApplication](../resources/workbookapplication.md)|Create a new workbookApplication object.|
|[List comments](../api/workbook-list-comments.md)|[workbookComment](../resources/workbookcomment.md) collection|Get the workbookComment resources from the comments navigation property.|
|[Create workbookComment](../api/workbook-post-comments.md)|[workbookComment](../resources/workbookcomment.md)|Create a new workbookComment object.|
|[List workbookFunctions](../api/workbook-list-functions.md)|[workbookFunctions](../resources/workbookfunctions.md) collection|Get the workbookFunctions resources from the functions navigation property.|
|[Create workbookFunctions](../api/workbook-post-functions.md)|[workbookFunctions](../resources/workbookfunctions.md)|Create a new workbookFunctions object.|
|[List names](../api/workbook-list-names.md)|[workbookNamedItem](../resources/workbooknameditem.md) collection|Get the workbookNamedItem resources from the names navigation property.|
|[Create workbookNamedItem](../api/workbook-post-names.md)|[workbookNamedItem](../resources/workbooknameditem.md)|Create a new workbookNamedItem object.|
|[List operations](../api/workbook-list-operations.md)|[workbookOperation](../resources/workbookoperation.md) collection|Get the workbookOperation resources from the operations navigation property.|
|[Create workbookOperation](../api/workbook-post-operations.md)|[workbookOperation](../resources/workbookoperation.md)|Create a new workbookOperation object.|
|[List tables](../api/workbook-list-tables.md)|[workbookTable](../resources/workbooktable.md) collection|Get the workbookTable resources from the tables navigation property.|
|[Create workbookTable](../api/workbook-post-tables.md)|[workbookTable](../resources/workbooktable.md)|Create a new workbookTable object.|
|[List worksheets](../api/workbook-list-worksheets.md)|[workbookWorksheet](../resources/workbookworksheet.md) collection|Get the workbookWorksheet resources from the worksheets navigation property.|
|[Create workbookWorksheet](../api/workbook-post-worksheets.md)|[workbookWorksheet](../resources/workbookworksheet.md)|Create a new workbookWorksheet object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|application|[workbookApplication](../resources/workbookapplication.md)|**TODO: Add Description**|
|comments|[workbookComment](../resources/workbookcomment.md) collection|**TODO: Add Description**|
|functions|[workbookFunctions](../resources/workbookfunctions.md)|**TODO: Add Description**|
|names|[workbookNamedItem](../resources/workbooknameditem.md) collection|**TODO: Add Description**|
|operations|[workbookOperation](../resources/workbookoperation.md) collection|**TODO: Add Description**|
|tables|[workbookTable](../resources/workbooktable.md) collection|**TODO: Add Description**|
|worksheets|[workbookWorksheet](../resources/workbookworksheet.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbook",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbook",
  "id": "String (identifier)"
}
```

