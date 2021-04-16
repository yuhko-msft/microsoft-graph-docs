---
title: "Get activeDirectoryWindowsAutopilotDeploymentProfile"
description: "Read the properties and relationships of an activeDirectoryWindowsAutopilotDeploymentProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get activeDirectoryWindowsAutopilotDeploymentProfile
Namespace: microsoft.graph



Read the properties and relationships of an [activeDirectoryWindowsAutopilotDeploymentProfile](../resources/activedirectorywindowsautopilotdeploymentprofile.md) object.

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
GET ** Entity URI for microsoft.graph.activeDirectoryWindowsAutopilotDeploymentProfile not found
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

If successful, this method returns a `200 OK` response code and an [activeDirectoryWindowsAutopilotDeploymentProfile](../resources/activedirectorywindowsautopilotdeploymentprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_activedirectorywindowsautopilotdeploymentprofile"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.activeDirectoryWindowsAutopilotDeploymentProfile not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.activeDirectoryWindowsAutopilotDeploymentProfile"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.activeDirectoryWindowsAutopilotDeploymentProfile",
    "id": "f1c4c477-c477-f1c4-77c4-c4f177c4c4f1",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "deviceNameTemplate": "String",
    "deviceType": "String",
    "displayName": "String",
    "enableWhiteGlove": "Boolean",
    "enrollmentStatusScreenSettings": {
      "@odata.type": "microsoft.graph.windowsEnrollmentStatusScreenSettings"
    },
    "extractHardwareHash": "Boolean",
    "language": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "outOfBoxExperienceSettings": {
      "@odata.type": "microsoft.graph.outOfBoxExperienceSettings"
    },
    "roleScopeTagIds": [
      "String"
    ],
    "hybridAzureADJoinSkipConnectivityCheck": "Boolean"
  }
}
```

