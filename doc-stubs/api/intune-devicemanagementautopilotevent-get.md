---
title: "Get deviceManagementAutopilotEvent"
description: "Read the properties and relationships of a deviceManagementAutopilotEvent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get deviceManagementAutopilotEvent
Namespace: microsoft.graph

Read the properties and relationships of a [deviceManagementAutopilotEvent](../resources/intune-devicemanagementautopilotevent.md) object.

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
GET /deviceManagement/autopilotEvents/{deviceManagementAutopilotEventId}
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

If successful, this method returns a `200 OK` response code and a [deviceManagementAutopilotEvent](../resources/intune-devicemanagementautopilotevent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_devicemanagementautopilotevent"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceManagement/autopilotEvents/{deviceManagementAutopilotEventId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementAutopilotEvent"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.deviceManagementAutopilotEvent",
    "id": "d8ac7fe8-7fe8-d8ac-e87f-acd8e87facd8",
    "deviceId": "String",
    "eventDateTime": "String (timestamp)",
    "deviceRegisteredDateTime": "String (timestamp)",
    "enrollmentStartDateTime": "String (timestamp)",
    "enrollmentType": "String",
    "deviceSerialNumber": "String",
    "managedDeviceName": "String",
    "userPrincipalName": "String",
    "windowsAutopilotDeploymentProfileDisplayName": "String",
    "enrollmentState": "String",
    "windows10EnrollmentCompletionPageConfigurationDisplayName": "String",
    "windows10EnrollmentCompletionPageConfigurationId": "String",
    "deploymentState": "String",
    "deviceSetupStatus": "String",
    "accountSetupStatus": "String",
    "osVersion": "String",
    "deploymentDuration": "String (duration)",
    "deploymentTotalDuration": "String (duration)",
    "devicePreparationDuration": "String (duration)",
    "deviceSetupDuration": "String (duration)",
    "accountSetupDuration": "String (duration)",
    "deploymentStartDateTime": "String (timestamp)",
    "deploymentEndDateTime": "String (timestamp)",
    "targetedAppCount": "Integer",
    "targetedPolicyCount": "Integer",
    "enrollmentFailureDetails": "String"
  }
}
```

