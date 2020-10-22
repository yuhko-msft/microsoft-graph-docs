---
title: "Get skypeForBusinessActivityUserDetail"
description: "Read the properties and relationships of a skypeForBusinessActivityUserDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get skypeForBusinessActivityUserDetail
Namespace: microsoft.graph

Read the properties and relationships of a [skypeForBusinessActivityUserDetail](../resources/skypeforbusinessactivityuserdetail.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
GET /skypeForBusinessActivityUserDetail
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [skypeForBusinessActivityUserDetail](../resources/skypeforbusinessactivityuserdetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_skypeforbusinessactivityuserdetail"
}
-->
``` http
GET https://graph.microsoft.com/beta/skypeForBusinessActivityUserDetail
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.skypeForBusinessActivityUserDetail"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
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
}
```

