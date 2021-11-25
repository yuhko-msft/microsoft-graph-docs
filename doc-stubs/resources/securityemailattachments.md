---
title: "securityEmailAttachments resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# securityEmailAttachments resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|detonation|[securityEmailDetonationData](../resources/securityemaildetonationdata.md)|**TODO: Add Description**|
|fileName|String|**TODO: Add Description**|
|fileType|String|**TODO: Add Description**|
|sha256|String|**TODO: Add Description**|
|threatName|String|**TODO: Add Description**|
|threatType|threatType|**TODO: Add Description**. The possible values are: `spam`, `malware`, `phish`, `none`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.securityEmailAttachments"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.securityEmailAttachments",
  "fileName": "String",
  "fileType": "String",
  "threatType": "String",
  "threatName": "String",
  "sha256": "String",
  "detonation": {
    "@odata.type": "microsoft.graph.securityEmailDetonationData"
  }
}
```

