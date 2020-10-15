---
title: "Create stsPolicy"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create stsPolicy

Namespace: microsoft.graph

Create a new stsPolicy object.

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

In the request body, supply JSON representation of the [stsPolicy](../resources/-stspolicy.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a stsPolicy object.

| Property              | Type              | Description |
| :-------------------- | :---------------- | :---------- |
| definition            | String collection |             |
| isOrganizationDefault | Boolean           |             |

## Response

If successful, this method returns a `201 Created` response code and a stsPolicy object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_stspolicy"
}
-->

```http
POST https://graph.microsoft.com/v1.0

Content-Type: application/json
Content-Length: 242

{
  "@odata.type": "#microsoft.graph.activityBasedTimeoutPolicy",
  "definition": [
    "String"
  ],
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "isOrganizationDefault": "Boolean"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.stsPolicy"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.activityBasedTimeoutPolicy",
  "definition": [
    "String"
  ],
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "id": "String(identifier)",
  "isOrganizationDefault": "Boolean"
}
}

```
