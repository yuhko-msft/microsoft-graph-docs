---
title: "Create domainDnsSrvRecord"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create domainDnsSrvRecord

Namespace: microsoft.graph

Create a new domainDnsSrvRecord object.

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

In the request body, supply JSON representation of the [domainDnsSrvRecord](../resources/-domaindnssrvrecord.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a domainDnsSrvRecord object.

| Property   | Type   | Description |
| :--------- | :----- | :---------- |
| nameTarget | String |             |
| port       | Int32  |             |
| priority   | Int32  |             |
| protocol   | String |             |
| service    | String |             |
| weight     | Int32  |             |

## Response

If successful, this method returns a `201 Created` response code and a domainDnsSrvRecord object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_domaindnssrvrecord"
}
-->

```http
POST https://graph.microsoft.com/v1.0

Content-Type: application/json
Content-Length: 331

{
  "@odata.type": "#microsoft.graph.domainDnsSrvRecord",
  "isOptional": "Boolean",
  "label": "String",
  "nameTarget": "String",
  "port": "Int32",
  "priority": "Int32",
  "protocol": "String",
  "recordType": "String",
  "service": "String",
  "supportedService": "String",
  "ttl": "Int32",
  "weight": "Int32"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.domainDnsSrvRecord"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.domainDnsSrvRecord",
  "id": "String(identifier)",
  "isOptional": "Boolean",
  "label": "String",
  "nameTarget": "String",
  "port": "Int32",
  "priority": "Int32",
  "protocol": "String",
  "recordType": "String",
  "service": "String",
  "supportedService": "String",
  "ttl": "Int32",
  "weight": "Int32"
}
}

```
