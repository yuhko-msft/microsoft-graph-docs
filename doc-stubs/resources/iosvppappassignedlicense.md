---
title: "iosVppAppAssignedLicense resource type"
description: "iOS Volume Purchase Program license assignment. This class does not support Create, Delete, or Update."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosVppAppAssignedLicense resource type

Namespace: microsoft.graph



iOS Volume Purchase Program license assignment. This class does not support Create, Delete, or Update.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosVppAppAssignedLicenses](../api/iosvppappassignedlicense-list.md)|[iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md) collection|Get a list of the [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md) objects and their properties.|
|[Create iosVppAppAssignedLicense](../api/iosvppappassignedlicense-create.md)|[iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md)|Create a new [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md) object.|
|[Get iosVppAppAssignedLicense](../api/iosvppappassignedlicense-get.md)|[iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md)|Read the properties and relationships of an [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md) object.|
|[Update iosVppAppAssignedLicense](../api/iosvppappassignedlicense-update.md)|[iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md)|Update the properties of an [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md) object.|
|[Delete iosVppAppAssignedLicense](../api/iosvppappassignedlicense-delete.md)|None|Deletes an [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md) object.|

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

