---
title: "List deviceComplianceScriptRunSummary"
description: "Get the deviceComplianceScriptRunSummary resources from the runSummary navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List deviceComplianceScriptRunSummary
Namespace: microsoft.graph



Get the deviceComplianceScriptRunSummary resources from the runSummary navigation property.

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
GET /deviceManagement/deviceComplianceScripts/{deviceComplianceScriptId}/runSummary
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

If successful, this method returns a `200 OK` response code and a collection of [deviceComplianceScriptRunSummary](../resources/devicecompliancescriptrunsummary.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_devicecompliancescriptrunsummary"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/deviceComplianceScripts/{deviceComplianceScriptId}/runSummary
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.deviceComplianceScriptRunSummary)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.deviceComplianceScriptRunSummary",
      "id": "386f263a-263a-386f-3a26-6f383a266f38",
      "detectionScriptErrorDeviceCount": "Integer",
      "detectionScriptPendingDeviceCount": "Integer",
      "issueDetectedDeviceCount": "Integer",
      "lastScriptRunDateTime": "String (timestamp)",
      "noIssueDetectedDeviceCount": "Integer"
    }
  ]
}
```

