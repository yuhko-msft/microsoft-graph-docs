---
title: "Create privilegedAccess"
description: "Create a new privilegedAccess object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create privilegedAccess
Namespace: microsoft.graph



Create a new [privilegedAccess](../resources/privilegedaccess.md) object.

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
POST /privilegedAccess
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [privilegedAccess](../resources/privilegedaccess.md) object.

The following table shows the properties that are required when you create the [privilegedAccess](../resources/privilegedaccess.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [privilegedAccess](../resources/privilegedaccess.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_privilegedaccess_from_privilegedaccess"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/privilegedAccess
Content-Type: application/json
Content-length: 86

{
  "@odata.type": "#microsoft.graph.privilegedAccess",
  "displayName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.privilegedAccess"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.privilegedAccess",
  "id": "98870b0f-0b0f-9887-0f0b-87980f0b8798",
  "displayName": "String"
}
```

