---
title: "Get depEnrollmentProfile"
description: "Read the properties and relationships of a depEnrollmentProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get depEnrollmentProfile
Namespace: microsoft.graph

Read the properties and relationships of a [depEnrollmentProfile](../resources/depenrollmentprofile.md) object.

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
GET /depEnrollmentProfile
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

If successful, this method returns a `200 OK` response code and a [depEnrollmentProfile](../resources/depenrollmentprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_depenrollmentprofile"
}
-->
``` http
GET https://graph.microsoft.com/beta/depEnrollmentProfile
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
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
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
}
```

