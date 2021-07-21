---
title: "Update session"
description: "Update the properties of a session object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update session
Namespace: microsoft.graph.callRecords

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [session](../resources/callrecords-session.md) object.

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
PATCH /communications/callRecords/{callRecordId}/sessions/{sessionId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [session](../resources/callrecords-session.md) object.

The following table shows the properties that are required when you update the [session](../resources/callrecords-session.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/callrecords-entity.md)|
|callee|[microsoft.graph.callRecords.endpoint](../resources/callrecords-endpoint.md)|**TODO: Add Description**|
|caller|[microsoft.graph.callRecords.endpoint](../resources/callrecords-endpoint.md)|**TODO: Add Description**|
|endDateTime|DateTimeOffset|**TODO: Add Description**|
|failureInfo|[microsoft.graph.callRecords.failureInfo](../resources/callrecords-failureinfo.md)|**TODO: Add Description**|
|modalities|modality collection|**TODO: Add Description**. Possible values are: `audio`, `video`, `videoBasedScreenSharing`, `data`, `screenSharing`, `unknownFutureValue`.|
|startDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [session](../resources/callrecords-session.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_session"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/communications/callRecords/{callRecordId}/sessions/{sessionId}
Content-Type: application/json
Content-length: 430

{
  "@odata.type": "#microsoft.graph.callRecords.session",
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
  "modalities": [
    "String"
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
  "@odata.type": "#microsoft.graph.callRecords.session",
  "id": "152993d3-93d3-1529-d393-2915d3932915",
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
  "modalities": [
    "String"
  ],
  "startDateTime": "String (timestamp)"
}
```

