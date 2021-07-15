---
title: "Update segment"
description: "Update the properties of a segment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update segment
Namespace: microsoft.graph.callRecords

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [segment](../resources/callrecords-segment.md) object.

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
PATCH /communications/callRecords/{callRecordId}/sessions/{sessionId}/segments/{segmentId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [segment](../resources/callrecords-segment.md) object.

The following table shows the properties that are required when you update the [segment](../resources/callrecords-segment.md).

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

If successful, this method returns a `200 OK` response code and an updated [segment](../resources/callrecords-segment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_segment"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/communications/callRecords/{callRecordId}/sessions/{sessionId}/segments/{segmentId}
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
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

