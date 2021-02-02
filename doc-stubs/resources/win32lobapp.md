---
title: "win32LobApp resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# win32LobApp resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [mobileLobApp](../resources/mobilelobapp.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List win32LobApp](../api/win32lobapp-list.md)|[win32LobApp](../resources/win32lobapp.md) collection|Get a list of the [win32LobApp](../resources/win32lobapp.md) objects and their properties.|
|[Create win32LobApp](../api/win32lobapp-create.md)|[win32LobApp](../resources/win32lobapp.md)|Create a new [win32LobApp](../resources/win32lobapp.md) object.|
|[Get win32LobApp](../api/win32lobapp-get.md)|[win32LobApp](../resources/win32lobapp.md)|Read the properties and relationships of a [win32LobApp](../resources/win32lobapp.md) object.|
|[Update win32LobApp](../api/win32lobapp-update.md)|[win32LobApp](../resources/win32lobapp.md)|Update the properties of a [win32LobApp](../resources/win32lobapp.md) object.|
|[Delete win32LobApp](../api/win32lobapp-delete.md)|None|Deletes a [win32LobApp](../resources/win32lobapp.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applicableArchitectures|windowsArchitecture|**TODO: Add Description**. Possible values are: `none`, `x86`, `x64`, `arm`, `neutral`, `arm64`.|
|committedContentVersion|String|**TODO: Add Description** Inherited from [mobileLobApp](../resources/mobilelobapp.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|dependentAppCount|Int32|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|description|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|detectionRules|[win32LobAppDetection](../resources/intune-win32lobappdetection.md) collection|**TODO: Add Description**|
|developer|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|displayName|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|displayVersion|String|**TODO: Add Description**|
|fileName|String|**TODO: Add Description** Inherited from [mobileLobApp](../resources/mobilelobapp.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|informationUrl|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|installCommandLine|String|**TODO: Add Description**|
|installExperience|[win32LobAppInstallExperience](../resources/intune-win32lobappinstallexperience.md)|**TODO: Add Description**|
|installLanguage|String|**TODO: Add Description**|
|isAssigned|Boolean|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|isFeatured|Boolean|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|largeIcon|[mimeContent](../resources/intune-mimecontent.md)|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|minimumCpuSpeedInMHz|Int32|**TODO: Add Description**|
|minimumFreeDiskSpaceInMB|Int32|**TODO: Add Description**|
|minimumMemoryInMB|Int32|**TODO: Add Description**|
|minimumNumberOfProcessors|Int32|**TODO: Add Description**|
|minimumSupportedOperatingSystem|[windowsMinimumOperatingSystem](../resources/intune-windowsminimumoperatingsystem.md)|**TODO: Add Description**|
|minimumSupportedWindowsRelease|String|**TODO: Add Description**|
|msiInformation|[win32LobAppMsiInformation](../resources/intune-win32lobappmsiinformation.md)|**TODO: Add Description**|
|notes|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|owner|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|privacyInformationUrl|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|publisher|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|publishingState|mobileAppPublishingState|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md). Possible values are: `notPublished`, `processing`, `published`.|
|requirementRules|[win32LobAppRequirement](../resources/intune-win32lobapprequirement.md) collection|**TODO: Add Description**|
|returnCodes|[win32LobAppReturnCode](../resources/intune-win32lobappreturncode.md) collection|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|rules|[win32LobAppRule](../resources/intune-win32lobapprule.md) collection|**TODO: Add Description**|
|runAs32Bit|Boolean|**TODO: Add Description**|
|setupFilePath|String|**TODO: Add Description**|
|size|Int64|**TODO: Add Description** Inherited from [mobileLobApp](../resources/mobilelobapp.md)|
|supersededAppCount|Int32|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|supersedingAppCount|Int32|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|uninstallCommandLine|String|**TODO: Add Description**|
|uploadState|Int32|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[mobileAppAssignment](../resources/intune-mobileappassignment.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|categories|[mobileAppCategory](../resources/intune-mobileappcategory.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|contentVersions|[mobileAppContent](../resources/intune-mobileappcontent.md) collection|**TODO: Add Description** Inherited from [mobileLobApp](../resources/mobilelobapp.md)|
|deviceStatuses|[mobileAppInstallStatus](../resources/intune-mobileappinstallstatus.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|installSummary|[mobileAppInstallSummary](../resources/intune-mobileappinstallsummary.md)|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|relationships|[mobileAppRelationship](../resources/intune-mobileapprelationship.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|userStatuses|[userAppInstallStatus](../resources/intune-userappinstallstatus.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.win32LobApp",
  "baseType": "microsoft.graph.mobileLobApp",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.win32LobApp",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "publisher": "String",
  "largeIcon": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "isFeatured": "Boolean",
  "privacyInformationUrl": "String",
  "informationUrl": "String",
  "owner": "String",
  "developer": "String",
  "notes": "String",
  "uploadState": "Integer",
  "publishingState": "String",
  "isAssigned": "Boolean",
  "roleScopeTagIds": [
    "String"
  ],
  "dependentAppCount": "Integer",
  "supersedingAppCount": "Integer",
  "supersededAppCount": "Integer",
  "committedContentVersion": "String",
  "fileName": "String",
  "size": "Integer",
  "installCommandLine": "String",
  "uninstallCommandLine": "String",
  "runAs32Bit": "Boolean",
  "applicableArchitectures": "String",
  "minimumSupportedOperatingSystem": {
    "@odata.type": "microsoft.graph.windowsMinimumOperatingSystem"
  },
  "minimumFreeDiskSpaceInMB": "Integer",
  "minimumMemoryInMB": "Integer",
  "minimumNumberOfProcessors": "Integer",
  "minimumCpuSpeedInMHz": "Integer",
  "detectionRules": [
    {
      "@odata.type": "microsoft.graph.win32LobAppRegistryDetection"
    }
  ],
  "requirementRules": [
    {
      "@odata.type": "microsoft.graph.win32LobAppRegistryRequirement"
    }
  ],
  "rules": [
    {
      "@odata.type": "microsoft.graph.win32LobAppRegistryRule"
    }
  ],
  "installExperience": {
    "@odata.type": "microsoft.graph.win32LobAppInstallExperience"
  },
  "returnCodes": [
    {
      "@odata.type": "microsoft.graph.win32LobAppReturnCode"
    }
  ],
  "msiInformation": {
    "@odata.type": "microsoft.graph.win32LobAppMsiInformation"
  },
  "setupFilePath": "String",
  "installLanguage": "String",
  "minimumSupportedWindowsRelease": "String",
  "displayVersion": "String"
}
```

