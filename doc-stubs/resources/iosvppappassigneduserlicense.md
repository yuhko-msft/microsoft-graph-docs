---
title: "iosVppAppAssignedUserLicense resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosVppAppAssignedUserLicense resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosVppAppAssignedUserLicenses](../api/iosvppappassigneduserlicense-list.md)|[iosVppAppAssignedUserLicense](../resources/iosvppappassigneduserlicense.md) collection|Get a list of the [iosVppAppAssignedUserLicense](../resources/iosvppappassigneduserlicense.md) objects and their properties.|
|[Create iosVppAppAssignedUserLicense](../api/iosvppappassigneduserlicense-create.md)|[iosVppAppAssignedUserLicense](../resources/iosvppappassigneduserlicense.md)|Create a new [iosVppAppAssignedUserLicense](../resources/iosvppappassigneduserlicense.md) object.|
|[Get iosVppAppAssignedUserLicense](../api/iosvppappassigneduserlicense-get.md)|[iosVppAppAssignedUserLicense](../resources/iosvppappassigneduserlicense.md)|Read the properties and relationships of an [iosVppAppAssignedUserLicense](../resources/iosvppappassigneduserlicense.md) object.|
|[Update iosVppAppAssignedUserLicense](../api/iosvppappassigneduserlicense-update.md)|[iosVppAppAssignedUserLicense](../resources/iosvppappassigneduserlicense.md)|Update the properties of an [iosVppAppAssignedUserLicense](../resources/iosvppappassigneduserlicense.md) object.|
|[Delete iosVppAppAssignedUserLicense](../api/iosvppappassigneduserlicense-delete.md)|None|Deletes an [iosVppAppAssignedUserLicense](../resources/iosvppappassigneduserlicense.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|userEmailAddress|String|**TODO: Add Description** Inherited from [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|
|userId|String|**TODO: Add Description** Inherited from [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|
|userName|String|**TODO: Add Description** Inherited from [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|
|userPrincipalName|String|**TODO: Add Description** Inherited from [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.iosVppAppAssignedUserLicense",
  "baseType": "microsoft.graph.iosVppAppAssignedLicense",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosVppAppAssignedUserLicense",
  "id": "String (identifier)",
  "userEmailAddress": "String",
  "userId": "String",
  "userName": "String",
  "userPrincipalName": "String"
}
```

