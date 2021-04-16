---
title: "Create deviceHealthScriptRunSummary"
description: "Create a new deviceHealthScriptRunSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceHealthScriptRunSummary
Namespace: microsoft.graph



Create a new [deviceHealthScriptRunSummary](../resources/devicehealthscriptrunsummary.md) object.

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
POST ** Collection URI for microsoft.graph.deviceHealthScriptRunSummary not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceHealthScriptRunSummary](../resources/devicehealthscriptrunsummary.md) object.

The following table shows the properties that are required when you create the [deviceHealthScriptRunSummary](../resources/devicehealthscriptrunsummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|detectionScriptErrorDeviceCount|Int32|Number of devices on which the detection script execution encountered an error and did not complete|
|detectionScriptPendingDeviceCount|Int32|Number of devices which have not yet run the latest version of the device health script|
|issueDetectedDeviceCount|Int32|Number of devices for which the detection script found an issue|
|issueRemediatedCumulativeDeviceCount|Int32|Number of devices that were remediated over the last 30 days|
|issueRemediatedDeviceCount|Int32|Number of devices for which the remediation script was able to resolve the detected issue|
|issueReoccurredDeviceCount|Int32|Number of devices for which the remediation script executed successfully but failed to resolve the detected issue|
|lastScriptRunDateTime|DateTimeOffset|Last run time for the script across all devices|
|noIssueDetectedDeviceCount|Int32|Number of devices for which the detection script did not find an issue and the device is healthy|
|remediationScriptErrorDeviceCount|Int32|Number of devices for which the remediation script execution encountered an error and did not complete|
|remediationSkippedDeviceCount|Int32|Number of devices for which remediation was skipped|



## Response

If successful, this method returns a `201 Created` response code and a [deviceHealthScriptRunSummary](../resources/devicehealthscriptrunsummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicehealthscriptrunsummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.deviceHealthScriptRunSummary not found
Content-Type: application/json
Content-length: 546

{
  "@odata.type": "#microsoft.graph.deviceHealthScriptRunSummary",
  "detectionScriptErrorDeviceCount": "Integer",
  "detectionScriptPendingDeviceCount": "Integer",
  "issueDetectedDeviceCount": "Integer",
  "issueRemediatedCumulativeDeviceCount": "Integer",
  "issueRemediatedDeviceCount": "Integer",
  "issueReoccurredDeviceCount": "Integer",
  "lastScriptRunDateTime": "String (timestamp)",
  "noIssueDetectedDeviceCount": "Integer",
  "remediationScriptErrorDeviceCount": "Integer",
  "remediationSkippedDeviceCount": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceHealthScriptRunSummary"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceHealthScriptRunSummary",
  "id": "871dff59-ff59-871d-59ff-1d8759ff1d87",
  "detectionScriptErrorDeviceCount": "Integer",
  "detectionScriptPendingDeviceCount": "Integer",
  "issueDetectedDeviceCount": "Integer",
  "issueRemediatedCumulativeDeviceCount": "Integer",
  "issueRemediatedDeviceCount": "Integer",
  "issueReoccurredDeviceCount": "Integer",
  "lastScriptRunDateTime": "String (timestamp)",
  "noIssueDetectedDeviceCount": "Integer",
  "remediationScriptErrorDeviceCount": "Integer",
  "remediationSkippedDeviceCount": "Integer"
}
```

