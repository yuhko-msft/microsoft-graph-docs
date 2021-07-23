---
title: "macOSScepCertificateProfile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSScepCertificateProfile resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [macOSCertificateProfileBase](../resources/macoscertificateprofilebase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List macOSScepCertificateProfiles](../api/macosscepcertificateprofile-list.md)|[macOSScepCertificateProfile](../resources/macosscepcertificateprofile.md) collection|Get a list of the [macOSScepCertificateProfile](../resources/macosscepcertificateprofile.md) objects and their properties.|
|[Create macOSScepCertificateProfile](../api/macosscepcertificateprofile-create.md)|[macOSScepCertificateProfile](../resources/macosscepcertificateprofile.md)|Create a new [macOSScepCertificateProfile](../resources/macosscepcertificateprofile.md) object.|
|[Get macOSScepCertificateProfile](../api/macosscepcertificateprofile-get.md)|[macOSScepCertificateProfile](../resources/macosscepcertificateprofile.md)|Read the properties and relationships of a [macOSScepCertificateProfile](../resources/macosscepcertificateprofile.md) object.|
|[Update macOSScepCertificateProfile](../api/macosscepcertificateprofile-update.md)|[macOSScepCertificateProfile](../resources/macosscepcertificateprofile.md)|Update the properties of a [macOSScepCertificateProfile](../resources/macosscepcertificateprofile.md) object.|
|[Delete macOSScepCertificateProfile](../api/macosscepcertificateprofile-delete.md)|None|Deletes a [macOSScepCertificateProfile](../resources/macosscepcertificateprofile.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowAllAppsAccess|Boolean|**TODO: Add Description**|
|certificateStore|certificateStore|**TODO: Add Description**. Possible values are: `user`, `machine`.|
|certificateValidityPeriodScale|certificateValidityPeriodScale|**TODO: Add Description** Inherited from [macOSCertificateProfileBase](../resources/macoscertificateprofilebase.md). Possible values are: `days`, `months`, `years`.|
|certificateValidityPeriodValue|Int32|**TODO: Add Description** Inherited from [macOSCertificateProfileBase](../resources/macoscertificateprofilebase.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|customSubjectAlternativeNames|[customSubjectAlternativeName](../resources/intune-customsubjectalternativename.md) collection|**TODO: Add Description**|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|extendedKeyUsages|[extendedKeyUsage](../resources/intune-extendedkeyusage.md) collection|**TODO: Add Description**|
|hashAlgorithm|hashAlgorithms|**TODO: Add Description**. Possible values are: `sha1`, `sha2`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|keySize|keySize|**TODO: Add Description**. Possible values are: `size1024`, `size2048`, `size4096`.|
|keyUsage|keyUsages|**TODO: Add Description**. Possible values are: `keyEncipherment`, `digitalSignature`.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|renewalThresholdPercentage|Int32|**TODO: Add Description** Inherited from [macOSCertificateProfileBase](../resources/macoscertificateprofilebase.md).|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|scepServerUrls|String collection|**TODO: Add Description**|
|subjectAlternativeNameFormatString|String|**TODO: Add Description**|
|subjectAlternativeNameType|subjectAlternativeNameType|**TODO: Add Description** Inherited from [macOSCertificateProfileBase](../resources/macoscertificateprofilebase.md). Possible values are: `none`, `emailAddress`, `userPrincipalName`, `customAzureADAttribute`, `domainNameService`, `universalResourceIdentifier`.|
|subjectNameFormat|appleSubjectNameFormat|**TODO: Add Description** Inherited from [macOSCertificateProfileBase](../resources/macoscertificateprofilebase.md). Possible values are: `commonName`, `commonNameAsEmail`, `custom`, `commonNameIncludingEmail`, `commonNameAsIMEI`, `commonNameAsSerialNumber`.|
|subjectNameFormatString|String|**TODO: Add Description**|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/intune-deviceconfigurationassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/intune-deviceconfigurationdevicestatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/intune-deviceconfigurationdeviceoverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|managedDeviceCertificateStates|[managedDeviceCertificateState](../resources/intune-manageddevicecertificatestate.md) collection|**TODO: Add Description**|
|rootCertificate|[macOSTrustedRootCertificate](../resources/macostrustedrootcertificate.md)|**TODO: Add Description**|
|userStatuses|[deviceConfigurationUserStatus](../resources/intune-deviceconfigurationuserstatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/intune-deviceconfigurationuseroverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.macOSScepCertificateProfile",
  "baseType": "microsoft.graph.macOSCertificateProfileBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSScepCertificateProfile",
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
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "renewalThresholdPercentage": "Integer",
  "subjectNameFormat": "String",
  "subjectAlternativeNameType": "String",
  "certificateValidityPeriodValue": "Integer",
  "certificateValidityPeriodScale": "String",
  "scepServerUrls": [
    "String"
  ],
  "subjectNameFormatString": "String",
  "keyUsage": "String",
  "keySize": "String",
  "hashAlgorithm": "String",
  "extendedKeyUsages": [
    {
      "@odata.type": "microsoft.graph.extendedKeyUsage"
    }
  ],
  "subjectAlternativeNameFormatString": "String",
  "certificateStore": "String",
  "customSubjectAlternativeNames": [
    {
      "@odata.type": "microsoft.graph.customSubjectAlternativeName"
    }
  ],
  "allowAllAppsAccess": "Boolean"
}
```

