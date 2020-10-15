---
title: "Create settings"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create settings

Namespace: microsoft.graph

Create a new groupSetting object.

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

In the request body, supply JSON representation of the [groupSetting](../resources/-groupsetting.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a groupSetting object.

| Property    | Type                                                    | Description |
| :---------- | :------------------------------------------------------ | :---------- |
| displayName | String                                                  |             |
| id          | String                                                  | Read-only.  |
| templateId  | String                                                  |             |
| values      | [settingValue](../resources/settingvalue.md) collection |             |

## Response

If successful, this method returns a `201 Created` response code and a groupSetting object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_settings"
}
-->

```http
POST https://graph.microsoft.com/v1.0

Content-Type: application/json
Content-Length: 312

[
  {
    "@odata.type": "#microsoft.graph.groupSetting",
    "displayName": "String",
    "id": "String(identifier)",
    "templateId": "String",
    "values": [
      {
        "@odata.type": "#microsoft.graph.settingValue",
        "name": "String",
        "value": "String"
      }
    ]
  }
]

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "$(this.ReturnTypeFullName)"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": [
  {
    "@odata.type": "#microsoft.graph.groupSetting",
    "displayName": "String",
    "id": "String(identifier)",
    "templateId": "String",
    "values": [
      {
        "@odata.type": "#microsoft.graph.settingValue",
        "name": "String",
        "value": "String"
      }
    ]
  }
]
}

```
