---
title: "mention resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mention resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mentions](../api/mention-list.md)|[mention](../resources/mention.md) collection|Get a list of the [mention](../resources/mention.md) objects and their properties.|
|[Create mention](../api/mention-create.md)|[mention](../resources/mention.md)|Create a new [mention](../resources/mention.md) object.|
|[Get mention](../api/mention-get.md)|[mention](../resources/mention.md)|Read the properties and relationships of a [mention](../resources/mention.md) object.|
|[Update mention](../api/mention-update.md)|[mention](../resources/mention.md)|Update the properties of a [mention](../resources/mention.md) object.|
|[Delete mention](../api/mention-delete.md)|None|Deletes a [mention](../resources/mention.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|application|String|**TODO: Add Description**|
|clientReference|String|**TODO: Add Description**|
|createdBy|[emailAddress](../resources/emailaddress.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|deepLink|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|mentioned|[emailAddress](../resources/emailaddress.md)|**TODO: Add Description**|
|mentionText|String|**TODO: Add Description**|
|serverCreatedDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mention",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mention",
  "id": "String (identifier)",
  "application": "String",
  "clientReference": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.emailAddress"
  },
  "createdDateTime": "String (timestamp)",
  "deepLink": "String",
  "mentioned": {
    "@odata.type": "microsoft.graph.emailAddress"
  },
  "mentionText": "String",
  "serverCreatedDateTime": "String (timestamp)"
}
```

