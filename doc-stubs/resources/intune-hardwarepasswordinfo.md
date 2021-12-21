---
title: "hardwarePasswordInfo resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# hardwarePasswordInfo resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List hardwarePasswordInfoes](../api/intune-hardwarepasswordinfo-list.md)|[hardwarePasswordInfo](../resources/intune-hardwarepasswordinfo.md) collection|Get a list of the [hardwarePasswordInfo](../resources/intune-hardwarepasswordinfo.md) objects and their properties.|
|[Create hardwarePasswordInfo](../api/devicemanagement-post-hardwarepasswordinfo.md)|[hardwarePasswordInfo](../resources/intune-hardwarepasswordinfo.md)|Create a new [hardwarePasswordInfo](../resources/intune-hardwarepasswordinfo.md) object.|
|[Get hardwarePasswordInfo](../api/intune-hardwarepasswordinfo-get.md)|[hardwarePasswordInfo](../resources/intune-hardwarepasswordinfo.md)|Read the properties and relationships of a [hardwarePasswordInfo](../resources/intune-hardwarepasswordinfo.md) object.|
|[Update hardwarePasswordInfo](../api/intune-hardwarepasswordinfo-update.md)|[hardwarePasswordInfo](../resources/intune-hardwarepasswordinfo.md)|Update the properties of a [hardwarePasswordInfo](../resources/intune-hardwarepasswordinfo.md) object.|
|[Delete hardwarePasswordInfo](../api/intune-hardwarepasswordinfo-delete.md)|None|Deletes a [hardwarePasswordInfo](../resources/intune-hardwarepasswordinfo.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|currentPassword|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|previousPasswords|String collection|**TODO: Add Description**|
|serialNumber|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.hardwarePasswordInfo",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.hardwarePasswordInfo",
  "id": "String (identifier)",
  "serialNumber": "String",
  "currentPassword": "String",
  "previousPasswords": [
    "String"
  ]
}
```

