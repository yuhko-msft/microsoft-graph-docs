---
title: "Update serviceUpdateMessage"
description: "Update the properties of a serviceUpdateMessage object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update serviceUpdateMessage
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [serviceUpdateMessage](../resources/serviceupdatemessage.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /admin/serviceAnnouncement/messages/{serviceUpdateMessageId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|startDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [serviceAnnouncementBase](../resources/serviceannouncementbase.md). Required.|
|endDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [serviceAnnouncementBase](../resources/serviceannouncementbase.md). Optional.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [serviceAnnouncementBase](../resources/serviceannouncementbase.md). Required.|
|title|String|**TODO: Add Description** Inherited from [serviceAnnouncementBase](../resources/serviceannouncementbase.md). Required.|
|details|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description** Inherited from [serviceAnnouncementBase](../resources/serviceannouncementbase.md). Optional.|
|body|[itemBody](../resources/itembody.md)|**TODO: Add Description** Required.|
|category|serviceUpdateCategory|**TODO: Add Description**. The possible values are: `preventOrFixIssue`, `planForChange`, `stayInformed`, `unknownFutureValue`. Required.|
|severity|serviceUpdateSeverity|**TODO: Add Description**. The possible values are: `normal`, `high`, `critical`, `unknownFutureValue`. Required.|
|tags|String collection|**TODO: Add Description** Optional.|
|isMajorChange|Boolean|**TODO: Add Description** Optional.|
|actionRequiredByDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|services|String collection|**TODO: Add Description** Optional.|
|viewPoint|[serviceUpdateMessageViewpoint](../resources/serviceupdatemessageviewpoint.md)|**TODO: Add Description** Optional.|
|hasAttachments|Boolean|**TODO: Add Description** Required.|
|attachmentsArchive|Stream|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [serviceUpdateMessage](../resources/serviceupdatemessage.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_serviceupdatemessage"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/admin/serviceAnnouncement/messages/{serviceUpdateMessageId}
Content-Type: application/json
Content-length: 684

{
  "@odata.type": "#microsoft.graph.serviceUpdateMessage",
  "startDateTime": "String (timestamp)",
  "endDateTime": "String (timestamp)",
  "title": "String",
  "details": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "body": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "category": "String",
  "severity": "String",
  "tags": [
    "String"
  ],
  "isMajorChange": "Boolean",
  "actionRequiredByDateTime": "String (timestamp)",
  "services": [
    "String"
  ],
  "viewPoint": {
    "@odata.type": "microsoft.graph.serviceUpdateMessageViewpoint"
  },
  "hasAttachments": "Boolean",
  "attachmentsArchive": "Stream"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.serviceUpdateMessage",
  "id": "49606a3f-6a3f-4960-3f6a-60493f6a6049",
  "startDateTime": "String (timestamp)",
  "endDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "title": "String",
  "details": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "body": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "category": "String",
  "severity": "String",
  "tags": [
    "String"
  ],
  "isMajorChange": "Boolean",
  "actionRequiredByDateTime": "String (timestamp)",
  "services": [
    "String"
  ],
  "viewPoint": {
    "@odata.type": "microsoft.graph.serviceUpdateMessageViewpoint"
  },
  "hasAttachments": "Boolean",
  "attachmentsArchive": "Stream"
}
```

