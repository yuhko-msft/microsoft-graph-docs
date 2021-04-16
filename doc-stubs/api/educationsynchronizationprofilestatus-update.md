---
title: "Update educationSynchronizationProfileStatus"
description: "Update the properties of an educationSynchronizationProfileStatus object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update educationSynchronizationProfileStatus
Namespace: microsoft.graph



Update the properties of an [educationSynchronizationProfileStatus](../resources/educationsynchronizationprofilestatus.md) object.

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
PATCH /education/synchronizationProfiles/{educationSynchronizationProfileId}/profileStatus
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [educationSynchronizationProfileStatus](../resources/educationsynchronizationprofilestatus.md) object.

The following table shows the properties that are required when you update the [educationSynchronizationProfileStatus](../resources/educationsynchronizationprofilestatus.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastActivityDateTime|DateTimeOffset|**TODO: Add Description**|
|lastSynchronizationDateTime|DateTimeOffset|**TODO: Add Description**|
|status|educationSynchronizationStatus|**TODO: Add Description**. Possible values are: `paused`, `inProgress`, `success`, `error`, `validationError`, `quarantined`, `unknownFutureValue`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [educationSynchronizationProfileStatus](../resources/educationsynchronizationprofilestatus.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_educationsynchronizationprofilestatus"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/education/synchronizationProfiles/{educationSynchronizationProfileId}/profileStatus
Content-Type: application/json
Content-length: 207

{
  "@odata.type": "#microsoft.graph.educationSynchronizationProfileStatus",
  "lastActivityDateTime": "String (timestamp)",
  "lastSynchronizationDateTime": "String (timestamp)",
  "status": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.educationSynchronizationProfileStatus",
  "id": "3bf5529f-529f-3bf5-9f52-f53b9f52f53b",
  "lastActivityDateTime": "String (timestamp)",
  "lastSynchronizationDateTime": "String (timestamp)",
  "status": "String"
}
```

