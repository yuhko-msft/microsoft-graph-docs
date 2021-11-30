---
title: "virtualEndpoint resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# virtualEndpoint resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List virtualEndpoints](../api/virtualendpoint-list.md)|[virtualEndpoint](../resources/virtualendpoint.md) collection|Get a list of the [virtualEndpoint](../resources/virtualendpoint.md) objects and their properties.|
|[Create virtualEndpoint](../api/devicemanagement-post-virtualendpoint.md)|[virtualEndpoint](../resources/virtualendpoint.md)|Create a new [virtualEndpoint](../resources/virtualendpoint.md) object.|
|[Get virtualEndpoint](../api/virtualendpoint-get.md)|[virtualEndpoint](../resources/virtualendpoint.md)|Read the properties and relationships of a [virtualEndpoint](../resources/virtualendpoint.md) object.|
|[Update virtualEndpoint](../api/virtualendpoint-update.md)|[virtualEndpoint](../resources/virtualendpoint.md)|Update the properties of a [virtualEndpoint](../resources/virtualendpoint.md) object.|
|[Delete virtualEndpoint](../api/virtualendpoint-delete.md)|None|Deletes a [virtualEndpoint](../resources/virtualendpoint.md) object.|
|[List cloudPcOrganizationSettings](../api/virtualendpoint-list-organizationsettings.md)|[cloudPcOrganizationSettings](../resources/cloudpcorganizationsettings.md) collection|Get the cloudPcOrganizationSettings resources from the organizationSettings navigation property.|
|[Create cloudPcOrganizationSettings](../api/virtualendpoint-post-organizationsettings.md)|[cloudPcOrganizationSettings](../resources/cloudpcorganizationsettings.md)|Create a new cloudPcOrganizationSettings object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|auditEvents|[cloudPcAuditEvent](../resources/cloudpcauditevent.md) collection|**TODO: Add Description**|
|cloudPCs|[cloudPC](../resources/cloudpc.md) collection|**TODO: Add Description**|
|deviceImages|[cloudPcDeviceImage](../resources/cloudpcdeviceimage.md) collection|**TODO: Add Description**|
|galleryImages|[cloudPcGalleryImage](../resources/cloudpcgalleryimage.md) collection|**TODO: Add Description**|
|onPremisesConnections|[cloudPcOnPremisesConnection](../resources/cloudpconpremisesconnection.md) collection|**TODO: Add Description**|
|organizationSettings|[cloudPcOrganizationSettings](../resources/cloudpcorganizationsettings.md)|**TODO: Add Description**|
|provisioningPolicies|[cloudPcProvisioningPolicy](../resources/cloudpcprovisioningpolicy.md) collection|**TODO: Add Description**|
|servicePlans|[cloudPcServicePlan](../resources/cloudpcserviceplan.md) collection|**TODO: Add Description**|
|supportedRegions|[cloudPcSupportedRegion](../resources/cloudpcsupportedregion.md) collection|**TODO: Add Description**|
|userSettings|[cloudPcUserSetting](../resources/cloudpcusersetting.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.virtualEndpoint",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.virtualEndpoint",
  "id": "String (identifier)"
}
```

