---
title: "user : reprocessLicenseAssignment"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# user : reprocessLicenseAssignment

Namespace: microsoft.graph

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

<!-- Actions and Functions -->

<!-- CRUD Methods -->

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 Ok` response code and a user object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "user_reprocesslicenseassignment"
}
-->

```http
POST https://graph.microsoft.com/v1.0/me/reprocessLicenseAssignment

Content-Type: application/json
Content-Length: 3906

{
  "@odata.type": "#microsoft.graph.user",
  "accountEnabled": "Boolean",
  "ageGroup": "String",
  "assignedLicenses": [
    {
      "@odata.type": "#microsoft.graph.assignedLicense",
      "disabledPlans": [
        "Guid"
      ],
      "skuId": "Guid"
    }
  ],
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
  "companyName": "String",
  "consentProvidedForMinor": "String",
  "country": "String",
  "createdDateTime": "DateTimeOffset",
  "creationType": "String",
  "deletedDateTime": "DateTimeOffset",
  "department": "String",
  "displayName": "String",
  "employeeId": "String",
  "externalUserState": "String",
  "externalUserStateChangeDateTime": "DateTimeOffset",
  "faxNumber": "String",
  "givenName": "String",
  "identities": [
    {
      "@odata.type": "#microsoft.graph.objectIdentity",
      "issuer": "String",
      "issuerAssignedId": "String",
      "signInType": "String"
    }
  ],
  "imAddresses": [
    "String"
  ],
  "isResourceAccount": "Boolean",
  "jobTitle": "String",
  "lastPasswordChangeDateTime": "DateTimeOffset",
  "legalAgeGroupClassification": "String",
  "licenseAssignmentStates": [
    {
      "@odata.type": "#microsoft.graph.licenseAssignmentState",
      "assignedByGroup": "String",
      "disabledPlans": [
        "Guid"
      ],
      "skuId": "Guid",
      "state": "String"
    }
  ],
  "mail": "String",
  "mailNickname": "String",
  "mobilePhone": "String",
  "officeLocation": "String",
  "onPremisesDistinguishedName": "String",
  "onPremisesDomainName": "String",
  "onPremisesExtensionAttributes": {
    "@odata.type": "#microsoft.graph.onPremisesExtensionAttributes",
    "extensionAttribute1": "String",
    "extensionAttribute10": "String",
    "extensionAttribute11": "String",
    "extensionAttribute12": "String",
    "extensionAttribute13": "String",
    "extensionAttribute14": "String",
    "extensionAttribute15": "String",
    "extensionAttribute2": "String",
    "extensionAttribute3": "String",
    "extensionAttribute4": "String",
    "extensionAttribute5": "String",
    "extensionAttribute6": "String",
    "extensionAttribute7": "String",
    "extensionAttribute8": "String",
    "extensionAttribute9": "String"
  },
  "onPremisesImmutableId": "String",
  "onPremisesLastSyncDateTime": "DateTimeOffset",
  "onPremisesProvisioningErrors": [
    {
      "@odata.type": "#microsoft.graph.onPremisesProvisioningError",
      "category": "String",
      "occurredDateTime": "DateTimeOffset",
      "propertyCausingError": "String",
      "value": "String"
    }
  ],
  "onPremisesSamAccountName": "String",
  "onPremisesSecurityIdentifier": "String",
  "onPremisesSyncEnabled": "Boolean",
  "onPremisesUserPrincipalName": "String",
  "otherMails": [
    "String"
  ],
  "passwordPolicies": "String",
  "passwordProfile": {
    "@odata.type": "#microsoft.graph.passwordProfile",
    "forceChangePasswordNextSignIn": "Boolean",
    "forceChangePasswordNextSignInWithMfa": "Boolean",
    "password": "String"
  },
  "postalCode": "String",
  "preferredLanguage": "String",
  "provisionedPlans": [
    {
      "@odata.type": "#microsoft.graph.provisionedPlan",
      "capabilityStatus": "String",
      "provisioningStatus": "String",
      "service": "String"
    }
  ],
  "proxyAddresses": [
    "String"
  ],
  "showInAddressList": "Boolean",
  "signInSessionsValidFromDateTime": "DateTimeOffset",
  "state": "String",
  "streetAddress": "String",
  "surname": "String",
  "usageLocation": "String",
  "userPrincipalName": "String",
  "userType": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.user"
}
-->

```http
HTTP 1.1 200 Ok

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.user",
  "accountEnabled": "Boolean",
  "ageGroup": "String",
  "assignedLicenses": [
    {
      "@odata.type": "#microsoft.graph.assignedLicense",
      "disabledPlans": [
        "Guid"
      ],
      "skuId": "Guid"
    }
  ],
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
  "companyName": "String",
  "consentProvidedForMinor": "String",
  "country": "String",
  "createdDateTime": "DateTimeOffset",
  "creationType": "String",
  "deletedDateTime": "DateTimeOffset",
  "department": "String",
  "displayName": "String",
  "employeeId": "String",
  "externalUserState": "String",
  "externalUserStateChangeDateTime": "DateTimeOffset",
  "faxNumber": "String",
  "givenName": "String",
  "id": "String(identifier)",
  "identities": [
    {
      "@odata.type": "#microsoft.graph.objectIdentity",
      "issuer": "String",
      "issuerAssignedId": "String",
      "signInType": "String"
    }
  ],
  "imAddresses": [
    "String"
  ],
  "isResourceAccount": "Boolean",
  "jobTitle": "String",
  "lastPasswordChangeDateTime": "DateTimeOffset",
  "legalAgeGroupClassification": "String",
  "licenseAssignmentStates": [
    {
      "@odata.type": "#microsoft.graph.licenseAssignmentState",
      "assignedByGroup": "String",
      "disabledPlans": [
        "Guid"
      ],
      "skuId": "Guid",
      "state": "String"
    }
  ],
  "mail": "String",
  "mailNickname": "String",
  "mobilePhone": "String",
  "officeLocation": "String",
  "onPremisesDistinguishedName": "String",
  "onPremisesDomainName": "String",
  "onPremisesExtensionAttributes": {
    "@odata.type": "#microsoft.graph.onPremisesExtensionAttributes",
    "extensionAttribute1": "String",
    "extensionAttribute10": "String",
    "extensionAttribute11": "String",
    "extensionAttribute12": "String",
    "extensionAttribute13": "String",
    "extensionAttribute14": "String",
    "extensionAttribute15": "String",
    "extensionAttribute2": "String",
    "extensionAttribute3": "String",
    "extensionAttribute4": "String",
    "extensionAttribute5": "String",
    "extensionAttribute6": "String",
    "extensionAttribute7": "String",
    "extensionAttribute8": "String",
    "extensionAttribute9": "String"
  },
  "onPremisesImmutableId": "String",
  "onPremisesLastSyncDateTime": "DateTimeOffset",
  "onPremisesProvisioningErrors": [
    {
      "@odata.type": "#microsoft.graph.onPremisesProvisioningError",
      "category": "String",
      "occurredDateTime": "DateTimeOffset",
      "propertyCausingError": "String",
      "value": "String"
    }
  ],
  "onPremisesSamAccountName": "String",
  "onPremisesSecurityIdentifier": "String",
  "onPremisesSyncEnabled": "Boolean",
  "onPremisesUserPrincipalName": "String",
  "otherMails": [
    "String"
  ],
  "passwordPolicies": "String",
  "passwordProfile": {
    "@odata.type": "#microsoft.graph.passwordProfile",
    "forceChangePasswordNextSignIn": "Boolean",
    "forceChangePasswordNextSignInWithMfa": "Boolean",
    "password": "String"
  },
  "postalCode": "String",
  "preferredLanguage": "String",
  "provisionedPlans": [
    {
      "@odata.type": "#microsoft.graph.provisionedPlan",
      "capabilityStatus": "String",
      "provisioningStatus": "String",
      "service": "String"
    }
  ],
  "proxyAddresses": [
    "String"
  ],
  "showInAddressList": "Boolean",
  "signInSessionsValidFromDateTime": "DateTimeOffset",
  "state": "String",
  "streetAddress": "String",
  "surname": "String",
  "usageLocation": "String",
  "userPrincipalName": "String",
  "userType": "String"
}
}

```
