---
title: "intuneBrand resource type"
description: "intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# intuneBrand resource type

Namespace: microsoft.graph



intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|companyPortalBlockedActions|[companyPortalBlockedAction](../resources/companyportalblockedaction.md) collection|Collection of blocked actions on the company portal as per platform and device ownership types.|
|contactITEmailAddress|String|Email address of the person/organization responsible for IT support.|
|contactITName|String|Name of the person/organization responsible for IT support.|
|contactITNotes|String|Text comments regarding the person/organization responsible for IT support.|
|contactITPhoneNumber|String|Phone number of the person/organization responsible for IT support.|
|customCanSeePrivacyMessage|String|The custom privacy message used to explain what the organization can see and do on managed devices.|
|customCantSeePrivacyMessage|String|The custom privacy message used to explain what the organization can’t see or do on managed devices.|
|customPrivacyMessage|String|The custom privacy message used to explain what the organization can’t see or do on managed devices.|
|darkBackgroundLogo|[mimeContent](../resources/mimecontent.md)|Logo image displayed in Company Portal apps which have a dark background behind the logo.|
|disableClientTelemetry|Boolean|Applies to telemetry sent from all clients to the Intune service. When disabled, all proactive troubleshooting and issue warnings within the client are turned off, and telemetry settings appear inactive or hidden to the device user.|
|displayName|String|Company/organization name that is displayed to end users.|
|enrollmentAvailability|enrollmentAvailabilityOptions|Customized device enrollment flow displayed to the end user . Possible values are: `availableWithPrompts`, `availableWithoutPrompts`, `unavailable`.|
|isFactoryResetDisabled|Boolean|Boolean that represents whether the adminsistrator has disabled the 'Factory Reset' action on corporate owned devices.|
|isRemoveDeviceDisabled|Boolean|Boolean that represents whether the adminsistrator has disabled the 'Remove Device' action on corporate owned devices.|
|landingPageCustomizedImage|[mimeContent](../resources/mimecontent.md)|Customized image displayed in Company Portal app landing page|
|lightBackgroundLogo|[mimeContent](../resources/mimecontent.md)|Logo image displayed in Company Portal apps which have a light background behind the logo.|
|onlineSupportSiteName|String|Display name of the company/organization’s IT helpdesk site.|
|onlineSupportSiteUrl|String|URL to the company/organization’s IT helpdesk site.|
|privacyUrl|String|URL to the company/organization’s privacy policy.|
|roleScopeTagIds|String collection|List of scope tags assigned to the default branding profile|
|sendDeviceOwnershipChangePushNotification|Boolean|Boolean that indicates if a push notification is sent to users when their device ownership type changes from personal to corporate|
|showAzureADEnterpriseApps|Boolean|Boolean that indicates if AzureAD Enterprise Apps will be shown in Company Portal|
|showDisplayNameNextToLogo|Boolean|Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.|
|showLogo|Boolean|Boolean that represents whether the administrator-supplied logo images are shown or not shown.|
|showNameNextToLogo|Boolean|Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.|
|showOfficeWebApps|Boolean|Boolean that indicates if Office WebApps will be shown in Company Portal|
|themeColor|[rgbColor](../resources/rgbcolor.md)|Primary theme color used in the Company Portal applications and web portal.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.intuneBrand"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.intuneBrand",
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
  "darkBackgroundLogo": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "disableClientTelemetry": "Boolean",
  "displayName": "String",
  "enrollmentAvailability": "String",
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
  "roleScopeTagIds": [
    "String"
  ],
  "sendDeviceOwnershipChangePushNotification": "Boolean",
  "showAzureADEnterpriseApps": "Boolean",
  "showDisplayNameNextToLogo": "Boolean",
  "showLogo": "Boolean",
  "showNameNextToLogo": "Boolean",
  "showOfficeWebApps": "Boolean",
  "themeColor": {
    "@odata.type": "microsoft.graph.rgbColor"
  }
}
```

