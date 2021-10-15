---
title: "Update intuneBrandingProfile"
description: "Update the properties of an intuneBrandingProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update intuneBrandingProfile
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [intuneBrandingProfile](../resources/intune-intunebrandingprofile.md) object.

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
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|profileName|String|Name of the profile Optional.|
|profileDescription|String|Description of the profile Optional.|
|isDefaultProfile|Boolean|Boolean that represents whether the profile is used as default or not Required.|
|createdDateTime|DateTimeOffset|Time when the BrandingProfile was created Required.|
|lastModifiedDateTime|DateTimeOffset|Time when the BrandingProfile was last modified Required.|
|displayName|String|Company/organization name that is displayed to end users Optional.|
|themeColor|[microsoft.management.services.api.rgbColor](../resources/intune-rgbcolor.md)|Primary theme color used in the Company Portal applications and web portal Optional.|
|showLogo|Boolean|Boolean that represents whether the administrator-supplied logo images are shown or not Required.|
|showDisplayNameNextToLogo|Boolean|Boolean that represents whether the administrator-supplied display name will be shown next to the logo image or not Required.|
|themeColorLogo|[microsoft.management.services.api.mimeContent](../resources/intune-mimecontent.md)|Logo image displayed in Company Portal apps which have a theme color background behind the logo Optional.|
|lightBackgroundLogo|[microsoft.management.services.api.mimeContent](../resources/intune-mimecontent.md)|Logo image displayed in Company Portal apps which have a light background behind the logo Optional.|
|landingPageCustomizedImage|[microsoft.management.services.api.mimeContent](../resources/intune-mimecontent.md)|Customized image displayed in Company Portal apps landing page Optional.|
|contactITName|String|Name of the person/organization responsible for IT support Optional.|
|contactITPhoneNumber|String|Phone number of the person/organization responsible for IT support Optional.|
|contactITEmailAddress|String|E-mail address of the person/organization responsible for IT support Optional.|
|contactITNotes|String|Text comments regarding the person/organization responsible for IT support Optional.|
|onlineSupportSiteUrl|String|URL to the company/organization’s IT helpdesk site Optional.|
|onlineSupportSiteName|String|Display name of the company/organization’s IT helpdesk site Optional.|
|privacyUrl|String|URL to the company/organization’s privacy policy Optional.|
|customPrivacyMessage|String|Text comments regarding what the admin doesn't have access to on the device Optional.|
|customCanSeePrivacyMessage|String|Text comments regarding what the admin has access to on the device Optional.|
|customCantSeePrivacyMessage|String|Text comments regarding what the admin doesn't have access to on the device Optional.|
|isRemoveDeviceDisabled|Boolean|Boolean that represents whether the adminsistrator has disabled the 'Remove Device' action on corporate owned devices. Required.|
|isFactoryResetDisabled|Boolean|Boolean that represents whether the adminsistrator has disabled the 'Factory Reset' action on corporate owned devices. Required.|
|companyPortalBlockedActions|[microsoft.management.services.api.companyPortalBlockedAction](../resources/intune-companyportalblockedaction.md) collection|Collection of blocked actions on the company portal as per platform and device ownership types. Optional.|
|showAzureADEnterpriseApps|Boolean|Boolean that indicates if AzureAD Enterprise Apps will be shown in Company Portal Required.|
|showOfficeWebApps|Boolean|Boolean that indicates if Office WebApps will be shown in Company Portal Required.|
|sendDeviceOwnershipChangePushNotification|Boolean|Boolean that indicates if a push notification is sent to users when their device ownership type changes from personal to corporate Required.|
|enrollmentAvailability|enrollmentAvailabilityOptions|Customized device enrollment flow displayed to the end user . The possible values are: `availableWithPrompts`, `availableWithoutPrompts`, `unavailable`. Required.|
|disableClientTelemetry|Boolean|Applies to telemetry sent from all clients to the Intune service. When disabled, all proactive troubleshooting and issue warnings within the client are turned off, and telemetry settings appear inactive or hidden to the device user. Required.|
|roleScopeTagIds|String collection|List of scope tags assigned to the branding profile Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [intuneBrandingProfile](../resources/intune-intunebrandingprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_intunebrandingprofile"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/intuneBrandingProfiles/{intuneBrandingProfileId}
Content-Type: application/json
Content-length: 1408

{
  "@odata.type": "#microsoft.graph.intuneBrandingProfile",
  "profileName": "String",
  "profileDescription": "String",
  "isDefaultProfile": "Boolean",
  "displayName": "String",
  "themeColor": {
    "@odata.type": "microsoft.graph.rgbColor"
  },
  "showLogo": "Boolean",
  "showDisplayNameNextToLogo": "Boolean",
  "themeColorLogo": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "lightBackgroundLogo": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "landingPageCustomizedImage": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "contactITName": "String",
  "contactITPhoneNumber": "String",
  "contactITEmailAddress": "String",
  "contactITNotes": "String",
  "onlineSupportSiteUrl": "String",
  "onlineSupportSiteName": "String",
  "privacyUrl": "String",
  "customPrivacyMessage": "String",
  "customCanSeePrivacyMessage": "String",
  "customCantSeePrivacyMessage": "String",
  "isRemoveDeviceDisabled": "Boolean",
  "isFactoryResetDisabled": "Boolean",
  "companyPortalBlockedActions": [
    {
      "@odata.type": "microsoft.graph.companyPortalBlockedAction"
    }
  ],
  "showAzureADEnterpriseApps": "Boolean",
  "showOfficeWebApps": "Boolean",
  "sendDeviceOwnershipChangePushNotification": "Boolean",
  "enrollmentAvailability": "String",
  "disableClientTelemetry": "Boolean",
  "roleScopeTagIds": [
    "String"
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
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
  "id": "7501904b-904b-7501-4b90-01754b900175",
  "profileName": "String",
  "profileDescription": "String",
  "isDefaultProfile": "Boolean",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "displayName": "String",
  "themeColor": {
    "@odata.type": "microsoft.graph.rgbColor"
  },
  "showLogo": "Boolean",
  "showDisplayNameNextToLogo": "Boolean",
  "themeColorLogo": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "lightBackgroundLogo": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "landingPageCustomizedImage": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "contactITName": "String",
  "contactITPhoneNumber": "String",
  "contactITEmailAddress": "String",
  "contactITNotes": "String",
  "onlineSupportSiteUrl": "String",
  "onlineSupportSiteName": "String",
  "privacyUrl": "String",
  "customPrivacyMessage": "String",
  "customCanSeePrivacyMessage": "String",
  "customCantSeePrivacyMessage": "String",
  "isRemoveDeviceDisabled": "Boolean",
  "isFactoryResetDisabled": "Boolean",
  "companyPortalBlockedActions": [
    {
      "@odata.type": "microsoft.graph.companyPortalBlockedAction"
    }
  ],
  "showAzureADEnterpriseApps": "Boolean",
  "showOfficeWebApps": "Boolean",
  "sendDeviceOwnershipChangePushNotification": "Boolean",
  "enrollmentAvailability": "String",
  "disableClientTelemetry": "Boolean",
  "roleScopeTagIds": [
    "String"
  ]
}
```

