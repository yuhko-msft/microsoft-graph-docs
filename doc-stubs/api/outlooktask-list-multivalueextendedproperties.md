---
title: "List multiValueExtendedProperties"
description: "Get the multiValueLegacyExtendedProperty resources from the multiValueExtendedProperties navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List multiValueExtendedProperties
Namespace: microsoft.graph



Get the multiValueLegacyExtendedProperty resources from the multiValueExtendedProperties navigation property.

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
GET /users/{usersId}/outlook/taskFolders/{outlookTaskFolderId}/tasks/{outlookTaskId}/multiValueExtendedProperties
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

If successful, this method returns a `200 OK` response code and a collection of [multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_multivaluelegacyextendedproperty"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/users/{usersId}/outlook/taskFolders/{outlookTaskFolderId}/tasks/{outlookTaskId}/multiValueExtendedProperties
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.multiValueLegacyExtendedProperty)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.multiValueLegacyExtendedProperty",
      "id": "7035f0ad-f0ad-7035-adf0-3570adf03570",
      "value": [
        "String"
      ]
    }
  ]
}
```

