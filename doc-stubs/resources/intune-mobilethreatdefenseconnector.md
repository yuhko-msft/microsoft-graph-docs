---
title: "mobileThreatDefenseConnector resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileThreatDefenseConnector resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mobileThreatDefenseConnectors](../api/intune-mobilethreatdefenseconnector-list.md)|[mobileThreatDefenseConnector](../resources/intune-mobilethreatdefenseconnector.md) collection|Get a list of the [mobileThreatDefenseConnector](../resources/intune-mobilethreatdefenseconnector.md) objects and their properties.|
|[Create mobileThreatDefenseConnector](../api/intune-mobilethreatdefenseconnector-create.md)|[mobileThreatDefenseConnector](../resources/intune-mobilethreatdefenseconnector.md)|Create a new [mobileThreatDefenseConnector](../resources/intune-mobilethreatdefenseconnector.md) object.|
|[Get mobileThreatDefenseConnector](../api/intune-mobilethreatdefenseconnector-get.md)|[mobileThreatDefenseConnector](../resources/intune-mobilethreatdefenseconnector.md)|Read the properties and relationships of a [mobileThreatDefenseConnector](../resources/intune-mobilethreatdefenseconnector.md) object.|
|[Update mobileThreatDefenseConnector](../api/intune-mobilethreatdefenseconnector-update.md)|[mobileThreatDefenseConnector](../resources/intune-mobilethreatdefenseconnector.md)|Update the properties of a [mobileThreatDefenseConnector](../resources/intune-mobilethreatdefenseconnector.md) object.|
|[Delete mobileThreatDefenseConnector](../api/intune-mobilethreatdefenseconnector-delete.md)|None|Deletes a [mobileThreatDefenseConnector](../resources/intune-mobilethreatdefenseconnector.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowPartnerToCollectIOSApplicationMetadata|Boolean|**TODO: Add Description**|
|androidDeviceBlockedOnMissingPartnerData|Boolean|**TODO: Add Description**|
|androidEnabled|Boolean|**TODO: Add Description**|
|androidMobileApplicationManagementEnabled|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|iosDeviceBlockedOnMissingPartnerData|Boolean|**TODO: Add Description**|
|iosEnabled|Boolean|**TODO: Add Description**|
|iosMobileApplicationManagementEnabled|Boolean|**TODO: Add Description**|
|lastHeartbeatDateTime|DateTimeOffset|**TODO: Add Description**|
|macDeviceBlockedOnMissingPartnerData|Boolean|**TODO: Add Description**|
|macEnabled|Boolean|**TODO: Add Description**|
|microsoftDefenderForEndpointAttachEnabled|Boolean|**TODO: Add Description**|
|partnerState|mobileThreatPartnerTenantState|**TODO: Add Description**. Possible values are: `unavailable`, `available`, `enabled`, `unresponsive`.|
|partnerUnresponsivenessThresholdInDays|Int32|**TODO: Add Description**|
|partnerUnsupportedOsVersionBlocked|Boolean|**TODO: Add Description**|
|windowsDeviceBlockedOnMissingPartnerData|Boolean|**TODO: Add Description**|
|windowsEnabled|Boolean|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mobileThreatDefenseConnector",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileThreatDefenseConnector",
  "id": "String (identifier)",
  "lastHeartbeatDateTime": "String (timestamp)",
  "partnerState": "String",
  "androidMobileApplicationManagementEnabled": "Boolean",
  "iosMobileApplicationManagementEnabled": "Boolean",
  "androidEnabled": "Boolean",
  "iosEnabled": "Boolean",
  "windowsEnabled": "Boolean",
  "macEnabled": "Boolean",
  "androidDeviceBlockedOnMissingPartnerData": "Boolean",
  "iosDeviceBlockedOnMissingPartnerData": "Boolean",
  "windowsDeviceBlockedOnMissingPartnerData": "Boolean",
  "macDeviceBlockedOnMissingPartnerData": "Boolean",
  "partnerUnsupportedOsVersionBlocked": "Boolean",
  "partnerUnresponsivenessThresholdInDays": "Integer",
  "allowPartnerToCollectIOSApplicationMetadata": "Boolean",
  "microsoftDefenderForEndpointAttachEnabled": "Boolean"
}
```

