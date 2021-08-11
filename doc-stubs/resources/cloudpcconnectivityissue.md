---
title: "cloudPCConnectivityIssue resource type"
description: "The user experience analyte connectivity issue entity."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# cloudPCConnectivityIssue resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The user experience analyte connectivity issue entity.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List cloudPCConnectivityIssues](../api/cloudpcconnectivityissue-list.md)|[cloudPCConnectivityIssue](../resources/cloudpcconnectivityissue.md) collection|Get a list of the [cloudPCConnectivityIssue](../resources/cloudpcconnectivityissue.md) objects and their properties.|
|[Create cloudPCConnectivityIssue](../api/cloudpcconnectivityissue-create.md)|[cloudPCConnectivityIssue](../resources/cloudpcconnectivityissue.md)|Create a new [cloudPCConnectivityIssue](../resources/cloudpcconnectivityissue.md) object.|
|[Get cloudPCConnectivityIssue](../api/cloudpcconnectivityissue-get.md)|[cloudPCConnectivityIssue](../resources/cloudpcconnectivityissue.md)|Read the properties and relationships of a [cloudPCConnectivityIssue](../resources/cloudpcconnectivityissue.md) object.|
|[Update cloudPCConnectivityIssue](../api/cloudpcconnectivityissue-update.md)|[cloudPCConnectivityIssue](../resources/cloudpcconnectivityissue.md)|Update the properties of a [cloudPCConnectivityIssue](../resources/cloudpcconnectivityissue.md) object.|
|[Delete cloudPCConnectivityIssue](../api/cloudpcconnectivityissue-delete.md)|None|Deletes a [cloudPCConnectivityIssue](../resources/cloudpcconnectivityissue.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceId|String|The Intune DeviceId of the device the connection is associated with.|
|errorCode|String|The error code of the connectivity issue.|
|errorDateTime|DateTimeOffset|The time that the connection initiated. The time is shown in ISO 8601 format and Coordinated Universal Time (UTC) time.|
|errorDescription|String|The detailed description of what went wrong.|
|id|String|The unique identifier of the user experience analytics connectivity issue event entity.|
|recommendedAction|String|The recommended action to fix the corresponding error.|
|userId|String|The unique id of user who initialize the connection.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.cloudPCConnectivityIssue",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.cloudPCConnectivityIssue",
  "id": "String (identifier)",
  "deviceId": "String",
  "errorCode": "String",
  "errorDateTime": "String (timestamp)",
  "userId": "String",
  "errorDescription": "String",
  "recommendedAction": "String"
}
```

