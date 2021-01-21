---
title: "Create entity"
description: "Create a new entity object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create entity
Namespace: microsoft.graph

Create a new [entity](../resources/entity.md) object.

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
POST ** Collection URI for microsoft.compliance.ediscovery.contract.entity not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [entity](../resources/entity.md) object.

The following table shows the properties that are required when you create the [entity](../resources/entity.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [entity](../resources/entity.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_entity_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.compliance.ediscovery.contract.entity not found
Content-Type: application/json
Content-length: 73

{
  "@odata.type": "#microsoft.compliance.ediscovery.contract.entity"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.compliance.ediscovery.contract.entity"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.compliance.ediscovery.contract.entity",
  "id": "e799838a-838a-e799-8a83-99e78a8399e7"
}
```

