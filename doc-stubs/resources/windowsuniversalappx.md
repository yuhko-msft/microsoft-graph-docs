---
title: "windowsUniversalAppX resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsUniversalAppX resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [mobileLobApp](../resources/mobilelobapp.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsUniversalAppXes](../api/windowsuniversalappx-list.md)|[windowsUniversalAppX](../resources/windowsuniversalappx.md) collection|Get a list of the [windowsUniversalAppX](../resources/windowsuniversalappx.md) objects and their properties.|
|[Create windowsUniversalAppX](../api/windowsuniversalappx-create.md)|[windowsUniversalAppX](../resources/windowsuniversalappx.md)|Create a new [windowsUniversalAppX](../resources/windowsuniversalappx.md) object.|
|[Get windowsUniversalAppX](../api/windowsuniversalappx-get.md)|[windowsUniversalAppX](../resources/windowsuniversalappx.md)|Read the properties and relationships of a [windowsUniversalAppX](../resources/windowsuniversalappx.md) object.|
|[Update windowsUniversalAppX](../api/windowsuniversalappx-update.md)|[windowsUniversalAppX](../resources/windowsuniversalappx.md)|Update the properties of a [windowsUniversalAppX](../resources/windowsuniversalappx.md) object.|
|[Delete windowsUniversalAppX](../api/windowsuniversalappx-delete.md)|None|Deletes a [windowsUniversalAppX](../resources/windowsuniversalappx.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applicableArchitectures|windowsArchitecture|**TODO: Add Description**. Possible values are: `none`, `x86`, `x64`, `arm`, `neutral`, `arm64`.|
|applicableDeviceTypes|windowsDeviceType|**TODO: Add Description**. Possible values are: `none`, `desktop`, `mobile`, `holographic`, `team`.|
|committedContentVersion|String|**TODO: Add Description** Inherited from [mobileLobApp](../resources/mobilelobapp.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|dependentAppCount|Int32|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|description|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|developer|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|displayName|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|fileName|String|**TODO: Add Description** Inherited from [mobileLobApp](../resources/mobilelobapp.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|identityName|String|**TODO: Add Description**|
|identityPublisherHash|String|**TODO: Add Description**|
|identityResourceIdentifier|String|**TODO: Add Description**|
|identityVersion|String|**TODO: Add Description**|
|informationUrl|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|isAssigned|Boolean|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|isBundle|Boolean|**TODO: Add Description**|
|isFeatured|Boolean|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|isMsiX|Boolean|**TODO: Add Description**|
|largeIcon|[mimeContent](../resources/intune-mimecontent.md)|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|minimumSupportedOperatingSystem|[windowsMinimumOperatingSystem](../resources/intune-windowsminimumoperatingsystem.md)|**TODO: Add Description**|
|notes|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|owner|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|privacyInformationUrl|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|publisher|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|publishingState|mobileAppPublishingState|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md). Possible values are: `notPublished`, `processing`, `published`.|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|size|Int64|**TODO: Add Description** Inherited from [mobileLobApp](../resources/mobilelobapp.md)|
|supersededAppCount|Int32|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|supersedingAppCount|Int32|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|uploadState|Int32|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[mobileAppAssignment](../resources/intune-mobileappassignment.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|categories|[mobileAppCategory](../resources/intune-mobileappcategory.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|committedContainedApps|[mobileContainedApp](../resources/intune-mobilecontainedapp.md) collection|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.windowsUniversalAppX",
  "baseType": "microsoft.graph.mobileLobApp",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsUniversalAppX",
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
  "applicableArchitectures": "String",
  "applicableDeviceTypes": "String",
  "identityName": "String",
  "identityPublisherHash": "String",
  "identityResourceIdentifier": "String",
  "isBundle": "Boolean",
  "minimumSupportedOperatingSystem": {
    "@odata.type": "microsoft.graph.windowsMinimumOperatingSystem"
  },
  "identityVersion": "String",
  "isMsiX": "Boolean"
}
```

