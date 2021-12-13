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
|detonation|[securityEmailDetonationData](../resources/securityemaildetonationdata.md)|Detonation data associated with the attachment (if applicable).|
|fileName|String|Name of the attachment in the Email.|
|fileType|String|Filetype of attachment e.g. .png.|
|sha256|String|SHA256 Filehash of the attachment.|
|threatName|String|Malware family or threat name associated with the threatypes.|
|threatType|threatType|Threat types associated with the Attachment e.g. malware or Phish. The possible values are: `spam`, `malware`, `phish`, `none`, `unknownFutureValue`.|

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

