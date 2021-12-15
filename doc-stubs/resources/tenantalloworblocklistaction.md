---
title: "tenantAllowOrBlockListAction resource type"
description: "When admin creates email threat submission, tenant allow block list operation could be provided. When tenant allow block list operation is provided, the threat submission will auto add releated items (urls/attachments/senders) into tenant allow block list."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# tenantAllowOrBlockListAction resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

When admin creates email threat submission, tenant allow block list operation could be provided. When tenant allow block list operation is provided, the threat submission will auto add releated items (urls/attachments/senders) into tenant allow block list.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|action|tenantAllowBlockListAction|The tenant allow block list action. The possible values are: `allow`, `block`, `unknownFutureValue`.|
|expirationDateTime|DateTimeOffset|The tenant allow block list auto expiration date time.|
|note|String|The tenant allow block list note string.|
|results|[tenantAllowBlockListEntryResult](../resources/tenantallowblocklistentryresult.md) collection|The result which contains tenant allow block list items of the email submission.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.tenantAllowOrBlockListAction"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.tenantAllowOrBlockListAction",
  "action": "String",
  "results": [
    {
      "@odata.type": "microsoft.graph.tenantAllowBlockListEntryResult"
    }
  ],
  "expirationDateTime": "String (timestamp)",
  "note": "String"
}
```

