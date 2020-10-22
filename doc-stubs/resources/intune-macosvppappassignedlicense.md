---
title: "macOsVppAppAssignedLicense resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOsVppAppAssignedLicense resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List assignedLicenses](../api/macosvppapp-list-assignedlicenses.md)|[macOsVppAppAssignedLicense](../resources/intune-macosvppappassignedlicense.md) collection|Get the macOsVppAppAssignedLicense resources from the assignedLicenses navigation property.|
|[Create assignedLicenses](../api/macosvppapp-post-assignedlicenses.md)|[macOsVppAppAssignedLicense](../resources/intune-macosvppappassignedlicense.md)|Create a new macOsVppAppAssignedLicense object.|
|[Update assignedLicenses](../api/macosvppapp-update-assignedlicenses.md)|[macOsVppAppAssignedLicense](../resources/intune-macosvppappassignedlicense.md)|Update the properties of an assignedLicenses object.|
|[Get assignedLicenses](../api/macosvppapp-get-macosvppappassignedlicense.md)|[macOsVppAppAssignedLicense](../resources/intune-macosvppappassignedlicense.md)|Read the properties and relationships of a [macOsVppAppAssignedLicense](../resources/intune-macosvppappassignedlicense.md) object.|
|[Delete assignedLicenses](../api/macosvppapp-delete-assignedlicenses.md)|None|Delete a [macOsVppAppAssignedLicense](../resources/intune-macosvppappassignedlicense.md) object.|
|[List macOsVppAppAssignedLicenses](../api/intune-macosvppappassignedlicense-list.md)|[macOsVppAppAssignedLicense](../resources/intune-macosvppappassignedlicense.md) collection|Get a list of the [macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md) objects and their properties.|
|[Create macOsVppAppAssignedLicense](../api/intune-macosvppappassignedlicense-create.md)|[macOsVppAppAssignedLicense](../resources/intune-macosvppappassignedlicense.md)|Create a new [macOsVppAppAssignedLicense](../resources/intune-macosvppappassignedlicense.md) object.|
|[Get macOsVppAppAssignedLicense](../api/intune-macosvppappassignedlicense-get.md)|[macOsVppAppAssignedLicense](../resources/intune-macosvppappassignedlicense.md)|Read the properties and relationships of a [macOsVppAppAssignedLicense](../resources/intune-macosvppappassignedlicense.md) object.|
|[Update macOsVppAppAssignedLicense](../api/intune-macosvppappassignedlicense-update.md)|[macOsVppAppAssignedLicense](../resources/intune-macosvppappassignedlicense.md)|Update the properties of a [macOsVppAppAssignedLicense](../resources/intune-macosvppappassignedlicense.md) object.|
|[Delete macOsVppAppAssignedLicense](../api/intune-macosvppappassignedlicense-delete.md)|None|Deletes a [macOsVppAppAssignedLicense](../resources/intune-macosvppappassignedlicense.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|userEmailAddress|String|**TODO: Add Description**|
|userId|String|**TODO: Add Description**|
|userName|String|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|

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

