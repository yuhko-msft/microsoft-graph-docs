---
title: "Update intuneBrandingProfile"
description: "Update the properties of an intuneBrandingProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update intuneBrandingProfile
Namespace: microsoft.graph



Update the properties of an [intuneBrandingProfile](../resources/intunebrandingprofile.md) object.

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
PATCH /deviceManagement/intuneBrandingProfiles/{intuneBrandingProfileId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [intuneBrandingProfile](../resources/intunebrandingprofile.md) object.

The following table shows the properties that are required when you update the [intuneBrandingProfile](../resources/intunebrandingprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|companyPortalBlockedActions|[companyPortalBlockedAction](../resources/companyportalblockedaction.md) collection|Collection of blocked actions on the company portal as per platform and device ownership types.|
|contactITEmailAddress|String|E-mail address of the person/organization responsible for IT support|
|contactITName|String|Name of the person/organization responsible for IT support|
|contactITNotes|String|Text comments regarding the person/organization responsible for IT support|
|contactITPhoneNumber|String|Phone number of the person/organization responsible for IT support|
|createdDateTime|DateTimeOffset|Time when the BrandingProfile was created|
|customCanSeePrivacyMessage|String|Text comments regarding what the admin has access to on the device|
|customCantSeePrivacyMessage|String|Text comments regarding what the admin doesn't have access to on the device|
|customPrivacyMessage|String|Text comments regarding what the admin doesn't have access to on the device|
|disableClientTelemetry|Boolean|Applies to telemetry sent from all clients to the Intune service. When disabled, all proactive troubleshooting and issue warnings within the client are turned off, and telemetry settings appear inactive or hidden to the device user.|
|displayName|String|Company/organization name that is displayed to end users|
|enrollmentAvailability|enrollmentAvailabilityOptions|Customized device enrollment flow displayed to the end user . Possible values are: `availableWithPrompts`, `availableWithoutPrompts`, `unavailable`.|
|isDefaultProfile|Boolean|Boolean that represents whether the profile is used as default or not|
|isFactoryResetDisabled|Boolean|Boolean that represents whether the adminsistrator has disabled the 'Factory Reset' action on corporate owned devices.|
|isRemoveDeviceDisabled|Boolean|Boolean that represents whether the adminsistrator has disabled the 'Remove Device' action on corporate owned devices.|
|landingPageCustomizedImage|[mimeContent](../resources/mimecontent.md)|Customized image displayed in Company Portal apps landing page|
|lastModifiedDateTime|DateTimeOffset|Time when the BrandingProfile was last modified|
|lightBackgroundLogo|[mimeContent](../resources/mimecontent.md)|Logo image displayed in Company Portal apps which have a light background behind the logo|
|onlineSupportSiteName|String|Display name of the company/organization’s IT helpdesk site|
|onlineSupportSiteUrl|String|URL to the company/organization’s IT helpdesk site|
|privacyUrl|String|URL to the company/organization’s privacy policy|
|profileDescription|String|Description of the profile|
|profileName|String|Name of the profile|
|roleScopeTagIds|String collection|List of scope tags assigned to the branding profile|
|sendDeviceOwnershipChangePushNotification|Boolean|Boolean that indicates if a push notification is sent to users when their device ownership type changes from personal to corporate|
|showAzureADEnterpriseApps|Boolean|Boolean that indicates if AzureAD Enterprise Apps will be shown in Company Portal|
|showDisplayNameNextToLogo|Boolean|Boolean that represents whether the administrator-supplied display name will be shown next to the logo image or not|
|showLogo|Boolean|Boolean that represents whether the administrator-supplied logo images are shown or not|
|showOfficeWebApps|Boolean|Boolean that indicates if Office WebApps will be shown in Company Portal|
|themeColor|[rgbColor](../resources/rgbcolor.md)|Primary theme color used in the Company Portal applications and web portal|
|themeColorLogo|[mimeContent](../resources/mimecontent.md)|Logo image displayed in Company Portal apps which have a theme color background behind the logo|



## Response

If successful, this method returns a `200 OK` response code and an updated [intuneBrandingProfile](../resources/intunebrandingprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_intunebrandingprofile"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/intuneBrandingProfiles/{intuneBrandingProfileId}
Content-Type: application/json
Content-length: 1408

{
  "@odata.type": "#microsoft.graph.intuneBrandingProfile",
  "companyPortalBlockedActions": [
    {
      "@odata.type": "microsoft.graph.companyPortalBlockedAction"
    }
  ],
  "contactITEmailAddress": "String",
  "contactITName": "String",
  "contactITNotes": "String",
  "contactITPhoneNumber": "String",
  "customCanSeePrivacyMessage": "String",
  "customCantSeePrivacyMessage": "String",
  "customPrivacyMessage": "String",
  "disableClientTelemetry": "Boolean",
  "displayName": "String",
  "enrollmentAvailability": "String",
  "isDefaultProfile": "Boolean",
  "isFactoryResetDisabled": "Boolean",
  "isRemoveDeviceDisabled": "Boolean",
  "landingPageCustomizedImage": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "lightBackgroundLogo": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "onlineSupportSiteName": "String",
  "onlineSupportSiteUrl": "String",
  "privacyUrl": "String",
  "profileDescription": "String",
  "profileName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "sendDeviceOwnershipChangePushNotification": "Boolean",
  "showAzureADEnterpriseApps": "Boolean",
  "showDisplayNameNextToLogo": "Boolean",
  "showLogo": "Boolean",
  "showOfficeWebApps": "Boolean",
  "themeColor": {
    "@odata.type": "microsoft.graph.rgbColor"
  },
  "themeColorLogo": {
    "@odata.type": "microsoft.graph.mimeContent"
  }
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
  "@odata.type": "#microsoft.graph.intuneBrandingProfile",
  "id": "9e1e22b2-22b2-9e1e-b222-1e9eb2221e9e",
  "companyPortalBlockedActions": [
    {
      "@odata.type": "microsoft.graph.companyPortalBlockedAction"
    }
  ],
  "contactITEmailAddress": "String",
  "contactITName": "String",
  "contactITNotes": "String",
  "contactITPhoneNumber": "String",
  "createdDateTime": "String (timestamp)",
  "customCanSeePrivacyMessage": "String",
  "customCantSeePrivacyMessage": "String",
  "customPrivacyMessage": "String",
  "disableClientTelemetry": "Boolean",
  "displayName": "String",
  "enrollmentAvailability": "String",
  "isDefaultProfile": "Boolean",
  "isFactoryResetDisabled": "Boolean",
  "isRemoveDeviceDisabled": "Boolean",
  "landingPageCustomizedImage": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "lightBackgroundLogo": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "onlineSupportSiteName": "String",
  "onlineSupportSiteUrl": "String",
  "privacyUrl": "String",
  "profileDescription": "String",
  "profileName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "sendDeviceOwnershipChangePushNotification": "Boolean",
  "showAzureADEnterpriseApps": "Boolean",
  "showDisplayNameNextToLogo": "Boolean",
  "showLogo": "Boolean",
  "showOfficeWebApps": "Boolean",
  "themeColor": {
    "@odata.type": "microsoft.graph.rgbColor"
  },
  "themeColorLogo": {
    "@odata.type": "microsoft.graph.mimeContent"
  }
}
```

