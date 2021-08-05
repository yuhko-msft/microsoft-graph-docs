---
title: "searchRequest resource type"
description: "The search request to be sent to the query endpoint. It contains the type of entities expected in the response, the underlying sources, the paging parameters, the fields request and the actual search query."
localization_priority: Normal
author: "nmoreau"
ms.prod: "search"
doc_type: "resourcePageType"
---

# searchRequest resource type

Namespace: microsoft.graph

A search request formatted in a JSON blob. 

The JSON blob contains the types of resources expected in the response, the underlying sources, paging parameters, sort options, requested aggregations and fields, and actual search query. See [examples](#see-also) of search requests on various resources.

> [!NOTE]
> Be aware of [known limitations](search-api-overview.md#known-limitations) on searching specific combinations of entity types, and sorting or aggregating search results.


## Properties

| Property     | Type        | Description |
|:-------------|:------------|:------------|
|contentSources|String collection|Contains the connection to be targeted.|
|enableTopResults|Boolean|This triggers hybrid sort for messages : the first 3 messages are the most relevant. This property is only applicable to entityType=`message`. Optional.|
|entityTypes|entityType collection| One or more types of resources expected in the response. Possible values are: `list`, `site`, `listItem`, `message`, `event`, `drive`, `driveItem`, `externalItem`. See [known limitations](search-api-overview.md#known-limitations) for those combinations of two or more entity types that are supported in the same search request. Required.|
|fields|String collection |Contains the fields to be returned for each resource object specified in **entityTypes**, allowing customization of the fields returned by default otherwise, including additional fields such as custom managed properties from SharePoint and OneDrive, or custom fields in **externalItem** from content that Microsoft Graph connectors bring in. <br>The fields property can be using the [semantic labels](https://docs.microsoft.com/microsoftsearch/configure-connector#step-5-assign-property-labels) applied to properties. For example, if a property is label as title, you can retrieve it using the following syntax : label_title.<br>Optional.|
|resultTemplateOptions|[resultTemplateOption](resultTemplateOption.md) collection|Provides the search result templates options for rendering connectors search results.|

## JSON representation

The following is a JSON representation of the resource.

```json
{
  "entityTypes": ["String"],
  "contentSources": ["String"],
  "query": {"@odata.type": "microsoft.graph.searchQuery"},
  "from": 1024,
  "size": 1024,
  "fields": ["String"],
  "enableTopResults": true,
  "resultTemplateOptions": [{"@odata.type": "microsoft.graph.resultTemplateOption"}]  
}
```

## See also
- Search [mail messages](/graph/search-concept-messages)
- Search [calendar events](/graph/search-concept-events)
- Search content in SharePoint and OneDrive ([files, lists and sites](/graph/search-concept-files))
- Search [custom types imported using connectors](/graph/search-concept-custom-types) data
- Use [display layout](/graph/search-concept-display-layout.md)


<!-- uuid: 16cd6b66-4b1a-43a1-adaf-3a886856ed98
2019-02-04 14:57:30 UTC -->
<!-- {
  "type": "#page.annotation",
  "description": "searchRequest resource",
  "keywords": "",
  "section": "documentation",
  "tocPath": ""
}-->


