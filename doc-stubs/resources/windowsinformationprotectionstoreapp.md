---
title: "windowsInformationProtectionStoreApp resource type"
description: "Store App for Windows information protection"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsInformationProtectionStoreApp resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Store App for Windows information protection


Inherits from [windowsInformationProtectionApp](../resources/windowsinformationprotectionapp.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|denied|Boolean|If true, app is denied protection or exemption. Inherited from [windowsInformationProtectionApp](../resources/windowsinformationprotectionapp.md).|
|description|String|The app's description. Inherited from [windowsInformationProtectionApp](../resources/windowsinformationprotectionapp.md).|
|displayName|String|App display name. Inherited from [windowsInformationProtectionApp](../resources/windowsinformationprotectionapp.md).|
|productName|String|The product name. Inherited from [windowsInformationProtectionApp](../resources/windowsinformationprotectionapp.md).|
|publisherName|String|The publisher name Inherited from [windowsInformationProtectionApp](../resources/windowsinformationprotectionapp.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.windowsInformationProtectionStoreApp"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsInformationProtectionStoreApp",
  "denied": "Boolean",
  "description": "String",
  "displayName": "String",
  "productName": "String",
  "publisherName": "String"
}
```

