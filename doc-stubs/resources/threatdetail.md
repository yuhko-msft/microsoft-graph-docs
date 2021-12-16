---
title: "threatDetail resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# threatDetail resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|context|String|Indicates if the detection was in any context (e.g. Priority protection).|
|detectionMethod|detectionMethod|Indicates the corresponding detection tech. The possible values are: `generalFilter`, `impersonationBrand`, `spoofExternalDomain`, `spoofDmarc`, `impersonationDomain`, `fileDetonation`, `fileReputation`, `fileDetonationReputation`, `fingerPrintMatching`, `mailboxIntelligenceImpersonation`, `domainReputation`, `spoofIntraOrg`, `advancedFilter`, `antiMalwareEngine`, `mixedAnalysisDetection`, `urlMaliciousReputation`, `urlDetonation`, `urlDetonationReputation`, `impersonationUser`, `campaign`, `unknownFutureValue`.|
|threatType|threatType|Indicates the threattype (e.g Malware Phish etc.). The possible values are: `spam`, `malware`, `phish`, `none`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.threatDetail"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.threatDetail",
  "threatType": "String",
  "detectionMethod": "String",
  "context": "String"
}
```

