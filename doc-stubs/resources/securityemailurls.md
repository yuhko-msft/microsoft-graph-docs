---
title: "securityEmailUrls resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# securityEmailUrls resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|detonation|[securityEmailDetonationData](../resources/securityemaildetonationdata.md)|Detonation data associated with the URL (if applicable).|
|threatType|threatType|Threat associated with the URL. The possible values are: `spam`, `malware`, `phish`, `none`, `unknownFutureValue`.|
|url|String|Full URL string including query parameters.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.securityEmailUrls"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.securityEmailUrls",
  "url": "String",
  "threatType": "String",
  "detonation": {
    "@odata.type": "microsoft.graph.securityEmailDetonationData"
  }
}
```

