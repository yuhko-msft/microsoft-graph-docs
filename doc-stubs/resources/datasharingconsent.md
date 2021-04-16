---
title: "dataSharingConsent resource type"
description: "Data sharing consent information."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# dataSharingConsent resource type

Namespace: microsoft.graph



Data sharing consent information.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List dataSharingConsents](../api/datasharingconsent-list.md)|[dataSharingConsent](../resources/datasharingconsent.md) collection|Get a list of the [dataSharingConsent](../resources/datasharingconsent.md) objects and their properties.|
|[Create dataSharingConsent](../api/datasharingconsent-create.md)|[dataSharingConsent](../resources/datasharingconsent.md)|Create a new [dataSharingConsent](../resources/datasharingconsent.md) object.|
|[Get dataSharingConsent](../api/datasharingconsent-get.md)|[dataSharingConsent](../resources/datasharingconsent.md)|Read the properties and relationships of a [dataSharingConsent](../resources/datasharingconsent.md) object.|
|[Update dataSharingConsent](../api/datasharingconsent-update.md)|[dataSharingConsent](../resources/datasharingconsent.md)|Update the properties of a [dataSharingConsent](../resources/datasharingconsent.md) object.|
|[Delete dataSharingConsent](../api/datasharingconsent-delete.md)|None|Deletes a [dataSharingConsent](../resources/datasharingconsent.md) object.|
|[consentToDataSharing](../api/datasharingconsent-consenttodatasharing.md)|[dataSharingConsent](../resources/datasharingconsent.md)|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|grantDateTime|DateTimeOffset|The time consent was granted for this account|
|granted|Boolean|The granted state for the data sharing consent|
|grantedByUpn|String|The Upn of the user that granted consent for this account|
|grantedByUserId|String|The UserId of the user that granted consent for this account|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|serviceDisplayName|String|The display name of the service work flow|
|termsUrl|String|The TermsUrl for the data sharing consent|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.dataSharingConsent",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.dataSharingConsent",
  "id": "String (identifier)",
  "grantDateTime": "String (timestamp)",
  "granted": "Boolean",
  "grantedByUpn": "String",
  "grantedByUserId": "String",
  "serviceDisplayName": "String",
  "termsUrl": "String"
}
```

