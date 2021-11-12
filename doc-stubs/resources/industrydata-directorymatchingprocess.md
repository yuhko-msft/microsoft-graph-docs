---
title: "directoryMatchingProcess resource type"
description: "Process representing the task of matching consolidated incoming data with Azure Active Directory.
This process doesn't have any detailed configuration data of its own.  Rather it aggregates all of the matching settings from every sourceSystemDefinition configured in the system."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# directoryMatchingProcess resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Process representing the task of matching consolidated incoming data with Azure Active Directory.
This process doesn't have any detailed configuration data of its own.  Rather it aggregates all of the matching settings from every sourceSystemDefinition configured in the system.


Inherits from [process](../resources/industrydata-process.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List directoryMatchingProcesses](../api/industrydata-directorymatchingprocess-list.md)|[microsoft.graph.industryData.directoryMatchingProcess](../resources/industrydata-directorymatchingprocess.md) collection|Get a list of the [directoryMatchingProcess](../resources/industrydata-directorymatchingprocess.md) objects and their properties.|
|[Create directoryMatchingProcess](../api/industrydata-industrydatahub-post-directorymatchingprocess.md)|[microsoft.graph.industryData.directoryMatchingProcess](../resources/industrydata-directorymatchingprocess.md)|Create a new [directoryMatchingProcess](../resources/industrydata-directorymatchingprocess.md) object.|
|[Get directoryMatchingProcess](../api/industrydata-directorymatchingprocess-get.md)|[microsoft.graph.industryData.directoryMatchingProcess](../resources/industrydata-directorymatchingprocess.md)|Read the properties and relationships of a [directoryMatchingProcess](../resources/industrydata-directorymatchingprocess.md) object.|
|[Update directoryMatchingProcess](../api/industrydata-directorymatchingprocess-update.md)|[microsoft.graph.industryData.directoryMatchingProcess](../resources/industrydata-directorymatchingprocess.md)|Update the properties of a [directoryMatchingProcess](../resources/industrydata-directorymatchingprocess.md) object.|
|[Delete directoryMatchingProcess](../api/industrydata-directorymatchingprocess-delete.md)|None|Deletes a [directoryMatchingProcess](../resources/industrydata-directorymatchingprocess.md) object.|
|[List runs](../api/industrydata-directorymatchingprocess-list-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md) collection|Get the run resources from the runs navigation property.|
|[Add run](../api/industrydata-directorymatchingprocess-post-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md)|Add runs by posting to the runs collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Name of the process. Inherited from [process](../resources/industrydata-process.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md).|
|readinessStatus|readinessStatus|The state of the process from creation through to ready to do work. Inherited from [process](../resources/industrydata-process.md). The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|runs|[microsoft.graph.industryData.run](../resources/industrydata-run.md) collection|The read-only set of runs that have been executed for this process. Ordered by time. Inherited from [process](../resources/process.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.directoryMatchingProcess",
  "baseType": "microsoft.graph.industryData.process",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.directoryMatchingProcess",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String"
}
```

