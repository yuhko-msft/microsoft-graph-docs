---
title: "searchEntity resource type"
description: "A top level object representing the Microsoft Search API endpoint."
localization_priority: Normal
author: "nmoreau"
ms.prod: "search"
doc_type: "resourcePageType"
---

# searchEntity resource type

Namespace: microsoft.graph

A top level object representing the Microsoft Search API endpoint. It does not behave as any other resource in Graph, but serves as an anchor to the [query](../api/search-query.md) action.

[!INCLUDE [search-api-preview](../../includes/search-api-preview-signup.md)]

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[query](../api/search-query.md) |[searchResponse](searchresponse.md) collection | Runs the query specified in the request body.|

## Properties
None.

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.

``` json
{
  
}
```

## Next steps

Explore the [query](../api/search-query.md) action.
