---
title: "Create organization"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create organization

Namespace: microsoft.graph

Create a new organization object.

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

In the request body, supply JSON representation of the [organization](../resources/-organization.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an organization object.

| Property                             | Type                                                          | Description |
| :----------------------------------- | :------------------------------------------------------------ | :---------- |
| assignedPlans                        | [assignedPlan](../resources/assignedplan.md) collection       |             |
| businessPhones                       | String collection                                             |             |
| city                                 | String                                                        |             |
| country                              | String                                                        |             |
| countryLetterCode                    | String                                                        |             |
| createdDateTime                      | DateTimeOffset                                                |             |
| displayName                          | String                                                        |             |
| marketingNotificationEmails          | String collection                                             |             |
| onPremisesLastSyncDateTime           | DateTimeOffset                                                |             |
| onPremisesSyncEnabled                | Boolean                                                       |             |
| postalCode                           | String                                                        |             |
| preferredLanguage                    | String                                                        |             |
| privacyProfile                       | [privacyProfile](../resources/privacyprofile.md)              |             |
| provisionedPlans                     | [provisionedPlan](../resources/provisionedplan.md) collection |             |
| securityComplianceNotificationMails  | String collection                                             |             |
| securityComplianceNotificationPhones | String collection                                             |             |
| state                                | String                                                        |             |
| street                               | String                                                        |             |
| technicalNotificationMails           | String collection                                             |             |
| tenantType                           | String                                                        |             |
| verifiedDomains                      | [verifiedDomain](../resources/verifieddomain.md) collection   |             |

## Response

If successful, this method returns a `201 Created` response code and an organization object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_organization"
}
-->

```http
POST https://graph.microsoft.com/v1.0/organization/{id}

Content-Type: application/json
Content-Length: 1581

{
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
HTTP 1.1 201 Created

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
