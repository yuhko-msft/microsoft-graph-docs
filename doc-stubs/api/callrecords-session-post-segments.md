---
title: "Create segment"
description: "Create a new segment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create segment
Namespace: microsoft.graph.callRecords

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new segment object.

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
POST /communications/callRecords/{callRecordId}/sessions/{sessionId}/segments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [segment](../resources/callrecords-segment.md) object.

The following table shows the properties that are required when you create the [segment](../resources/callrecords-segment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/callrecords-entity.md)|
|callee|[microsoft.graph.callRecords.endpoint](../resources/callrecords-endpoint.md)|**TODO: Add Description**|
|caller|[microsoft.graph.callRecords.endpoint](../resources/callrecords-endpoint.md)|**TODO: Add Description**|
|endDateTime|DateTimeOffset|**TODO: Add Description**|
|failureInfo|[microsoft.graph.callRecords.failureInfo](../resources/callrecords-failureinfo.md)|**TODO: Add Description**|
|media|[microsoft.graph.callRecords.media](../resources/callrecords-media.md) collection|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [segment](../resources/callrecords-segment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_segment_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/communications/callRecords/{callRecordId}/sessions/{sessionId}/segments
Content-Type: application/json
Content-length: 483

{
  "@odata.type": "#microsoft.graph.callRecords.segment",
  "callee": {
    "@odata.type": "microsoft.graph.callRecords.endpoint"
  },
  "caller": {
    "@odata.type": "microsoft.graph.callRecords.endpoint"
  },
  "endDateTime": "String (timestamp)",
  "failureInfo": {
    "@odata.type": "microsoft.graph.callRecords.failureInfo"
  },
  "media": [
    {
      "@odata.type": "microsoft.graph.callRecords.media"
    }
  ],
  "startDateTime": "String (timestamp)"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.callRecords.segment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.callRecords.segment",
  "id": "e7eaf109-f109-e7ea-09f1-eae709f1eae7",
  "callee": {
    "@odata.type": "microsoft.graph.callRecords.endpoint"
  },
  "caller": {
    "@odata.type": "microsoft.graph.callRecords.endpoint"
  },
  "endDateTime": "String (timestamp)",
  "failureInfo": {
    "@odata.type": "microsoft.graph.callRecords.failureInfo"
  },
  "media": [
    {
      "@odata.type": "microsoft.graph.callRecords.media"
    }
  ],
  "startDateTime": "String (timestamp)"
}
```

