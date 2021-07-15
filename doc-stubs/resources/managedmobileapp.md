---
title: "managedMobileApp resource type"
description: "The identifier for the deployment an app."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedMobileApp resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The identifier for the deployment an app.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedMobileApps](../api/managedmobileapp-list.md)|[managedMobileApp](../resources/managedmobileapp.md) collection|Get a list of the [managedMobileApp](../resources/managedmobileapp.md) objects and their properties.|
|[Create managedMobileApp](../api/managedmobileapp-create.md)|[managedMobileApp](../resources/managedmobileapp.md)|Create a new [managedMobileApp](../resources/managedmobileapp.md) object.|
|[Get managedMobileApp](../api/managedmobileapp-get.md)|[managedMobileApp](../resources/managedmobileapp.md)|Read the properties and relationships of a [managedMobileApp](../resources/managedmobileapp.md) object.|
|[Update managedMobileApp](../api/managedmobileapp-update.md)|[managedMobileApp](../resources/managedmobileapp.md)|Update the properties of a [managedMobileApp](../resources/managedmobileapp.md) object.|
|[Delete managedMobileApp](../api/managedmobileapp-delete.md)|None|Deletes a [managedMobileApp](../resources/managedmobileapp.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|mobileAppIdentifier|[mobileAppIdentifier](../resources/mobileappidentifier.md)|The identifier for an app with it's operating system type.|
|version|String|Version of the entity.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedMobileApp",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedMobileApp",
  "id": "String (identifier)",
  "mobileAppIdentifier": {
    "@odata.type": "microsoft.graph.mobileAppIdentifier"
  },
  "version": "String"
}
```

