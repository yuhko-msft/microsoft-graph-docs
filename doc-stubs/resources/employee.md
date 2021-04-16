---
title: "employee resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# employee resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List employees](../api/employee-list.md)|[employee](../resources/employee.md) collection|Get a list of the [employee](../resources/employee.md) objects and their properties.|
|[Create employee](../api/employee-create.md)|[employee](../resources/employee.md)|Create a new [employee](../resources/employee.md) object.|
|[Get employee](../api/employee-get.md)|[employee](../resources/employee.md)|Read the properties and relationships of an [employee](../resources/employee.md) object.|
|[Update employee](../api/employee-update.md)|[employee](../resources/employee.md)|Update the properties of an [employee](../resources/employee.md) object.|
|[Delete employee](../api/employee-delete.md)|None|Deletes an [employee](../resources/employee.md) object.|
|[List picture](../api/employee-list-picture.md)|[picture](../resources/picture.md) collection|Get the picture resources from the picture navigation property.|
|[Create picture](../api/employee-post-picture.md)|[picture](../resources/picture.md)|Create a new picture object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|address|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
|birthDate|Date|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|email|String|**TODO: Add Description**|
|employmentDate|Date|**TODO: Add Description**|
|givenName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|jobTitle|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|middleName|String|**TODO: Add Description**|
|mobilePhone|String|**TODO: Add Description**|
|number|String|**TODO: Add Description**|
|personalEmail|String|**TODO: Add Description**|
|phoneNumber|String|**TODO: Add Description**|
|statisticsGroupCode|String|**TODO: Add Description**|
|status|String|**TODO: Add Description**|
|surname|String|**TODO: Add Description**|
|terminationDate|Date|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|picture|[picture](../resources/picture.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.employee",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.employee",
  "id": "String (identifier)",
  "address": {
    "@odata.type": "microsoft.graph.postalAddressType"
  },
  "birthDate": "Date",
  "displayName": "String",
  "email": "String",
  "employmentDate": "Date",
  "givenName": "String",
  "jobTitle": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "middleName": "String",
  "mobilePhone": "String",
  "number": "String",
  "personalEmail": "String",
  "phoneNumber": "String",
  "statisticsGroupCode": "String",
  "status": "String",
  "surname": "String",
  "terminationDate": "Date"
}
```

