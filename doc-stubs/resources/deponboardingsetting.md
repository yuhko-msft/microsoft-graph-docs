---
title: "depOnboardingSetting resource type"
description: "The depOnboardingSetting represents an instance of the Apple DEP service being onboarded to Intune. The onboarded service instance manages an Apple Token used to synchronize data between Apple and Intune."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# depOnboardingSetting resource type

Namespace: microsoft.graph



The depOnboardingSetting represents an instance of the Apple DEP service being onboarded to Intune. The onboarded service instance manages an Apple Token used to synchronize data between Apple and Intune.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List depOnboardingSettings](../api/deponboardingsetting-list.md)|[depOnboardingSetting](../resources/deponboardingsetting.md) collection|Get a list of the [depOnboardingSetting](../resources/deponboardingsetting.md) objects and their properties.|
|[Create depOnboardingSetting](../api/deponboardingsetting-create.md)|[depOnboardingSetting](../resources/deponboardingsetting.md)|Create a new [depOnboardingSetting](../resources/deponboardingsetting.md) object.|
|[Get depOnboardingSetting](../api/deponboardingsetting-get.md)|[depOnboardingSetting](../resources/deponboardingsetting.md)|Read the properties and relationships of a [depOnboardingSetting](../resources/deponboardingsetting.md) object.|
|[Update depOnboardingSetting](../api/deponboardingsetting-update.md)|[depOnboardingSetting](../resources/deponboardingsetting.md)|Update the properties of a [depOnboardingSetting](../resources/deponboardingsetting.md) object.|
|[Delete depOnboardingSetting](../api/deponboardingsetting-delete.md)|None|Deletes a [depOnboardingSetting](../resources/deponboardingsetting.md) object.|
|[generateEncryptionPublicKey](../api/deponboardingsetting-generateencryptionpublickey.md)|String|**TODO: Add Description**|
|[shareForSchoolDataSyncService](../api/deponboardingsetting-shareforschooldatasyncservice.md)|None|**TODO: Add Description**|
|[syncWithAppleDeviceEnrollmentProgram](../api/deponboardingsetting-syncwithappledeviceenrollmentprogram.md)|None|**TODO: Add Description**|
|[unshareForSchoolDataSyncService](../api/deponboardingsetting-unshareforschooldatasyncservice.md)|None|**TODO: Add Description**|
|[uploadDepToken](../api/deponboardingsetting-uploaddeptoken.md)|None|**TODO: Add Description**|
|[getEncryptionPublicKey](../api/deponboardingsetting-getencryptionpublickey.md)|String|**TODO: Add Description**|
|[getExpiringVppTokenCount](../api/deponboardingsetting-getexpiringvpptokencount.md)|Int32|**TODO: Add Description**|
|[List depIOSEnrollmentProfile](../api/deponboardingsetting-list-defaultiosenrollmentprofile.md)|[depIOSEnrollmentProfile](../resources/depiosenrollmentprofile.md) collection|Get the depIOSEnrollmentProfile resources from the defaultIosEnrollmentProfile navigation property.|
|[Add depIOSEnrollmentProfile](../api/deponboardingsetting-post-defaultiosenrollmentprofile.md)|[depIOSEnrollmentProfile](../resources/depiosenrollmentprofile.md)|Add defaultIosEnrollmentProfile by posting to the defaultIosEnrollmentProfile collection.|
|[List depMacOSEnrollmentProfile](../api/deponboardingsetting-list-defaultmacosenrollmentprofile.md)|[depMacOSEnrollmentProfile](../resources/depmacosenrollmentprofile.md) collection|Get the depMacOSEnrollmentProfile resources from the defaultMacOsEnrollmentProfile navigation property.|
|[Add depMacOSEnrollmentProfile](../api/deponboardingsetting-post-defaultmacosenrollmentprofile.md)|[depMacOSEnrollmentProfile](../resources/depmacosenrollmentprofile.md)|Add defaultMacOsEnrollmentProfile by posting to the defaultMacOsEnrollmentProfile collection.|
|[List enrollmentProfiles](../api/deponboardingsetting-list-enrollmentprofiles.md)|[enrollmentProfile](../resources/enrollmentprofile.md) collection|Get the enrollmentProfile resources from the enrollmentProfiles navigation property.|
|[Create enrollmentProfile](../api/deponboardingsetting-post-enrollmentprofiles.md)|[enrollmentProfile](../resources/enrollmentprofile.md)|Create a new enrollmentProfile object.|
|[List importedAppleDeviceIdentities](../api/deponboardingsetting-list-importedappledeviceidentities.md)|[importedAppleDeviceIdentity](../resources/importedappledeviceidentity.md) collection|Get the importedAppleDeviceIdentity resources from the importedAppleDeviceIdentities navigation property.|
|[Create importedAppleDeviceIdentity](../api/deponboardingsetting-post-importedappledeviceidentities.md)|[importedAppleDeviceIdentity](../resources/importedappledeviceidentity.md)|Create a new importedAppleDeviceIdentity object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appleIdentifier|String|The Apple ID used to obtain the current token.|
|dataSharingConsentGranted|Boolean|Consent granted for data sharing with Apple Dep Service|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|When the service was onboarded.|
|lastSuccessfulSyncDateTime|DateTimeOffset|When the service last syned with Intune|
|lastSyncErrorCode|Int32|Error code reported by Apple during last dep sync.|
|lastSyncTriggeredDateTime|DateTimeOffset|When Intune last requested a sync.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|
|shareTokenWithSchoolDataSyncService|Boolean|Whether or not the Dep token sharing is enabled with the School Data Sync service.|
|syncedDeviceCount|Int32|Gets synced device count|
|tokenExpirationDateTime|DateTimeOffset|When the token will expire.|
|tokenName|String|Friendly Name for Dep Token|
|tokenType|depTokenType|Gets or sets the Dep Token Type. Possible values are: `none`, `dep`, `appleSchoolManager`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|defaultIosEnrollmentProfile|[depIOSEnrollmentProfile](../resources/depiosenrollmentprofile.md)|Default iOS Enrollment Profile|
|defaultMacOsEnrollmentProfile|[depMacOSEnrollmentProfile](../resources/depmacosenrollmentprofile.md)|Default MacOs Enrollment Profile|
|enrollmentProfiles|[enrollmentProfile](../resources/enrollmentprofile.md) collection|The enrollment profiles.|
|importedAppleDeviceIdentities|[importedAppleDeviceIdentity](../resources/importedappledeviceidentity.md) collection|The imported Apple device identities.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.depOnboardingSetting",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.depOnboardingSetting",
  "id": "String (identifier)",
  "appleIdentifier": "String",
  "dataSharingConsentGranted": "Boolean",
  "lastModifiedDateTime": "String (timestamp)",
  "lastSuccessfulSyncDateTime": "String (timestamp)",
  "lastSyncErrorCode": "Integer",
  "lastSyncTriggeredDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "shareTokenWithSchoolDataSyncService": "Boolean",
  "syncedDeviceCount": "Integer",
  "tokenExpirationDateTime": "String (timestamp)",
  "tokenName": "String",
  "tokenType": "String"
}
```

