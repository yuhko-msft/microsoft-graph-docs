---
title: "printConnector resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# printConnector resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List printConnectors](../api/printconnector-list.md)|[printConnector](../resources/printconnector.md) collection|Get a list of the [printConnector](../resources/printconnector.md) objects and their properties.|
|[Create printConnector](../api/printconnector-create.md)|[printConnector](../resources/printconnector.md)|Create a new [printConnector](../resources/printconnector.md) object.|
|[Get printConnector](../api/printconnector-get.md)|[printConnector](../resources/printconnector.md)|Read the properties and relationships of a [printConnector](../resources/printconnector.md) object.|
|[Update printConnector](../api/printconnector-update.md)|[printConnector](../resources/printconnector.md)|Update the properties of a [printConnector](../resources/printconnector.md) object.|
|[Delete printConnector](../api/printconnector-delete.md)|None|Deletes a [printConnector](../resources/printconnector.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appVersion|String|**TODO: Add Description**|
|deviceHealth|[deviceHealth](../resources/devicehealth.md)|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|fullyQualifiedDomainName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|location|[printerLocation](../resources/printerlocation.md)|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|operatingSystem|String|**TODO: Add Description**|
|registeredDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.printConnector",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.printConnector",
  "id": "String (identifier)",
  "appVersion": "String",
  "deviceHealth": {
    "@odata.type": "microsoft.graph.deviceHealth"
  },
  "displayName": "String",
  "fullyQualifiedDomainName": "String",
  "location": {
    "@odata.type": "microsoft.graph.printerLocation"
  },
  "name": "String",
  "operatingSystem": "String",
  "registeredDateTime": "String (timestamp)"
}
```

