---
title: "AzureConnection resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# AzureConnection resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List AzureConnections](../api/azureconnection-list.md)|[AzureConnection](../resources/azureconnection.md) collection|Get a list of the [AzureConnection](../resources/azureconnection.md) objects and their properties.|
|[Create AzureConnection](../api/azureconnection-post-azureconnections.md)|[AzureConnection](../resources/azureconnection.md)|Create a new [AzureConnection](../resources/azureconnection.md) object.|
|[Get AzureConnection](../api/azureconnection-get.md)|[AzureConnection](../resources/azureconnection.md)|Read the properties and relationships of an [AzureConnection](../resources/azureconnection.md) object.|
|[Update AzureConnection](../api/azureconnection-update.md)|[AzureConnection](../resources/azureconnection.md)|Update the properties of an [AzureConnection](../resources/azureconnection.md) object.|
|[Delete AzureConnection](../api/azureconnection-delete.md)|None|Deletes an [AzureConnection](../resources/azureconnection.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|adDomainName|String|**TODO: Add Description**|
|adDomainPassword|String|**TODO: Add Description**|
|adDomainUsername|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|healthCheckStatus|cloudPcOnPremisesConnectionStatus|**TODO: Add Description**. Possible values are: `Pending`, `Running`, `Passed`, `Failed`, `UnknownFutureValue`.|
|healthCheckStatusDetails|[cloudPcOnPremisesConnectionStatusDetails](../resources/cloudpconpremisesconnectionstatusdetails.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|inUse|Boolean|**TODO: Add Description**|
|organizationalUnit|String|**TODO: Add Description**|
|resourceGroupId|String|**TODO: Add Description**|
|subNetId|String|**TODO: Add Description**|
|subscriptionId|String|**TODO: Add Description**|
|subscriptionName|String|**TODO: Add Description**|
|virtualNetworkId|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.AzureConnection",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.AzureConnection",
  "id": "String (identifier)",
  "displayName": "String",
  "subscriptionId": "String",
  "subscriptionName": "String",
  "adDomainName": "String",
  "adDomainUsername": "String",
  "adDomainPassword": "String",
  "organizationalUnit": "String",
  "resourceGroupId": "String",
  "virtualNetworkId": "String",
  "subNetId": "String",
  "healthCheckStatus": "String",
  "healthCheckStatusDetails": {
    "@odata.type": "microsoft.graph.cloudPcOnPremisesConnectionStatusDetails"
  },
  "inUse": "Boolean"
}
```

