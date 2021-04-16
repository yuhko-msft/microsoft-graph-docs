---
title: "androidDeviceOwnerGlobalProxyDirect resource type"
description: "Android Device Owner Global Proxy Direct."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidDeviceOwnerGlobalProxyDirect resource type

Namespace: microsoft.graph



Android Device Owner Global Proxy Direct.


Inherits from [androidDeviceOwnerGlobalProxy](../resources/androiddeviceownerglobalproxy.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|excludedHosts|String collection|The excluded hosts|
|host|String|The host name|
|port|Int32|The port|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.androidDeviceOwnerGlobalProxyDirect"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidDeviceOwnerGlobalProxyDirect",
  "excludedHosts": [
    "String"
  ],
  "host": "String",
  "port": "Integer"
}
```

