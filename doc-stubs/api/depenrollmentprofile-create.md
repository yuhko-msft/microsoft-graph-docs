---
title: "Create depEnrollmentProfile"
description: "Create a new depEnrollmentProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create depEnrollmentProfile
Namespace: microsoft.graph



Create a new [depEnrollmentProfile](../resources/depenrollmentprofile.md) object.

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
POST ** Collection URI for microsoft.graph.depEnrollmentProfile not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [depEnrollmentProfile](../resources/depenrollmentprofile.md) object.

The following table shows the properties that are required when you create the [depEnrollmentProfile](../resources/depenrollmentprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|configurationEndpointUrl|String|Configuration endpoint url to use for Enrollment Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|description|String|Description of the profile Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|displayName|String|Name of the profile Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|enableAuthenticationViaCompanyPortal|Boolean|Indicates to authenticate with Apple Setup Assistant instead of Company Portal. Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|requireCompanyPortalOnSetupAssistantEnrolledDevices|Boolean|Indicates that Company Portal is required on setup assistant enrolled devices Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|requiresUserAuthentication|Boolean|Indicates if the profile requires user authentication Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|appleIdDisabled|Boolean|Indicates if Apple id setup pane is disabled|
|applePayDisabled|Boolean|Indicates if Apple pay setup pane is disabled|
|awaitDeviceConfiguredConfirmation|Boolean|Indicates if the device will need to wait for configured confirmation|
|diagnosticsDisabled|Boolean|Indicates if diagnostics setup pane is disabled|
|enableSharedIPad|Boolean|This indicates whether the device is to be enrolled in a mode which enables multi user scenarios. Only applicable in shared iPads.|
|isDefault|Boolean|Indicates if this is the default profile|
|isMandatory|Boolean|Indicates if the profile is mandatory|
|iTunesPairingMode|iTunesPairingMode|Indicates the iTunes pairing mode. Possible values are: `disallow`, `allow`, `requiresCertificate`.|
|locationDisabled|Boolean|Indicates if Location service setup pane is disabled|
|macOSFileVaultDisabled|Boolean|Indicates if Mac OS file vault is disabled|
|macOSRegistrationDisabled|Boolean|Indicates if Mac OS registration is disabled|
|managementCertificates|[managementCertificateWithThumbprint](../resources/managementcertificatewiththumbprint.md) collection|Management certificates for Apple Configurator|
|passCodeDisabled|Boolean|Indicates if Passcode setup pane is disabled|
|profileRemovalDisabled|Boolean|Indicates if the profile removal option is disabled|
|restoreBlocked|Boolean|Indicates if Restore setup pane is blocked|
|restoreFromAndroidDisabled|Boolean|Indicates if Restore from Android is disabled|
|sharedIPadMaximumUserCount|Int32|This specifies the maximum number of users that can use a shared iPad. Only applicable in shared iPad mode.|
|siriDisabled|Boolean|Indicates if siri setup pane is disabled|
|supervisedModeEnabled|Boolean|Supervised mode, True to enable, false otherwise. See https://docs.microsoft.com/en-us/intune/deploy-use/enroll-devices-in-microsoft-intune for additional information.|
|supportDepartment|String|Support department information|
|supportPhoneNumber|String|Support phone number|
|termsAndConditionsDisabled|Boolean|Indicates if 'Terms and Conditions' setup pane is disabled|
|touchIdDisabled|Boolean|Indicates if touch id setup pane is disabled|
|zoomDisabled|Boolean|Indicates if zoom setup pane is disabled|



## Response

If successful, this method returns a `201 Created` response code and a [depEnrollmentProfile](../resources/depenrollmentprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_depenrollmentprofile_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.depEnrollmentProfile not found
Content-Type: application/json
Content-length: 1288

{
  "@odata.type": "#microsoft.graph.depEnrollmentProfile",
  "configurationEndpointUrl": "String",
  "description": "String",
  "displayName": "String",
  "enableAuthenticationViaCompanyPortal": "Boolean",
  "requireCompanyPortalOnSetupAssistantEnrolledDevices": "Boolean",
  "requiresUserAuthentication": "Boolean",
  "appleIdDisabled": "Boolean",
  "applePayDisabled": "Boolean",
  "awaitDeviceConfiguredConfirmation": "Boolean",
  "diagnosticsDisabled": "Boolean",
  "enableSharedIPad": "Boolean",
  "isDefault": "Boolean",
  "isMandatory": "Boolean",
  "iTunesPairingMode": "String",
  "locationDisabled": "Boolean",
  "macOSFileVaultDisabled": "Boolean",
  "macOSRegistrationDisabled": "Boolean",
  "managementCertificates": [
    {
      "@odata.type": "microsoft.graph.managementCertificateWithThumbprint"
    }
  ],
  "passCodeDisabled": "Boolean",
  "profileRemovalDisabled": "Boolean",
  "restoreBlocked": "Boolean",
  "restoreFromAndroidDisabled": "Boolean",
  "sharedIPadMaximumUserCount": "Integer",
  "siriDisabled": "Boolean",
  "supervisedModeEnabled": "Boolean",
  "supportDepartment": "String",
  "supportPhoneNumber": "String",
  "termsAndConditionsDisabled": "Boolean",
  "touchIdDisabled": "Boolean",
  "zoomDisabled": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.depEnrollmentProfile"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.depEnrollmentProfile",
  "id": "3a71ae45-ae45-3a71-45ae-713a45ae713a",
  "configurationEndpointUrl": "String",
  "description": "String",
  "displayName": "String",
  "enableAuthenticationViaCompanyPortal": "Boolean",
  "requireCompanyPortalOnSetupAssistantEnrolledDevices": "Boolean",
  "requiresUserAuthentication": "Boolean",
  "appleIdDisabled": "Boolean",
  "applePayDisabled": "Boolean",
  "awaitDeviceConfiguredConfirmation": "Boolean",
  "diagnosticsDisabled": "Boolean",
  "enableSharedIPad": "Boolean",
  "isDefault": "Boolean",
  "isMandatory": "Boolean",
  "iTunesPairingMode": "String",
  "locationDisabled": "Boolean",
  "macOSFileVaultDisabled": "Boolean",
  "macOSRegistrationDisabled": "Boolean",
  "managementCertificates": [
    {
      "@odata.type": "microsoft.graph.managementCertificateWithThumbprint"
    }
  ],
  "passCodeDisabled": "Boolean",
  "profileRemovalDisabled": "Boolean",
  "restoreBlocked": "Boolean",
  "restoreFromAndroidDisabled": "Boolean",
  "sharedIPadMaximumUserCount": "Integer",
  "siriDisabled": "Boolean",
  "supervisedModeEnabled": "Boolean",
  "supportDepartment": "String",
  "supportPhoneNumber": "String",
  "termsAndConditionsDisabled": "Boolean",
  "touchIdDisabled": "Boolean",
  "zoomDisabled": "Boolean"
}
```

