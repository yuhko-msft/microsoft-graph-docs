---
title: "List user"
description: "Get the user resources from the lastModifiedByUser navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List user
Namespace: microsoft.graph



Get the user resources from the lastModifiedByUser navigation property.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /sites/{sitesId}/pages/{sitePageId}/lastModifiedByUser
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [user](../resources/user.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_user"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/sites/{sitesId}/pages/{sitePageId}/lastModifiedByUser
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.user)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.user",
      "id": "64ed8ef4-8ef4-64ed-f48e-ed64f48eed64",
      "deletedDateTime": "String (timestamp)",
      "aboutMe": "String",
      "accountEnabled": "Boolean",
      "ageGroup": "String",
      "assignedLicenses": [
        {
          "@odata.type": "microsoft.graph.assignedLicense"
        }
      ],
      "assignedPlans": [
        {
          "@odata.type": "microsoft.graph.assignedPlan"
        }
      ],
      "birthday": "String (timestamp)",
      "businessPhones": [
        "String"
      ],
      "city": "String",
      "companyName": "String",
      "consentProvidedForMinor": "String",
      "country": "String",
      "createdDateTime": "String (timestamp)",
      "creationType": "String",
      "customSecurityAttributes": {
        "@odata.type": "microsoft.graph.customSecurityAttributeValue"
      },
      "department": "String",
      "deviceEnrollmentLimit": "Integer",
      "deviceKeys": [
        {
          "@odata.type": "microsoft.graph.deviceKey"
        }
      ],
      "displayName": "String",
      "employeeHireDate": "String (timestamp)",
      "employeeId": "String",
      "employeeOrgData": {
        "@odata.type": "microsoft.graph.employeeOrgData"
      },
      "employeeType": "String",
      "externalUserState": "String",
      "externalUserStateChangeDateTime": "String",
      "faxNumber": "String",
      "givenName": "String",
      "hireDate": "String (timestamp)",
      "identities": [
        {
          "@odata.type": "microsoft.graph.objectIdentity"
        }
      ],
      "imAddresses": [
        "String"
      ],
      "infoCatalogs": [
        "String"
      ],
      "interests": [
        "String"
      ],
      "isManagementRestricted": "Boolean",
      "isResourceAccount": "Boolean",
      "jobTitle": "String",
      "lastPasswordChangeDateTime": "String (timestamp)",
      "legalAgeGroupClassification": "String",
      "licenseAssignmentStates": [
        {
          "@odata.type": "microsoft.graph.licenseAssignmentState"
        }
      ],
      "mail": "String",
      "mailboxSettings": {
        "@odata.type": "microsoft.graph.mailboxSettings"
      },
      "mailNickname": "String",
      "mobilePhone": "String",
      "mySite": "String",
      "officeLocation": "String",
      "onPremisesDistinguishedName": "String",
      "onPremisesDomainName": "String",
      "onPremisesExtensionAttributes": {
        "@odata.type": "microsoft.graph.onPremisesExtensionAttributes"
      },
      "onPremisesImmutableId": "String",
      "onPremisesLastSyncDateTime": "String (timestamp)",
      "onPremisesProvisioningErrors": [
        {
          "@odata.type": "microsoft.graph.onPremisesProvisioningError"
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
        "@odata.type": "microsoft.graph.passwordProfile"
      },
      "pastProjects": [
        "String"
      ],
      "postalCode": "String",
      "preferredDataLocation": "String",
      "preferredLanguage": "String",
      "preferredName": "String",
      "provisionedPlans": [
        {
          "@odata.type": "microsoft.graph.provisionedPlan"
        }
      ],
      "proxyAddresses": [
        "String"
      ],
      "refreshTokensValidFromDateTime": "String (timestamp)",
      "responsibilities": [
        "String"
      ],
      "schools": [
        "String"
      ],
      "showInAddressList": "Boolean",
      "signInActivity": {
        "@odata.type": "microsoft.graph.signInActivity"
      },
      "signInSessionsValidFromDateTime": "String (timestamp)",
      "skills": [
        "String"
      ],
      "state": "String",
      "streetAddress": "String",
      "surname": "String",
      "temporaryAccessPass": {
        "@odata.type": "microsoft.graph.temporaryAccessPass"
      },
      "usageLocation": "String",
      "userPrincipalName": "String",
      "userType": "String"
    }
  ]
}
```

