---
title: "Update teamsAppDefinition"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update teamsAppDefinition

Namespace: microsoft.graph

Update the properties of a teamsAppDefinition object.

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

In the request body, supply JSON representation of the [teamsAppDefinition](../resources/-teamsappdefinition.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a teamsAppDefinition object.

| Property    | Type   | Description |
| :---------- | :----- | :---------- |
| displayName | String |             |
| id          | String | Read-only.  |
| teamsAppId  | String |             |
| version     | String |             |

## Response

If successful, this method returns a `200 OK` response code and a teamsAppDefinition object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_teamsappdefinition"
}
-->

```http
PATCH https://graph.microsoft.com/v1.0/appCatalogs/teamsApps/{id}/appDefinitions/{id}

Content-Type: application/json
Content-Length: 139

{
  "@odata.type": "#microsoft.graph.teamsAppDefinition",
  "displayName": "String",
  "teamsAppId": "String",
  "version": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Teams.GraphSvc.teamsAppDefinition"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.teamsAppDefinition",
  "displayName": "String",
  "id": "String(identifier)",
  "teamsAppId": "String",
  "version": "String"
}
}

```
