---
title: "win32LobAppFileSystemDetection resource type"
description: "Contains file or folder path to detect a Win32 App"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# win32LobAppFileSystemDetection resource type

Namespace: microsoft.graph



Contains file or folder path to detect a Win32 App


Inherits from [win32LobAppDetection](../resources/win32lobappdetection.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|check32BitOn64System|Boolean|A value indicating whether this file or folder is for checking 32-bit app on 64-bit system|
|detectionType|win32LobAppFileSystemDetectionType|The file system detection type. Possible values are: `notConfigured`, `exists`, `modifiedDate`, `createdDate`, `version`, `sizeInMB`, `doesNotExist`.|
|detectionValue|String|The file or folder detection value|
|fileOrFolderName|String|The file or folder name to detect Win32 Line of Business (LoB) app|
|operator|win32LobAppDetectionOperator|The operator for file or folder detection. Possible values are: `notConfigured`, `equal`, `notEqual`, `greaterThan`, `greaterThanOrEqual`, `lessThan`, `lessThanOrEqual`.|
|path|String|The file or folder path to detect Win32 Line of Business (LoB) app|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.win32LobAppFileSystemDetection"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.win32LobAppFileSystemDetection",
  "check32BitOn64System": "Boolean",
  "detectionType": "String",
  "detectionValue": "String",
  "fileOrFolderName": "String",
  "operator": "String",
  "path": "String"
}
```

