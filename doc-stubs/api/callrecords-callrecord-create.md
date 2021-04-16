---
title: "Create callRecord"
description: "Create a new callRecord object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create callRecord
Namespace: microsoft.graph.callRecords



Create a new [callRecord](../resources/callrecords-callrecord.md) object.

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
POST /communications/callRecords
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [callRecord](../resources/callrecords-callrecord.md) object.

The following table shows the properties that are required when you create the [callRecord](../resources/callrecords-callrecord.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/callrecords-entity.md)|
|endDateTime|DateTimeOffset|**TODO: Add Description**|
|joinWebUrl|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|modalities|modality collection|**TODO: Add Description**. Possible values are: `audio`, `video`, `videoBasedScreenSharing`, `data`, `screenSharing`, `unknownFutureValue`.|
|organizer|[identitySet](../resources/callrecords-identityset.md)|**TODO: Add Description**|
|participants|[identitySet](../resources/callrecords-identityset.md) collection|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description**|
|type|callType|**TODO: Add Description**. Possible values are: `unknown`, `groupCall`, `peerToPeer`, `unknownFutureValue`.|
|version|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [callRecord](../resources/callrecords-callrecord.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_callrecord_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/communications/callRecords
Content-Type: application/json
Content-length: 425

{
  "@odata.type": "#microsoft.graph.callRecords.callRecord",
  "endDateTime": "String (timestamp)",
  "joinWebUrl": "String",
  "modalities": [
    "String"
  ],
  "organizer": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "participants": [
    {
      "@odata.type": "microsoft.graph.identitySet"
    }
  ],
  "startDateTime": "String (timestamp)",
  "type": "String",
  "version": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.callRecords.callRecord"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.callRecords.callRecord",
  "id": "247861a0-61a0-2478-a061-7824a0617824",
  "endDateTime": "String (timestamp)",
  "joinWebUrl": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "modalities": [
    "String"
  ],
  "organizer": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "participants": [
    {
      "@odata.type": "microsoft.graph.identitySet"
    }
  ],
  "startDateTime": "String (timestamp)",
  "type": "String",
  "version": "Integer"
}
```

