---
title: "Create educationSynchronizationError"
description: "Create a new educationSynchronizationError object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create educationSynchronizationError
Namespace: microsoft.graph



Create a new educationSynchronizationError object.

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
POST /education/synchronizationProfiles/{educationSynchronizationProfileId}/errors
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [educationSynchronizationError](../resources/educationsynchronizationerror.md) object.

The following table shows the properties that are required when you create the [educationSynchronizationError](../resources/educationsynchronizationerror.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|entryType|String|**TODO: Add Description**|
|errorCode|String|**TODO: Add Description**|
|errorMessage|String|**TODO: Add Description**|
|joiningValue|String|**TODO: Add Description**|
|recordedDateTime|DateTimeOffset|**TODO: Add Description**|
|reportableIdentifier|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [educationSynchronizationError](../resources/educationsynchronizationerror.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_educationsynchronizationerror_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/education/synchronizationProfiles/{educationSynchronizationProfileId}/errors
Content-Type: application/json
Content-length: 263

{
  "@odata.type": "#microsoft.graph.educationSynchronizationError",
  "entryType": "String",
  "errorCode": "String",
  "errorMessage": "String",
  "joiningValue": "String",
  "recordedDateTime": "String (timestamp)",
  "reportableIdentifier": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.educationSynchronizationError"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.educationSynchronizationError",
  "id": "4ccc9a28-9a28-4ccc-289a-cc4c289acc4c",
  "entryType": "String",
  "errorCode": "String",
  "errorMessage": "String",
  "joiningValue": "String",
  "recordedDateTime": "String (timestamp)",
  "reportableIdentifier": "String"
}
```

