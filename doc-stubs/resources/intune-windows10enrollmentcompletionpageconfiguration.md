---
title: "windows10EnrollmentCompletionPageConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10EnrollmentCompletionPageConfiguration resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windows10EnrollmentCompletionPageConfiguration](../api/intune-windows10enrollmentcompletionpageconfiguration-list.md)|[windows10EnrollmentCompletionPageConfiguration](../resources/intune-windows10enrollmentcompletionpageconfiguration.md) collection|Get a list of the [windows10EnrollmentCompletionPageConfiguration](../resources/windows10enrollmentcompletionpageconfiguration.md) objects and their properties.|
|[Create windows10EnrollmentCompletionPageConfiguration](../api/intune-windows10enrollmentcompletionpageconfiguration-create.md)|[windows10EnrollmentCompletionPageConfiguration](../resources/intune-windows10enrollmentcompletionpageconfiguration.md)|Create a new [windows10EnrollmentCompletionPageConfiguration](../resources/intune-windows10enrollmentcompletionpageconfiguration.md) object.|
|[Get windows10EnrollmentCompletionPageConfiguration](../api/intune-windows10enrollmentcompletionpageconfiguration-get.md)|[windows10EnrollmentCompletionPageConfiguration](../resources/intune-windows10enrollmentcompletionpageconfiguration.md)|Read the properties and relationships of a [windows10EnrollmentCompletionPageConfiguration](../resources/intune-windows10enrollmentcompletionpageconfiguration.md) object.|
|[Update windows10EnrollmentCompletionPageConfiguration](../api/intune-windows10enrollmentcompletionpageconfiguration-update.md)|[windows10EnrollmentCompletionPageConfiguration](../resources/intune-windows10enrollmentcompletionpageconfiguration.md)|Update the properties of a [windows10EnrollmentCompletionPageConfiguration](../resources/intune-windows10enrollmentcompletionpageconfiguration.md) object.|
|[Delete windows10EnrollmentCompletionPageConfiguration](../api/intune-windows10enrollmentcompletionpageconfiguration-delete.md)|None|Deletes a [windows10EnrollmentCompletionPageConfiguration](../resources/intune-windows10enrollmentcompletionpageconfiguration.md) object.|
|[setPriority](../api/intune-windows10enrollmentcompletionpageconfiguration-setpriority.md)|None|**TODO: Add Description**|
|[assign](../api/intune-windows10enrollmentcompletionpageconfiguration-assign.md)|None|**TODO: Add Description**|
|[List assignments](../api/intune-windows10enrollmentcompletionpageconfiguration-list-assignments.md)|[enrollmentConfigurationAssignment](../resources/intune-enrollmentconfigurationassignment.md) collection|Get the enrollmentConfigurationAssignment resources from the assignments navigation property.|
|[Create assignments](../api/intune-windows10enrollmentcompletionpageconfiguration-post-assignments.md)|[enrollmentConfigurationAssignment](../resources/intune-enrollmentconfigurationassignment.md)|Create a new enrollmentConfigurationAssignment object.|
|[Get assignments](../api/intune-windows10enrollmentcompletionpageconfiguration-get-enrollmentconfigurationassignment.md)|[enrollmentConfigurationAssignment](../resources/intune-enrollmentconfigurationassignment.md)|Read the properties and relationships of an [enrollmentConfigurationAssignment](../resources/intune-enrollmentconfigurationassignment.md) object.|
|[Update assignments](../api/intune-windows10enrollmentcompletionpageconfiguration-update-assignments.md)|[enrollmentConfigurationAssignment](../resources/intune-enrollmentconfigurationassignment.md)|Update the properties of an assignments object.|
|[Delete assignments](../api/intune-windows10enrollmentcompletionpageconfiguration-delete-assignments.md)|None|Delete an [enrollmentConfigurationAssignment](../resources/intune-enrollmentconfigurationassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowDeviceResetOnInstallFailure|Boolean|**TODO: Add Description**|
|allowDeviceUseOnInstallFailure|Boolean|**TODO: Add Description**|
|allowLogCollectionOnInstallFailure|Boolean|**TODO: Add Description**|
|blockDeviceSetupRetryByUser|Boolean|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|customErrorMessage|String|**TODO: Add Description**|
|description|String|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|disableUserStatusTrackingAfterFirstUser|Boolean|**TODO: Add Description**|
|displayName|String|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|installProgressTimeoutInMinutes|Int32|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|priority|Int32|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|selectedMobileAppIds|String collection|**TODO: Add Description**|
|showInstallationProgress|Boolean|**TODO: Add Description**|
|trackInstallProgressForAutopilotOnly|Boolean|**TODO: Add Description**|
|version|Int32|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[enrollmentConfigurationAssignment](../resources/intune-enrollmentconfigurationassignment.md) collection|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|

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
  "displayName": "String",
  "description": "String",
  "priority": "Integer",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "version": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "showInstallationProgress": "Boolean",
  "blockDeviceSetupRetryByUser": "Boolean",
  "allowDeviceResetOnInstallFailure": "Boolean",
  "allowLogCollectionOnInstallFailure": "Boolean",
  "customErrorMessage": "String",
  "installProgressTimeoutInMinutes": "Integer",
  "allowDeviceUseOnInstallFailure": "Boolean",
  "selectedMobileAppIds": [
    "String"
  ],
  "trackInstallProgressForAutopilotOnly": "Boolean",
  "disableUserStatusTrackingAfterFirstUser": "Boolean"
}
```

