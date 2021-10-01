---
title: "intuneBrandingProfile resource type"
description: "This entity contains data which is used in customizing the tenant level appearance of the Company Portal applications as well as the end user web portal."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# intuneBrandingProfile resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

This entity contains data which is used in customizing the tenant level appearance of the Company Portal applications as well as the end user web portal.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List intuneBrandingProfiles](../api/intune-intunebrandingprofile-list.md)|[intuneBrandingProfile](../resources/intune-intunebrandingprofile.md) collection|Get a list of the [intuneBrandingProfile](../resources/intune-intunebrandingprofile.md) objects and their properties.|
|[Create intuneBrandingProfile](../api/intune-intunebrandingprofile-create.md)|[intuneBrandingProfile](../resources/intune-intunebrandingprofile.md)|Create a new [intuneBrandingProfile](../resources/intune-intunebrandingprofile.md) object.|
|[Get intuneBrandingProfile](../api/intune-intunebrandingprofile-get.md)|[intuneBrandingProfile](../resources/intune-intunebrandingprofile.md)|Read the properties and relationships of an [intuneBrandingProfile](../resources/intune-intunebrandingprofile.md) object.|
|[Update intuneBrandingProfile](../api/intune-intunebrandingprofile-update.md)|[intuneBrandingProfile](../resources/intune-intunebrandingprofile.md)|Update the properties of an [intuneBrandingProfile](../resources/intune-intunebrandingprofile.md) object.|
|[Delete intuneBrandingProfile](../api/intune-intunebrandingprofile-delete.md)|None|Deletes an [intuneBrandingProfile](../resources/intune-intunebrandingprofile.md) object.|
|[List assignments](../api/intune-intunebrandingprofile-list-assignments.md)|[intuneBrandingProfileAssignment](../resources/intune-intunebrandingprofileassignment.md) collection|Get the intuneBrandingProfileAssignment resources from the assignments navigation property.|
|[Create intuneBrandingProfileAssignment](../api/intune-intunebrandingprofile-post-assignments.md)|[intuneBrandingProfileAssignment](../resources/intune-intunebrandingprofileassignment.md)|Create a new intuneBrandingProfileAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|companyPortalBlockedActions|[companyPortalBlockedAction](../resources/intune-companyportalblockedaction.md) collection|Collection of blocked actions on the company portal as per platform and device ownership types.|
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
|enrollmentAvailability|enrollmentAvailabilityOptions|Customized device enrollment flow displayed to the end user . The possible values are: `availableWithPrompts`, `availableWithoutPrompts`, `unavailable`.|
|id|String|Profile Key|
|isDefaultProfile|Boolean|Boolean that represents whether the profile is used as default or not|
|isFactoryResetDisabled|Boolean|Boolean that represents whether the adminsistrator has disabled the 'Factory Reset' action on corporate owned devices.|
|isRemoveDeviceDisabled|Boolean|Boolean that represents whether the adminsistrator has disabled the 'Remove Device' action on corporate owned devices.|
|landingPageCustomizedImage|[mimeContent](../resources/intune-mimecontent.md)|Customized image displayed in Company Portal apps landing page|
|lastModifiedDateTime|DateTimeOffset|Time when the BrandingProfile was last modified|
|lightBackgroundLogo|[mimeContent](../resources/intune-mimecontent.md)|Logo image displayed in Company Portal apps which have a light background behind the logo|
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
|themeColor|[rgbColor](../resources/intune-rgbcolor.md)|Primary theme color used in the Company Portal applications and web portal|
|themeColorLogo|[mimeContent](../resources/intune-mimecontent.md)|Logo image displayed in Company Portal apps which have a theme color background behind the logo|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[intuneBrandingProfileAssignment](../resources/intune-intunebrandingprofileassignment.md) collection|The list of group assignments for the branding profile|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.intuneBrandingProfile",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.intuneBrandingProfile",
  "id": "String (identifier)",
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

