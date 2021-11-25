---
title: "emailEventRoot resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# emailEventRoot resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List emailEventRoots](../api/emaileventroot-list.md)|[emailEventRoot](../resources/emaileventroot.md) collection|Get a list of the [emailEventRoot](../resources/emaileventroot.md) objects and their properties.|
|[Create emailEventRoot](../api/security-post-emailevent.md)|[emailEventRoot](../resources/emaileventroot.md)|Create a new [emailEventRoot](../resources/emaileventroot.md) object.|
|[Get emailEventRoot](../api/emaileventroot-get.md)|[emailEventRoot](../resources/emaileventroot.md)|Read the properties and relationships of an [emailEventRoot](../resources/emaileventroot.md) object.|
|[Update emailEventRoot](../api/emaileventroot-update.md)|[emailEventRoot](../resources/emaileventroot.md)|Update the properties of an [emailEventRoot](../resources/emaileventroot.md) object.|
|[Delete emailEventRoot](../api/emaileventroot-delete.md)|None|Deletes an [emailEventRoot](../resources/emaileventroot.md) object.|
|[getListEmails](../api/emaileventroot-getlistemails.md)|[email](../resources/email.md) collection|**TODO: Add Description**|
|[List emails](../api/emaileventroot-list-emails.md)|[email](../resources/email.md) collection|Get the email resources from the emails navigation property.|
|[Create email](../api/emaileventroot-post-emails.md)|[email](../resources/email.md)|Create a new email object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|emails|[email](../resources/email.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.emailEventRoot",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.emailEventRoot"
}
```

