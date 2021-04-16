---
title: "mobileAppIntentAndStateDetail resource type"
description: "Mobile App Intent and Install State for a given device."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileAppIntentAndStateDetail resource type

Namespace: microsoft.graph



Mobile App Intent and Install State for a given device.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applicationId|String|MobieApp identifier.|
|displayName|String|The admin provided or imported title of the app.|
|displayVersion|String|Human readable version of the application|
|installState|resultantAppState|The install state of the app. Possible values are: `notApplicable`, `installed`, `failed`, `notInstalled`, `uninstallFailed`, `pendingInstall`, `unknown`.|
|mobileAppIntent|mobileAppIntent|Mobile App Intent. Possible values are: `available`, `notAvailable`, `requiredInstall`, `requiredUninstall`, `requiredAndAvailableInstall`, `availableInstallWithoutEnrollment`, `exclude`.|
|supportedDeviceTypes|[mobileAppSupportedDeviceType](../resources/mobileappsupporteddevicetype.md) collection|The supported platforms for the app.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.mobileAppIntentAndStateDetail"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileAppIntentAndStateDetail",
  "applicationId": "String",
  "displayName": "String",
  "displayVersion": "String",
  "installState": "String",
  "mobileAppIntent": "String",
  "supportedDeviceTypes": [
    {
      "@odata.type": "microsoft.graph.mobileAppSupportedDeviceType"
    }
  ]
}
```

