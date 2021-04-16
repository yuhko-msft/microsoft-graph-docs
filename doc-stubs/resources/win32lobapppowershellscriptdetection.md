---
title: "win32LobAppPowerShellScriptDetection resource type"
description: "Contains PowerShell script properties to detect a Win32 App"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# win32LobAppPowerShellScriptDetection resource type

Namespace: microsoft.graph



Contains PowerShell script properties to detect a Win32 App


Inherits from [win32LobAppDetection](../resources/win32lobappdetection.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|enforceSignatureCheck|Boolean|A value indicating whether signature check is enforced|
|runAs32Bit|Boolean|A value indicating whether this script should run as 32-bit|
|scriptContent|String|The base64 encoded script content to detect Win32 Line of Business (LoB) app|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.win32LobAppPowerShellScriptDetection"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.win32LobAppPowerShellScriptDetection",
  "enforceSignatureCheck": "Boolean",
  "runAs32Bit": "Boolean",
  "scriptContent": "String"
}
```

