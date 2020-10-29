---
title: "Search"
description: "Retrieve the search resource used to execute queries"
localization_priority: Normal
author: "nmoreau"
ms.prod: "search"
doc_type: "resourcePageType"
---

# Search resource type

Namespace: microsoft.graph

The search resource is the top level object representing the search endpoint. It serves as an anchor to the [query](../api/search-query.md) action.

This resource is not expected to be called as such. Any request on the resource will incur a Bad Request.

## JSON representation

None

## Properties

None

## Relationships

None

## Methods

| Method       | Return Type | Description |
|:-------------|:------------|:------------|
| [query](../api/search-query.md) | [searchResponse](searchresponse.md) Collection| Executes the query specified in the [searchRequest](../resources/searchrequest.md)|