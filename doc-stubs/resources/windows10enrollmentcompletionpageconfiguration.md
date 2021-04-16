---
title: "windows10EnrollmentCompletionPageConfiguration resource type"
description: "Windows 10 Enrollment Status Page Configuration"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10EnrollmentCompletionPageConfiguration resource type

Namespace: microsoft.graph



Windows 10 Enrollment Status Page Configuration


Inherits from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windows10EnrollmentCompletionPageConfiguration](../api/windows10enrollmentcompletionpageconfiguration-list.md)|[windows10EnrollmentCompletionPageConfiguration](../resources/windows10enrollmentcompletionpageconfiguration.md) collection|Get a list of the [windows10EnrollmentCompletionPageConfiguration](../resources/windows10enrollmentcompletionpageconfiguration.md) objects and their properties.|
|[Create windows10EnrollmentCompletionPageConfiguration](../api/windows10enrollmentcompletionpageconfiguration-create.md)|[windows10EnrollmentCompletionPageConfiguration](../resources/windows10enrollmentcompletionpageconfiguration.md)|Create a new [windows10EnrollmentCompletionPageConfiguration](../resources/windows10enrollmentcompletionpageconfiguration.md) object.|
|[Get windows10EnrollmentCompletionPageConfiguration](../api/windows10enrollmentcompletionpageconfiguration-get.md)|[windows10EnrollmentCompletionPageConfiguration](../resources/windows10enrollmentcompletionpageconfiguration.md)|Read the properties and relationships of a [windows10EnrollmentCompletionPageConfiguration](../resources/windows10enrollmentcompletionpageconfiguration.md) object.|
|[Update windows10EnrollmentCompletionPageConfiguration](../api/windows10enrollmentcompletionpageconfiguration-update.md)|[windows10EnrollmentCompletionPageConfiguration](../resources/windows10enrollmentcompletionpageconfiguration.md)|Update the properties of a [windows10EnrollmentCompletionPageConfiguration](../resources/windows10enrollmentcompletionpageconfiguration.md) object.|
|[Delete windows10EnrollmentCompletionPageConfiguration](../api/windows10enrollmentcompletionpageconfiguration-delete.md)|None|Deletes a [windows10EnrollmentCompletionPageConfiguration](../resources/windows10enrollmentcompletionpageconfiguration.md) object.|
|[assign](../api/windows10enrollmentcompletionpageconfiguration-assign.md)|None|**TODO: Add Description**|
|[setPriority](../api/windows10enrollmentcompletionpageconfiguration-setpriority.md)|None|**TODO: Add Description**|
|[List assignments](../api/windows10enrollmentcompletionpageconfiguration-list-assignments.md)|[enrollmentConfigurationAssignment](../resources/enrollmentconfigurationassignment.md) collection|Get the enrollmentConfigurationAssignment resources from the assignments navigation property.|
|[Create enrollmentConfigurationAssignment](../api/windows10enrollmentcompletionpageconfiguration-post-assignments.md)|[enrollmentConfigurationAssignment](../resources/enrollmentconfigurationassignment.md)|Create a new enrollmentConfigurationAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowDeviceResetOnInstallFailure|Boolean|Allow or block device reset on installation failure|
|allowDeviceUseOnInstallFailure|Boolean|Allow the user to continue using the device on installation failure|
|allowLogCollectionOnInstallFailure|Boolean|Allow or block log collection on installation failure|
|blockDeviceSetupRetryByUser|Boolean|Allow the user to retry the setup on installation failure|
|createdDateTime|DateTimeOffset|Created date time in UTC of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|customErrorMessage|String|Set custom error message to show upon installation failure|
|description|String|The description of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|disableUserStatusTrackingAfterFirstUser|Boolean|Only show installation progress for first user post enrollment|
|displayName|String|The display name of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|installProgressTimeoutInMinutes|Int32|Set installation progress timeout in minutes|
|lastModifiedDateTime|DateTimeOffset|Last modified date time in UTC of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|priority|Int32|Priority is used when a user exists in multiple groups that are assigned enrollment configuration. Users are subject only to the configuration with the lowest priority value. Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|roleScopeTagIds|String collection|Optional role scope tags for the enrollment restrictions. Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|selectedMobileAppIds|String collection|Selected applications to track the installation status|
|showInstallationProgress|Boolean|Show or hide installation progress to user|
|trackInstallProgressForAutopilotOnly|Boolean|Only show installation progress for Autopilot enrollment scenarios|
|version|Int32|The version of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[enrollmentConfigurationAssignment](../resources/enrollmentconfigurationassignment.md) collection|The list of group assignments for the device configuration profile Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windows10EnrollmentCompletionPageConfiguration",
  "baseType": "microsoft.graph.deviceEnrollmentConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10EnrollmentCompletionPageConfiguration",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "priority": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "allowDeviceResetOnInstallFailure": "Boolean",
  "allowDeviceUseOnInstallFailure": "Boolean",
  "allowLogCollectionOnInstallFailure": "Boolean",
  "blockDeviceSetupRetryByUser": "Boolean",
  "customErrorMessage": "String",
  "disableUserStatusTrackingAfterFirstUser": "Boolean",
  "installProgressTimeoutInMinutes": "Integer",
  "selectedMobileAppIds": [
    "String"
  ],
  "showInstallationProgress": "Boolean",
  "trackInstallProgressForAutopilotOnly": "Boolean"
}
```

