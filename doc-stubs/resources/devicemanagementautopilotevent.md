---
title: "deviceManagementAutopilotEvent resource type"
description: "Represents an Autopilot flow event."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementAutopilotEvent resource type

Namespace: microsoft.graph



Represents an Autopilot flow event.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementAutopilotEvents](../api/devicemanagementautopilotevent-list.md)|[deviceManagementAutopilotEvent](../resources/devicemanagementautopilotevent.md) collection|Get a list of the [deviceManagementAutopilotEvent](../resources/devicemanagementautopilotevent.md) objects and their properties.|
|[Create deviceManagementAutopilotEvent](../api/devicemanagementautopilotevent-create.md)|[deviceManagementAutopilotEvent](../resources/devicemanagementautopilotevent.md)|Create a new [deviceManagementAutopilotEvent](../resources/devicemanagementautopilotevent.md) object.|
|[Get deviceManagementAutopilotEvent](../api/devicemanagementautopilotevent-get.md)|[deviceManagementAutopilotEvent](../resources/devicemanagementautopilotevent.md)|Read the properties and relationships of a [deviceManagementAutopilotEvent](../resources/devicemanagementautopilotevent.md) object.|
|[Update deviceManagementAutopilotEvent](../api/devicemanagementautopilotevent-update.md)|[deviceManagementAutopilotEvent](../resources/devicemanagementautopilotevent.md)|Update the properties of a [deviceManagementAutopilotEvent](../resources/devicemanagementautopilotevent.md) object.|
|[Delete deviceManagementAutopilotEvent](../api/devicemanagementautopilotevent-delete.md)|None|Deletes a [deviceManagementAutopilotEvent](../resources/devicemanagementautopilotevent.md) object.|
|[List policyStatusDetails](../api/devicemanagementautopilotevent-list-policystatusdetails.md)|[deviceManagementAutopilotPolicyStatusDetail](../resources/devicemanagementautopilotpolicystatusdetail.md) collection|Get the deviceManagementAutopilotPolicyStatusDetail resources from the policyStatusDetails navigation property.|
|[Create deviceManagementAutopilotPolicyStatusDetail](../api/devicemanagementautopilotevent-post-policystatusdetails.md)|[deviceManagementAutopilotPolicyStatusDetail](../resources/devicemanagementautopilotpolicystatusdetail.md)|Create a new deviceManagementAutopilotPolicyStatusDetail object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
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
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|managedDeviceName|String|Managed device name.|
|osVersion|String|Device operating system version.|
|targetedAppCount|Int32|Count of applications targeted.|
|targetedPolicyCount|Int32|Count of policies targeted.|
|userPrincipalName|String|User principal name used to enroll the device.|
|windows10EnrollmentCompletionPageConfigurationDisplayName|String|Enrollment Status Page profile name|
|windows10EnrollmentCompletionPageConfigurationId|String|Enrollment Status Page profile ID|
|windowsAutopilotDeploymentProfileDisplayName|String|Autopilot profile name.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|policyStatusDetails|[deviceManagementAutopilotPolicyStatusDetail](../resources/devicemanagementautopilotpolicystatusdetail.md) collection|Policy and application status details for this device.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementAutopilotEvent",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementAutopilotEvent",
  "id": "String (identifier)",
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

