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
|[copy](../api/mailsearchfolder-copy.md)|[mailFolder](../resources/mailfolder.md)|**TODO: Add Description**|
|[move](../api/mailsearchfolder-move.md)|[mailFolder](../resources/mailfolder.md)|**TODO: Add Description**|
|[List childFolders](../api/mailsearchfolder-list-childfolders.md)|[mailFolder](../resources/mailfolder.md) collection|Get the mailFolder resources from the childFolders navigation property.|
|[Create mailFolder](../api/mailsearchfolder-post-childfolders.md)|[mailFolder](../resources/mailfolder.md)|Create a new mailFolder object.|
|[List messageRules](../api/mailsearchfolder-list-messagerules.md)|[messageRule](../resources/messagerule.md) collection|Get the messageRule resources from the messageRules navigation property.|
|[Create messageRule](../api/mailsearchfolder-post-messagerules.md)|[messageRule](../resources/messagerule.md)|Create a new messageRule object.|
|[List messages](../api/mailsearchfolder-list-messages.md)|[message](../resources/message.md) collection|Get the message resources from the messages navigation property.|
|[Create message](../api/mailsearchfolder-post-messages.md)|[message](../resources/message.md)|Create a new message object.|
|[List multiValueExtendedProperties](../api/mailsearchfolder-list-multivalueextendedproperties.md)|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection|Get the multiValueLegacyExtendedProperty resources from the multiValueExtendedProperties navigation property.|
|[Create multiValueLegacyExtendedProperty](../api/mailsearchfolder-post-multivalueextendedproperties.md)|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md)|Create a new multiValueLegacyExtendedProperty object.|
|[List singleValueExtendedProperties](../api/mailsearchfolder-list-singlevalueextendedproperties.md)|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection|Get the singleValueLegacyExtendedProperty resources from the singleValueExtendedProperties navigation property.|
|[Create singleValueLegacyExtendedProperty](../api/mailsearchfolder-post-singlevalueextendedproperties.md)|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md)|Create a new singleValueLegacyExtendedProperty object.|
|[List userConfigurations](../api/mailsearchfolder-list-userconfigurations.md)|[userConfiguration](../resources/userconfiguration.md) collection|Get the userConfiguration resources from the userConfigurations navigation property.|
|[Create userConfiguration](../api/mailsearchfolder-post-userconfigurations.md)|[userConfiguration](../resources/userconfiguration.md)|Create a new userConfiguration object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|childFolderCount|Int32|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md).|
|displayName|String|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md).|
|filterQuery|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|includeNestedFolders|Boolean|**TODO: Add Description**|
|isHidden|Boolean|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md).|
|isSupported|Boolean|**TODO: Add Description**|
|parentFolderId|String|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md).|
|sourceFolderIds|String collection|**TODO: Add Description**|
|totalItemCount|Int32|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md).|
|unreadItemCount|Int32|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md).|
|wellKnownName|String|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md).|

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
  "childFolderCount": "Integer",
  "displayName": "String",
  "isHidden": "Boolean",
  "parentFolderId": "String",
  "totalItemCount": "Integer",
  "unreadItemCount": "Integer",
  "wellKnownName": "String",
  "filterQuery": "String",
  "includeNestedFolders": "Boolean",
  "isSupported": "Boolean",
  "sourceFolderIds": [
    "String"
  ]
}
```

