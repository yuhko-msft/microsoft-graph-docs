---
title: "reportRoot: getEmailAppUsageUserDetail"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# reportRoot: getEmailAppUsageUserDetail
Namespace: microsoft.graph



**TODO: Add Description**

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
GET /reports/getEmailAppUsageUserDetail
GET /print/reports/getEmailAppUsageUserDetail
```

## Function parameters
In the request URL, provide the following query parameters with values.
The following table shows the parameters that can be used with this function.

|Parameter|Type|Description|
|:---|:---|:---|
|period|String|**TODO: Add Description**|


## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this function returns a `200 OK` response code and a [emailAppUsageUserDetail](../resources/emailappusageuserdetail.md) collection in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "reportroot_getemailappusageuserdetail"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/reports/getEmailAppUsageUserDetail(period='parameterValue')
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.emailAppUsageUserDetail)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.emailAppUsageUserDetail",
      "id": "String (identifier)",
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
  ]
}
```

