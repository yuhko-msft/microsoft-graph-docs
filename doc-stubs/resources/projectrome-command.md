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
|[List commands](../api/projectrome-command-list.md)|[command](../resources/projectrome-command.md) collection|Get a list of the [command](../resources/command.md) objects and their properties.|
|[Create command](../api/projectrome-command-post-commands.md)|[command](../resources/projectrome-command.md)|Create a new [command](../resources/projectrome-command.md) object.|
|[Get command](../api/projectrome-command-get.md)|[command](../resources/projectrome-command.md)|Read the properties and relationships of a [command](../resources/projectrome-command.md) object.|
|[Update command](../api/projectrome-command-update.md)|[command](../resources/projectrome-command.md)|Update the properties of a [command](../resources/projectrome-command.md) object.|
|[Delete command](../api/projectrome-command-delete.md)|None|Deletes a [command](../resources/projectrome-command.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appServiceName|String|**TODO: Add Description**|
|error|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|packageFamilyName|String|**TODO: Add Description**|
|payload|[payloadRequest](../resources/projectrome-payloadrequest.md)|**TODO: Add Description**|
|permissionTicket|String|**TODO: Add Description**|
|postBackUri|String|**TODO: Add Description**|
|status|String|**TODO: Add Description**|
|type|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|responsepayload|[payloadResponse](../resources/projectrome-payloadresponse.md)|**TODO: Add Description**|

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
  "status": "String",
  "type": "String",
  "appServiceName": "String",
  "packageFamilyName": "String",
  "error": "String",
  "payload": {
    "@odata.type": "microsoft.graph.payloadRequest"
  },
  "permissionTicket": "String",
  "postBackUri": "String"
}
```

