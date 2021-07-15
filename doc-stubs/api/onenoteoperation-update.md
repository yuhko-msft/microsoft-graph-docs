---
title: "Update onenoteOperation"
description: "Update the properties of an onenoteOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update onenoteOperation
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [onenoteOperation](../resources/onenoteoperation.md) object.

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
PATCH /me/onenote/operations/{onenoteOperationId}
PATCH /users/{usersId}/onenote/operations/{onenoteOperationId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [onenoteOperation](../resources/onenoteoperation.md) object.

The following table shows the properties that are required when you update the [onenoteOperation](../resources/onenoteoperation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [operation](../resources/operation.md)|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [operation](../resources/operation.md)|
|status|operationStatus|**TODO: Add Description** Inherited from [operation](../resources/operation.md). Possible values are: `NotStarted`, `Running`, `Completed`, `Failed`.|
|error|[onenoteOperationError](../resources/onenoteoperationerror.md)|**TODO: Add Description**|
|percentComplete|String|**TODO: Add Description**|
|resourceId|String|**TODO: Add Description**|
|resourceLocation|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [onenoteOperation](../resources/onenoteoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_onenoteoperation"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/me/onenote/operations/{onenoteOperationId}
Content-Type: application/json
Content-length: 300

{
  "@odata.type": "#microsoft.graph.onenoteOperation",
  "lastActionDateTime": "String (timestamp)",
  "status": "String",
  "error": {
    "@odata.type": "microsoft.graph.onenoteOperationError"
  },
  "percentComplete": "String",
  "resourceId": "String",
  "resourceLocation": "String"
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
  "@odata.type": "#microsoft.graph.onenoteOperation",
  "id": "89aba152-a152-89ab-52a1-ab8952a1ab89",
  "createdDateTime": "String (timestamp)",
  "lastActionDateTime": "String (timestamp)",
  "status": "String",
  "error": {
    "@odata.type": "microsoft.graph.onenoteOperationError"
  },
  "percentComplete": "String",
  "resourceId": "String",
  "resourceLocation": "String"
}
```

