---
title: "azureIOTDevice resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# azureIOTDevice resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List azureIOTDevices](../api/intune-azureiotdevice-list.md)|[azureIOTDevice](../resources/intune-azureiotdevice.md) collection|Get a list of the [azureIOTDevice](../resources/azureiotdevice.md) objects and their properties.|
|[Create azureIOTDevice](../api/intune-azureiotdevice-create.md)|[azureIOTDevice](../resources/intune-azureiotdevice.md)|Create a new [azureIOTDevice](../resources/intune-azureiotdevice.md) object.|
|[Get azureIOTDevice](../api/intune-azureiotdevice-get.md)|[azureIOTDevice](../resources/intune-azureiotdevice.md)|Read the properties and relationships of an [azureIOTDevice](../resources/intune-azureiotdevice.md) object.|
|[Update azureIOTDevice](../api/intune-azureiotdevice-update.md)|[azureIOTDevice](../resources/intune-azureiotdevice.md)|Update the properties of an [azureIOTDevice](../resources/intune-azureiotdevice.md) object.|
|[Delete azureIOTDevice](../api/intune-azureiotdevice-delete.md)|None|Deletes an [azureIOTDevice](../resources/intune-azureiotdevice.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|desiredProperties|[azureIOTProperty](../resources/intune-azureiotproperty.md) collection|**TODO: Add Description**|
|deviceId|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|reportedProperties|[azureIOTProperty](../resources/intune-azureiotproperty.md) collection|**TODO: Add Description**|
|tags|[azureIOTProperty](../resources/intune-azureiotproperty.md) collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.azureIOTDevice",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.azureIOTDevice",
  "id": "String (identifier)",
  "deviceId": "String",
  "desiredProperties": [
    {
      "@odata.type": "microsoft.graph.azureIOTProperty"
    }
  ],
  "reportedProperties": [
    {
      "@odata.type": "microsoft.graph.azureIOTProperty"
    }
  ],
  "tags": [
    {
      "@odata.type": "microsoft.graph.azureIOTProperty"
    }
  ]
}
```

