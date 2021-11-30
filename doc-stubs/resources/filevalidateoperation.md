---
title: "fileValidateOperation resource type"
description: "This entity represents the asynchronous operation results from any operation that validates file data."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# fileValidateOperation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

This entity represents the asynchronous operation results from any operation that validates file data.


Inherits from [validateOperation](../resources/validateoperation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List fileValidateOperations](../api/filevalidateoperation-list.md)|[fileValidateOperation](../resources/filevalidateoperation.md) collection|Get a list of the [fileValidateOperation](../resources/filevalidateoperation.md) objects and their properties.|
|[Get fileValidateOperation](../api/filevalidateoperation-get.md)|[fileValidateOperation](../resources/filevalidateoperation.md)|Read the properties and relationships of a [fileValidateOperation](../resources/filevalidateoperation.md) object.|
|[Update fileValidateOperation](../api/filevalidateoperation-update.md)|[fileValidateOperation](../resources/filevalidateoperation.md)|Update the properties of a [fileValidateOperation](../resources/filevalidateoperation.md) object.|
|[Delete fileValidateOperation](../api/filevalidateoperation-delete.md)|None|Deletes a [fileValidateOperation](../resources/filevalidateoperation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md).|
|errors|[publicError](../resources/publicerror.md) collection|Set of errors discovered by validation. Inherited from [validateOperation](../resources/validateoperation.md).|
|id|String|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md).|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md).|
|resourceLocation|String|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md).|
|status|longRunningOperationStatus|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md). The possible values are: `notStarted`, `running`, `succeeded`, `failed`, `unknownFutureValue`.|
|statusDetail|String|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md).|
|validatedFiles|String collection|**TODO: Add Description**|
|warnings|[publicError](../resources/publicerror.md) collection|Set of warnings discovered by validation. Inherited from [validateOperation](../resources/validateoperation.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.fileValidateOperation",
  "baseType": "microsoft.industryData.validateOperation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.fileValidateOperation",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "lastActionDateTime": "String (timestamp)",
  "status": "String",
  "statusDetail": "String",
  "resourceLocation": "String",
  "errors": [
    {
      "@odata.type": "microsoft.graph.publicError"
    }
  ],
  "warnings": [
    {
      "@odata.type": "microsoft.graph.publicError"
    }
  ],
  "validatedFiles": [
    "String"
  ]
}
```

