---
title: "Update endpoint"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update endpoint

Namespace: microsoft.graph

Update the properties of an endpoint object.

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

In the request body, supply JSON representation of the [endpoint](../resources/-endpoint.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an endpoint object.

| Property           | Type   | Description |
| :----------------- | :----- | :---------- |
| capability         | String |             |
| providerId         | String |             |
| providerName       | String |             |
| providerResourceId | String |             |
| uri                | String |             |

## Response

If successful, this method returns a `200 OK` response code and an endpoint object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_endpoint"
}
-->

```http
PATCH https://graph.microsoft.com/v1.0/servicePrincipals/{id}/endpoints/{id}

Content-Type: application/json
Content-Length: 228

{
  "@odata.type": "#microsoft.graph.endpoint",
  "capability": "String",
  "deletedDateTime": "DateTimeOffset",
  "providerId": "String",
  "providerName": "String",
  "providerResourceId": "String",
  "uri": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.endpoint"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.endpoint",
  "capability": "String",
  "deletedDateTime": "DateTimeOffset",
  "id": "String(identifier)",
  "providerId": "String",
  "providerName": "String",
  "providerResourceId": "String",
  "uri": "String"
}
}

```
