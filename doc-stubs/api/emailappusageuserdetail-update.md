---
title: "Update emailAppUsageUserDetail"
description: "Update the properties of an emailAppUsageUserDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update emailAppUsageUserDetail
Namespace: microsoft.graph

Update the properties of an [emailAppUsageUserDetail](../resources/emailappusageuserdetail.md) object.

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
PATCH /emailAppUsageUserDetail
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [emailAppUsageUserDetail](../resources/emailappusageuserdetail.md) object.

The following table shows the properties that are required when you create the [emailAppUsageUserDetail](../resources/emailappusageuserdetail.md).

|Property|Type|Description|
|:---|:---|:---|
|reportRefreshDate|Date|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|isDeleted|Boolean|**TODO: Add Description**|
|deletedDate|Date|**TODO: Add Description**|
|lastActivityDate|Date|**TODO: Add Description**|
|mailForMac|String collection|**TODO: Add Description**|
|outlookForMac|String collection|**TODO: Add Description**|
|outlookForWindows|String collection|**TODO: Add Description**|
|outlookForMobile|String collection|**TODO: Add Description**|
|otherForMobile|String collection|**TODO: Add Description**|
|outlookForWeb|String collection|**TODO: Add Description**|
|pop3App|String collection|**TODO: Add Description**|
|imap4App|String collection|**TODO: Add Description**|
|smtpApp|String collection|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [emailAppUsageUserDetail](../resources/emailappusageuserdetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_emailappusageuserdetail"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/emailAppUsageUserDetail
Content-Type: application/json
Content-length: 638

{
  "@odata.type": "#microsoft.graph.emailAppUsageUserDetail",
  "reportRefreshDate": "Date",
  "userPrincipalName": "String",
  "displayName": "String",
  "isDeleted": "Boolean",
  "deletedDate": "Date",
  "lastActivityDate": "Date",
  "mailForMac": [
    "String"
  ],
  "outlookForMac": [
    "String"
  ],
  "outlookForWindows": [
    "String"
  ],
  "outlookForMobile": [
    "String"
  ],
  "otherForMobile": [
    "String"
  ],
  "outlookForWeb": [
    "String"
  ],
  "pop3App": [
    "String"
  ],
  "imap4App": [
    "String"
  ],
  "smtpApp": [
    "String"
  ],
  "reportPeriod": "String"
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
  "@odata.type": "#microsoft.graph.emailAppUsageUserDetail",
  "reportRefreshDate": "Date",
  "userPrincipalName": "String",
  "displayName": "String",
  "isDeleted": "Boolean",
  "deletedDate": "Date",
  "lastActivityDate": "Date",
  "mailForMac": [
    "String"
  ],
  "outlookForMac": [
    "String"
  ],
  "outlookForWindows": [
    "String"
  ],
  "outlookForMobile": [
    "String"
  ],
  "otherForMobile": [
    "String"
  ],
  "outlookForWeb": [
    "String"
  ],
  "pop3App": [
    "String"
  ],
  "imap4App": [
    "String"
  ],
  "smtpApp": [
    "String"
  ],
  "reportPeriod": "String"
}
```

