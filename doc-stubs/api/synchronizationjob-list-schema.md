---
title: "List synchronizationSchema"
description: "Get the synchronizationSchema resources from the schema navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List synchronizationSchema
Namespace: microsoft.graph



Get the synchronizationSchema resources from the schema navigation property.

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
GET /applications/{applicationsId}/synchronization/jobs/{synchronizationJobId}/schema
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

If successful, this method returns a `200 OK` response code and a collection of [synchronizationSchema](../resources/synchronizationschema.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_synchronizationschema"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/applications/{applicationsId}/synchronization/jobs/{synchronizationJobId}/schema
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.synchronizationSchema)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.synchronizationSchema",
      "id": "0b33a958-a958-0b33-58a9-330b58a9330b",
      "synchronizationRules": [
        {
          "@odata.type": "microsoft.graph.synchronizationRule"
        }
      ],
      "version": "String"
    }
  ]
}
```

