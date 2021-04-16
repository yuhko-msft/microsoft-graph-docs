---
title: "win32LobAppFileSystemRequirement resource type"
description: "Contains file or folder path to detect a Win32 App"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# win32LobAppFileSystemRequirement resource type

Namespace: microsoft.graph



Contains file or folder path to detect a Win32 App


Inherits from [win32LobAppRequirement](../resources/win32lobapprequirement.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|check32BitOn64System|Boolean|A value indicating whether this file or folder is for checking 32-bit app on 64-bit system|
|detectionType|win32LobAppFileSystemDetectionType|The file system detection type. Possible values are: `notConfigured`, `exists`, `modifiedDate`, `createdDate`, `version`, `sizeInMB`, `doesNotExist`.|
|detectionValue|String|The detection value Inherited from [win32LobAppRequirement](../resources/win32lobapprequirement.md)|
|fileOrFolderName|String|The file or folder name to detect Win32 Line of Business (LoB) app|
|operator|win32LobAppDetectionOperator|The operator for detection Inherited from [win32LobAppRequirement](../resources/win32lobapprequirement.md). Possible values are: `notConfigured`, `equal`, `notEqual`, `greaterThan`, `greaterThanOrEqual`, `lessThan`, `lessThanOrEqual`.|
|path|String|The file or folder path to detect Win32 Line of Business (LoB) app|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.win32LobAppFileSystemRequirement"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.win32LobAppFileSystemRequirement",
  "detectionValue": "String",
  "operator": "String",
  "check32BitOn64System": "Boolean",
  "detectionType": "String",
  "fileOrFolderName": "String",
  "path": "String"
}
```

