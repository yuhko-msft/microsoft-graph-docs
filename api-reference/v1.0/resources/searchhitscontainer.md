---
title: "searchHitsContainer resource type"
description: "Represent the list of search results."
localization_priority: Normal
author: "nmoreau"
ms.prod: "search"
doc_type: "resourcePageType"
---

# searchHitsContainer resource type

Namespace: microsoft.graph

Represent the list of search results.

## Properties

| Property     | Type        | Description |
|:-------------|:------------|:------------|
|hits|[searchHit](searchhit.md) collection|A collection of the search results.|
|moreResultsAvailable|Boolean|Provides information if more results are available. Based on this information, you can adjust the **from** and **size** properties of the [searchRequest](searchrequest.md) accordingly.|
|total|Int32|The total number of results. Note this is not the number of results on the page, but the total number of results satisfying the query.|

## JSON representation

The following is a JSON representation of the resource.

```json
{
  "hits": [{"@odata.type": "microsoft.graph.searchHit"}],
  "moreResultsAvailable": true,
  "total": 1024
}
```