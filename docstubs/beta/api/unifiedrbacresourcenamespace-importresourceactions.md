---
title: "unifiedrbacresourcenamespace : importResourceActions"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# unifiedrbacresourcenamespace : importResourceActions

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

| Permission type                        | Permissions (from most to least privileged) |
| :------------------------------------- | :------------------------------------------ |
| Delegated (work or school account)     |                                             |
| Delegated (personal Microsoft account) |                                             |
| Application                            |                                             |

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->

```http

```

## Request headers

| Name          | Description                 |
| :------------ | :-------------------------- |
| Authorization | Bearer {token}. Required.   |
| Content-Type  | application/json. Required. |

## Request Body

In the request body, supply JSON representation of the parameters.

<!-- Actions and Functions -->

The following table shows the parameters that can be used with this method.

| Parameter                  | Type    | Description |
| :------------------------- | :------ | :---------- |
| format                     | String  |             |
| value                      | String  |             |
| overwriteResourceNamespace | Boolean |             |

<!-- CRUD Methods -->

## Response

If successful, this method returns a `200 Ok` response code and an unifiedRbacResourceNamespace object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "unifiedrbacresourcenamespace_importresourceactions"
}
-->

```http
POST https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 91

{
  "@odata.type": "#microsoft.graph.unifiedRbacResourceNamespace",
  "name": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.EnterpriseRbac.unifiedRbacResourceNamespace"
}
-->

```http
HTTP 1.1 200 Ok

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.unifiedRbacResourceNamespace",
  "id": "String(identifier)",
  "name": "String"
}
}

```
