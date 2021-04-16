---
title: "educationUser resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# educationUser resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List educationUsers](../api/educationuser-list.md)|[educationUser](../resources/educationuser.md) collection|Get a list of the [educationUser](../resources/educationuser.md) objects and their properties.|
|[Create educationUser](../api/educationuser-create.md)|[educationUser](../resources/educationuser.md)|Create a new [educationUser](../resources/educationuser.md) object.|
|[Get educationUser](../api/educationuser-get.md)|[educationUser](../resources/educationuser.md)|Read the properties and relationships of an [educationUser](../resources/educationuser.md) object.|
|[Update educationUser](../api/educationuser-update.md)|[educationUser](../resources/educationuser.md)|Update the properties of an [educationUser](../resources/educationuser.md) object.|
|[Delete educationUser](../api/educationuser-delete.md)|None|Deletes an [educationUser](../resources/educationuser.md) object.|
|[List assignments](../api/educationuser-list-assignments.md)|[educationAssignment](../resources/educationassignment.md) collection|Get the educationAssignment resources from the assignments navigation property.|
|[Create educationAssignment](../api/educationuser-post-assignments.md)|[educationAssignment](../resources/educationassignment.md)|Create a new educationAssignment object.|
|[List rubrics](../api/educationuser-list-rubrics.md)|[educationRubric](../resources/educationrubric.md) collection|Get the educationRubric resources from the rubrics navigation property.|
|[Create educationRubric](../api/educationuser-post-rubrics.md)|[educationRubric](../resources/educationrubric.md)|Create a new educationRubric object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
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
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
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

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[educationAssignment](../resources/educationassignment.md) collection|**TODO: Add Description**|
|classes|[educationClass](../resources/educationclass.md) collection|**TODO: Add Description**|
|rubrics|[educationRubric](../resources/educationrubric.md) collection|**TODO: Add Description**|
|schools|[educationSchool](../resources/educationschool.md) collection|**TODO: Add Description**|
|taughtClasses|[educationClass](../resources/educationclass.md) collection|**TODO: Add Description**|
|user|[user](../resources/user.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.educationUser",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.educationUser",
  "id": "String (identifier)",
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

