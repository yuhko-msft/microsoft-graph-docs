---
title: "office365ActiveUserDetail resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# office365ActiveUserDetail resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List office365ActiveUserDetail](../api/office365activeuserdetail-list.md)|[office365ActiveUserDetail](../resources/office365activeuserdetail.md) collection|Get a list of the [office365ActiveUserDetail](../resources/office365activeuserdetail.md) objects and their properties.|
|[Create office365ActiveUserDetail](../api/office365activeuserdetail-create.md)|[office365ActiveUserDetail](../resources/office365activeuserdetail.md)|Create a new [office365ActiveUserDetail](../resources/office365activeuserdetail.md) object.|
|[Get office365ActiveUserDetail](../api/office365activeuserdetail-get.md)|[office365ActiveUserDetail](../resources/office365activeuserdetail.md)|Read the properties and relationships of an [office365ActiveUserDetail](../resources/office365activeuserdetail.md) object.|
|[Update office365ActiveUserDetail](../api/office365activeuserdetail-update.md)|[office365ActiveUserDetail](../resources/office365activeuserdetail.md)|Update the properties of an [office365ActiveUserDetail](../resources/office365activeuserdetail.md) object.|
|[Delete office365ActiveUserDetail](../api/office365activeuserdetail-delete.md)|None|Deletes an [office365ActiveUserDetail](../resources/office365activeuserdetail.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|assignedProducts|String collection|**TODO: Add Description**|
|deletedDate|Date|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|exchangeLastActivityDate|Date|**TODO: Add Description**|
|exchangeLicenseAssignDate|Date|**TODO: Add Description**|
|hasExchangeLicense|Boolean|**TODO: Add Description**|
|hasOneDriveLicense|Boolean|**TODO: Add Description**|
|hasSharePointLicense|Boolean|**TODO: Add Description**|
|hasSkypeForBusinessLicense|Boolean|**TODO: Add Description**|
|hasTeamsLicense|Boolean|**TODO: Add Description**|
|hasYammerLicense|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isDeleted|Boolean|**TODO: Add Description**|
|oneDriveLastActivityDate|Date|**TODO: Add Description**|
|oneDriveLicenseAssignDate|Date|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|sharePointLastActivityDate|Date|**TODO: Add Description**|
|sharePointLicenseAssignDate|Date|**TODO: Add Description**|
|skypeForBusinessLastActivityDate|Date|**TODO: Add Description**|
|skypeForBusinessLicenseAssignDate|Date|**TODO: Add Description**|
|teamsLastActivityDate|Date|**TODO: Add Description**|
|teamsLicenseAssignDate|Date|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|yammerLastActivityDate|Date|**TODO: Add Description**|
|yammerLicenseAssignDate|Date|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.office365ActiveUserDetail",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.office365ActiveUserDetail",
  "id": "String (identifier)",
  "assignedProducts": [
    "String"
  ],
  "deletedDate": "Date",
  "displayName": "String",
  "exchangeLastActivityDate": "Date",
  "exchangeLicenseAssignDate": "Date",
  "hasExchangeLicense": "Boolean",
  "hasOneDriveLicense": "Boolean",
  "hasSharePointLicense": "Boolean",
  "hasSkypeForBusinessLicense": "Boolean",
  "hasTeamsLicense": "Boolean",
  "hasYammerLicense": "Boolean",
  "isDeleted": "Boolean",
  "oneDriveLastActivityDate": "Date",
  "oneDriveLicenseAssignDate": "Date",
  "reportRefreshDate": "Date",
  "sharePointLastActivityDate": "Date",
  "sharePointLicenseAssignDate": "Date",
  "skypeForBusinessLastActivityDate": "Date",
  "skypeForBusinessLicenseAssignDate": "Date",
  "teamsLastActivityDate": "Date",
  "teamsLicenseAssignDate": "Date",
  "userPrincipalName": "String",
  "yammerLastActivityDate": "Date",
  "yammerLicenseAssignDate": "Date"
}
```

