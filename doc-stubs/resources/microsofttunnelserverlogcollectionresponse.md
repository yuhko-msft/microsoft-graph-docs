---
title: "microsoftTunnelServerLogCollectionResponse resource type"
description: "Entity that stores the server log collection status."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# microsoftTunnelServerLogCollectionResponse resource type

Namespace: microsoft.graph



Entity that stores the server log collection status.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List microsoftTunnelServerLogCollectionResponses](../api/microsofttunnelserverlogcollectionresponse-list.md)|[microsoftTunnelServerLogCollectionResponse](../resources/microsofttunnelserverlogcollectionresponse.md) collection|Get a list of the [microsoftTunnelServerLogCollectionResponse](../resources/microsofttunnelserverlogcollectionresponse.md) objects and their properties.|
|[Create microsoftTunnelServerLogCollectionResponse](../api/microsofttunnelserverlogcollectionresponse-create.md)|[microsoftTunnelServerLogCollectionResponse](../resources/microsofttunnelserverlogcollectionresponse.md)|Create a new [microsoftTunnelServerLogCollectionResponse](../resources/microsofttunnelserverlogcollectionresponse.md) object.|
|[Get microsoftTunnelServerLogCollectionResponse](../api/microsofttunnelserverlogcollectionresponse-get.md)|[microsoftTunnelServerLogCollectionResponse](../resources/microsofttunnelserverlogcollectionresponse.md)|Read the properties and relationships of a [microsoftTunnelServerLogCollectionResponse](../resources/microsofttunnelserverlogcollectionresponse.md) object.|
|[Update microsoftTunnelServerLogCollectionResponse](../api/microsofttunnelserverlogcollectionresponse-update.md)|[microsoftTunnelServerLogCollectionResponse](../resources/microsofttunnelserverlogcollectionresponse.md)|Update the properties of a [microsoftTunnelServerLogCollectionResponse](../resources/microsofttunnelserverlogcollectionresponse.md) object.|
|[Delete microsoftTunnelServerLogCollectionResponse](../api/microsofttunnelserverlogcollectionresponse-delete.md)|None|Deletes a [microsoftTunnelServerLogCollectionResponse](../resources/microsofttunnelserverlogcollectionresponse.md) object.|
|[createDownloadUrl](../api/microsofttunnelserverlogcollectionresponse-createdownloadurl.md)|String|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|endDateTime|DateTimeOffset|The end time of the logs collected|
|expiryDateTime|DateTimeOffset|The time when the log collection is expired|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|requestDateTime|DateTimeOffset|The time when the log collection was requested|
|serverId|String|ID of the server the log collection is requested upon|
|sizeInBytes|Int64|The size of the logs in bytes|
|startDateTime|DateTimeOffset|The start time of the logs collected |
|status|microsoftTunnelLogCollectionStatus|The status of log collection. Possible values are: `pending`, `completed`, `failed`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.microsoftTunnelServerLogCollectionResponse",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.microsoftTunnelServerLogCollectionResponse",
  "id": "String (identifier)",
  "endDateTime": "String (timestamp)",
  "expiryDateTime": "String (timestamp)",
  "requestDateTime": "String (timestamp)",
  "serverId": "String",
  "sizeInBytes": "Integer",
  "startDateTime": "String (timestamp)",
  "status": "String"
}
```

