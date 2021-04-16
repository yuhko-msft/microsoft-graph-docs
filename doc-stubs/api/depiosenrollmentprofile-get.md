---
title: "Get depIOSEnrollmentProfile"
description: "Read the properties and relationships of a depIOSEnrollmentProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get depIOSEnrollmentProfile
Namespace: microsoft.graph



Read the properties and relationships of a [depIOSEnrollmentProfile](../resources/depiosenrollmentprofile.md) object.

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
GET /deviceManagement/depOnboardingSettings/{depOnboardingSettingId}/defaultIosEnrollmentProfile
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [depIOSEnrollmentProfile](../resources/depiosenrollmentprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_depiosenrollmentprofile"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/depOnboardingSettings/{depOnboardingSettingId}/defaultIosEnrollmentProfile
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
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

