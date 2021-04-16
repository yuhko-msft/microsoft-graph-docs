---
title: "Add depIOSEnrollmentProfile"
description: "Add defaultIosEnrollmentProfile by posting to the defaultIosEnrollmentProfile collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add depIOSEnrollmentProfile
Namespace: microsoft.graph



Add defaultIosEnrollmentProfile by posting to the defaultIosEnrollmentProfile collection.

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
POST /deviceManagement/depOnboardingSettings/{depOnboardingSettingId}/defaultIosEnrollmentProfile/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [depIOSEnrollmentProfile](../resources/depiosenrollmentprofile.md) object.

The following table shows the properties that are required when you create the [depIOSEnrollmentProfile](../resources/depiosenrollmentprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|configurationEndpointUrl|String|Configuration endpoint url to use for Enrollment Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|description|String|Description of the profile Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|displayName|String|Name of the profile Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|enableAuthenticationViaCompanyPortal|Boolean|Indicates to authenticate with Apple Setup Assistant instead of Company Portal. Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|requireCompanyPortalOnSetupAssistantEnrolledDevices|Boolean|Indicates that Company Portal is required on setup assistant enrolled devices Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|requiresUserAuthentication|Boolean|Indicates if the profile requires user authentication Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|appleIdDisabled|Boolean|Indicates if Apple id setup pane is disabled Inherited from [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|
|applePayDisabled|Boolean|Indicates if Apple pay setup pane is disabled Inherited from [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|
|configurationWebUrl|Boolean|URL for setup assistant login Inherited from [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|
|deviceNameTemplate|String|Sets a literal or name pattern. Inherited from [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|
|diagnosticsDisabled|Boolean|Indicates if diagnostics setup pane is disabled Inherited from [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|
|displayToneSetupDisabled|Boolean|Indicates if displaytone setup screen is disabled Inherited from [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|
|isDefault|Boolean|Indicates if this is the default profile Inherited from [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|
|isMandatory|Boolean|Indicates if the profile is mandatory Inherited from [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|
|locationDisabled|Boolean|Indicates if Location service setup pane is disabled Inherited from [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|
|privacyPaneDisabled|Boolean|Indicates if privacy screen is disabled Inherited from [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|
|profileRemovalDisabled|Boolean|Indicates if the profile removal option is disabled Inherited from [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|
|restoreBlocked|Boolean|Indicates if Restore setup pane is blocked Inherited from [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|
|screenTimeScreenDisabled|Boolean|Indicates if screen timeout setup is disabled Inherited from [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|
|siriDisabled|Boolean|Indicates if siri setup pane is disabled Inherited from [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|
|supervisedModeEnabled|Boolean|Supervised mode, True to enable, false otherwise. See https://docs.microsoft.com/en-us/intune/deploy-use/enroll-devices-in-microsoft-intune for additional information. Inherited from [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|
|supportDepartment|String|Support department information Inherited from [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|
|supportPhoneNumber|String|Support phone number Inherited from [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|
|termsAndConditionsDisabled|Boolean|Indicates if 'Terms and Conditions' setup pane is disabled Inherited from [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|
|touchIdDisabled|Boolean|Indicates if touch id setup pane is disabled Inherited from [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|
|appearanceScreenDisabled|Boolean|Indicates if Apperance screen is disabled|
|awaitDeviceConfiguredConfirmation|Boolean|Indicates if the device will need to wait for configured confirmation|
|companyPortalVppTokenId|String|If set, indicates which Vpp token should be used to deploy the Company Portal w/ device licensing. 'enableAuthenticationViaCompanyPortal' must be set in order for this property to be set.|
|deviceToDeviceMigrationDisabled|Boolean|Indicates if Device To Device Migration is disabled|
|enableSharedIPad|Boolean|This indicates whether the device is to be enrolled in a mode which enables multi user scenarios. Only applicable in shared iPads.|
|enableSingleAppEnrollmentMode|Boolean|Tells the device to enable single app mode and apply app-lock during enrollment. Default is false. 'enableAuthenticationViaCompanyPortal' and 'companyPortalVppTokenId' must be set for this property to be set.|
|expressLanguageScreenDisabled|Boolean|Indicates if Express Language screen is disabled|
|homeButtonScreenDisabled|Boolean|Indicates if home button sensitivity screen is disabled|
|iMessageAndFaceTimeScreenDisabled|Boolean|Indicates if iMessage and FaceTime screen is disabled|
|iTunesPairingMode|iTunesPairingMode|Indicates the iTunes pairing mode. Possible values are: `disallow`, `allow`, `requiresCertificate`.|
|managementCertificates|[managementCertificateWithThumbprint](../resources/managementcertificatewiththumbprint.md) collection|Management certificates for Apple Configurator|
|onBoardingScreenDisabled|Boolean|Indicates if onboarding setup screen is disabled|
|passCodeDisabled|Boolean|Indicates if Passcode setup pane is disabled|
|preferredLanguageScreenDisabled|Boolean|Indicates if Preferred language screen is disabled|
|restoreCompletedScreenDisabled|Boolean|Indicates if Weclome screen is disabled|
|restoreFromAndroidDisabled|Boolean|Indicates if Restore from Android is disabled|
|sharedIPadMaximumUserCount|Int32|This specifies the maximum number of users that can use a shared iPad. Only applicable in shared iPad mode.|
|simSetupScreenDisabled|Boolean|Indicates if the SIMSetup screen is disabled|
|softwareUpdateScreenDisabled|Boolean|Indicates if the mandatory sofware update screen is disabled|
|updateCompleteScreenDisabled|Boolean|Indicates if Weclome screen is disabled|
|watchMigrationScreenDisabled|Boolean|Indicates if the watch migration screen is disabled|
|welcomeScreenDisabled|Boolean|Indicates if Weclome screen is disabled|
|zoomDisabled|Boolean|Indicates if zoom setup pane is disabled|



## Response

If successful, this method returns a `204 No Content` response code and a [depIOSEnrollmentProfile](../resources/depiosenrollmentprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_depiosenrollmentprofile_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/depOnboardingSettings/{depOnboardingSettingId}/defaultIosEnrollmentProfile/$ref
Content-Type: application/json
Content-length: 2075

{
  "@odata.type": "#microsoft.graph.depIOSEnrollmentProfile",
  "configurationEndpointUrl": "String",
  "description": "String",
  "displayName": "String",
  "enableAuthenticationViaCompanyPortal": "Boolean",
  "requireCompanyPortalOnSetupAssistantEnrolledDevices": "Boolean",
  "requiresUserAuthentication": "Boolean",
  "appleIdDisabled": "Boolean",
  "applePayDisabled": "Boolean",
  "configurationWebUrl": "Boolean",
  "deviceNameTemplate": "String",
  "diagnosticsDisabled": "Boolean",
  "displayToneSetupDisabled": "Boolean",
  "isDefault": "Boolean",
  "isMandatory": "Boolean",
  "locationDisabled": "Boolean",
  "privacyPaneDisabled": "Boolean",
  "profileRemovalDisabled": "Boolean",
  "restoreBlocked": "Boolean",
  "screenTimeScreenDisabled": "Boolean",
  "siriDisabled": "Boolean",
  "supervisedModeEnabled": "Boolean",
  "supportDepartment": "String",
  "supportPhoneNumber": "String",
  "termsAndConditionsDisabled": "Boolean",
  "touchIdDisabled": "Boolean",
  "appearanceScreenDisabled": "Boolean",
  "awaitDeviceConfiguredConfirmation": "Boolean",
  "companyPortalVppTokenId": "String",
  "deviceToDeviceMigrationDisabled": "Boolean",
  "enableSharedIPad": "Boolean",
  "enableSingleAppEnrollmentMode": "Boolean",
  "expressLanguageScreenDisabled": "Boolean",
  "homeButtonScreenDisabled": "Boolean",
  "iMessageAndFaceTimeScreenDisabled": "Boolean",
  "iTunesPairingMode": "String",
  "managementCertificates": [
    {
      "@odata.type": "microsoft.graph.managementCertificateWithThumbprint"
    }
  ],
  "onBoardingScreenDisabled": "Boolean",
  "passCodeDisabled": "Boolean",
  "preferredLanguageScreenDisabled": "Boolean",
  "restoreCompletedScreenDisabled": "Boolean",
  "restoreFromAndroidDisabled": "Boolean",
  "sharedIPadMaximumUserCount": "Integer",
  "simSetupScreenDisabled": "Boolean",
  "softwareUpdateScreenDisabled": "Boolean",
  "updateCompleteScreenDisabled": "Boolean",
  "watchMigrationScreenDisabled": "Boolean",
  "welcomeScreenDisabled": "Boolean",
  "zoomDisabled": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.depIOSEnrollmentProfile"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.depIOSEnrollmentProfile",
  "id": "0c506df5-6df5-0c50-f56d-500cf56d500c",
  "configurationEndpointUrl": "String",
  "description": "String",
  "displayName": "String",
  "enableAuthenticationViaCompanyPortal": "Boolean",
  "requireCompanyPortalOnSetupAssistantEnrolledDevices": "Boolean",
  "requiresUserAuthentication": "Boolean",
  "appleIdDisabled": "Boolean",
  "applePayDisabled": "Boolean",
  "configurationWebUrl": "Boolean",
  "deviceNameTemplate": "String",
  "diagnosticsDisabled": "Boolean",
  "displayToneSetupDisabled": "Boolean",
  "isDefault": "Boolean",
  "isMandatory": "Boolean",
  "locationDisabled": "Boolean",
  "privacyPaneDisabled": "Boolean",
  "profileRemovalDisabled": "Boolean",
  "restoreBlocked": "Boolean",
  "screenTimeScreenDisabled": "Boolean",
  "siriDisabled": "Boolean",
  "supervisedModeEnabled": "Boolean",
  "supportDepartment": "String",
  "supportPhoneNumber": "String",
  "termsAndConditionsDisabled": "Boolean",
  "touchIdDisabled": "Boolean",
  "appearanceScreenDisabled": "Boolean",
  "awaitDeviceConfiguredConfirmation": "Boolean",
  "companyPortalVppTokenId": "String",
  "deviceToDeviceMigrationDisabled": "Boolean",
  "enableSharedIPad": "Boolean",
  "enableSingleAppEnrollmentMode": "Boolean",
  "expressLanguageScreenDisabled": "Boolean",
  "homeButtonScreenDisabled": "Boolean",
  "iMessageAndFaceTimeScreenDisabled": "Boolean",
  "iTunesPairingMode": "String",
  "managementCertificates": [
    {
      "@odata.type": "microsoft.graph.managementCertificateWithThumbprint"
    }
  ],
  "onBoardingScreenDisabled": "Boolean",
  "passCodeDisabled": "Boolean",
  "preferredLanguageScreenDisabled": "Boolean",
  "restoreCompletedScreenDisabled": "Boolean",
  "restoreFromAndroidDisabled": "Boolean",
  "sharedIPadMaximumUserCount": "Integer",
  "simSetupScreenDisabled": "Boolean",
  "softwareUpdateScreenDisabled": "Boolean",
  "updateCompleteScreenDisabled": "Boolean",
  "watchMigrationScreenDisabled": "Boolean",
  "welcomeScreenDisabled": "Boolean",
  "zoomDisabled": "Boolean"
}
```

