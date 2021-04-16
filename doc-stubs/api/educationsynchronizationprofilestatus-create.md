---
title: "Create educationSynchronizationProfileStatus"
description: "Create a new educationSynchronizationProfileStatus object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create educationSynchronizationProfileStatus
Namespace: microsoft.graph



Create a new [educationSynchronizationProfileStatus](../resources/educationsynchronizationprofilestatus.md) object.

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
POST ** Collection URI for microsoft.graph.educationSynchronizationProfileStatus not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [educationSynchronizationProfileStatus](../resources/educationsynchronizationprofilestatus.md) object.

The following table shows the properties that are required when you create the [educationSynchronizationProfileStatus](../resources/educationsynchronizationprofilestatus.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastActivityDateTime|DateTimeOffset|**TODO: Add Description**|
|lastSynchronizationDateTime|DateTimeOffset|**TODO: Add Description**|
|status|educationSynchronizationStatus|**TODO: Add Description**. Possible values are: `paused`, `inProgress`, `success`, `error`, `validationError`, `quarantined`, `unknownFutureValue`.|



## Response

If successful, this method returns a `201 Created` response code and an [educationSynchronizationProfileStatus](../resources/educationsynchronizationprofilestatus.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_educationsynchronizationprofilestatus_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.educationSynchronizationProfileStatus not found
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
  "truncated": true,
  "@odata.type": "microsoft.graph.educationSynchronizationProfileStatus"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.educationSynchronizationProfileStatus",
  "id": "3bf5529f-529f-3bf5-9f52-f53b9f52f53b",
  "lastActivityDateTime": "String (timestamp)",
  "lastSynchronizationDateTime": "String (timestamp)",
  "status": "String"
}
```

