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

Read the properties and relationships of an [activeDirectoryWindowsAutopilotDeploymentProfile](../resources/intune-activedirectorywindowsautopilotdeploymentprofile.md) object.

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

If successful, this method returns a `200 OK` response code and an [activeDirectoryWindowsAutopilotDeploymentProfile](../resources/intune-activedirectorywindowsautopilotdeploymentprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_activedirectorywindowsautopilotdeploymentprofile"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.activeDirectoryWindowsAutopilotDeploymentProfile not found
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
    "id": "0763d9fc-d9fc-0763-fcd9-6307fcd96307",
    "displayName": "String",
    "description": "String",
    "language": "String",
    "createdDateTime": "String (timestamp)",
    "lastModifiedDateTime": "String (timestamp)",
    "outOfBoxExperienceSettings": {
      "@odata.type": "microsoft.graph.outOfBoxExperienceSettings"
    },
    "enrollmentStatusScreenSettings": {
      "@odata.type": "microsoft.graph.windowsEnrollmentStatusScreenSettings"
    },
    "extractHardwareHash": "Boolean",
    "deviceNameTemplate": "String",
    "deviceType": "String",
    "enableWhiteGlove": "Boolean",
    "roleScopeTagIds": [
      "String"
    ],
    "hybridAzureADJoinSkipConnectivityCheck": "Boolean"
  }
}
```

