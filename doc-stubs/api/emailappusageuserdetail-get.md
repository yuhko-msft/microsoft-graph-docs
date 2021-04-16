---
title: "Get emailAppUsageUserDetail"
description: "Read the properties and relationships of an emailAppUsageUserDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get emailAppUsageUserDetail
Namespace: microsoft.graph



Read the properties and relationships of an [emailAppUsageUserDetail](../resources/emailappusageuserdetail.md) object.

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
GET /emailAppUsageUserDetail
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

If successful, this method returns a `200 OK` response code and an [emailAppUsageUserDetail](../resources/emailappusageuserdetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_emailappusageuserdetail"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/emailAppUsageUserDetail
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.emailAppUsageUserDetail"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.emailAppUsageUserDetail",
    "id": "8c7443dd-43dd-8c74-dd43-748cdd43748c",
    "deletedDate": "Date",
    "displayName": "String",
    "imap4App": [
      "String"
    ],
    "isDeleted": "Boolean",
    "lastActivityDate": "Date",
    "mailForMac": [
      "String"
    ],
    "otherForMobile": [
      "String"
    ],
    "outlookForMac": [
      "String"
    ],
    "outlookForMobile": [
      "String"
    ],
    "outlookForWeb": [
      "String"
    ],
    "outlookForWindows": [
      "String"
    ],
    "pop3App": [
      "String"
    ],
    "reportPeriod": "String",
    "reportRefreshDate": "Date",
    "smtpApp": [
      "String"
    ],
    "userPrincipalName": "String"
  }
}
```

