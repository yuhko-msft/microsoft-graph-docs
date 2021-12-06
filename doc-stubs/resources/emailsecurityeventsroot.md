---
title: "emailSecurityEventsRoot resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# emailSecurityEventsRoot resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List emailSecurityEventsRoots](../api/emailsecurityeventsroot-list.md)|[emailSecurityEventsRoot](../resources/emailsecurityeventsroot.md) collection|Get a list of the [emailSecurityEventsRoot](../resources/emailsecurityeventsroot.md) objects and their properties.|
|[Create emailSecurityEventsRoot](../api/security-post-emailsecurityevents.md)|[emailSecurityEventsRoot](../resources/emailsecurityeventsroot.md)|Create a new [emailSecurityEventsRoot](../resources/emailsecurityeventsroot.md) object.|
|[Get emailSecurityEventsRoot](../api/emailsecurityeventsroot-get.md)|[emailSecurityEventsRoot](../resources/emailsecurityeventsroot.md)|Read the properties and relationships of an [emailSecurityEventsRoot](../resources/emailsecurityeventsroot.md) object.|
|[Update emailSecurityEventsRoot](../api/emailsecurityeventsroot-update.md)|[emailSecurityEventsRoot](../resources/emailsecurityeventsroot.md)|Update the properties of an [emailSecurityEventsRoot](../resources/emailsecurityeventsroot.md) object.|
|[Delete emailSecurityEventsRoot](../api/emailsecurityeventsroot-delete.md)|None|Deletes an [emailSecurityEventsRoot](../resources/emailsecurityeventsroot.md) object.|
|[softDelete](../api/emailsecurityeventsroot-softdelete.md)|[remediationResponse](../resources/remediationresponse.md)|**TODO: Add Description**|
|[hardDelete](../api/emailsecurityeventsroot-harddelete.md)|[remediationResponse](../resources/remediationresponse.md)|**TODO: Add Description**|
|[moveToJunk](../api/emailsecurityeventsroot-movetojunk.md)|[remediationResponse](../resources/remediationresponse.md)|**TODO: Add Description**|
|[movetoDeletedItems](../api/emailsecurityeventsroot-movetodeleteditems.md)|[remediationResponse](../resources/remediationresponse.md)|**TODO: Add Description**|
|[movetoInbox](../api/emailsecurityeventsroot-movetoinbox.md)|[remediationResponse](../resources/remediationresponse.md)|**TODO: Add Description**|
|[getListEmails](../api/emailsecurityeventsroot-getlistemails.md)|[mailMessage](../resources/mailmessage.md) collection|**TODO: Add Description**|
|[List mailMessages](../api/emailsecurityeventsroot-list-mailmessages.md)|[mailMessage](../resources/mailmessage.md) collection|Get the mailMessage resources from the mailMessages navigation property.|
|[Create mailMessage](../api/emailsecurityeventsroot-post-mailmessages.md)|[mailMessage](../resources/mailmessage.md)|Create a new mailMessage object.|

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
  "@odata.type": "microsoft.graph.emailSecurityEventsRoot",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.emailSecurityEventsRoot"
}
```

