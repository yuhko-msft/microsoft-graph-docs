---
title: "depIOSEnrollmentProfile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# depIOSEnrollmentProfile resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [depEnrollmentBaseProfile](../resources/intune-depenrollmentbaseprofile.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List depIOSEnrollmentProfiles](../api/intune-depiosenrollmentprofile-list.md)|[depIOSEnrollmentProfile](../resources/intune-depiosenrollmentprofile.md) collection|Get a list of the [depIOSEnrollmentProfile](../resources/intune-depiosenrollmentprofile.md) objects and their properties.|
|[Create depIOSEnrollmentProfile](../api/intune-depiosenrollmentprofile-create.md)|[depIOSEnrollmentProfile](../resources/intune-depiosenrollmentprofile.md)|Create a new [depIOSEnrollmentProfile](../resources/intune-depiosenrollmentprofile.md) object.|
|[Get depIOSEnrollmentProfile](../api/intune-depiosenrollmentprofile-get.md)|[depIOSEnrollmentProfile](../resources/intune-depiosenrollmentprofile.md)|Read the properties and relationships of a [depIOSEnrollmentProfile](../resources/intune-depiosenrollmentprofile.md) object.|
|[Update depIOSEnrollmentProfile](../api/intune-depiosenrollmentprofile-update.md)|[depIOSEnrollmentProfile](../resources/intune-depiosenrollmentprofile.md)|Update the properties of a [depIOSEnrollmentProfile](../resources/intune-depiosenrollmentprofile.md) object.|
|[Delete depIOSEnrollmentProfile](../api/intune-depiosenrollmentprofile-delete.md)|None|Deletes a [depIOSEnrollmentProfile](../resources/intune-depiosenrollmentprofile.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appearanceScreenDisabled|Boolean|**TODO: Add Description**|
|appleIdDisabled|Boolean|**TODO: Add Description** Inherited from [depEnrollmentBaseProfile](../resources/intune-depenrollmentbaseprofile.md).|
|applePayDisabled|Boolean|**TODO: Add Description** Inherited from [depEnrollmentBaseProfile](../resources/intune-depenrollmentbaseprofile.md).|
|awaitDeviceConfiguredConfirmation|Boolean|**TODO: Add Description**|
|carrierActivationUrl|String|**TODO: Add Description**|
|companyPortalVppTokenId|String|**TODO: Add Description**|
|configurationEndpointUrl|String|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md).|
|configurationWebUrl|Boolean|**TODO: Add Description** Inherited from [depEnrollmentBaseProfile](../resources/intune-depenrollmentbaseprofile.md).|
|description|String|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md).|
|deviceNameTemplate|String|**TODO: Add Description** Inherited from [depEnrollmentBaseProfile](../resources/intune-depenrollmentbaseprofile.md).|
|deviceToDeviceMigrationDisabled|Boolean|**TODO: Add Description**|
|diagnosticsDisabled|Boolean|**TODO: Add Description** Inherited from [depEnrollmentBaseProfile](../resources/intune-depenrollmentbaseprofile.md).|
|displayName|String|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md).|
|displayToneSetupDisabled|Boolean|**TODO: Add Description** Inherited from [depEnrollmentBaseProfile](../resources/intune-depenrollmentbaseprofile.md).|
|enableAuthenticationViaCompanyPortal|Boolean|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md).|
|enableSharedIPad|Boolean|**TODO: Add Description**|
|enableSingleAppEnrollmentMode|Boolean|**TODO: Add Description**|
|expressLanguageScreenDisabled|Boolean|**TODO: Add Description**|
|forceTemporarySession|Boolean|**TODO: Add Description**|
|homeButtonScreenDisabled|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|iMessageAndFaceTimeScreenDisabled|Boolean|**TODO: Add Description**|
|isDefault|Boolean|**TODO: Add Description** Inherited from [depEnrollmentBaseProfile](../resources/intune-depenrollmentbaseprofile.md).|
|isMandatory|Boolean|**TODO: Add Description** Inherited from [depEnrollmentBaseProfile](../resources/intune-depenrollmentbaseprofile.md).|
|iTunesPairingMode|iTunesPairingMode|**TODO: Add Description**. Possible values are: `disallow`, `allow`, `requiresCertificate`.|
|locationDisabled|Boolean|**TODO: Add Description** Inherited from [depEnrollmentBaseProfile](../resources/intune-depenrollmentbaseprofile.md).|
|managementCertificates|[managementCertificateWithThumbprint](../resources/intune-managementcertificatewiththumbprint.md) collection|**TODO: Add Description**|
|onBoardingScreenDisabled|Boolean|**TODO: Add Description**|
|passCodeDisabled|Boolean|**TODO: Add Description**|
|passcodeLockGracePeriodInSeconds|Int32|**TODO: Add Description**|
|preferredLanguageScreenDisabled|Boolean|**TODO: Add Description**|
|privacyPaneDisabled|Boolean|**TODO: Add Description** Inherited from [depEnrollmentBaseProfile](../resources/intune-depenrollmentbaseprofile.md).|
|profileRemovalDisabled|Boolean|**TODO: Add Description** Inherited from [depEnrollmentBaseProfile](../resources/intune-depenrollmentbaseprofile.md).|
|requireCompanyPortalOnSetupAssistantEnrolledDevices|Boolean|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md).|
|requiresUserAuthentication|Boolean|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md).|
|restoreBlocked|Boolean|**TODO: Add Description** Inherited from [depEnrollmentBaseProfile](../resources/intune-depenrollmentbaseprofile.md).|
|restoreCompletedScreenDisabled|Boolean|**TODO: Add Description**|
|restoreFromAndroidDisabled|Boolean|**TODO: Add Description**|
|screenTimeScreenDisabled|Boolean|**TODO: Add Description** Inherited from [depEnrollmentBaseProfile](../resources/intune-depenrollmentbaseprofile.md).|
|sharedIPadMaximumUserCount|Int32|**TODO: Add Description**|
|simSetupScreenDisabled|Boolean|**TODO: Add Description**|
|siriDisabled|Boolean|**TODO: Add Description** Inherited from [depEnrollmentBaseProfile](../resources/intune-depenrollmentbaseprofile.md).|
|softwareUpdateScreenDisabled|Boolean|**TODO: Add Description**|
|supervisedModeEnabled|Boolean|**TODO: Add Description** Inherited from [depEnrollmentBaseProfile](../resources/intune-depenrollmentbaseprofile.md).|
|supportDepartment|String|**TODO: Add Description** Inherited from [depEnrollmentBaseProfile](../resources/intune-depenrollmentbaseprofile.md).|
|supportPhoneNumber|String|**TODO: Add Description** Inherited from [depEnrollmentBaseProfile](../resources/intune-depenrollmentbaseprofile.md).|
|temporarySessionTimeoutInSeconds|Int32|**TODO: Add Description**|
|termsAndConditionsDisabled|Boolean|**TODO: Add Description** Inherited from [depEnrollmentBaseProfile](../resources/intune-depenrollmentbaseprofile.md).|
|touchIdDisabled|Boolean|**TODO: Add Description** Inherited from [depEnrollmentBaseProfile](../resources/intune-depenrollmentbaseprofile.md).|
|updateCompleteScreenDisabled|Boolean|**TODO: Add Description**|
|userSessionTimeoutInSeconds|Int32|**TODO: Add Description**|
|watchMigrationScreenDisabled|Boolean|**TODO: Add Description**|
|welcomeScreenDisabled|Boolean|**TODO: Add Description**|
|zoomDisabled|Boolean|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.depIOSEnrollmentProfile",
  "baseType": "microsoft.graph.depEnrollmentBaseProfile",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.depIOSEnrollmentProfile",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "requiresUserAuthentication": "Boolean",
  "configurationEndpointUrl": "String",
  "enableAuthenticationViaCompanyPortal": "Boolean",
  "requireCompanyPortalOnSetupAssistantEnrolledDevices": "Boolean",
  "isDefault": "Boolean",
  "supervisedModeEnabled": "Boolean",
  "supportDepartment": "String",
  "isMandatory": "Boolean",
  "locationDisabled": "Boolean",
  "supportPhoneNumber": "String",
  "profileRemovalDisabled": "Boolean",
  "restoreBlocked": "Boolean",
  "appleIdDisabled": "Boolean",
  "termsAndConditionsDisabled": "Boolean",
  "touchIdDisabled": "Boolean",
  "applePayDisabled": "Boolean",
  "siriDisabled": "Boolean",
  "diagnosticsDisabled": "Boolean",
  "displayToneSetupDisabled": "Boolean",
  "privacyPaneDisabled": "Boolean",
  "screenTimeScreenDisabled": "Boolean",
  "deviceNameTemplate": "String",
  "configurationWebUrl": "Boolean",
  "iTunesPairingMode": "String",
  "managementCertificates": [
    {
      "@odata.type": "microsoft.graph.managementCertificateWithThumbprint"
    }
  ],
  "restoreFromAndroidDisabled": "Boolean",
  "awaitDeviceConfiguredConfirmation": "Boolean",
  "sharedIPadMaximumUserCount": "Integer",
  "enableSharedIPad": "Boolean",
  "companyPortalVppTokenId": "String",
  "enableSingleAppEnrollmentMode": "Boolean",
  "homeButtonScreenDisabled": "Boolean",
  "iMessageAndFaceTimeScreenDisabled": "Boolean",
  "onBoardingScreenDisabled": "Boolean",
  "simSetupScreenDisabled": "Boolean",
  "softwareUpdateScreenDisabled": "Boolean",
  "watchMigrationScreenDisabled": "Boolean",
  "appearanceScreenDisabled": "Boolean",
  "expressLanguageScreenDisabled": "Boolean",
  "preferredLanguageScreenDisabled": "Boolean",
  "deviceToDeviceMigrationDisabled": "Boolean",
  "welcomeScreenDisabled": "Boolean",
  "passCodeDisabled": "Boolean",
  "zoomDisabled": "Boolean",
  "restoreCompletedScreenDisabled": "Boolean",
  "updateCompleteScreenDisabled": "Boolean",
  "forceTemporarySession": "Boolean",
  "temporarySessionTimeoutInSeconds": "Integer",
  "userSessionTimeoutInSeconds": "Integer",
  "passcodeLockGracePeriodInSeconds": "Integer",
  "carrierActivationUrl": "String"
}
```

