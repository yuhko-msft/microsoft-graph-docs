---
title: "Create informationProtectionLabel"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create informationProtectionLabel

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new informationProtectionLabel object.

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

In the request body, supply JSON representation of the [informationProtectionLabel](../resources/-informationprotectionlabel.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an informationProtectionLabel object.

| Property    | Type                                                     | Description |
| :---------- | :------------------------------------------------------- | :---------- |
| color       | String                                                   |             |
| description | String                                                   |             |
| id          | String                                                   | Read-only.  |
| isActive    | Boolean                                                  |             |
| name        | String                                                   |             |
| parent      | [parentLabelDetails](../resources/parentlabeldetails.md) |             |
| sensitivity | Int32                                                    |             |
| tooltip     | String                                                   |             |

## Response

If successful, this method returns a `201 Created` response code and an informationProtectionLabel object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_informationprotectionlabel"
}
-->

```http
POST https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 1803

{
  "@odata.type": "#microsoft.graph.informationProtectionLabel",
  "color": "String",
  "description": "String",
  "isActive": "Boolean",
  "name": "String",
  "parent": {
    "@odata.type": "#microsoft.graph.parentLabelDetails",
    "color": "String",
    "description": "String",
    "id": "String(identifier)",
    "isActive": "Boolean",
    "name": "String",
    "parent": {
      "@odata.type": "#microsoft.graph.parentLabelDetails",
      "color": "String",
      "description": "String",
      "id": "String(identifier)",
      "isActive": "Boolean",
      "name": "String",
      "parent": {
        "@odata.type": "#microsoft.graph.parentLabelDetails",
        "color": "String",
        "description": "String",
        "id": "String(identifier)",
        "isActive": "Boolean",
        "name": "String",
        "parent": {
          "@odata.type": "#microsoft.graph.parentLabelDetails",
          "color": "String",
          "description": "String",
          "id": "String(identifier)",
          "isActive": "Boolean",
          "name": "String",
          "parent": {
            "@odata.type": "#microsoft.graph.parentLabelDetails",
            "color": "String",
            "description": "String",
            "id": "String(identifier)",
            "isActive": "Boolean",
            "name": "String",
            "parent": {},
            "sensitivity": "Int32",
            "tooltip": "String"
          },
          "sensitivity": "Int32",
          "tooltip": "String"
        },
        "sensitivity": "Int32",
        "tooltip": "String"
      },
      "sensitivity": "Int32",
      "tooltip": "String"
    },
    "sensitivity": "Int32",
    "tooltip": "String"
  },
  "sensitivity": "Int32",
  "tooltip": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.informationProtection.informationProtectionLabel"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.informationProtectionLabel",
  "color": "String",
  "description": "String",
  "id": "String(identifier)",
  "isActive": "Boolean",
  "name": "String",
  "parent": {
    "@odata.type": "#microsoft.graph.parentLabelDetails",
    "color": "String",
    "description": "String",
    "id": "String(identifier)",
    "isActive": "Boolean",
    "name": "String",
    "parent": {
      "@odata.type": "#microsoft.graph.parentLabelDetails",
      "color": "String",
      "description": "String",
      "id": "String(identifier)",
      "isActive": "Boolean",
      "name": "String",
      "parent": {
        "@odata.type": "#microsoft.graph.parentLabelDetails",
        "color": "String",
        "description": "String",
        "id": "String(identifier)",
        "isActive": "Boolean",
        "name": "String",
        "parent": {
          "@odata.type": "#microsoft.graph.parentLabelDetails",
          "color": "String",
          "description": "String",
          "id": "String(identifier)",
          "isActive": "Boolean",
          "name": "String",
          "parent": {
            "@odata.type": "#microsoft.graph.parentLabelDetails",
            "color": "String",
            "description": "String",
            "id": "String(identifier)",
            "isActive": "Boolean",
            "name": "String",
            "parent": {},
            "sensitivity": "Int32",
            "tooltip": "String"
          },
          "sensitivity": "Int32",
          "tooltip": "String"
        },
        "sensitivity": "Int32",
        "tooltip": "String"
      },
      "sensitivity": "Int32",
      "tooltip": "String"
    },
    "sensitivity": "Int32",
    "tooltip": "String"
  },
  "sensitivity": "Int32",
  "tooltip": "String"
}
}

```
