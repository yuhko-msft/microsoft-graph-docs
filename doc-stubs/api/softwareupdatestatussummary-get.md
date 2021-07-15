---
title: "Get softwareUpdateStatusSummary"
description: "Read the properties and relationships of a softwareUpdateStatusSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get softwareUpdateStatusSummary
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [softwareUpdateStatusSummary](../resources/softwareupdatestatussummary.md) object.

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
GET /deviceManagement/softwareUpdateStatusSummary
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

If successful, this method returns a `200 OK` response code and a [softwareUpdateStatusSummary](../resources/softwareupdatestatussummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_softwareupdatestatussummary"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceManagement/softwareUpdateStatusSummary
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.softwareUpdateStatusSummary"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.softwareUpdateStatusSummary",
    "id": "5fbe82a0-82a0-5fbe-a082-be5fa082be5f",
    "compliantDeviceCount": "Integer",
    "compliantUserCount": "Integer",
    "conflictDeviceCount": "Integer",
    "conflictUserCount": "Integer",
    "displayName": "String",
    "errorDeviceCount": "Integer",
    "errorUserCount": "Integer",
    "nonCompliantDeviceCount": "Integer",
    "nonCompliantUserCount": "Integer",
    "notApplicableDeviceCount": "Integer",
    "notApplicableUserCount": "Integer",
    "remediatedDeviceCount": "Integer",
    "remediatedUserCount": "Integer",
    "unknownDeviceCount": "Integer",
    "unknownUserCount": "Integer"
  }
}
```

