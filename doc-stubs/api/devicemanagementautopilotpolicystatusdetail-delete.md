---
title: "Delete deviceManagementAutopilotPolicyStatusDetail"
description: "Deletes a deviceManagementAutopilotPolicyStatusDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Delete deviceManagementAutopilotPolicyStatusDetail
Namespace: microsoft.graph



Deletes a [deviceManagementAutopilotPolicyStatusDetail](../resources/devicemanagementautopilotpolicystatusdetail.md) object.

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
DELETE /deviceManagement/autopilotEvents/{deviceManagementAutopilotEventId}/policyStatusDetails/{deviceManagementAutopilotPolicyStatusDetailId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "delete_devicemanagementautopilotpolicystatusdetail"
}
-->
``` http
DELETE https://graph.microsoft.com/v1.0/deviceManagement/autopilotEvents/{deviceManagementAutopilotEventId}/policyStatusDetails/{deviceManagementAutopilotPolicyStatusDetailId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 204 No Content
```

