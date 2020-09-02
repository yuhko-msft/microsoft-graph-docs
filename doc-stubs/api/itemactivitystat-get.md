---
title: "Get itemActivityStat"
description: "Read the properties and relationships of an itemActivityStat object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get itemActivityStat
Namespace: microsoft.graph

Read the properties and relationships of an [itemActivityStat](../resources/itemactivitystat.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
GET /drive/activities/{itemActivityOLDId}/driveItem/analytics/allTime
GET /drive/activities/{itemActivityOLDId}/driveItem/analytics/lastSevenDays
GET /drives/{drivesId}/activities/{itemActivityOLDId}/driveItem/analytics/allTime
GET /drives/{drivesId}/activities/{itemActivityOLDId}/driveItem/analytics/lastSevenDays
GET /drive/activities/{itemActivityOLDId}/driveItem/analytics/itemActivityStats/{itemActivityStatId}
GET /drives/{drivesId}/activities/{itemActivityOLDId}/driveItem/analytics/itemActivityStats/{itemActivityStatId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and an [itemActivityStat](../resources/itemactivitystat.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_itemactivitystat"
}
-->
``` http
GET https://graph.microsoft.com/beta/drive/activities/{itemActivityOLDId}/driveItem/analytics/allTime
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.itemActivityStat"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.itemActivityStat",
    "id": "3ee0ba41-ba41-3ee0-41ba-e03e41bae03e",
    "startDateTime": "String (timestamp)",
    "endDateTime": "String (timestamp)",
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
    "move": {
      "@odata.type": "microsoft.graph.itemActionStat"
    },
    "isTrending": "Boolean",
    "incompleteData": {
      "@odata.type": "microsoft.graph.incompleteData"
    }
  }
}
```

