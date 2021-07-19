---
title: "Create identity"
description: "Create a new identity object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create identity
Namespace: microsoft.graph.externalConnectors



Create a new identity object.

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
POST /connections/{connectionsId}/groups/{externalGroupId}/members
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [identity](../resources/externalconnectors-identity.md) object.

The following table shows the properties that are required when you create the [identity](../resources/externalconnectors-identity.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/externalconnectors-entity.md)|
|type|identityType|**TODO: Add Description**. Possible values are: `user`, `group`, `externalGroup`, `unknownFutureValue`.|



## Response

If successful, this method returns a `201 Created` response code and an [identity](../resources/externalconnectors-identity.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_identity_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/connections/{connectionsId}/groups/{externalGroupId}/members
Content-Type: application/json
Content-length: 90

{
  "@odata.type": "#microsoft.graph.externalConnectors.identity",
  "type": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.externalConnectors.identity"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.externalConnectors.identity",
  "id": "1bfc0609-0609-1bfc-0906-fc1b0906fc1b",
  "type": "String"
}
```

