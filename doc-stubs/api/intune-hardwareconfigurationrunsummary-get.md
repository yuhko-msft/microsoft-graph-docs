---
title: "Get hardwareConfigurationRunSummary"
description: "Read the properties and relationships of a hardwareConfigurationRunSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get hardwareConfigurationRunSummary
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [hardwareConfigurationRunSummary](../resources/intune-hardwareconfigurationrunsummary.md) object.

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
GET /deviceManagement/hardwareConfigurations/{hardwareConfigurationId}/runSummary
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

If successful, this method returns a `200 OK` response code and a [hardwareConfigurationRunSummary](../resources/intune-hardwareconfigurationrunsummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_hardwareconfigurationrunsummary"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceManagement/hardwareConfigurations/{hardwareConfigurationId}/runSummary
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.hardwareConfigurationRunSummary"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.hardwareConfigurationRunSummary",
    "id": "3bf7d848-d848-3bf7-48d8-f73b48d8f73b",
    "successfulDeviceCount": "Integer",
    "failedDeviceCount": "Integer",
    "pendingDeviceCount": "Integer",
    "errorDeviceCount": "Integer",
    "notApplicableDeviceCount": "Integer",
    "unknownDeviceCount": "Integer",
    "successfulUserCount": "Integer",
    "failedUserCount": "Integer",
    "pendingUserCount": "Integer",
    "errorUserCount": "Integer",
    "notApplicableUserCount": "Integer",
    "unknownUserCount": "Integer",
    "lastRunDateTime": "String (timestamp)"
  }
}
```

