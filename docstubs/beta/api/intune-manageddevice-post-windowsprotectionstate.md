---
title: "Create windowsProtectionState"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create windowsProtectionState

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new windowsProtectionState object.

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

In the request body, supply JSON representation of the [windowsProtectionState](../resources/intune-windowsprotectionstate.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a windowsProtectionState object.

| Property                       | Type           | Description                                                                                               |
| :----------------------------- | :------------- | :-------------------------------------------------------------------------------------------------------- |
| antiMalwareVersion             | String         | Current anti malware version                                                                              |
| deviceState                    | String         | Computer's state (like clean or pending full scan or pending reboot etc)                                  |
| engineVersion                  | String         | Current endpoint protection engine's version                                                              |
| fullScanOverdue                | Boolean        | Full scan overdue or not?                                                                                 |
| fullScanRequired               | Boolean        | Full scan required or not?                                                                                |
| id                             | String         | The unique Identifier for the device protection status object. This is device id of the device Read-only. |
| lastFullScanDateTime           | DateTimeOffset | Last quick scan datetime                                                                                  |
| lastFullScanSignatureVersion   | String         | Last full scan signature version                                                                          |
| lastQuickScanDateTime          | DateTimeOffset | Last quick scan datetime                                                                                  |
| lastQuickScanSignatureVersion  | String         | Last quick scan signature version                                                                         |
| lastReportedDateTime           | DateTimeOffset | Last device health status reported time                                                                   |
| malwareProtectionEnabled       | Boolean        | Anti malware is enabled or not                                                                            |
| networkInspectionSystemEnabled | Boolean        | Network inspection system enabled or not?                                                                 |
| quickScanOverdue               | Boolean        | Quick scan overdue or not?                                                                                |
| realTimeProtectionEnabled      | Boolean        | Real time protection is enabled or not?                                                                   |
| rebootRequired                 | Boolean        | Reboot required or not?                                                                                   |
| signatureUpdateOverdue         | Boolean        | Signature out of date or not?                                                                             |
| signatureVersion               | String         | Current malware definitions version                                                                       |

## Response

If successful, this method returns a `201 Created` response code and a windowsProtectionState object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_windowsprotectionstate"
}
-->

```http
POST https://graph.microsoft.com/beta/users/{id}/managedDevices/{id}/windowsProtectionState

Content-Type: application/json
Content-Length: 723

{
  "@odata.type": "#microsoft.graph.windowsProtectionState",
  "antiMalwareVersion": "String",
  "deviceState": "String",
  "engineVersion": "String",
  "fullScanOverdue": "Boolean",
  "fullScanRequired": "Boolean",
  "lastFullScanDateTime": "DateTimeOffset",
  "lastFullScanSignatureVersion": "String",
  "lastQuickScanDateTime": "DateTimeOffset",
  "lastQuickScanSignatureVersion": "String",
  "lastReportedDateTime": "DateTimeOffset",
  "malwareProtectionEnabled": "Boolean",
  "networkInspectionSystemEnabled": "Boolean",
  "quickScanOverdue": "Boolean",
  "realTimeProtectionEnabled": "Boolean",
  "rebootRequired": "Boolean",
  "signatureUpdateOverdue": "Boolean",
  "signatureVersion": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.windowsProtectionState"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.windowsProtectionState",
  "antiMalwareVersion": "String",
  "deviceState": "String",
  "engineVersion": "String",
  "fullScanOverdue": "Boolean",
  "fullScanRequired": "Boolean",
  "id": "String(identifier)",
  "lastFullScanDateTime": "DateTimeOffset",
  "lastFullScanSignatureVersion": "String",
  "lastQuickScanDateTime": "DateTimeOffset",
  "lastQuickScanSignatureVersion": "String",
  "lastReportedDateTime": "DateTimeOffset",
  "malwareProtectionEnabled": "Boolean",
  "networkInspectionSystemEnabled": "Boolean",
  "quickScanOverdue": "Boolean",
  "realTimeProtectionEnabled": "Boolean",
  "rebootRequired": "Boolean",
  "signatureUpdateOverdue": "Boolean",
  "signatureVersion": "String"
}
}

```