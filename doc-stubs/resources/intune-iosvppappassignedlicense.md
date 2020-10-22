---
title: "iosVppAppAssignedLicense resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosVppAppAssignedLicense resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List assignedLicenses](../api/iosvppapp-list-assignedlicenses.md)|[iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md) collection|Get the iosVppAppAssignedLicense resources from the assignedLicenses navigation property.|
|[Create assignedLicenses](../api/iosvppapp-post-assignedlicenses.md)|[iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|Create a new iosVppAppAssignedLicense object.|
|[Update assignedLicenses](../api/iosvppapp-update-assignedlicenses.md)|[iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|Update the properties of an assignedLicenses object.|
|[Get assignedLicenses](../api/iosvppapp-get-iosvppappassignedlicense.md)|[iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|Read the properties and relationships of an [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md) object.|
|[Delete assignedLicenses](../api/iosvppapp-delete-assignedlicenses.md)|None|Delete an [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md) object.|
|[List iosVppAppAssignedLicenses](../api/intune-iosvppappassignedlicense-list.md)|[iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md) collection|Get a list of the [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md) objects and their properties.|
|[Create iosVppAppAssignedLicense](../api/intune-iosvppappassignedlicense-create.md)|[iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|Create a new [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md) object.|
|[Get iosVppAppAssignedLicense](../api/intune-iosvppappassignedlicense-get.md)|[iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|Read the properties and relationships of an [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md) object.|
|[Update iosVppAppAssignedLicense](../api/intune-iosvppappassignedlicense-update.md)|[iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|Update the properties of an [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md) object.|
|[Delete iosVppAppAssignedLicense](../api/intune-iosvppappassignedlicense-delete.md)|None|Deletes an [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md) object.|

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
  "@odata.type": "microsoft.graph.iosVppAppAssignedLicense",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosVppAppAssignedLicense",
  "id": "String (identifier)",
  "userEmailAddress": "String",
  "userId": "String",
  "userName": "String",
  "userPrincipalName": "String"
}
```

