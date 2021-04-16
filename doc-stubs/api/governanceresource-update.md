---
title: "Update governanceResource"
description: "Update the properties of a governanceResource object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update governanceResource
Namespace: microsoft.graph



Update the properties of a [governanceResource](../resources/governanceresource.md) object.

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
PATCH /governanceResources/{governanceResourcesId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [governanceResource](../resources/governanceresource.md) object.

The following table shows the properties that are required when you update the [governanceResource](../resources/governanceresource.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|externalId|String|**TODO: Add Description**|
|registeredDateTime|DateTimeOffset|**TODO: Add Description**|
|registeredRoot|String|**TODO: Add Description**|
|status|String|**TODO: Add Description**|
|type|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [governanceResource](../resources/governanceresource.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_governanceresource"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/governanceResources/{governanceResourcesId}
Content-Type: application/json
Content-length: 237

{
  "@odata.type": "#microsoft.graph.governanceResource",
  "displayName": "String",
  "externalId": "String",
  "registeredDateTime": "String (timestamp)",
  "registeredRoot": "String",
  "status": "String",
  "type": "String"
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
  "@odata.type": "#microsoft.graph.governanceResource",
  "id": "8c721898-1898-8c72-9818-728c9818728c",
  "displayName": "String",
  "externalId": "String",
  "registeredDateTime": "String (timestamp)",
  "registeredRoot": "String",
  "status": "String",
  "type": "String"
}
```

