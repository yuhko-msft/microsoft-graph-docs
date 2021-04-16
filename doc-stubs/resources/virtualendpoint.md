---
title: "virtualEndpoint resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# virtualEndpoint resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List virtualEndpoints](../api/virtualendpoint-list.md)|[virtualEndpoint](../resources/virtualendpoint.md) collection|Get a list of the [virtualEndpoint](../resources/virtualendpoint.md) objects and their properties.|
|[Create virtualEndpoint](../api/virtualendpoint-create.md)|[virtualEndpoint](../resources/virtualendpoint.md)|Create a new [virtualEndpoint](../resources/virtualendpoint.md) object.|
|[Get virtualEndpoint](../api/virtualendpoint-get.md)|[virtualEndpoint](../resources/virtualendpoint.md)|Read the properties and relationships of a [virtualEndpoint](../resources/virtualendpoint.md) object.|
|[Update virtualEndpoint](../api/virtualendpoint-update.md)|[virtualEndpoint](../resources/virtualendpoint.md)|Update the properties of a [virtualEndpoint](../resources/virtualendpoint.md) object.|
|[Delete virtualEndpoint](../api/virtualendpoint-delete.md)|None|Deletes a [virtualEndpoint](../resources/virtualendpoint.md) object.|
|[getEffectivePermissions](../api/virtualendpoint-geteffectivepermissions.md)|String collection|**TODO: Add Description**|
|[List cloudPCs](../api/virtualendpoint-list-cloudpcs.md)|[cloudPC](../resources/cloudpc.md) collection|Get the cloudPC resources from the cloudPCs navigation property.|
|[Create cloudPC](../api/virtualendpoint-post-cloudpcs.md)|[cloudPC](../resources/cloudpc.md)|Create a new cloudPC object.|
|[List deviceImages](../api/virtualendpoint-list-deviceimages.md)|[cloudPcDeviceImage](../resources/cloudpcdeviceimage.md) collection|Get the cloudPcDeviceImage resources from the deviceImages navigation property.|
|[Create cloudPcDeviceImage](../api/virtualendpoint-post-deviceimages.md)|[cloudPcDeviceImage](../resources/cloudpcdeviceimage.md)|Create a new cloudPcDeviceImage object.|
|[List onPremisesConnections](../api/virtualendpoint-list-onpremisesconnections.md)|[cloudPcOnPremisesConnection](../resources/cloudpconpremisesconnection.md) collection|Get the cloudPcOnPremisesConnection resources from the onPremisesConnections navigation property.|
|[Create cloudPcOnPremisesConnection](../api/virtualendpoint-post-onpremisesconnections.md)|[cloudPcOnPremisesConnection](../resources/cloudpconpremisesconnection.md)|Create a new cloudPcOnPremisesConnection object.|
|[List provisioningPolicies](../api/virtualendpoint-list-provisioningpolicies.md)|[cloudPcProvisioningPolicy](../resources/cloudpcprovisioningpolicy.md) collection|Get the cloudPcProvisioningPolicy resources from the provisioningPolicies navigation property.|
|[Create cloudPcProvisioningPolicy](../api/virtualendpoint-post-provisioningpolicies.md)|[cloudPcProvisioningPolicy](../resources/cloudpcprovisioningpolicy.md)|Create a new cloudPcProvisioningPolicy object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|cloudPCs|[cloudPC](../resources/cloudpc.md) collection|**TODO: Add Description**|
|deviceImages|[cloudPcDeviceImage](../resources/cloudpcdeviceimage.md) collection|**TODO: Add Description**|
|onPremisesConnections|[cloudPcOnPremisesConnection](../resources/cloudpconpremisesconnection.md) collection|**TODO: Add Description**|
|provisioningPolicies|[cloudPcProvisioningPolicy](../resources/cloudpcprovisioningpolicy.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.virtualEndpoint",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.virtualEndpoint",
  "id": "String (identifier)"
}
```

