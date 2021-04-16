---
title: "securityBaselineContributingPolicy resource type"
description: "The security baseline compliance state of a setting for a device"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# securityBaselineContributingPolicy resource type

Namespace: microsoft.graph



The security baseline compliance state of a setting for a device

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Name of the policy|
|sourceId|String|Unique identifier of the policy|
|sourceType|securityBaselinePolicySourceType|Authoring source of the policy. Possible values are: `deviceConfiguration`, `deviceIntent`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.securityBaselineContributingPolicy"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.securityBaselineContributingPolicy",
  "displayName": "String",
  "sourceId": "String",
  "sourceType": "String"
}
```

