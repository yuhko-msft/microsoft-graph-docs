---
title: "companyInformation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# companyInformation resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List companyInformations](../api/companyinformation-list.md)|[companyInformation](../resources/companyinformation.md) collection|Get a list of the [companyInformation](../resources/companyinformation.md) objects and their properties.|
|[Create companyInformation](../api/companyinformation-create.md)|[companyInformation](../resources/companyinformation.md)|Create a new [companyInformation](../resources/companyinformation.md) object.|
|[Get companyInformation](../api/companyinformation-get.md)|[companyInformation](../resources/companyinformation.md)|Read the properties and relationships of a [companyInformation](../resources/companyinformation.md) object.|
|[Update companyInformation](../api/companyinformation-update.md)|[companyInformation](../resources/companyinformation.md)|Update the properties of a [companyInformation](../resources/companyinformation.md) object.|
|[Delete companyInformation](../api/companyinformation-delete.md)|None|Deletes a [companyInformation](../resources/companyinformation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|address|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
|currencyCode|String|**TODO: Add Description**|
|currentFiscalYearStartDate|Date|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|email|String|**TODO: Add Description**|
|faxNumber|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|industry|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|phoneNumber|String|**TODO: Add Description**|
|picture|Stream|**TODO: Add Description**|
|taxRegistrationNumber|String|**TODO: Add Description**|
|website|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.companyInformation",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.companyInformation",
  "id": "String (identifier)",
  "address": {
    "@odata.type": "microsoft.graph.postalAddressType"
  },
  "currencyCode": "String",
  "currentFiscalYearStartDate": "Date",
  "displayName": "String",
  "email": "String",
  "faxNumber": "String",
  "industry": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "phoneNumber": "String",
  "picture": "Stream",
  "taxRegistrationNumber": "String",
  "website": "String"
}
```

