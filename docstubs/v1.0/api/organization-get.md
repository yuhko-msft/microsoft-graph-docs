---
title: "Get organization"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Get organization

Namespace: microsoft.graph

Read the properties and relationships an organization object.

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

If successful, this method returns a `200 OK` response code and an organization object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "get_organization"
}
-->

```http
GET https://graph.microsoft.com/v1.0/organization/{id}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.organization"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.organization",
  "assignedPlans": [
    {
      "@odata.type": "#microsoft.graph.assignedPlan",
      "assignedDateTime": "DateTimeOffset",
      "capabilityStatus": "String",
      "service": "String",
      "servicePlanId": "Guid"
    }
  ],
  "businessPhones": [
    "String"
  ],
  "city": "String",
  "country": "String",
  "countryLetterCode": "String",
  "createdDateTime": "DateTimeOffset",
  "deletedDateTime": "DateTimeOffset",
  "displayName": "String",
  "id": "String(identifier)",
  "marketingNotificationEmails": [
    "String"
  ],
  "onPremisesLastSyncDateTime": "DateTimeOffset",
  "onPremisesSyncEnabled": "Boolean",
  "postalCode": "String",
  "preferredLanguage": "String",
  "privacyProfile": {
    "@odata.type": "#microsoft.graph.privacyProfile",
    "contactEmail": "String",
    "statementUrl": "String"
  },
  "provisionedPlans": [
    {
      "@odata.type": "#microsoft.graph.provisionedPlan",
      "capabilityStatus": "String",
      "provisioningStatus": "String",
      "service": "String"
    }
  ],
  "securityComplianceNotificationMails": [
    "String"
  ],
  "securityComplianceNotificationPhones": [
    "String"
  ],
  "state": "String",
  "street": "String",
  "technicalNotificationMails": [
    "String"
  ],
  "tenantType": "String",
  "verifiedDomains": [
    {
      "@odata.type": "#microsoft.graph.verifiedDomain",
      "capabilities": "String",
      "isDefault": "Boolean",
      "isInitial": "Boolean",
      "name": "String",
      "type": "String"
    }
  ]
}
}

```
