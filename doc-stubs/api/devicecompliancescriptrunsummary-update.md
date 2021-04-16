---
title: "Update deviceComplianceScriptRunSummary"
description: "Update the properties of a deviceComplianceScriptRunSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceComplianceScriptRunSummary
Namespace: microsoft.graph



Update the properties of a [deviceComplianceScriptRunSummary](../resources/devicecompliancescriptrunsummary.md) object.

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
PATCH /deviceManagement/deviceComplianceScripts/{deviceComplianceScriptId}/runSummary
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceComplianceScriptRunSummary](../resources/devicecompliancescriptrunsummary.md) object.

The following table shows the properties that are required when you update the [deviceComplianceScriptRunSummary](../resources/devicecompliancescriptrunsummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|detectionScriptErrorDeviceCount|Int32|Number of devices on which the detection script execution encountered an error and did not complete. Valid values -2147483648 to 2147483647|
|detectionScriptPendingDeviceCount|Int32|Number of devices which have not yet run the latest version of the device compliance script. Valid values -2147483648 to 2147483647|
|issueDetectedDeviceCount|Int32|Number of devices for which the detection script found an issue. Valid values -2147483648 to 2147483647|
|lastScriptRunDateTime|DateTimeOffset|Last run time for the script across all devices|
|noIssueDetectedDeviceCount|Int32|Number of devices for which the detection script did not find an issue and the device is healthy. Valid values -2147483648 to 2147483647|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceComplianceScriptRunSummary](../resources/devicecompliancescriptrunsummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicecompliancescriptrunsummary"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/deviceComplianceScripts/{deviceComplianceScriptId}/runSummary
Content-Type: application/json
Content-length: 310

{
  "@odata.type": "#microsoft.graph.deviceComplianceScriptRunSummary",
  "detectionScriptErrorDeviceCount": "Integer",
  "detectionScriptPendingDeviceCount": "Integer",
  "issueDetectedDeviceCount": "Integer",
  "lastScriptRunDateTime": "String (timestamp)",
  "noIssueDetectedDeviceCount": "Integer"
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
  "@odata.type": "#microsoft.graph.deviceComplianceScriptRunSummary",
  "id": "386f263a-263a-386f-3a26-6f383a266f38",
  "detectionScriptErrorDeviceCount": "Integer",
  "detectionScriptPendingDeviceCount": "Integer",
  "issueDetectedDeviceCount": "Integer",
  "lastScriptRunDateTime": "String (timestamp)",
  "noIssueDetectedDeviceCount": "Integer"
}
```

