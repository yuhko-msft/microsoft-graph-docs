---
title: "windowsInformationProtectionDataRecoveryCertificate resource type"
description: "Windows Information Protection DataRecoveryCertificate"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsInformationProtectionDataRecoveryCertificate resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Windows Information Protection DataRecoveryCertificate

## Properties
|Property|Type|Description|
|:---|:---|:---|
|certificate|Binary|Data recovery Certificate|
|description|String|Data recovery Certificate description|
|expirationDateTime|DateTimeOffset|Data recovery Certificate expiration datetime|
|subjectName|String|Data recovery Certificate subject name|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.windowsInformationProtectionDataRecoveryCertificate"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsInformationProtectionDataRecoveryCertificate",
  "certificate": "Binary",
  "description": "String",
  "expirationDateTime": "String (timestamp)",
  "subjectName": "String"
}
```

