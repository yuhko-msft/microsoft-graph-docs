---
title: "deviceLogCollectionResponse resource type"
description: "Windows Log Collection request entity."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceLogCollectionResponse resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Windows Log Collection request entity.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceLogCollectionResponses](../api/devicelogcollectionresponse-list.md)|[deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md) collection|Get a list of the [deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md) objects and their properties.|
|[Create deviceLogCollectionResponse](../api/devicelogcollectionresponse-create.md)|[deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md)|Create a new [deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md) object.|
|[Get deviceLogCollectionResponse](../api/devicelogcollectionresponse-get.md)|[deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md)|Read the properties and relationships of a [deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md) object.|
|[Update deviceLogCollectionResponse](../api/devicelogcollectionresponse-update.md)|[deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md)|Update the properties of a [deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md) object.|
|[Delete deviceLogCollectionResponse](../api/devicelogcollectionresponse-delete.md)|None|Deletes a [deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md) object.|
|[createDownloadUrl](../api/devicelogcollectionresponse-createdownloadurl.md)|String|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|errorCode|Int64|The error code, if any. Valid values -9.22337203685478E+18 to 9.22337203685478E+18|
|expirationDateTimeUTC|DateTimeOffset|The DateTime of the expiration of the logs|
|id|String|The unique identifier in the form of tenantId_deviceId_requestId|
|initiatedByUserPrincipalName|String|The UPN for who initiated the request|
|managedDeviceId|Guid|The device Id|
|receivedDateTimeUTC|DateTimeOffset|The DateTime the request was received|
|requestedDateTimeUTC|DateTimeOffset|The DateTime of the request|
|size|Double|The size of the logs. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|status|String|The status of the log collection request|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceLogCollectionResponse",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceLogCollectionResponse",
  "id": "String (identifier)",
  "status": "String",
  "managedDeviceId": "Guid",
  "errorCode": "Integer",
  "requestedDateTimeUTC": "String (timestamp)",
  "receivedDateTimeUTC": "String (timestamp)",
  "initiatedByUserPrincipalName": "String",
  "expirationDateTimeUTC": "String (timestamp)",
  "size": "Double"
}
```

