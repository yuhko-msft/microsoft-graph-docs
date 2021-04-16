---
title: "List educationUsers"
description: "Get a list of the educationUser objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List educationUsers
Namespace: microsoft.graph



Get a list of the [educationUser](../resources/educationuser.md) objects and their properties.

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
GET /education/users
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

If successful, this method returns a `200 OK` response code and a collection of [educationUser](../resources/educationuser.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_educationuser"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/education/users
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.educationUser)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
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
  ]
}
```

