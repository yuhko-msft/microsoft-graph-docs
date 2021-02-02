---
title: "notificationMessageTemplate resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# notificationMessageTemplate resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List notificationMessageTemplates](../api/intune-notificationmessagetemplate-list.md)|[notificationMessageTemplate](../resources/intune-notificationmessagetemplate.md) collection|Get a list of the [notificationMessageTemplate](../resources/notificationmessagetemplate.md) objects and their properties.|
|[Create notificationMessageTemplate](../api/intune-notificationmessagetemplate-create.md)|[notificationMessageTemplate](../resources/intune-notificationmessagetemplate.md)|Create a new [notificationMessageTemplate](../resources/intune-notificationmessagetemplate.md) object.|
|[Get notificationMessageTemplate](../api/intune-notificationmessagetemplate-get.md)|[notificationMessageTemplate](../resources/intune-notificationmessagetemplate.md)|Read the properties and relationships of a [notificationMessageTemplate](../resources/intune-notificationmessagetemplate.md) object.|
|[Update notificationMessageTemplate](../api/intune-notificationmessagetemplate-update.md)|[notificationMessageTemplate](../resources/intune-notificationmessagetemplate.md)|Update the properties of a [notificationMessageTemplate](../resources/intune-notificationmessagetemplate.md) object.|
|[Delete notificationMessageTemplate](../api/intune-notificationmessagetemplate-delete.md)|None|Deletes a [notificationMessageTemplate](../resources/intune-notificationmessagetemplate.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|brandingOptions|notificationTemplateBrandingOptions|**TODO: Add Description**. Possible values are: `none`, `includeCompanyLogo`, `includeCompanyName`, `includeContactInformation`, `includeCompanyPortalLink`.|
|defaultLocale|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description**|
|scopeTags|String collection|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|localizedNotificationMessages|[localizedNotificationMessage](../resources/intune-localizednotificationmessage.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.notificationMessageTemplate",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.notificationMessageTemplate",
  "id": "String (identifier)",
  "lastModifiedDateTime": "String (timestamp)",
  "displayName": "String",
  "defaultLocale": "String",
  "brandingOptions": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "scopeTags": [
    "String"
  ]
}
```

