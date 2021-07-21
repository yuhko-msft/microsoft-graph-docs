---
title: "termsAndConditionsAcceptanceStatus resource type"
description: "A termsAndConditionsAcceptanceStatus entity represents the acceptance status of a given Terms and Conditions (TandC) policy by a given user. Users must accept the most up-to-date version of the terms in order to retain access to the Company Portal."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# termsAndConditionsAcceptanceStatus resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A termsAndConditionsAcceptanceStatus entity represents the acceptance status of a given Terms and Conditions (TandC) policy by a given user. Users must accept the most up-to-date version of the terms in order to retain access to the Company Portal.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List termsAndConditionsAcceptanceStatus](../api/termsandconditionsacceptancestatus-list.md)|[termsAndConditionsAcceptanceStatus](../resources/termsandconditionsacceptancestatus.md) collection|Get a list of the [termsAndConditionsAcceptanceStatus](../resources/termsandconditionsacceptancestatus.md) objects and their properties.|
|[Create termsAndConditionsAcceptanceStatus](../api/termsandconditionsacceptancestatus-create.md)|[termsAndConditionsAcceptanceStatus](../resources/termsandconditionsacceptancestatus.md)|Create a new [termsAndConditionsAcceptanceStatus](../resources/termsandconditionsacceptancestatus.md) object.|
|[Get termsAndConditionsAcceptanceStatus](../api/termsandconditionsacceptancestatus-get.md)|[termsAndConditionsAcceptanceStatus](../resources/termsandconditionsacceptancestatus.md)|Read the properties and relationships of a [termsAndConditionsAcceptanceStatus](../resources/termsandconditionsacceptancestatus.md) object.|
|[Update termsAndConditionsAcceptanceStatus](../api/termsandconditionsacceptancestatus-update.md)|[termsAndConditionsAcceptanceStatus](../resources/termsandconditionsacceptancestatus.md)|Update the properties of a [termsAndConditionsAcceptanceStatus](../resources/termsandconditionsacceptancestatus.md) object.|
|[Delete termsAndConditionsAcceptanceStatus](../api/termsandconditionsacceptancestatus-delete.md)|None|Deletes a [termsAndConditionsAcceptanceStatus](../resources/termsandconditionsacceptancestatus.md) object.|
|[List termsAndConditions](../api/termsandconditionsacceptancestatus-list-termsandconditions.md)|[termsAndConditions](../resources/termsandconditions.md) collection|Get the termsAndConditions resources from the termsAndConditions navigation property.|
|[Add termsAndConditions](../api/termsandconditionsacceptancestatus-post-termsandconditions.md)|[termsAndConditions](../resources/termsandconditions.md)|Add termsAndConditions by posting to the termsAndConditions collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|acceptedDateTime|DateTimeOffset|DateTime when the terms were last accepted by the user.|
|acceptedVersion|Int32|Most recent version number of the TandC accepted by the user.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|userDisplayName|String|Display name of the user whose acceptance the entity represents.|
|userPrincipalName|String|The userPrincipalName of the User that accepted the term.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|termsAndConditions|[termsAndConditions](../resources/termsandconditions.md)|Navigation link to the terms and conditions that are assigned.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.termsAndConditionsAcceptanceStatus",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.termsAndConditionsAcceptanceStatus",
  "id": "String (identifier)",
  "acceptedDateTime": "String (timestamp)",
  "acceptedVersion": "Integer",
  "userDisplayName": "String",
  "userPrincipalName": "String"
}
```

