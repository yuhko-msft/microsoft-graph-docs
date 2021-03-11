---
title: "Update connectionOperation"
description: "Update the properties of a connectionOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update connectionOperation
Namespace: microsoft.graph.externalConnectors



Update the properties of a [connectionOperation](../resources/externalconnectors-connectionoperation.md) object.

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
PATCH /connections/{connectionsId}/operations/{connectionOperationId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [connectionOperation](../resources/externalconnectors-connectionoperation.md) object.

The following table shows the properties that are required when you update the [connectionOperation](../resources/externalconnectors-connectionoperation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|status|connectionOperationStatus|**TODO: Add Description**. Possible values are: `unspecified`, `inprogress`, `completed`, `failed`, `unknownFutureValue`.|
|error|[publicError](../resources/externalconnectors-publicerror.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [connectionOperation](../resources/externalconnectors-connectionoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_connectionoperation"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/connections/{connectionsId}/operations/{connectionOperationId}
Content-Type: application/json
Content-length: 173

{
  "@odata.type": "#microsoft.graph.externalConnectors.connectionOperation",
  "status": "String",
  "error": {
    "@odata.type": "microsoft.graph.publicError"
  }
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
  "@odata.type": "#microsoft.graph.externalConnectors.connectionOperation",
  "id": "4187f93b-f93b-4187-3bf9-87413bf98741",
  "status": "String",
  "error": {
    "@odata.type": "microsoft.graph.publicError"
  }
}
```

