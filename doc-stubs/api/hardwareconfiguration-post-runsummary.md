---
title: "Create hardwareConfigurationRunSummary"
description: "Create a new hardwareConfigurationRunSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create hardwareConfigurationRunSummary
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [hardwareConfigurationRunSummary](../resources/intune-hardwareconfigurationrunsummary.md) object.

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
POST ** Collection URI for microsoft.graph.hardwareConfigurationRunSummary not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [hardwareConfigurationRunSummary](../resources/intune-hardwareconfigurationrunsummary.md) object.

You can specify the following properties when creating a **hardwareConfigurationRunSummary**.

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

If successful, this method returns a `201 Created` response code and a [hardwareConfigurationRunSummary](../resources/intune-hardwareconfigurationrunsummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_hardwareconfigurationrunsummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.hardwareConfigurationRunSummary not found
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
  "truncated": true,
  "@odata.type": "microsoft.graph.hardwareConfigurationRunSummary"
}
-->
``` http
HTTP/1.1 201 Created
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

