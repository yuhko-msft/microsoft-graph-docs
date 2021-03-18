---
title: "mailSearchFolder resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mailSearchFolder resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [mailFolder](../resources/mailfolder.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mailSearchFolders](../api/mailsearchfolder-list.md)|[mailSearchFolder](../resources/mailsearchfolder.md) collection|Get a list of the [mailSearchFolder](../resources/mailsearchfolder.md) objects and their properties.|
|[Create mailSearchFolder](../api/mailsearchfolder-create.md)|[mailSearchFolder](../resources/mailsearchfolder.md)|Create a new [mailSearchFolder](../resources/mailsearchfolder.md) object.|
|[Get mailSearchFolder](../api/mailsearchfolder-get.md)|[mailSearchFolder](../resources/mailsearchfolder.md)|Read the properties and relationships of a [mailSearchFolder](../resources/mailsearchfolder.md) object.|
|[Update mailSearchFolder](../api/mailsearchfolder-update.md)|[mailSearchFolder](../resources/mailsearchfolder.md)|Update the properties of a [mailSearchFolder](../resources/mailsearchfolder.md) object.|
|[Delete mailSearchFolder](../api/mailsearchfolder-delete.md)|None|Deletes a [mailSearchFolder](../resources/mailsearchfolder.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|childFolderCount|Int32|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md)|
|displayName|String|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md)|
|filterQuery|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|includeNestedFolders|Boolean|**TODO: Add Description**|
|isSupported|Boolean|**TODO: Add Description**|
|parentFolderId|String|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md)|
|sourceFolderIDs|String collection|**TODO: Add Description**|
|totalItemCount|Int32|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md)|
|unreadItemCount|Int32|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md)|
|wellKnownName|String|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|childFolders|[mailFolder](../resources/mailfolder.md) collection|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md)|
|messageRules|[messageRule](../resources/messagerule.md) collection|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md)|
|messages|[message](../resources/message.md) collection|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md)|
|multiValueExtendedProperties|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md)|
|singleValueExtendedProperties|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md)|
|userConfigurations|[userConfiguration](../resources/userconfiguration.md) collection|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mailSearchFolder",
  "baseType": "microsoft.graph.mailFolder",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mailSearchFolder",
  "id": "String (identifier)",
  "displayName": "String",
  "parentFolderId": "String",
  "childFolderCount": "Integer",
  "unreadItemCount": "Integer",
  "totalItemCount": "Integer",
  "wellKnownName": "String",
  "isSupported": "Boolean",
  "includeNestedFolders": "Boolean",
  "sourceFolderIDs": [
    "String"
  ],
  "filterQuery": "String"
}
```

