---
title: "deviceManagementPartner resource type"
description: "Entity which represents a connection to device management partner."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementPartner resource type

Namespace: microsoft.graph



Entity which represents a connection to device management partner.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementPartners](../api/devicemanagementpartner-list.md)|[deviceManagementPartner](../resources/devicemanagementpartner.md) collection|Get a list of the [deviceManagementPartner](../resources/devicemanagementpartner.md) objects and their properties.|
|[Create deviceManagementPartner](../api/devicemanagementpartner-create.md)|[deviceManagementPartner](../resources/devicemanagementpartner.md)|Create a new [deviceManagementPartner](../resources/devicemanagementpartner.md) object.|
|[Get deviceManagementPartner](../api/devicemanagementpartner-get.md)|[deviceManagementPartner](../resources/devicemanagementpartner.md)|Read the properties and relationships of a [deviceManagementPartner](../resources/devicemanagementpartner.md) object.|
|[Update deviceManagementPartner](../api/devicemanagementpartner-update.md)|[deviceManagementPartner](../resources/devicemanagementpartner.md)|Update the properties of a [deviceManagementPartner](../resources/devicemanagementpartner.md) object.|
|[Delete deviceManagementPartner](../api/devicemanagementpartner-delete.md)|None|Deletes a [deviceManagementPartner](../resources/devicemanagementpartner.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Partner display name|
|groupsRequiringPartnerEnrollment|[deviceManagementPartnerAssignment](../resources/devicemanagementpartnerassignment.md) collection|User groups that specifies whether enrollment is through partner.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isConfigured|Boolean|Whether device management partner is configured or not|
|lastHeartbeatDateTime|DateTimeOffset|Timestamp of last heartbeat after admin enabled option Connect to Device management Partner|
|partnerAppType|deviceManagementPartnerAppType|Partner App type. Possible values are: `unknown`, `singleTenantApp`, `multiTenantApp`.|
|partnerState|deviceManagementPartnerTenantState|Partner state of this tenant. Possible values are: `unknown`, `unavailable`, `enabled`, `terminated`, `rejected`, `unresponsive`.|
|singleTenantAppId|String|Partner Single tenant App id|
|whenPartnerDevicesWillBeMarkedAsNonCompliant|DateTimeOffset|DateTime in UTC when PartnerDevices will be marked as NonCompliant. This will become obselete soon.|
|whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime|DateTimeOffset|DateTime in UTC when PartnerDevices will be marked as NonCompliant|
|whenPartnerDevicesWillBeRemoved|DateTimeOffset|DateTime in UTC when PartnerDevices will be removed. This will become obselete soon.|
|whenPartnerDevicesWillBeRemovedDateTime|DateTimeOffset|DateTime in UTC when PartnerDevices will be removed|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementPartner",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementPartner",
  "id": "String (identifier)",
  "displayName": "String",
  "groupsRequiringPartnerEnrollment": [
    {
      "@odata.type": "microsoft.graph.deviceManagementPartnerAssignment"
    }
  ],
  "isConfigured": "Boolean",
  "lastHeartbeatDateTime": "String (timestamp)",
  "partnerAppType": "String",
  "partnerState": "String",
  "singleTenantAppId": "String",
  "whenPartnerDevicesWillBeMarkedAsNonCompliant": "String (timestamp)",
  "whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime": "String (timestamp)",
  "whenPartnerDevicesWillBeRemoved": "String (timestamp)",
  "whenPartnerDevicesWillBeRemovedDateTime": "String (timestamp)"
}
```

