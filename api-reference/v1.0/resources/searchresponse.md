---
title: "searchResponse resource type"
description: "Description of the searchResponse"
localization_priority: Normal
author: "nmoreau"
ms.prod: "search"
doc_type: "resourcePageType"
---

# searchResponse resource type

Namespace: microsoft.graph

Represents results from a search query, and the terms used for the query.

## Properties

| Property     | Type        | Description |
|:-------------|:------------|:------------|
|hitsContainers|[searchHitsContainer](searchhitscontainer.md) collection|A collection of search results.|
|searchTerms|String collection|Contains the search terms sent in the initial search query.|

## JSON representation

The following is a JSON representation of the resource.

```json
{
  "hitsContainers": [{"@odata.type": "microsoft.graph.searchHitsContainer"}],
  "searchTerms": ["String"]
}
```