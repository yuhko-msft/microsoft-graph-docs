---
title: "macOsVppAppAssignedLicense resource type"
description: "MacOS Volume Purchase Program license assignment. This class does not support Create, Delete, or Update."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOsVppAppAssignedLicense resource type

Namespace: microsoft.graph



MacOS Volume Purchase Program license assignment. This class does not support Create, Delete, or Update.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List macOsVppAppAssignedLicenses](../api/macosvppappassignedlicense-list.md)|[macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md) collection|Get a list of the [macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md) objects and their properties.|
|[Create macOsVppAppAssignedLicense](../api/macosvppappassignedlicense-create.md)|[macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md)|Create a new [macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md) object.|
|[Get macOsVppAppAssignedLicense](../api/macosvppappassignedlicense-get.md)|[macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md)|Read the properties and relationships of a [macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md) object.|
|[Update macOsVppAppAssignedLicense](../api/macosvppappassignedlicense-update.md)|[macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md)|Update the properties of a [macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md) object.|
|[Delete macOsVppAppAssignedLicense](../api/macosvppappassignedlicense-delete.md)|None|Deletes a [macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|userEmailAddress|String|The user email address.|
|userId|String|The user ID.|
|userName|String|The user name.|
|userPrincipalName|String|The user principal name.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.macOsVppAppAssignedLicense",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOsVppAppAssignedLicense",
  "id": "String (identifier)",
  "userEmailAddress": "String",
  "userId": "String",
  "userName": "String",
  "userPrincipalName": "String"
}
```

