---
title: "tenantAllowBlockListEntryResult resource type"
description: "One entry for tenant allow block list item which could be url, attachment or senders."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# tenantAllowBlockListEntryResult resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

One entry for tenant allow block list item which could be url, attachment or senders.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|entryType|tenantAllowBlockListType|The tenant allow block list entry type. The possible values are: `url`, `fileHash`, `sender`, `recipient`, `unknownFutureValue`.|
|expirationDateTime|DateTimeOffset|The expiration date time for this entry.|
|identity|String|The identity.|
|tenantAllowBlockListResult|longRunningOperationStatus|The tenant allow block operation result for this entry. The possible values are: `notStarted`, `running`, `succeeded`, `failed`, `skipped`, `unknownFutureValue`.|
|value|String|The tenant allow block list value.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.tenantAllowBlockListEntryResult"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.tenantAllowBlockListEntryResult",
  "identity": "String",
  "value": "String",
  "entryType": "String",
  "expirationDateTime": "String (timestamp)",
  "tenantAllowBlockListResult": "String"
}
```

