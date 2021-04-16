---
title: "Update longRunningOperation"
description: "Update the properties of a longRunningOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update longRunningOperation
Namespace: microsoft.graph



Update the properties of a [longRunningOperation](../resources/longrunningoperation.md) object.

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
PATCH /me/authentication/operations/{longRunningOperationId}
PATCH /users/{usersId}/authentication/operations/{longRunningOperationId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [longRunningOperation](../resources/longrunningoperation.md) object.

The following table shows the properties that are required when you update the [longRunningOperation](../resources/longrunningoperation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description**|
|resourceLocation|String|**TODO: Add Description**|
|status|longRunningOperationStatus|**TODO: Add Description**. Possible values are: `notstarted`, `running`, `succeeded`, `failed`.|
|statusDetail|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [longRunningOperation](../resources/longrunningoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_longrunningoperation"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/me/authentication/operations/{longRunningOperationId}
Content-Type: application/json
Content-length: 194

{
  "@odata.type": "#microsoft.graph.longRunningOperation",
  "lastActionDateTime": "String (timestamp)",
  "resourceLocation": "String",
  "status": "String",
  "statusDetail": "String"
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
  "@odata.type": "#microsoft.graph.longRunningOperation",
  "id": "c20b89e0-89e0-c20b-e089-0bc2e0890bc2",
  "createdDateTime": "String (timestamp)",
  "lastActionDateTime": "String (timestamp)",
  "resourceLocation": "String",
  "status": "String",
  "statusDetail": "String"
}
```

