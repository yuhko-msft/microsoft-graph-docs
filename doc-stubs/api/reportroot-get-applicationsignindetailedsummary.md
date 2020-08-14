---
title: "Get applicationSignInDetailedSummary"
description: "Read the properties and relationships of an applicationSignInDetailedSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get applicationSignInDetailedSummary
Namespace: microsoft.graph

Read the properties and relationships of an [applicationSignInDetailedSummary](../resources/applicationsignindetailedsummary.md) object.

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
GET /reports/applicationSignInDetailedSummary
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

If successful, this method returns a `200 OK` response code and an [applicationSignInDetailedSummary](../resources/applicationsignindetailedsummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_applicationsignindetailedsummary"
}
-->
``` http
GET https://graph.microsoft.com/beta/reports/applicationSignInDetailedSummary
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.applicationSignInDetailedSummary"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.applicationSignInDetailedSummary",
    "id": "afc1b742-b742-afc1-42b7-c1af42b7c1af",
    "appId": "String",
    "appDisplayName": "String",
    "status": {
      "@odata.type": "microsoft.graph.signInStatus"
    },
    "signInCount": "Integer",
    "aggregatedEventDateTime": "String (timestamp)"
  }
}
```

