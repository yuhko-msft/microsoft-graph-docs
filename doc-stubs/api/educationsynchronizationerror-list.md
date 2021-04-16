---
title: "List educationSynchronizationErrors"
description: "Get a list of the educationSynchronizationError objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List educationSynchronizationErrors
Namespace: microsoft.graph



Get a list of the [educationSynchronizationError](../resources/educationsynchronizationerror.md) objects and their properties.

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
GET /education/synchronizationProfiles/{educationSynchronizationProfileId}/errors
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

If successful, this method returns a `200 OK` response code and a collection of [educationSynchronizationError](../resources/educationsynchronizationerror.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_educationsynchronizationerror"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/education/synchronizationProfiles/{educationSynchronizationProfileId}/errors
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.educationSynchronizationError)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
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
  ]
}
```

