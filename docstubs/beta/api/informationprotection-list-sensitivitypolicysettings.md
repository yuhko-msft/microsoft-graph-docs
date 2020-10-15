---
title: "List sensitivityPolicySettings"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# List sensitivityPolicySettings

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the sensitivityPolicySettings objects from a sensitivityPolicySettings navigation property.

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

## Optional query parameters

This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers

| Name          | Description               |
| :------------ | :------------------------ |
| Authorization | Bearer {token}. Required. |

## Request Body

<!-- Actions and Functions -->

<!-- CRUD Methods -->

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 Ok` response code and a sensitivityPolicySettings object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "list_sensitivitypolicysettings"
}
-->

```http
GET https://graph.microsoft.com/beta/informationProtection/sensitivityPolicySettings

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.dataClassificationService.contract.sensitivityPolicySettings"
}
-->

```http
HTTP 1.1 200 Ok

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.sensitivityPolicySettings",
  "applicableTo": "String",
  "downgradeSensitivityRequiresJustification": "Boolean",
  "helpWebUrl": "String",
  "id": "String(identifier)",
  "isMandatory": "Boolean"
}
}

```
