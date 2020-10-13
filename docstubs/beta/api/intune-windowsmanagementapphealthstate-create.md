---
title: "Create windowsManagementAppHealthState"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create windowsManagementAppHealthState

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new windowsManagementAppHealthState object.

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

In the request body, supply JSON representation of the [windowsManagementAppHealthState](../resources/intune-windowsmanagementapphealthstate.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a windowsManagementAppHealthState object.

| Property            | Type           | Description                                                                                           |
| :------------------ | :------------- | :---------------------------------------------------------------------------------------------------- |
| deviceName          | String         | Name of the device on which Windows management app is installed.                                      |
| deviceOSVersion     | String         | Windows 10 OS version of the device on which Windows management app is installed.                     |
| healthState         | String         | Windows management app health state.                                                                  |
| id                  | String         | Unique Identifier for the Windows management app health state. This property is read-only. Read-only. |
| installedVersion    | String         | Windows management app installed version.                                                             |
| lastCheckInDateTime | DateTimeOffset | Windows management app last check-in time.                                                            |

## Response

If successful, this method returns a `201 Created` response code and a windowsManagementAppHealthState object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_windowsmanagementapphealthstate"
}
-->

```http
POST https://graph.microsoft.com/beta/deviceAppManagement/windowsManagementApp/healthStates/{id}

Content-Type: application/json
Content-Length: 237

{
  "@odata.type": "#microsoft.graph.windowsManagementAppHealthState",
  "deviceName": "String",
  "deviceOSVersion": "String",
  "healthState": "String",
  "installedVersion": "String",
  "lastCheckInDateTime": "DateTimeOffset"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.windowsManagementAppHealthState"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.windowsManagementAppHealthState",
  "deviceName": "String",
  "deviceOSVersion": "String",
  "healthState": "String",
  "id": "String(identifier)",
  "installedVersion": "String",
  "lastCheckInDateTime": "DateTimeOffset"
}
}

```
