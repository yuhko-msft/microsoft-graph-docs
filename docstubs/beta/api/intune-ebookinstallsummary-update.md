---
title: "Update eBookInstallSummary"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update eBookInstallSummary

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an eBookInstallSummary object.

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

In the request body, supply JSON representation of the [eBookInstallSummary](../resources/intune-ebookinstallsummary.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an eBookInstallSummary object.

| Property                | Type   | Description                                                                  |
| :---------------------- | :----- | :--------------------------------------------------------------------------- |
| failedDeviceCount       | Int32  | Number of Devices that have failed to install this book.                     |
| failedUserCount         | Int32  | Number of Users that have 1 or more device that failed to install this book. |
| id                      | String | Key of the entity. Read-only.                                                |
| installedDeviceCount    | Int32  | Number of Devices that have successfully installed this book.                |
| installedUserCount      | Int32  | Number of Users whose devices have all succeeded to install this book.       |
| notInstalledDeviceCount | Int32  | Number of Devices that does not have this book installed.                    |
| notInstalledUserCount   | Int32  | Number of Users that did not install this book.                              |

## Response

If successful, this method returns a `200 OK` response code and an eBookInstallSummary object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_ebookinstallsummary"
}
-->

```http
PATCH https://graph.microsoft.com/beta/deviceAppManagement/managedEBooks/{id}/installSummary

Content-Type: application/json
Content-Length: 271

{
  "@odata.type": "#microsoft.graph.eBookInstallSummary",
  "failedDeviceCount": "Int32",
  "failedUserCount": "Int32",
  "installedDeviceCount": "Int32",
  "installedUserCount": "Int32",
  "notInstalledDeviceCount": "Int32",
  "notInstalledUserCount": "Int32"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.eBookInstallSummary"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.eBookInstallSummary",
  "failedDeviceCount": "Int32",
  "failedUserCount": "Int32",
  "id": "String(identifier)",
  "installedDeviceCount": "Int32",
  "installedUserCount": "Int32",
  "notInstalledDeviceCount": "Int32",
  "notInstalledUserCount": "Int32"
}
}

```
