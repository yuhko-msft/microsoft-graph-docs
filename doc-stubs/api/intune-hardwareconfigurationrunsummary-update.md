---
title: "Update hardwareConfigurationRunSummary"
description: "Update the properties of a hardwareConfigurationRunSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update hardwareConfigurationRunSummary
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [hardwareConfigurationRunSummary](../resources/intune-hardwareconfigurationrunsummary.md) object.

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
PATCH /deviceManagement/hardwareConfigurations/{hardwareConfigurationId}/runSummary
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|successfulDeviceCount|Int32|**TODO: Add Description** Required.|
|failedDeviceCount|Int32|**TODO: Add Description** Required.|
|pendingDeviceCount|Int32|**TODO: Add Description** Required.|
|errorDeviceCount|Int32|**TODO: Add Description** Required.|
|notApplicableDeviceCount|Int32|**TODO: Add Description** Required.|
|unknownDeviceCount|Int32|**TODO: Add Description** Required.|
|successfulUserCount|Int32|**TODO: Add Description** Required.|
|failedUserCount|Int32|**TODO: Add Description** Required.|
|pendingUserCount|Int32|**TODO: Add Description** Required.|
|errorUserCount|Int32|**TODO: Add Description** Required.|
|notApplicableUserCount|Int32|**TODO: Add Description** Required.|
|unknownUserCount|Int32|**TODO: Add Description** Required.|
|lastRunDateTime|DateTimeOffset|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [hardwareConfigurationRunSummary](../resources/intune-hardwareconfigurationrunsummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_hardwareconfigurationrunsummary"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/hardwareConfigurations/{hardwareConfigurationId}/runSummary
Content-Type: application/json
Content-length: 549

{
  "@odata.type": "#microsoft.graph.hardwareConfigurationRunSummary",
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
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
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
```

