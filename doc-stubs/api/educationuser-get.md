---
title: "Get educationUser"
description: "Read the properties and relationships of an educationUser object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get educationUser
Namespace: microsoft.graph



Read the properties and relationships of an [educationUser](../resources/educationuser.md) object.

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
GET /education/me
GET /education/users/{educationUserId}
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

If successful, this method returns a `200 OK` response code and an [educationUser](../resources/educationuser.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_educationuser"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/education/me
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.educationUser"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.educationUser",
    "id": "b520889c-889c-b520-9c88-20b59c8820b5",
    "accountEnabled": "Boolean",
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
    "businessPhones": [
      "String"
    ],
    "createdBy": {
      "@odata.type": "microsoft.graph.identitySet"
    },
    "department": "String",
    "displayName": "String",
    "externalSource": "String",
    "externalSourceDetail": "String",
    "givenName": "String",
    "mail": "String",
    "mailingAddress": {
      "@odata.type": "microsoft.graph.physicalAddress"
    },
    "mailNickname": "String",
    "middleName": "String",
    "mobilePhone": "String",
    "officeLocation": "String",
    "onPremisesInfo": {
      "@odata.type": "microsoft.graph.educationOnPremisesInfo"
    },
    "passwordPolicies": "String",
    "passwordProfile": {
      "@odata.type": "microsoft.graph.passwordProfile"
    },
    "preferredLanguage": "String",
    "primaryRole": "String",
    "provisionedPlans": [
      {
        "@odata.type": "microsoft.graph.provisionedPlan"
      }
    ],
    "refreshTokensValidFromDateTime": "String (timestamp)",
    "relatedContacts": [
      {
        "@odata.type": "microsoft.graph.relatedContact"
      }
    ],
    "residenceAddress": {
      "@odata.type": "microsoft.graph.physicalAddress"
    },
    "showInAddressList": "Boolean",
    "student": {
      "@odata.type": "microsoft.graph.educationStudent"
    },
    "surname": "String",
    "teacher": {
      "@odata.type": "microsoft.graph.educationTeacher"
    },
    "usageLocation": "String",
    "userPrincipalName": "String",
    "userType": "String"
  }
}
```

