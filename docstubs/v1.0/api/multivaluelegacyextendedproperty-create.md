---
title: "Create multiValueLegacyExtendedProperty"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create multiValueLegacyExtendedProperty

Namespace: microsoft.graph

Create a new multiValueLegacyExtendedProperty object.

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

In the request body, supply JSON representation of the [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a multiValueLegacyExtendedProperty object.

| Property | Type              | Description |
| :------- | :---------------- | :---------- |
| id       | String            | Read-only.  |
| value    | String collection |             |

## Response

If successful, this method returns a `201 Created` response code and a multiValueLegacyExtendedProperty object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_multivaluelegacyextendedproperty"
}
-->

```http
POST https://graph.microsoft.com/v1.0/users/{id}/calendar/multiValueExtendedProperties/{id}

Content-Type: application/json
Content-Length: 108

{
  "@odata.type": "#microsoft.graph.multiValueLegacyExtendedProperty",
  "value": [
    "String"
  ]
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.OutlookServices.multiValueLegacyExtendedProperty"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.multiValueLegacyExtendedProperty",
  "id": "String(identifier)",
  "value": [
    "String"
  ]
}
}

```
