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

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Process representing the task of matching consolidated incoming data with Azure Active Directory.
This process doesn't have any detailed configuration data of its own.  Rather it aggregates all of the matching settings from every sourceSystemDefinition configured in the system.


Inherits from [process](../resources/process.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List directoryMatchingProcesses](../api/directorymatchingprocess-list.md)|[directoryMatchingProcess](../resources/directorymatchingprocess.md) collection|Get a list of the [directoryMatchingProcess](../resources/directorymatchingprocess.md) objects and their properties.|
|[Create directoryMatchingProcess](../api/industrydatahub-post-directorymatchingprocess.md)|[directoryMatchingProcess](../resources/directorymatchingprocess.md)|Create a new [directoryMatchingProcess](../resources/directorymatchingprocess.md) object.|
|[Get directoryMatchingProcess](../api/directorymatchingprocess-get.md)|[directoryMatchingProcess](../resources/directorymatchingprocess.md)|Read the properties and relationships of a [directoryMatchingProcess](../resources/directorymatchingprocess.md) object.|
|[Update directoryMatchingProcess](../api/directorymatchingprocess-update.md)|[directoryMatchingProcess](../resources/directorymatchingprocess.md)|Update the properties of a [directoryMatchingProcess](../resources/directorymatchingprocess.md) object.|
|[Delete directoryMatchingProcess](../api/directorymatchingprocess-delete.md)|None|Deletes a [directoryMatchingProcess](../resources/directorymatchingprocess.md) object.|
|[List runs](../api/directorymatchingprocess-list-runs.md)|[run](../resources/run.md) collection|Get the run resources from the runs navigation property.|
|[Add run](../api/directorymatchingprocess-post-runs.md)|[run](../resources/run.md)|Add runs by posting to the runs collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Name of the process. Inherited from [process](../resources/process.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md).|
|id|String|Unique identifier for the entity. Read-only. Inherited from [entity](../resources/entity.md).|
|readinessStatus|readinessStatus|The state of the process from creation through to ready to do work. Inherited from [process](../resources/process.md). The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|runs|[run](../resources/run.md) collection|The read-only set of runs that have been executed for this process. Ordered by time. Inherited from [process](../resources/process.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.directoryMatchingProcess",
  "baseType": "microsoft.industryData.process",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.directoryMatchingProcess",
  "id": "String (identifier)",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String"
}
```

