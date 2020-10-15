---
title: "Create teamsAppDefinition"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create teamsAppDefinition

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new teamsAppDefinition object.

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

| Property                                       | Type                                       | Description |
| :--------------------------------------------- | :----------------------------------------- | :---------- |
| azureADAppId                                   | String                                     |             |
| createdBy                                      | [identitySet](../resources/identityset.md) |             |
| description                                    | String                                     |             |
| displayName                                    | String                                     |             |
| id                                             | String                                     | Read-only.  |
| lastModifiedDateTime                           | DateTimeOffset                             |             |
| publishingState                                | String                                     |             |
| requiredResourceSpecificApplicationPermissions | String collection                          |             |
| shortdescription                               | String                                     |             |
| teamsAppId                                     | String                                     |             |
| version                                        | String                                     |             |

## Response

If successful, this method returns a `201 Created` response code and a teamsAppDefinition object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_teamsappdefinition"
}
-->

```http
POST https://graph.microsoft.com/beta/appCatalogs/teamsApps/{id}/appDefinitions/{id}

Content-Type: application/json
Content-Length: 885

{
  "@odata.type": "#microsoft.graph.teamsAppDefinition",
  "azureADAppId": "String",
  "createdBy": {
    "@odata.type": "#microsoft.graph.identitySet",
    "application": {
      "@odata.type": "#microsoft.graph.identity",
      "displayName": "String",
      "id": "String(identifier)"
    },
    "device": {
      "@odata.type": "#microsoft.graph.identity",
      "displayName": "String",
      "id": "String(identifier)"
    },
    "user": {
      "@odata.type": "#microsoft.graph.identity",
      "displayName": "String",
      "id": "String(identifier)"
    }
  },
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "DateTimeOffset",
  "publishingState": "String",
  "requiredResourceSpecificApplicationPermissions": [
    "String"
  ],
  "shortdescription": "String",
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
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.teamsAppDefinition",
  "azureADAppId": "String",
  "createdBy": {
    "@odata.type": "#microsoft.graph.identitySet",
    "application": {
      "@odata.type": "#microsoft.graph.identity",
      "displayName": "String",
      "id": "String(identifier)"
    },
    "device": {
      "@odata.type": "#microsoft.graph.identity",
      "displayName": "String",
      "id": "String(identifier)"
    },
    "user": {
      "@odata.type": "#microsoft.graph.identity",
      "displayName": "String",
      "id": "String(identifier)"
    }
  },
  "description": "String",
  "displayName": "String",
  "id": "String(identifier)",
  "lastModifiedDateTime": "DateTimeOffset",
  "publishingState": "String",
  "requiredResourceSpecificApplicationPermissions": [
    "String"
  ],
  "shortdescription": "String",
  "teamsAppId": "String",
  "version": "String"
}
}

```
