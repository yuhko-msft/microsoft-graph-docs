---
title: "Update depEnrollmentProfile"
description: "Update the properties of a depEnrollmentProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update depEnrollmentProfile
Namespace: microsoft.graph

Update the properties of a [depEnrollmentProfile](../resources/depenrollmentprofile.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
PATCH /depEnrollmentProfile
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
|displayName|String|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|description|String|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|requiresUserAuthentication|Boolean|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|configurationEndpointUrl|String|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|enableAuthenticationViaCompanyPortal|Boolean|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|requireCompanyPortalOnSetupAssistantEnrolledDevices|Boolean|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|isDefault|Boolean|**TODO: Add Description**|
|supervisedModeEnabled|Boolean|**TODO: Add Description**|
|supportDepartment|String|**TODO: Add Description**|
|passCodeDisabled|Boolean|**TODO: Add Description**|
|isMandatory|Boolean|**TODO: Add Description**|
|locationDisabled|Boolean|**TODO: Add Description**|
|supportPhoneNumber|String|**TODO: Add Description**|
|iTunesPairingMode|iTunesPairingMode|**TODO: Add Description**. Possible values are: `disallow`, `allow`, `requiresCertificate`.|
|profileRemovalDisabled|Boolean|**TODO: Add Description**|
|managementCertificates|[managementCertificateWithThumbprint](../resources/intune-managementcertificatewiththumbprint.md) collection|**TODO: Add Description**|
|restoreBlocked|Boolean|**TODO: Add Description**|
|restoreFromAndroidDisabled|Boolean|**TODO: Add Description**|
|appleIdDisabled|Boolean|**TODO: Add Description**|
|termsAndConditionsDisabled|Boolean|**TODO: Add Description**|
|touchIdDisabled|Boolean|**TODO: Add Description**|
|applePayDisabled|Boolean|**TODO: Add Description**|
|zoomDisabled|Boolean|**TODO: Add Description**|
|siriDisabled|Boolean|**TODO: Add Description**|
|diagnosticsDisabled|Boolean|**TODO: Add Description**|
|macOSRegistrationDisabled|Boolean|**TODO: Add Description**|
|macOSFileVaultDisabled|Boolean|**TODO: Add Description**|
|awaitDeviceConfiguredConfirmation|Boolean|**TODO: Add Description**|
|sharedIPadMaximumUserCount|Int32|**TODO: Add Description**|
|enableSharedIPad|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [depEnrollmentProfile](../resources/depenrollmentprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_depenrollmentprofile"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/depEnrollmentProfile
Content-Type: application/json
Content-length: 1288

{
  "@odata.type": "#microsoft.graph.depEnrollmentProfile",
  "displayName": "String",
  "description": "String",
  "requiresUserAuthentication": "Boolean",
  "configurationEndpointUrl": "String",
  "enableAuthenticationViaCompanyPortal": "Boolean",
  "requireCompanyPortalOnSetupAssistantEnrolledDevices": "Boolean",
  "isDefault": "Boolean",
  "supervisedModeEnabled": "Boolean",
  "supportDepartment": "String",
  "passCodeDisabled": "Boolean",
  "isMandatory": "Boolean",
  "locationDisabled": "Boolean",
  "supportPhoneNumber": "String",
  "iTunesPairingMode": "String",
  "profileRemovalDisabled": "Boolean",
  "managementCertificates": [
    {
      "@odata.type": "microsoft.graph.managementCertificateWithThumbprint"
    }
  ],
  "restoreBlocked": "Boolean",
  "restoreFromAndroidDisabled": "Boolean",
  "appleIdDisabled": "Boolean",
  "termsAndConditionsDisabled": "Boolean",
  "touchIdDisabled": "Boolean",
  "applePayDisabled": "Boolean",
  "zoomDisabled": "Boolean",
  "siriDisabled": "Boolean",
  "diagnosticsDisabled": "Boolean",
  "macOSRegistrationDisabled": "Boolean",
  "macOSFileVaultDisabled": "Boolean",
  "awaitDeviceConfiguredConfirmation": "Boolean",
  "sharedIPadMaximumUserCount": "Integer",
  "enableSharedIPad": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.depEnrollmentProfile",
  "id": "26d89467-9467-26d8-6794-d8266794d826",
  "displayName": "String",
  "description": "String",
  "requiresUserAuthentication": "Boolean",
  "configurationEndpointUrl": "String",
  "enableAuthenticationViaCompanyPortal": "Boolean",
  "requireCompanyPortalOnSetupAssistantEnrolledDevices": "Boolean",
  "isDefault": "Boolean",
  "supervisedModeEnabled": "Boolean",
  "supportDepartment": "String",
  "passCodeDisabled": "Boolean",
  "isMandatory": "Boolean",
  "locationDisabled": "Boolean",
  "supportPhoneNumber": "String",
  "iTunesPairingMode": "String",
  "profileRemovalDisabled": "Boolean",
  "managementCertificates": [
    {
      "@odata.type": "microsoft.graph.managementCertificateWithThumbprint"
    }
  ],
  "restoreBlocked": "Boolean",
  "restoreFromAndroidDisabled": "Boolean",
  "appleIdDisabled": "Boolean",
  "termsAndConditionsDisabled": "Boolean",
  "touchIdDisabled": "Boolean",
  "applePayDisabled": "Boolean",
  "zoomDisabled": "Boolean",
  "siriDisabled": "Boolean",
  "diagnosticsDisabled": "Boolean",
  "macOSRegistrationDisabled": "Boolean",
  "macOSFileVaultDisabled": "Boolean",
  "awaitDeviceConfiguredConfirmation": "Boolean",
  "sharedIPadMaximumUserCount": "Integer",
  "enableSharedIPad": "Boolean"
}
```

