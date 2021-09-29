---
title: "caseExportOperation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# caseExportOperation resource type

Namespace: microsoft.graph.ediscovery

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [caseOperation](../resources/ediscovery-caseoperation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List caseExportOperations](../api/ediscovery-caseexportoperation-list.md)|[microsoft.graph.ediscovery.caseExportOperation](../resources/ediscovery-caseexportoperation.md) collection|Get a list of the [caseExportOperation](../resources/ediscovery-caseexportoperation.md) objects and their properties.|
|[Create caseExportOperation](../api/ediscovery-caseexportoperation-create.md)|[microsoft.graph.ediscovery.caseExportOperation](../resources/ediscovery-caseexportoperation.md)|Create a new [caseExportOperation](../resources/ediscovery-caseexportoperation.md) object.|
|[Get caseExportOperation](../api/ediscovery-caseexportoperation-get.md)|[microsoft.graph.ediscovery.caseExportOperation](../resources/ediscovery-caseexportoperation.md)|Read the properties and relationships of a [caseExportOperation](../resources/ediscovery-caseexportoperation.md) object.|
|[Update caseExportOperation](../api/ediscovery-caseexportoperation-update.md)|[microsoft.graph.ediscovery.caseExportOperation](../resources/ediscovery-caseexportoperation.md)|Update the properties of a [caseExportOperation](../resources/ediscovery-caseexportoperation.md) object.|
|[Delete caseExportOperation](../api/ediscovery-caseexportoperation-delete.md)|None|Deletes a [caseExportOperation](../resources/ediscovery-caseexportoperation.md) object.|
|[List reviewSetQuery](../api/ediscovery-caseexportoperation-list-reviewsetquery.md)|[microsoft.graph.ediscovery.reviewSetQuery](../resources/ediscovery-reviewsetquery.md) collection|Get the reviewSetQuery resources from the reviewSetQuery navigation property.|
|[Add reviewSetQuery](../api/ediscovery-caseexportoperation-post-reviewsetquery.md)|[microsoft.graph.ediscovery.reviewSetQuery](../resources/ediscovery-reviewsetquery.md)|Add reviewSetQuery by posting to the reviewSetQuery collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|action|caseAction|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md). The possible values are: `contentExport`, `applyTags`, `convertToPdf`, `index`, `estimateStatistics`, `addToReviewSet`, `unknownFutureValue`.|
|azureBlobContainer|String|**TODO: Add Description**|
|azureBlobToken|String|**TODO: Add Description**|
|completedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md).|
|createdBy|[microsoft.graph.identitySet](../resources/ediscovery-intune-identityset.md)|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md).|
|description|String|**TODO: Add Description**|
|exportOptions|exportOptions|**TODO: Add Description**. The possible values are: `originalFiles`, `text`, `pdfReplacement`, `fileInfo`, `tags`, `unknownFutureValue`.|
|exportStructure|exportFileStructure|**TODO: Add Description**. The possible values are: `none`, `directory`, `pst`, `unknownFutureValue`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md).|
|outputFolderId|String|**TODO: Add Description**|
|outputName|String|**TODO: Add Description**|
|percentProgress|Int32|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md).|
|resultInfo|[microsoft.graph.resultInfo](../resources/ediscovery-resultinfo.md)|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md).|
|status|caseOperationStatus|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md). The possible values are: `notStarted`, `submissionFailed`, `running`, `succeeded`, `partiallySucceeded`, `failed`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|reviewSet|[reviewSet](../resources/ediscovery-reviewset.md)|**TODO: Add Description**|
|reviewSetQuery|[reviewSetQuery](../resources/ediscovery-reviewsetquery.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.ediscovery.caseExportOperation",
  "baseType": "microsoft.graph.ediscovery.caseOperation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.ediscovery.caseExportOperation",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "completedDateTime": "String (timestamp)",
  "percentProgress": "Integer",
  "status": "String",
  "action": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "resultInfo": {
    "@odata.type": "microsoft.graph.resultInfo"
  },
  "outputName": "String",
  "description": "String",
  "outputFolderId": "String",
  "azureBlobContainer": "String",
  "azureBlobToken": "String",
  "exportOptions": "String",
  "exportStructure": "String"
}
```

