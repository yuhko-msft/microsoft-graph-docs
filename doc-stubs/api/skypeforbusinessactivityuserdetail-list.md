---
title: "List skypeForBusinessActivityUserDetails"
description: "Get a list of the skypeForBusinessActivityUserDetail objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List skypeForBusinessActivityUserDetails
Namespace: microsoft.graph



Get a list of the [skypeForBusinessActivityUserDetail](../resources/skypeforbusinessactivityuserdetail.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.skypeForBusinessActivityUserDetail not found
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

If successful, this method returns a `200 OK` response code and a collection of [skypeForBusinessActivityUserDetail](../resources/skypeforbusinessactivityuserdetail.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_skypeforbusinessactivityuserdetail"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.skypeForBusinessActivityUserDetail not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.skypeForBusinessActivityUserDetail)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
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
  ]
}
```

