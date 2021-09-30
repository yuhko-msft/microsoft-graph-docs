---
title: "deviceManagement resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagement resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get deviceManagement](../api/intune-devicemanagement-get.md)|[deviceManagement](../resources/intune-devicemanagement.md)|Read the properties and relationships of a [deviceManagement](../resources/intune-devicemanagement.md) object.|
|[Update deviceManagement](../api/intune-devicemanagement-update.md)|[deviceManagement](../resources/intune-devicemanagement.md)|Update the properties of a [deviceManagement](../resources/intune-devicemanagement.md) object.|
|[List microsoftTunnelConfigurations](../api/intune-devicemanagement-list-microsofttunnelconfigurations.md)|[microsoftTunnelConfiguration](../resources/intune-microsofttunnelconfiguration.md) collection|Get the microsoftTunnelConfiguration resources from the microsoftTunnelConfigurations navigation property.|
|[Create microsoftTunnelConfiguration](../api/intune-devicemanagement-post-microsofttunnelconfigurations.md)|[microsoftTunnelConfiguration](../resources/intune-microsofttunnelconfiguration.md)|Create a new microsoftTunnelConfiguration object.|
|[List microsoftTunnelHealthThresholds](../api/intune-devicemanagement-list-microsofttunnelhealththresholds.md)|[microsoftTunnelHealthThreshold](../resources/intune-microsofttunnelhealththreshold.md) collection|Get the microsoftTunnelHealthThreshold resources from the microsoftTunnelHealthThresholds navigation property.|
|[Create microsoftTunnelHealthThreshold](../api/intune-devicemanagement-post-microsofttunnelhealththresholds.md)|[microsoftTunnelHealthThreshold](../resources/intune-microsofttunnelhealththreshold.md)|Create a new microsoftTunnelHealthThreshold object.|
|[List microsoftTunnelServerLogCollectionResponses](../api/intune-devicemanagement-list-microsofttunnelserverlogcollectionresponses.md)|[microsoftTunnelServerLogCollectionResponse](../resources/intune-microsofttunnelserverlogcollectionresponse.md) collection|Get the microsoftTunnelServerLogCollectionResponse resources from the microsoftTunnelServerLogCollectionResponses navigation property.|
|[Create microsoftTunnelServerLogCollectionResponse](../api/intune-devicemanagement-post-microsofttunnelserverlogcollectionresponses.md)|[microsoftTunnelServerLogCollectionResponse](../resources/intune-microsofttunnelserverlogcollectionresponse.md)|Create a new microsoftTunnelServerLogCollectionResponse object.|
|[List microsoftTunnelSites](../api/intune-devicemanagement-list-microsofttunnelsites.md)|[microsoftTunnelSite](../resources/intune-microsofttunnelsite.md) collection|Get the microsoftTunnelSite resources from the microsoftTunnelSites navigation property.|
|[Create microsoftTunnelSite](../api/intune-devicemanagement-post-microsofttunnelsites.md)|[microsoftTunnelSite](../resources/intune-microsofttunnelsite.md)|Create a new microsoftTunnelSite object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|microsoftTunnelConfigurations|[microsoftTunnelConfiguration](../resources/intune-microsofttunnelconfiguration.md) collection|Collection of MicrosoftTunnelConfiguration settings associated with account.|
|microsoftTunnelHealthThresholds|[microsoftTunnelHealthThreshold](../resources/intune-microsofttunnelhealththreshold.md) collection|Collection of MicrosoftTunnelHealthThreshold settings associated with account.|
|microsoftTunnelServerLogCollectionResponses|[microsoftTunnelServerLogCollectionResponse](../resources/intune-microsofttunnelserverlogcollectionresponse.md) collection|Collection of MicrosoftTunnelServerLogCollectionResponse settings associated with account.|
|microsoftTunnelSites|[microsoftTunnelSite](../resources/intune-microsofttunnelsite.md) collection|Collection of MicrosoftTunnelSite settings associated with account.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagement",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagement",
  "id": "String (identifier)"
}
```

