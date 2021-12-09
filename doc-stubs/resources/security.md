---
title: "security resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# security resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get security](../api/security-get.md)|[security](../resources/security.md)|Read the properties and relationships of a [security](../resources/security.md) object.|
|[Update security](../api/security-update.md)|[security](../resources/security.md)|Update the properties of a [security](../resources/security.md) object.|
|[softDelete](../api/security-softdelete.md)|[remediationResponse](../resources/remediationresponse.md)|**TODO: Add Description**|
|[hardDelete](../api/security-harddelete.md)|[remediationResponse](../resources/remediationresponse.md)|**TODO: Add Description**|
|[moveToJunk](../api/security-movetojunk.md)|[remediationResponse](../resources/remediationresponse.md)|**TODO: Add Description**|
|[movetoDeletedItems](../api/security-movetodeleteditems.md)|[remediationResponse](../resources/remediationresponse.md)|**TODO: Add Description**|
|[movetoInbox](../api/security-movetoinbox.md)|[remediationResponse](../resources/remediationresponse.md)|**TODO: Add Description**|
|[getMailMessages](../api/security-getmailmessages.md)|[mailMessage](../resources/mailmessage.md) collection|**TODO: Add Description**|
|[List mailMessages](../api/security-list-mailmessages.md)|[mailMessage](../resources/mailmessage.md) collection|Get the mailMessage resources from the mailMessages navigation property.|
|[Create mailMessage](../api/security-post-mailmessages.md)|[mailMessage](../resources/mailmessage.md)|Create a new mailMessage object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|mailMessages|[mailMessage](../resources/mailmessage.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.security",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.security"
}
```

