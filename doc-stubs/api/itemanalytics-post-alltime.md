---
title: "Add itemActivityStat"
description: "Add allTime by posting to the allTime collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add itemActivityStat
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Add allTime by posting to the allTime collection.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /workbooks/{workbooksId}/activities/{itemActivityOLDId}/listItem/analytics/allTime/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [itemActivityStat](../resources/itemactivitystat.md) object.

The following table shows the properties that are required when you create the [itemActivityStat](../resources/itemactivitystat.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|access|[itemActionStat](../resources/itemactionstat.md)|**TODO: Add Description**|
|create|[itemActionStat](../resources/itemactionstat.md)|**TODO: Add Description**|
|delete|[itemActionStat](../resources/itemactionstat.md)|**TODO: Add Description**|
|edit|[itemActionStat](../resources/itemactionstat.md)|**TODO: Add Description**|
|endDateTime|DateTimeOffset|**TODO: Add Description**|
|incompleteData|[incompleteData](../resources/incompletedata.md)|**TODO: Add Description**|
|isTrending|Boolean|**TODO: Add Description**|
|move|[itemActionStat](../resources/itemactionstat.md)|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `204 No Content` response code and an [itemActivityStat](../resources/itemactivitystat.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_itemactivitystat_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/workbooks/{workbooksId}/activities/{itemActivityOLDId}/listItem/analytics/allTime/$ref
Content-Type: application/json
Content-length: 616

{
  "@odata.type": "#microsoft.graph.itemActivityStat",
  "access": {
    "@odata.type": "microsoft.graph.itemActionStat"
  },
  "create": {
    "@odata.type": "microsoft.graph.itemActionStat"
  },
  "delete": {
    "@odata.type": "microsoft.graph.itemActionStat"
  },
  "edit": {
    "@odata.type": "microsoft.graph.itemActionStat"
  },
  "endDateTime": "String (timestamp)",
  "incompleteData": {
    "@odata.type": "microsoft.graph.incompleteData"
  },
  "isTrending": "Boolean",
  "move": {
    "@odata.type": "microsoft.graph.itemActionStat"
  },
  "startDateTime": "String (timestamp)"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.itemActivityStat"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.itemActivityStat",
  "id": "7ce1fafa-fafa-7ce1-fafa-e17cfafae17c",
  "access": {
    "@odata.type": "microsoft.graph.itemActionStat"
  },
  "create": {
    "@odata.type": "microsoft.graph.itemActionStat"
  },
  "delete": {
    "@odata.type": "microsoft.graph.itemActionStat"
  },
  "edit": {
    "@odata.type": "microsoft.graph.itemActionStat"
  },
  "endDateTime": "String (timestamp)",
  "incompleteData": {
    "@odata.type": "microsoft.graph.incompleteData"
  },
  "isTrending": "Boolean",
  "move": {
    "@odata.type": "microsoft.graph.itemActionStat"
  },
  "startDateTime": "String (timestamp)"
}
```

