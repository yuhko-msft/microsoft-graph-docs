---
title: "androidForWorkPkcsCertificateProfile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidForWorkPkcsCertificateProfile resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [androidForWorkCertificateProfileBase](../resources/androidforworkcertificateprofilebase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidForWorkPkcsCertificateProfiles](../api/androidforworkpkcscertificateprofile-list.md)|[androidForWorkPkcsCertificateProfile](../resources/androidforworkpkcscertificateprofile.md) collection|Get a list of the [androidForWorkPkcsCertificateProfile](../resources/androidforworkpkcscertificateprofile.md) objects and their properties.|
|[Create androidForWorkPkcsCertificateProfile](../api/androidforworkpkcscertificateprofile-create.md)|[androidForWorkPkcsCertificateProfile](../resources/androidforworkpkcscertificateprofile.md)|Create a new [androidForWorkPkcsCertificateProfile](../resources/androidforworkpkcscertificateprofile.md) object.|
|[Get androidForWorkPkcsCertificateProfile](../api/androidforworkpkcscertificateprofile-get.md)|[androidForWorkPkcsCertificateProfile](../resources/androidforworkpkcscertificateprofile.md)|Read the properties and relationships of an [androidForWorkPkcsCertificateProfile](../resources/androidforworkpkcscertificateprofile.md) object.|
|[Update androidForWorkPkcsCertificateProfile](../api/androidforworkpkcscertificateprofile-update.md)|[androidForWorkPkcsCertificateProfile](../resources/androidforworkpkcscertificateprofile.md)|Update the properties of an [androidForWorkPkcsCertificateProfile](../resources/androidforworkpkcscertificateprofile.md) object.|
|[Delete androidForWorkPkcsCertificateProfile](../api/androidforworkpkcscertificateprofile-delete.md)|None|Deletes an [androidForWorkPkcsCertificateProfile](../resources/androidforworkpkcscertificateprofile.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|certificateStore|certificateStore|**TODO: Add Description**. Possible values are: `user`, `machine`.|
|certificateTemplateName|String|**TODO: Add Description**|
|certificateValidityPeriodScale|certificateValidityPeriodScale|**TODO: Add Description** Inherited from [androidForWorkCertificateProfileBase](../resources/androidforworkcertificateprofilebase.md). Possible values are: `days`, `months`, `years`.|
|certificateValidityPeriodValue|Int32|**TODO: Add Description** Inherited from [androidForWorkCertificateProfileBase](../resources/androidforworkcertificateprofilebase.md)|
|certificationAuthority|String|**TODO: Add Description**|
|certificationAuthorityName|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|customSubjectAlternativeNames|[customSubjectAlternativeName](../resources/intune-customsubjectalternativename.md) collection|**TODO: Add Description**|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|extendedKeyUsages|[extendedKeyUsage](../resources/intune-extendedkeyusage.md) collection|**TODO: Add Description** Inherited from [androidForWorkCertificateProfileBase](../resources/androidforworkcertificateprofilebase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|renewalThresholdPercentage|Int32|**TODO: Add Description** Inherited from [androidForWorkCertificateProfileBase](../resources/androidforworkcertificateprofilebase.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|scenarioType|scenarioType|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md). Possible values are: `general`, `resourceAccess`.|
|subjectAlternativeNameFormatString|String|**TODO: Add Description**|
|subjectAlternativeNameType|subjectAlternativeNameType|**TODO: Add Description** Inherited from [androidForWorkCertificateProfileBase](../resources/androidforworkcertificateprofilebase.md). Possible values are: `none`, `emailAddress`, `userPrincipalName`, `customAzureADAttribute`, `domainNameService`, `universalResourceIdentifier`.|
|subjectNameFormat|subjectNameFormat|**TODO: Add Description** Inherited from [androidForWorkCertificateProfileBase](../resources/androidforworkcertificateprofilebase.md). Possible values are: `commonName`, `commonNameIncludingEmail`, `commonNameAsEmail`, `custom`, `commonNameAsIMEI`, `commonNameAsSerialNumber`, `commonNameAsAadDeviceId`, `commonNameAsIntuneDeviceId`, `commonNameAsDurableDeviceId`.|
|subjectNameFormatString|String|**TODO: Add Description**|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/intune-deviceconfigurationassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/intune-deviceconfigurationdevicestatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/intune-deviceconfigurationdeviceoverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|managedDeviceCertificateStates|[managedDeviceCertificateState](../resources/intune-manageddevicecertificatestate.md) collection|**TODO: Add Description**|
|rootCertificate|[androidForWorkTrustedRootCertificate](../resources/androidforworktrustedrootcertificate.md)|**TODO: Add Description** Inherited from [androidForWorkCertificateProfileBase](../resources/androidforworkcertificateprofilebase.md)|
|userStatuses|[deviceConfigurationUserStatus](../resources/intune-deviceconfigurationuserstatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/intune-deviceconfigurationuseroverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.androidForWorkPkcsCertificateProfile",
  "baseType": "microsoft.graph.androidForWorkCertificateProfileBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidForWorkPkcsCertificateProfile",
  "id": "String (identifier)",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "scenarioType": "String",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "renewalThresholdPercentage": "Integer",
  "subjectNameFormat": "String",
  "certificateValidityPeriodValue": "Integer",
  "certificateValidityPeriodScale": "String",
  "extendedKeyUsages": [
    {
      "@odata.type": "microsoft.graph.extendedKeyUsage"
    }
  ],
  "subjectAlternativeNameType": "String",
  "certificationAuthority": "String",
  "certificationAuthorityName": "String",
  "certificateTemplateName": "String",
  "subjectAlternativeNameFormatString": "String",
  "subjectNameFormatString": "String",
  "certificateStore": "String",
  "customSubjectAlternativeNames": [
    {
      "@odata.type": "microsoft.graph.customSubjectAlternativeName"
    }
  ]
}
```

