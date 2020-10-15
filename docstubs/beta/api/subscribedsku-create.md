---
title: "Create subscribedSku"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create subscribedSku

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new subscribedSku object.

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

In the request body, supply JSON representation of the [subscribedSku](../resources/-subscribedsku.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a subscribedSku object.

| Property         | Type                                                          | Description |
| :--------------- | :------------------------------------------------------------ | :---------- |
| appliesTo        | String                                                        |             |
| capabilityStatus | String                                                        |             |
| consumedUnits    | Int32                                                         |             |
| id               | String                                                        | Read-only.  |
| prepaidUnits     | [licenseUnitsDetail](../resources/licenseunitsdetail.md)      |             |
| servicePlans     | [servicePlanInfo](../resources/serviceplaninfo.md) collection |             |
| skuId            | Guid                                                          |             |
| skuPartNumber    | String                                                        |             |

## Response

If successful, this method returns a `201 Created` response code and a subscribedSku object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_subscribedsku"
}
-->

```http
POST https://graph.microsoft.com/beta/subscribedSkus/{id}

Content-Type: application/json
Content-Length: 590

{
  "@odata.type": "#microsoft.graph.subscribedSku",
  "appliesTo": "String",
  "capabilityStatus": "String",
  "consumedUnits": "Int32",
  "prepaidUnits": {
    "@odata.type": "#microsoft.graph.licenseUnitsDetail",
    "enabled": "Int32",
    "suspended": "Int32",
    "warning": "Int32"
  },
  "servicePlans": [
    {
      "@odata.type": "#microsoft.graph.servicePlanInfo",
      "appliesTo": "String",
      "provisioningStatus": "String",
      "servicePlanId": "Guid",
      "servicePlanName": "String"
    }
  ],
  "skuId": "Guid",
  "skuPartNumber": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.subscribedSku"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.subscribedSku",
  "appliesTo": "String",
  "capabilityStatus": "String",
  "consumedUnits": "Int32",
  "id": "String(identifier)",
  "prepaidUnits": {
    "@odata.type": "#microsoft.graph.licenseUnitsDetail",
    "enabled": "Int32",
    "suspended": "Int32",
    "warning": "Int32"
  },
  "servicePlans": [
    {
      "@odata.type": "#microsoft.graph.servicePlanInfo",
      "appliesTo": "String",
      "provisioningStatus": "String",
      "servicePlanId": "Guid",
      "servicePlanName": "String"
    }
  ],
  "skuId": "Guid",
  "skuPartNumber": "String"
}
}

```
