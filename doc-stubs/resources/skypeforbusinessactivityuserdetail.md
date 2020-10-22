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
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.skypeForBusinessActivityUserDetail",
  "totalPeerToPeerSessionCount": "Integer",
  "totalOrganizedConferenceCount": "Integer",
  "totalParticipatedConferenceCount": "Integer",
  "peerToPeerLastActivityDate": "Date",
  "organizedConferenceLastActivityDate": "Date",
  "participatedConferenceLastActivityDate": "Date",
  "peerToPeerIMCount": "Integer",
  "peerToPeerAudioCount": "Integer",
  "peerToPeerAudioMinutes": "Integer",
  "peerToPeerVideoCount": "Integer",
  "peerToPeerVideoMinutes": "Integer",
  "peerToPeerAppSharingCount": "Integer",
  "peerToPeerFileTransferCount": "Integer",
  "organizedConferenceIMCount": "Integer",
  "organizedConferenceAudioVideoCount": "Integer",
  "organizedConferenceAudioVideoMinutes": "Integer",
  "organizedConferenceAppSharingCount": "Integer",
  "organizedConferenceWebCount": "Integer",
  "organizedConferenceDialInOut3rdPartyCount": "Integer",
  "organizedConferenceCloudDialInOutMicrosoftCount": "Integer",
  "organizedConferenceCloudDialInMicrosoftMinutes": "Integer",
  "organizedConferenceCloudDialOutMicrosoftMinutes": "Integer",
  "participatedConferenceIMCount": "Integer",
  "participatedConferenceAudioVideoCount": "Integer",
  "participatedConferenceAudioVideoMinutes": "Integer",
  "participatedConferenceAppSharingCount": "Integer",
  "participatedConferenceWebCount": "Integer",
  "participatedConferenceDialInOut3rdPartyCount": "Integer",
  "reportRefreshDate": "Date",
  "userPrincipalName": "String",
  "isDeleted": "Boolean",
  "deletedDate": "Date",
  "lastActivityDate": "Date",
  "assignedProducts": [
    "String"
  ],
  "reportPeriod": "String"
}
```

