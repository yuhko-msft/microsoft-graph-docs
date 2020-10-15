---
title: "Create sublabels"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create sublabels

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new sensitivityLabel object.

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

In the request body, supply JSON representation of the [sensitivityLabel](../resources/-sensitivitylabel.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a sensitivityLabel object.

| Property                    | Type                                                          | Description |
| :-------------------------- | :------------------------------------------------------------ | :---------- |
| applicableTo                | String                                                        |             |
| applicationMode             | String                                                        |             |
| assignedPolicies            | [labelPolicy](../resources/labelpolicy.md) collection         |             |
| autoLabeling                | [autoLabeling](../resources/autolabeling.md)                  |             |
| description                 | String                                                        |             |
| displayName                 | String                                                        |             |
| id                          | String                                                        | Read-only.  |
| isDefault                   | Boolean                                                       |             |
| isEndpointProtectionEnabled | Boolean                                                       |             |
| labelActions                | [labelActionBase](../resources/labelactionbase.md) collection |             |
| name                        | String                                                        |             |
| priority                    | Int32                                                         |             |
| toolTip                     | String                                                        |             |

## Response

If successful, this method returns a `201 Created` response code and a sensitivityLabel object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_sublabels"
}
-->

```http
POST https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 973

[
  {
    "@odata.type": "#microsoft.graph.sensitivityLabel",
    "applicableTo": "String",
    "applicationMode": "String",
    "assignedPolicies": [
      {
        "@odata.type": "#microsoft.graph.labelPolicy",
        "id": "String(identifier)",
        "name": "String"
      }
    ],
    "autoLabeling": {
      "@odata.type": "#microsoft.graph.autoLabeling",
      "message": "String",
      "sensitiveTypeIds": [
        "String"
      ]
    },
    "description": "String",
    "displayName": "String",
    "id": "String(identifier)",
    "isDefault": "Boolean",
    "isEndpointProtectionEnabled": "Boolean",
    "labelActions": [
      {
        "@odata.type": "#microsoft.graph.encryptWithTemplate",
        "availableForEncryption": "Boolean",
        "encryptWith": "String",
        "name": "String",
        "templateId": "String"
      }
    ],
    "name": "String",
    "priority": "Int32",
    "toolTip": "String"
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
    "@odata.type": "#microsoft.graph.sensitivityLabel",
    "applicableTo": "String",
    "applicationMode": "String",
    "assignedPolicies": [
      {
        "@odata.type": "#microsoft.graph.labelPolicy",
        "id": "String(identifier)",
        "name": "String"
      }
    ],
    "autoLabeling": {
      "@odata.type": "#microsoft.graph.autoLabeling",
      "message": "String",
      "sensitiveTypeIds": [
        "String"
      ]
    },
    "description": "String",
    "displayName": "String",
    "id": "String(identifier)",
    "isDefault": "Boolean",
    "isEndpointProtectionEnabled": "Boolean",
    "labelActions": [
      {
        "@odata.type": "#microsoft.graph.encryptWithTemplate",
        "availableForEncryption": "Boolean",
        "encryptWith": "String",
        "name": "String",
        "templateId": "String"
      }
    ],
    "name": "String",
    "priority": "Int32",
    "toolTip": "String"
  }
]
}

```
