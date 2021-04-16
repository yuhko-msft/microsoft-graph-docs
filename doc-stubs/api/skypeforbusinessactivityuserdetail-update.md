---
title: "Update skypeForBusinessActivityUserDetail"
description: "Update the properties of a skypeForBusinessActivityUserDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update skypeForBusinessActivityUserDetail
Namespace: microsoft.graph



Update the properties of a [skypeForBusinessActivityUserDetail](../resources/skypeforbusinessactivityuserdetail.md) object.

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
PATCH /skypeForBusinessActivityUserDetail
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [skypeForBusinessActivityUserDetail](../resources/skypeforbusinessactivityuserdetail.md) object.

The following table shows the properties that are required when you update the [skypeForBusinessActivityUserDetail](../resources/skypeforbusinessactivityuserdetail.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
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



## Response

If successful, this method returns a `200 OK` response code and an updated [skypeForBusinessActivityUserDetail](../resources/skypeforbusinessactivityuserdetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_skypeforbusinessactivityuserdetail"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/skypeForBusinessActivityUserDetail
Content-Type: application/json
Content-length: 1689

{
  "@odata.type": "#microsoft.graph.skypeForBusinessActivityUserDetail",
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.skypeForBusinessActivityUserDetail",
  "id": "00db821a-821a-00db-1a82-db001a82db00",
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

