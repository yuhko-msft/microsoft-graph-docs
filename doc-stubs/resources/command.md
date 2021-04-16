---
title: "command resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# command resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List commands](../api/command-list.md)|[command](../resources/command.md) collection|Get a list of the [command](../resources/command.md) objects and their properties.|
|[Create command](../api/command-post-commands.md)|[command](../resources/command.md)|Create a new [command](../resources/command.md) object.|
|[Get command](../api/command-get.md)|[command](../resources/command.md)|Read the properties and relationships of a [command](../resources/command.md) object.|
|[Update command](../api/command-update.md)|[command](../resources/command.md)|Update the properties of a [command](../resources/command.md) object.|
|[Delete command](../api/command-delete.md)|None|Deletes a [command](../resources/command.md) object.|
|[List payloadResponse](../api/command-list-responsepayload.md)|[payloadResponse](../resources/payloadresponse.md) collection|Get the payloadResponse resources from the responsepayload navigation property.|
|[Add payloadResponse](../api/command-post-responsepayload.md)|[payloadResponse](../resources/payloadresponse.md)|Add responsepayload by posting to the responsepayload collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appServiceName|String|**TODO: Add Description**|
|error|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|packageFamilyName|String|**TODO: Add Description**|
|payload|[payloadRequest](../resources/payloadrequest.md)|**TODO: Add Description**|
|permissionTicket|String|**TODO: Add Description**|
|postBackUri|String|**TODO: Add Description**|
|status|String|**TODO: Add Description**|
|type|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|responsepayload|[payloadResponse](../resources/payloadresponse.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.command",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.command",
  "id": "String (identifier)",
  "appServiceName": "String",
  "error": "String",
  "packageFamilyName": "String",
  "payload": {
    "@odata.type": "microsoft.graph.payloadRequest"
  },
  "permissionTicket": "String",
  "postBackUri": "String",
  "status": "String",
  "type": "String"
}
```

