---
title: "Create extensionProperty"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create extensionProperty

Namespace: microsoft.graph

Create a new extensionProperty object.

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

In the request body, supply JSON representation of the [extensionProperty](../resources/-extensionproperty.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an extensionProperty object.

| Property               | Type              | Description |
| :--------------------- | :---------------- | :---------- |
| appDisplayName         | String            |             |
| dataType               | String            |             |
| isSyncedFromOnPremises | Boolean           |             |
| name                   | String            |             |
| targetObjects          | String collection |             |

## Response

If successful, this method returns a `201 Created` response code and an extensionProperty object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_extensionproperty"
}
-->

```http
POST https://graph.microsoft.com/v1.0/applications/{id}/extensionProperties/{id}

Content-Type: application/json
Content-Length: 258

{
  "@odata.type": "#microsoft.graph.extensionProperty",
  "appDisplayName": "String",
  "dataType": "String",
  "deletedDateTime": "DateTimeOffset",
  "isSyncedFromOnPremises": "Boolean",
  "name": "String",
  "targetObjects": [
    "String"
  ]
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.extensionProperty"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.extensionProperty",
  "appDisplayName": "String",
  "dataType": "String",
  "deletedDateTime": "DateTimeOffset",
  "id": "String(identifier)",
  "isSyncedFromOnPremises": "Boolean",
  "name": "String",
  "targetObjects": [
    "String"
  ]
}
}

```
