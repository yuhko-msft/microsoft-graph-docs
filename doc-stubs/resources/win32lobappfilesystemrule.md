---
title: "win32LobAppFileSystemRule resource type"
description: "A complex type to store file or folder rule data for a Win32 LOB app."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# win32LobAppFileSystemRule resource type

Namespace: microsoft.graph

A complex type to store file or folder rule data for a Win32 LOB app.


Inherits from [win32LobAppRule](../resources/win32lobapprule.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|check32BitOn64System|Boolean|A value indicating whether to expand environment variables in the 32-bit context on 64-bit systems.|
|comparisonValue|String|The file or folder comparison value.|
|fileOrFolderName|String|The file or folder name to look up.|
|operationType|win32LobAppFileSystemOperationType|The file system operation type. Possible values are: `notConfigured`, `exists`, `modifiedDate`, `createdDate`, `version`, `sizeInMB`, `doesNotExist`.|
|operator|win32LobAppRuleOperator|The operator for file or folder detection. Possible values are: `notConfigured`, `equal`, `notEqual`, `greaterThan`, `greaterThanOrEqual`, `lessThan`, `lessThanOrEqual`.|
|path|String|The file or folder path to look up.|
|ruleType|win32LobAppRuleType|The rule type indicating the purpose of the rule. Inherited from [win32LobAppRule](../resources/win32lobapprule.md). Possible values are: `detection`, `requirement`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.win32LobAppFileSystemRule"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.win32LobAppFileSystemRule",
  "ruleType": "String",
  "path": "String",
  "fileOrFolderName": "String",
  "check32BitOn64System": "Boolean",
  "operationType": "String",
  "operator": "String",
  "comparisonValue": "String"
}
```

