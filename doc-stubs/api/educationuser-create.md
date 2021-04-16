---
title: "Create educationUser"
description: "Create a new educationUser object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create educationUser
Namespace: microsoft.graph



Create a new [educationUser](../resources/educationuser.md) object.

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
POST /education/users
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [educationUser](../resources/educationuser.md) object.

The following table shows the properties that are required when you create the [educationUser](../resources/educationuser.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|accountEnabled|Boolean|**TODO: Add Description**|
|assignedLicenses|[assignedLicense](../resources/assignedlicense.md) collection|**TODO: Add Description**|
|assignedPlans|[assignedPlan](../resources/assignedplan.md) collection|**TODO: Add Description**|
|businessPhones|String collection|**TODO: Add Description**|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|department|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|externalSource|educationExternalSource|**TODO: Add Description**. Possible values are: `sis`, `manual`, `unknownFutureValue`, `lms`.|
|externalSourceDetail|String|**TODO: Add Description**|
|givenName|String|**TODO: Add Description**|
|mail|String|**TODO: Add Description**|
|mailingAddress|[physicalAddress](../resources/physicaladdress.md)|**TODO: Add Description**|
|mailNickname|String|**TODO: Add Description**|
|middleName|String|**TODO: Add Description**|
|mobilePhone|String|**TODO: Add Description**|
|officeLocation|String|**TODO: Add Description**|
|onPremisesInfo|[educationOnPremisesInfo](../resources/educationonpremisesinfo.md)|**TODO: Add Description**|
|passwordPolicies|String|**TODO: Add Description**|
|passwordProfile|[passwordProfile](../resources/passwordprofile.md)|**TODO: Add Description**|
|preferredLanguage|String|**TODO: Add Description**|
|primaryRole|educationUserRole|**TODO: Add Description**. Possible values are: `student`, `teacher`, `none`, `unknownFutureValue`, `faculty`.|
|provisionedPlans|[provisionedPlan](../resources/provisionedplan.md) collection|**TODO: Add Description**|
|refreshTokensValidFromDateTime|DateTimeOffset|**TODO: Add Description**|
|relatedContacts|[relatedContact](../resources/relatedcontact.md) collection|**TODO: Add Description**|
|residenceAddress|[physicalAddress](../resources/physicaladdress.md)|**TODO: Add Description**|
|showInAddressList|Boolean|**TODO: Add Description**|
|student|[educationStudent](../resources/educationstudent.md)|**TODO: Add Description**|
|surname|String|**TODO: Add Description**|
|teacher|[educationTeacher](../resources/educationteacher.md)|**TODO: Add Description**|
|usageLocation|String|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|userType|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [educationUser](../resources/educationuser.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_educationuser_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/education/users
Content-Type: application/json
Content-length: 1684

{
  "@odata.type": "#microsoft.graph.educationUser",
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
HTTP/1.1 201 Created
Content-Type: application/json

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
```

