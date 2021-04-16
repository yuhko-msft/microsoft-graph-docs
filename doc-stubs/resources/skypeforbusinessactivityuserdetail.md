---
title: "skypeForBusinessActivityUserDetail resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# skypeForBusinessActivityUserDetail resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List skypeForBusinessActivityUserDetails](../api/skypeforbusinessactivityuserdetail-list.md)|[skypeForBusinessActivityUserDetail](../resources/skypeforbusinessactivityuserdetail.md) collection|Get a list of the [skypeForBusinessActivityUserDetail](../resources/skypeforbusinessactivityuserdetail.md) objects and their properties.|
|[Create skypeForBusinessActivityUserDetail](../api/skypeforbusinessactivityuserdetail-create.md)|[skypeForBusinessActivityUserDetail](../resources/skypeforbusinessactivityuserdetail.md)|Create a new [skypeForBusinessActivityUserDetail](../resources/skypeforbusinessactivityuserdetail.md) object.|
|[Get skypeForBusinessActivityUserDetail](../api/skypeforbusinessactivityuserdetail-get.md)|[skypeForBusinessActivityUserDetail](../resources/skypeforbusinessactivityuserdetail.md)|Read the properties and relationships of a [skypeForBusinessActivityUserDetail](../resources/skypeforbusinessactivityuserdetail.md) object.|
|[Update skypeForBusinessActivityUserDetail](../api/skypeforbusinessactivityuserdetail-update.md)|[skypeForBusinessActivityUserDetail](../resources/skypeforbusinessactivityuserdetail.md)|Update the properties of a [skypeForBusinessActivityUserDetail](../resources/skypeforbusinessactivityuserdetail.md) object.|
|[Delete skypeForBusinessActivityUserDetail](../api/skypeforbusinessactivityuserdetail-delete.md)|None|Deletes a [skypeForBusinessActivityUserDetail](../resources/skypeforbusinessactivityuserdetail.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|assignedProducts|String collection|**TODO: Add Description**|
|deletedDate|Date|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isDeleted|Boolean|**TODO: Add Description**|
|lastActivityDate|Date|**TODO: Add Description**|
|organizedConferenceAppSharingCount|Int64|**TODO: Add Description**|
|organizedConferenceAudioVideoCount|Int64|**TODO: Add Description**|
|organizedConferenceAudioVideoMinutes|Int64|**TODO: Add Description**|
|organizedConferenceCloudDialInMicrosoftMinutes|Int64|**TODO: Add Description**|
|organizedConferenceCloudDialInOutMicrosoftCount|Int64|**TODO: Add Description**|
|organizedConferenceCloudDialOutMicrosoftMinutes|Int64|**TODO: Add Description**|
|organizedConferenceDialInOut3rdPartyCount|Int64|**TODO: Add Description**|
|organizedConferenceIMCount|Int64|**TODO: Add Description**|
|organizedConferenceLastActivityDate|Date|**TODO: Add Description**|
|organizedConferenceWebCount|Int64|**TODO: Add Description**|
|participatedConferenceAppSharingCount|Int64|**TODO: Add Description**|
|participatedConferenceAudioVideoCount|Int64|**TODO: Add Description**|
|participatedConferenceAudioVideoMinutes|Int64|**TODO: Add Description**|
|participatedConferenceDialInOut3rdPartyCount|Int64|**TODO: Add Description**|
|participatedConferenceIMCount|Int64|**TODO: Add Description**|
|participatedConferenceLastActivityDate|Date|**TODO: Add Description**|
|participatedConferenceWebCount|Int64|**TODO: Add Description**|
|peerToPeerAppSharingCount|Int64|**TODO: Add Description**|
|peerToPeerAudioCount|Int64|**TODO: Add Description**|
|peerToPeerAudioMinutes|Int64|**TODO: Add Description**|
|peerToPeerFileTransferCount|Int64|**TODO: Add Description**|
|peerToPeerIMCount|Int64|**TODO: Add Description**|
|peerToPeerLastActivityDate|Date|**TODO: Add Description**|
|peerToPeerVideoCount|Int64|**TODO: Add Description**|
|peerToPeerVideoMinutes|Int64|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|totalOrganizedConferenceCount|Int64|**TODO: Add Description**|
|totalParticipatedConferenceCount|Int64|**TODO: Add Description**|
|totalPeerToPeerSessionCount|Int64|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.skypeForBusinessActivityUserDetail",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.skypeForBusinessActivityUserDetail",
  "id": "String (identifier)",
  "assignedProducts": [
    "String"
  ],
  "deletedDate": "Date",
  "isDeleted": "Boolean",
  "lastActivityDate": "Date",
  "organizedConferenceAppSharingCount": "Integer",
  "organizedConferenceAudioVideoCount": "Integer",
  "organizedConferenceAudioVideoMinutes": "Integer",
  "organizedConferenceCloudDialInMicrosoftMinutes": "Integer",
  "organizedConferenceCloudDialInOutMicrosoftCount": "Integer",
  "organizedConferenceCloudDialOutMicrosoftMinutes": "Integer",
  "organizedConferenceDialInOut3rdPartyCount": "Integer",
  "organizedConferenceIMCount": "Integer",
  "organizedConferenceLastActivityDate": "Date",
  "organizedConferenceWebCount": "Integer",
  "participatedConferenceAppSharingCount": "Integer",
  "participatedConferenceAudioVideoCount": "Integer",
  "participatedConferenceAudioVideoMinutes": "Integer",
  "participatedConferenceDialInOut3rdPartyCount": "Integer",
  "participatedConferenceIMCount": "Integer",
  "participatedConferenceLastActivityDate": "Date",
  "participatedConferenceWebCount": "Integer",
  "peerToPeerAppSharingCount": "Integer",
  "peerToPeerAudioCount": "Integer",
  "peerToPeerAudioMinutes": "Integer",
  "peerToPeerFileTransferCount": "Integer",
  "peerToPeerIMCount": "Integer",
  "peerToPeerLastActivityDate": "Date",
  "peerToPeerVideoCount": "Integer",
  "peerToPeerVideoMinutes": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "totalOrganizedConferenceCount": "Integer",
  "totalParticipatedConferenceCount": "Integer",
  "totalPeerToPeerSessionCount": "Integer",
  "userPrincipalName": "String"
}
```

