---
title: "cloudPCConnectivityIssue resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# cloudPCConnectivityIssue resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List cloudPCConnectivityIssues](../api/intune-cloudpcconnectivityissue-list.md)|[cloudPCConnectivityIssue](../resources/intune-cloudpcconnectivityissue.md) collection|Get a list of the [cloudPCConnectivityIssue](../resources/intune-cloudpcconnectivityissue.md) objects and their properties.|
|[Create cloudPCConnectivityIssue](../api/intune-cloudpcconnectivityissue-create.md)|[cloudPCConnectivityIssue](../resources/intune-cloudpcconnectivityissue.md)|Create a new [cloudPCConnectivityIssue](../resources/intune-cloudpcconnectivityissue.md) object.|
|[Get cloudPCConnectivityIssue](../api/intune-cloudpcconnectivityissue-get.md)|[cloudPCConnectivityIssue](../resources/intune-cloudpcconnectivityissue.md)|Read the properties and relationships of a [cloudPCConnectivityIssue](../resources/intune-cloudpcconnectivityissue.md) object.|
|[Update cloudPCConnectivityIssue](../api/intune-cloudpcconnectivityissue-update.md)|[cloudPCConnectivityIssue](../resources/intune-cloudpcconnectivityissue.md)|Update the properties of a [cloudPCConnectivityIssue](../resources/intune-cloudpcconnectivityissue.md) object.|
|[Delete cloudPCConnectivityIssue](../api/intune-cloudpcconnectivityissue-delete.md)|None|Deletes a [cloudPCConnectivityIssue](../resources/intune-cloudpcconnectivityissue.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceId|String|**TODO: Add Description**|
|errorCode|String|**TODO: Add Description**|
|errorDateTime|DateTimeOffset|**TODO: Add Description**|
|errorDescription|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|recommendedAction|String|**TODO: Add Description**|
|userId|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.cloudPCConnectivityIssue",
  "baseType": "microsoft.graph.entity",
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

