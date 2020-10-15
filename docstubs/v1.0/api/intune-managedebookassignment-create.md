---
title: "Create managedEBookAssignment"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create managedEBookAssignment

Namespace: microsoft.graph

Create a new managedEBookAssignment object.

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

In the request body, supply JSON representation of the [managedEBookAssignment](../resources/intune-managedebookassignment.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a managedEBookAssignment object.

| Property      | Type                                                                                             | Description                      |
| :------------ | :----------------------------------------------------------------------------------------------- | :------------------------------- |
| id            | String                                                                                           | Key of the entity. Read-only.    |
| installIntent | String                                                                                           | The install intent for eBook.    |
| target        | [deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md) | The assignment target for eBook. |

## Response

If successful, this method returns a `201 Created` response code and a managedEBookAssignment object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_managedebookassignment"
}
-->

```http
POST https://graph.microsoft.com/v1.0/deviceAppManagement/managedEBooks/{id}/assignments/{id}

Content-Type: application/json
Content-Length: 187

{
  "@odata.type": "#microsoft.graph.managedEBookAssignment",
  "installIntent": "String",
  "target": {
    "@odata.type": "#microsoft.graph.allLicensedUsersAssignmentTarget"
  }
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.managedEBookAssignment"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.managedEBookAssignment",
  "id": "String(identifier)",
  "installIntent": "String",
  "target": {
    "@odata.type": "#microsoft.graph.allLicensedUsersAssignmentTarget"
  }
}
}

```
