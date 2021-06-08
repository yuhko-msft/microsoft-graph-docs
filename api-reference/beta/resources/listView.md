---
author: krtsoi
description: "The ListView resource represents a view of a list in a site."
ms.date: 06/08/2021
title: ListView
localization_priority: Normal
ms.prod: "sharepoint"
doc_type: resourcePageType
---
# ListView resource

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents a list view of a [list].

## JSON representation

Here is a JSON representation of a **listView** resource.

<!-- {
       "blockType": "resource",
       "baseType": "microsoft.graph.entity",
       "@odata.type": "microsoft.graph.listView",
       "keyProperty": "id"
} -->

```json
{
  "associatedContentType": { "@odata.type": "microsoft.graph.contentType" },
  "columns": { "@odata.type": "microsoft.graph.columnDefinition" },
  "contentType": { "@odata.type": "microsoft.graph.contentTypeInfo" },
  "displayName": "All Items",
  "id": "string",
  "imageUrl": "/_layouts/15/images/generic.png?rev=47",
  "includeRootFolder": true,
  "isDefault": false,
  "isHidden": true,
  "isPersonalView": false,
  "isReadOnly": false,
  "isThreaded": false,
  "publicationLevel": "published | draft | checkout",
  "scope": "Default | Recursive | RecursiveAll | FilesOnly",
  "legacyType": "calendar | chart | gantt | grid | html | recurrence",
  "webUrl": "/Lists/testList/AllItems.aspx",
  "mobile": { "@odata.type": "microsoft.graph.mobileView" },
  "paging": { "@odata.type": "microsoft.graph.pagingView" },
  "tabular": { "@odata.type": "microsoft.graph.tabularView" },
}
```

## Properties

List views can hold data of various types. The following properties indicate what type of data relating to list views, as well as additional settings for that data.

View type-related properties are mutually exclusive -- a list view can only have one of them specified. These properties correspond to SharePoint's [SPViewType] enumeration.

| Property name           | Type    | Description
|:------------------------|:--------|:-----------------------------------------
| **columns**             | [columnDefinition][] | Specifies the collection of columns in the list view.
| **contentType**         | [contentTypeInfo]    | Identifier of the content type with which the view is associated so that the view is available only on folders of this content type.
| **displayName**         | string  | The display name of the list view.
| **id**                  | string  | View identifier of the list view.
| **imageUrl**            | string  | Specifies the URI (Uniform Resource Identifier) of the image for the list view.
| **includeRootFolder**   | boolean | Indicates whether the current folder is displayed in the list view.
| **isDefault**           | boolean | Indicates the list view is the default list view.
| **isHidden**            | boolean | Indicates the list view is hidden.
| **isPersonalView**      | boolean | Indicates the list view is a personal view.
| **isReadOnly**          | boolean | Indicates the list view is a read only view.
| **isThreaded**          | boolean | Indicates the list view is a threaded view.
| **legacyType**          | string  | Specifies the legacy type of the list view. Represents a LegacyViewType value.
| **publicationLevel**    | string  | Indicates the publication level required for file items in order to be displayed in the view. Represents a ListViewLevel value.
| **scope**               | string  | Specifies the scope for the list view. Represents a ListViewScope value.
| **webUrl**              | string  | Specifies the site relative URL of the list view page.
| **mobile**              |[mobileView] | This list supports a mobile view.
| **paging**              |[pagingView] | This list supports displaying items across multiple pages.
| **tabular**             |[tabularView]| This list supports a view that includes bulk selection checkboxes.

### LegacyViewType
| Value          | Description
|:---------------|:-------------------------------------------------------------
| **calendar**   | This list is viewed as a calendar.
| **chart**      | This list is viewed as a chart.
| **gantt**      | This list is viewed as a gantt chart.
| **grid**       | This list is viewed as a data sheet.
| **html**       | This list is viewed as standard HTML.
| **recurrence** | This list displays recurring events.

### ListViewLevel
| Value          | Description
|:---------------|:-------------------------------------------------------------
| **published**  | Current version of the document is published.
| **draft**      | Current version of the document is a draft.
| **checkout**   | Current version of the document is checked out to the current user.
Note: These properties correspond to SharePoint's [SPFileLevel] enumeration.

### ListViewScope
| Value                   | Description
|:------------------------|:--------------------------------------------------------
| **default**             | Default. Show only the files and subfolders of a specific folder.
| **recursiveOnlyFiles**  | Show all files of all folders pane. Corresponds with [SPViewScope].recursive
| **recursiveAll**        | Show all files and all subfolders of all folders.
| **filesOnly**           | Show only the files of a specific folder.
Note: These properties correspond to SharePoint's [SPViewScope] enumeration.

## Relationships

The **listView** resource has the following relationships to other resources.

| Relationship name         | Type          | Description
|:--------------------------|:--------------|:----------------------
| **associatedContentType** | [contentType] | This content type associated with this list view

[columnDefinition]: columnDefinition.md
[contentType]: contentType.md
[contentTypeInfo]: contentTypeInfo.md
[mobileView]: mobileView.md
[pagingView]: pagingView.md
[tabularView]: tabularView.md
[SPFileLevel]: https://docs.microsoft.com/en-us/dotnet/api/microsoft.sharepoint.spfilelevel?view=sharepoint-server
[SPViewScope]: https://docs.microsoft.com/en-us/dotnet/api/microsoft.sharepoint.spviewscope?view=sharepoint-server
[SPViewType]: https://docs.microsoft.com/en-us/dotnet/api/microsoft.sharepoint.spviewcollection.spviewtype?view=sharepoint-server

<!--
{
  "type": "#page.annotation",
  "description": "",
  "keywords": "",
  "section": "documentation",
  "suppressions": [
    "Warning: /docs/rest-api/resources/listView.md:
      Found potential enums in resource example that weren't defined in a table:(published,draft,checkout) are in resource, but () are in table",
      "Warning: /docs/rest-api/resources/listView.md:
      Found potential enums in resource example that weren't defined in a table:(Default,Recursive,RecursiveAll,FilesOnly) are in resource, but () are in table",
      "Warning: /docs/rest-api/resources/listView.md:
      Found potential enums in resource example that weren't defined in a table:(calendar,chart,gantt,grid,html,recurrence) are in resource, but () are in table"
  ],
  "tocPath": "Resources/ListView"
}
-->


