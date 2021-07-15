---
title: "Create session"
description: "Create a new session object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create session
Namespace: microsoft.graph.callRecords

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [session](../resources/callrecords-session.md) object.

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
POST /communications/callRecords/{callRecordId}/sessions
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [session](../resources/callrecords-session.md) object.

The following table shows the properties that are required when you create the [session](../resources/callrecords-session.md).

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

If successful, this method returns a `201 Created` response code and a [session](../resources/callrecords-session.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_session_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/communications/callRecords/{callRecordId}/sessions
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
  "truncated": true,
  "@odata.type": "microsoft.graph.callRecords.session"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.callRecords.session",
  "id": "b1e9cc5f-cc5f-b1e9-5fcc-e9b15fcce9b1",
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

