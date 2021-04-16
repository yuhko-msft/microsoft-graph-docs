---
title: "Create deviceManagementAutopilotEvent"
description: "Create a new deviceManagementAutopilotEvent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementAutopilotEvent
Namespace: microsoft.graph



Create a new [deviceManagementAutopilotEvent](../resources/devicemanagementautopilotevent.md) object.

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
POST /deviceManagement/autopilotEvents
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementAutopilotEvent](../resources/devicemanagementautopilotevent.md) object.

The following table shows the properties that are required when you create the [deviceManagementAutopilotEvent](../resources/devicemanagementautopilotevent.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|accountSetupDuration|Duration|Time spent in user ESP.|
|accountSetupStatus|windowsAutopilotDeploymentState|Deployment status for the enrollment status page account setup phase. Possible values are: `unknown`, `success`, `inProgress`, `failure`, `successWithTimeout`, `notAttempted`, `disabled`.|
|deploymentDuration|Duration|Autopilot deployment duration including enrollment.|
|deploymentEndDateTime|DateTimeOffset|Deployment end time.|
|deploymentStartDateTime|DateTimeOffset|Deployment start time.|
|deploymentState|windowsAutopilotDeploymentState|Deployment state like Success, Failure, InProgress, SuccessWithTimeout. Possible values are: `unknown`, `success`, `inProgress`, `failure`, `successWithTimeout`, `notAttempted`, `disabled`.|
|deploymentTotalDuration|Duration|Total deployment duration from enrollment to Desktop screen.|
|deviceId|String|Device id associated with the object|
|devicePreparationDuration|Duration|Time spent in device enrollment.|
|deviceRegisteredDateTime|DateTimeOffset|Device registration date.|
|deviceSerialNumber|String|Device serial number.|
|deviceSetupDuration|Duration|Time spent in device ESP.|
|deviceSetupStatus|windowsAutopilotDeploymentState|Deployment status for the enrollment status page device setup phase. Possible values are: `unknown`, `success`, `inProgress`, `failure`, `successWithTimeout`, `notAttempted`, `disabled`.|
|enrollmentFailureDetails|String|Enrollment failure details.|
|enrollmentStartDateTime|DateTimeOffset|Device enrollment start date.|
|enrollmentState|enrollmentState|Enrollment state like Enrolled, Failed. Possible values are: `unknown`, `enrolled`, `pendingReset`, `failed`, `notContacted`, `blocked`.|
|enrollmentType|windowsAutopilotEnrollmentType|Enrollment type. Possible values are: `unknown`, `azureADJoinedWithAutopilotProfile`, `offlineDomainJoined`, `azureADJoinedUsingDeviceAuthWithAutopilotProfile`, `azureADJoinedUsingDeviceAuthWithoutAutopilotProfile`, `azureADJoinedWithOfflineAutopilotProfile`, `azureADJoinedWithWhiteGlove`, `offlineDomainJoinedWithWhiteGlove`, `offlineDomainJoinedWithOfflineAutopilotProfile`.|
|eventDateTime|DateTimeOffset|Time when the event occurred .|
|managedDeviceName|String|Managed device name.|
|osVersion|String|Device operating system version.|
|targetedAppCount|Int32|Count of applications targeted.|
|targetedPolicyCount|Int32|Count of policies targeted.|
|userPrincipalName|String|User principal name used to enroll the device.|
|windows10EnrollmentCompletionPageConfigurationDisplayName|String|Enrollment Status Page profile name|
|windows10EnrollmentCompletionPageConfigurationId|String|Enrollment Status Page profile ID|
|windowsAutopilotDeploymentProfileDisplayName|String|Autopilot profile name.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementAutopilotEvent](../resources/devicemanagementautopilotevent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementautopilotevent_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/autopilotEvents
Content-Type: application/json
Content-length: 1196

{
  "@odata.type": "#microsoft.graph.deviceManagementAutopilotEvent",
  "accountSetupDuration": "String (duration)",
  "accountSetupStatus": "String",
  "deploymentDuration": "String (duration)",
  "deploymentEndDateTime": "String (timestamp)",
  "deploymentStartDateTime": "String (timestamp)",
  "deploymentState": "String",
  "deploymentTotalDuration": "String (duration)",
  "deviceId": "String",
  "devicePreparationDuration": "String (duration)",
  "deviceRegisteredDateTime": "String (timestamp)",
  "deviceSerialNumber": "String",
  "deviceSetupDuration": "String (duration)",
  "deviceSetupStatus": "String",
  "enrollmentFailureDetails": "String",
  "enrollmentStartDateTime": "String (timestamp)",
  "enrollmentState": "String",
  "enrollmentType": "String",
  "eventDateTime": "String (timestamp)",
  "managedDeviceName": "String",
  "osVersion": "String",
  "targetedAppCount": "Integer",
  "targetedPolicyCount": "Integer",
  "userPrincipalName": "String",
  "windows10EnrollmentCompletionPageConfigurationDisplayName": "String",
  "windows10EnrollmentCompletionPageConfigurationId": "String",
  "windowsAutopilotDeploymentProfileDisplayName": "String"
}
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
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementAutopilotEvent",
  "id": "1b25ec54-ec54-1b25-54ec-251b54ec251b",
  "accountSetupDuration": "String (duration)",
  "accountSetupStatus": "String",
  "deploymentDuration": "String (duration)",
  "deploymentEndDateTime": "String (timestamp)",
  "deploymentStartDateTime": "String (timestamp)",
  "deploymentState": "String",
  "deploymentTotalDuration": "String (duration)",
  "deviceId": "String",
  "devicePreparationDuration": "String (duration)",
  "deviceRegisteredDateTime": "String (timestamp)",
  "deviceSerialNumber": "String",
  "deviceSetupDuration": "String (duration)",
  "deviceSetupStatus": "String",
  "enrollmentFailureDetails": "String",
  "enrollmentStartDateTime": "String (timestamp)",
  "enrollmentState": "String",
  "enrollmentType": "String",
  "eventDateTime": "String (timestamp)",
  "managedDeviceName": "String",
  "osVersion": "String",
  "targetedAppCount": "Integer",
  "targetedPolicyCount": "Integer",
  "userPrincipalName": "String",
  "windows10EnrollmentCompletionPageConfigurationDisplayName": "String",
  "windows10EnrollmentCompletionPageConfigurationId": "String",
  "windowsAutopilotDeploymentProfileDisplayName": "String"
}
```

