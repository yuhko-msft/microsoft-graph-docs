---
title: "Employee resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# Employee resource type

Namespace: microsoft.graph.linkedIn

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|academicTitle|String|**TODO: Add Description**|
|addressBookDifferentiator|String|**TODO: Add Description**|
|addressBookTitle|String|**TODO: Add Description**|
|buildingName|String|**TODO: Add Description**|
|businessCardTitle|String|**TODO: Add Description**|
|businessGroup|String|**TODO: Add Description**|
|companyCode|String|**TODO: Add Description**|
|companyName|String|**TODO: Add Description**|
|costCenterName|String|**TODO: Add Description**|
|discipline|String|**TODO: Add Description**|
|emailAlias|String|**TODO: Add Description**|
|employeeType|String|**TODO: Add Description**|
|firstName|String|**TODO: Add Description**|
|fullEmailAddress|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|lastName|String|**TODO: Add Description**|
|member|String|**TODO: Add Description**|
|middleInitial|String|**TODO: Add Description**|
|nameSuffix|String|**TODO: Add Description**|
|personnelStatus|String|**TODO: Add Description**|
|positionNumber|String|**TODO: Add Description**|
|positionStatus|String|**TODO: Add Description**|
|positionType|String|**TODO: Add Description**|
|positionTypeId|String|**TODO: Add Description**|
|preferredFirstName|String|**TODO: Add Description**|
|preferredLastName|String|**TODO: Add Description**|
|preferredName|String|**TODO: Add Description**|
|profession|String|**TODO: Add Description**|
|profile|[EmployeeProfile](../resources/linkedin-employeeprofile.md)|**TODO: Add Description**|
|qualifier1|String|**TODO: Add Description**|
|qualifier2|String|**TODO: Add Description**|
|salutation|String|**TODO: Add Description**|
|standardTitle|String|**TODO: Add Description**|
|telephoneCountryCode|String|**TODO: Add Description**|
|telephoneNumber|String|**TODO: Add Description**|
|userPreferences|[EmployeeUserPreferences](../resources/linkedin-employeeuserpreferences.md)|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|vacantPositionIndicator|Boolean|**TODO: Add Description**|
|workCity|String|**TODO: Add Description**|
|workCountryCode|String|**TODO: Add Description**|
|workCountryName|String|**TODO: Add Description**|
|workRegion|String|**TODO: Add Description**|
|workRoom|String|**TODO: Add Description**|
|workSpaceType|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.linkedIn.Employee"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.linkedIn.Employee",
  "id": "String (identifier)",
  "member": "String",
  "academicTitle": "String",
  "addressBookDifferentiator": "String",
  "addressBookTitle": "String",
  "buildingName": "String",
  "businessCardTitle": "String",
  "businessGroup": "String",
  "companyCode": "String",
  "companyName": "String",
  "costCenterName": "String",
  "discipline": "String",
  "emailAlias": "String",
  "employeeType": "String",
  "firstName": "String",
  "fullEmailAddress": "String",
  "lastName": "String",
  "middleInitial": "String",
  "nameSuffix": "String",
  "personnelStatus": "String",
  "positionNumber": "String",
  "positionStatus": "String",
  "positionType": "String",
  "positionTypeId": "String",
  "preferredFirstName": "String",
  "preferredLastName": "String",
  "preferredName": "String",
  "profession": "String",
  "qualifier1": "String",
  "qualifier2": "String",
  "salutation": "String",
  "standardTitle": "String",
  "telephoneCountryCode": "String",
  "telephoneNumber": "String",
  "userPrincipalName": "String",
  "vacantPositionIndicator": "Boolean",
  "workCity": "String",
  "workCountryCode": "String",
  "workCountryName": "String",
  "workRegion": "String",
  "workRoom": "String",
  "workSpaceType": "String",
  "userPreferences": {
    "@odata.type": "microsoft.graph.linkedIn.EmployeeUserPreferences"
  },
  "profile": {
    "@odata.type": "microsoft.graph.linkedIn.EmployeeProfile"
  }
}
```

