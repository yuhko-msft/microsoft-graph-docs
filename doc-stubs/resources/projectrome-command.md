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
|AppServiceName|String|**TODO: Add Description**|
|Error|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|PackageFamilyName|String|**TODO: Add Description**|
|Payload|[PayloadRequest](../resources/projectrome-payloadrequest.md)|**TODO: Add Description**|
|PermissionTicket|String|**TODO: Add Description**|
|PostBackUri|String|**TODO: Add Description**|
|Status|String|**TODO: Add Description**|
|Type|String|**TODO: Add Description**|

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
  "Status": "String",
  "Type": "String",
  "AppServiceName": "String",
  "PackageFamilyName": "String",
  "Error": "String",
  "Payload": {
    "@odata.type": "microsoft.graph.PayloadRequest"
  },
  "PermissionTicket": "String",
  "PostBackUri": "String"
}
```

