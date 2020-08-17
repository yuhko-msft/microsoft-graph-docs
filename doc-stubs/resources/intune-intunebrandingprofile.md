---
title: "intuneBrandingProfile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# intuneBrandingProfile resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List intuneBrandingProfiles](../api/intune-intunebrandingprofile-list.md)|[intuneBrandingProfile](../resources/intune-intunebrandingprofile.md) collection|Get a list of the [intuneBrandingProfile](../resources/intunebrandingprofile.md) objects and their properties.|
|[Create intuneBrandingProfile](../api/intune-intunebrandingprofile-create.md)|[intuneBrandingProfile](../resources/intune-intunebrandingprofile.md)|Create a new [intuneBrandingProfile](../resources/intune-intunebrandingprofile.md) object.|
|[Get intuneBrandingProfile](../api/intune-intunebrandingprofile-get.md)|[intuneBrandingProfile](../resources/intune-intunebrandingprofile.md)|Read the properties and relationships of an [intuneBrandingProfile](../resources/intune-intunebrandingprofile.md) object.|
|[Update intuneBrandingProfile](../api/intune-intunebrandingprofile-update.md)|[intuneBrandingProfile](../resources/intune-intunebrandingprofile.md)|Update the properties of an [intuneBrandingProfile](../resources/intune-intunebrandingprofile.md) object.|
|[Delete intuneBrandingProfile](../api/intune-intunebrandingprofile-delete.md)|None|Deletes an [intuneBrandingProfile](../resources/intune-intunebrandingprofile.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|companyPortalBlockedActions|[companyPortalBlockedAction](../resources/intune-companyportalblockedaction.md) collection|**TODO: Add Description**|
|contactITEmailAddress|String|**TODO: Add Description**|
|contactITName|String|**TODO: Add Description**|
|contactITNotes|String|**TODO: Add Description**|
|contactITPhoneNumber|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|customCanSeePrivacyMessage|String|**TODO: Add Description**|
|customCantSeePrivacyMessage|String|**TODO: Add Description**|
|customPrivacyMessage|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|enrollmentAvailability|enrollmentAvailabilityOptions|**TODO: Add Description**. Possible values are: `availableWithPrompts`, `availableWithoutPrompts`, `unavailable`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isDefaultProfile|Boolean|**TODO: Add Description**|
|isFactoryResetDisabled|Boolean|**TODO: Add Description**|
|isRemoveDeviceDisabled|Boolean|**TODO: Add Description**|
|landingPageCustomizedImage|[mimeContent](../resources/intune-mimecontent.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|lightBackgroundLogo|[mimeContent](../resources/intune-mimecontent.md)|**TODO: Add Description**|
|onlineSupportSiteName|String|**TODO: Add Description**|
|onlineSupportSiteUrl|String|**TODO: Add Description**|
|privacyUrl|String|**TODO: Add Description**|
|profileDescription|String|**TODO: Add Description**|
|profileName|String|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description**|
|sendDeviceOwnershipChangePushNotification|Boolean|**TODO: Add Description**|
|showAzureADEnterpriseApps|Boolean|**TODO: Add Description**|
|showDisplayNameNextToLogo|Boolean|**TODO: Add Description**|
|showLogo|Boolean|**TODO: Add Description**|
|showOfficeWebApps|Boolean|**TODO: Add Description**|
|themeColor|[rgbColor](../resources/intune-rgbcolor.md)|**TODO: Add Description**|
|themeColorLogo|[mimeContent](../resources/intune-mimecontent.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[intuneBrandingProfileAssignment](../resources/intune-intunebrandingprofileassignment.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.intuneBrandingProfile",
  "baseType": "microsoft.graph.entity",
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
  "roleScopeTagIds": [
    "String"
  ]
}
```

