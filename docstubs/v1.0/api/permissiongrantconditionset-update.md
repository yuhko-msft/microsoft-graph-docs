---
title: "Update permissionGrantConditionSet"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update permissionGrantConditionSet

Namespace: microsoft.graph

Update the properties of a permissionGrantConditionSet object.

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

In the request body, supply JSON representation of the [permissionGrantConditionSet](../resources/-permissiongrantconditionset.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a permissionGrantConditionSet object.

| Property                                    | Type              | Description |
| :------------------------------------------ | :---------------- | :---------- |
| clientApplicationIds                        | String collection |             |
| clientApplicationPublisherIds               | String collection |             |
| clientApplicationsFromVerifiedPublisherOnly | Boolean           |             |
| clientApplicationTenantIds                  | String collection |             |
| id                                          | String            | Read-only.  |
| permissionClassification                    | String            |             |
| permissions                                 | String collection |             |
| permissionType                              | String            |             |
| resourceApplication                         | String            |             |

## Response

If successful, this method returns a `200 OK` response code and a permissionGrantConditionSet object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_permissiongrantconditionset"
}
-->

```http
PATCH https://graph.microsoft.com/v1.0

Content-Type: application/json
Content-Length: 440

{
  "@odata.type": "#microsoft.graph.permissionGrantConditionSet",
  "clientApplicationIds": [
    "String"
  ],
  "clientApplicationPublisherIds": [
    "String"
  ],
  "clientApplicationTenantIds": [
    "String"
  ],
  "clientApplicationsFromVerifiedPublisherOnly": "Boolean",
  "permissionClassification": "String",
  "permissionType": "String",
  "permissions": [
    "String"
  ],
  "resourceApplication": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.permissionGrantConditionSet"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.permissionGrantConditionSet",
  "clientApplicationIds": [
    "String"
  ],
  "clientApplicationPublisherIds": [
    "String"
  ],
  "clientApplicationTenantIds": [
    "String"
  ],
  "clientApplicationsFromVerifiedPublisherOnly": "Boolean",
  "id": "String(identifier)",
  "permissionClassification": "String",
  "permissionType": "String",
  "permissions": [
    "String"
  ],
  "resourceApplication": "String"
}
}

```
