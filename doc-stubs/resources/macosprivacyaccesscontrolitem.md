---
title: "macOSPrivacyAccessControlItem resource type"
description: "Represents per-process privacy preferences."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSPrivacyAccessControlItem resource type

Namespace: microsoft.graph



Represents per-process privacy preferences.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accessibility|enablement|Allow the app or process to control the Mac via the Accessibility subsystem. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|addressBook|enablement|Allow or block access to contact information managed by Contacts. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|appleEventsAllowedReceivers|[macOSAppleEventReceiver](../resources/macosappleeventreceiver.md) collection|Allow or deny the app or process to send a restricted Apple event to another app or process. You will need to know the identifier, identifier type, and code requirement of the receiving app or process. This collection can contain a maximum of 500 elements.|
|blockCamera|Boolean|Block access to camera app.|
|blockListenEvent|Boolean|Block the app or process from listening to events from input devices such as mouse, keyboard, and trackpad.Requires macOS 10.15 or later.|
|blockMicrophone|Boolean|Block access to microphone.|
|blockScreenCapture|Boolean|Block app from capturing contents of system display. Requires macOS 10.15 or later.|
|calendar|enablement|Allow or block access to event information managed by Calendar. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|codeRequirement|String|Enter the code requirement, which can be obtained with the command 'codesign –display -r –' in the Terminal app. Include everything after '=>'.|
|displayName|String|The display name of the app, process, or executable.|
|fileProviderPresence|enablement|Allow the app or process to access files managed by another app’s file provider extension. Requires macOS 10.15 or later. . Possible values are: `notConfigured`, `enabled`, `disabled`.|
|identifier|String|The bundle ID or path of the app, process, or executable.|
|identifierType|macOSProcessIdentifierType|A bundle ID is used to identify an app. A path is used to identify a process or executable. Possible values are: `bundleID`, `path`.|
|mediaLibrary|enablement|Allow or block access to music and the media library. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|photos|enablement|Allow or block access to images managed by Photos. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|postEvent|enablement|Control access to CoreGraphics APIs, which are used to send CGEvents to the system event stream. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|reminders|enablement|Allow or block access to information managed by Reminders. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|speechRecognition|enablement|Allow or block access to system speech recognition facility. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|staticCodeValidation|Boolean|Statically validates the code requirement. Use this setting if the process invalidates its dynamic code signature.|
|systemPolicyAllFiles|enablement|Control access to all protected files on a device. Files might be in locations such as emails, messages, apps, and administrative settings. Apply this setting with caution. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|systemPolicyDesktopFolder|enablement|Allow or block access to Desktop folder. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|systemPolicyDocumentsFolder|enablement|Allow or block access to Documents folder. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|systemPolicyDownloadsFolder|enablement|Allow or block access to Downloads folder. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|systemPolicyNetworkVolumes|enablement|Allow or block access to network volumes. Requires macOS 10.15 or later. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|systemPolicyRemovableVolumes|enablement|Control access to removable  volumes on the device, such as an external hard drive. Requires macOS 10.15 or later. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|systemPolicySystemAdminFiles|enablement|Allow app or process to access files used in system administration. Possible values are: `notConfigured`, `enabled`, `disabled`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.macOSPrivacyAccessControlItem"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSPrivacyAccessControlItem",
  "accessibility": "String",
  "addressBook": "String",
  "appleEventsAllowedReceivers": [
    {
      "@odata.type": "microsoft.graph.macOSAppleEventReceiver"
    }
  ],
  "blockCamera": "Boolean",
  "blockListenEvent": "Boolean",
  "blockMicrophone": "Boolean",
  "blockScreenCapture": "Boolean",
  "calendar": "String",
  "codeRequirement": "String",
  "displayName": "String",
  "fileProviderPresence": "String",
  "identifier": "String",
  "identifierType": "String",
  "mediaLibrary": "String",
  "photos": "String",
  "postEvent": "String",
  "reminders": "String",
  "speechRecognition": "String",
  "staticCodeValidation": "Boolean",
  "systemPolicyAllFiles": "String",
  "systemPolicyDesktopFolder": "String",
  "systemPolicyDocumentsFolder": "String",
  "systemPolicyDownloadsFolder": "String",
  "systemPolicyNetworkVolumes": "String",
  "systemPolicyRemovableVolumes": "String",
  "systemPolicySystemAdminFiles": "String"
}
```

