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
GET https://graph.microsoft.com/v1.0/skypeForBusinessActivityUserDetail
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
}
```

