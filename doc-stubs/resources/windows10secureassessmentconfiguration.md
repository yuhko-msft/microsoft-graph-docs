---
title: "windows10SecureAssessmentConfiguration resource type"
description: "This topic provides descriptions of the declared methods, properties and relationships exposed by the secureAssessment resource."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10SecureAssessmentConfiguration resource type

Namespace: microsoft.graph



This topic provides descriptions of the declared methods, properties and relationships exposed by the secureAssessment resource.


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windows10SecureAssessmentConfiguration](../api/windows10secureassessmentconfiguration-list.md)|[windows10SecureAssessmentConfiguration](../resources/windows10secureassessmentconfiguration.md) collection|Get a list of the [windows10SecureAssessmentConfiguration](../resources/windows10secureassessmentconfiguration.md) objects and their properties.|
|[Create windows10SecureAssessmentConfiguration](../api/windows10secureassessmentconfiguration-create.md)|[windows10SecureAssessmentConfiguration](../resources/windows10secureassessmentconfiguration.md)|Create a new [windows10SecureAssessmentConfiguration](../resources/windows10secureassessmentconfiguration.md) object.|
|[Get windows10SecureAssessmentConfiguration](../api/windows10secureassessmentconfiguration-get.md)|[windows10SecureAssessmentConfiguration](../resources/windows10secureassessmentconfiguration.md)|Read the properties and relationships of a [windows10SecureAssessmentConfiguration](../resources/windows10secureassessmentconfiguration.md) object.|
|[Update windows10SecureAssessmentConfiguration](../api/windows10secureassessmentconfiguration-update.md)|[windows10SecureAssessmentConfiguration](../resources/windows10secureassessmentconfiguration.md)|Update the properties of a [windows10SecureAssessmentConfiguration](../resources/windows10secureassessmentconfiguration.md) object.|
|[Delete windows10SecureAssessmentConfiguration](../api/windows10secureassessmentconfiguration-delete.md)|None|Deletes a [windows10SecureAssessmentConfiguration](../resources/windows10secureassessmentconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowPrinting|Boolean|Indicates whether or not to allow the app from printing during the test.|
|allowScreenCapture|Boolean|Indicates whether or not to allow screen capture capability during a test.|
|allowTextSuggestion|Boolean|Indicates whether or not to allow text suggestions during the test.|
|assessmentAppUserModelId|String|Specifies the application user model ID of the assessment app launched when a user signs in to a secure assessment with a local guest account. Important notice: this property must be set with localGuestAccountName in order to make the local guest account sign-in experience work properly for secure assessments.|
|configurationAccount|String|The account used to configure the Windows device for taking the test. The user can be a domain account (domain\user), an AAD account (username@tenant.com) or a local account (username).|
|configurationAccountType|secureAssessmentAccountType|The account type used to by ConfigurationAccount. Possible values are: `azureADAccount`, `domainAccount`, `localAccount`, `localGuestAccount`.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|launchUri|String|Url link to an assessment that's automatically loaded when the secure assessment browser is launched. It has to be a valid Url (http\[s\]://msdn.microsoft.com/).|
|localGuestAccountName|String|Specifies the display text for the local guest account shown on the sign-in screen. Typically is the name of an assessment. When the user clicks the local guest account on the sign-in screen, an assessment app is launched with a specified assessment URL. Secure assessments can only be configured with local guest account sign-in on devices running Windows 10, version 1903 or later. Important notice: this property must be set with assessmentAppUserModelID in order to make the local guest account sign-in experience work properly for secure assessments.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|The list of assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Device Configuration Setting State Device Summary Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Device configuration installation status by device. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Device Configuration devices status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|The list of group assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatuses|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Device configuration installation status by user. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Device Configuration users status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windows10SecureAssessmentConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10SecureAssessmentConfiguration",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "version": "Integer",
  "allowPrinting": "Boolean",
  "allowScreenCapture": "Boolean",
  "allowTextSuggestion": "Boolean",
  "assessmentAppUserModelId": "String",
  "configurationAccount": "String",
  "configurationAccountType": "String",
  "launchUri": "String",
  "localGuestAccountName": "String"
}
```

