---
title: "graphAPIErrorDetails resource type"
description: "Represents an error from Microsoft Graph that could happen when performing a managed tenant operation."
author: "idwilliams"
ms.localizationpriority: medium
ms.prod: "microsoft-365-lighthouse"
doc_type: resourcePageType
---

# graphAPIErrorDetails resource type

Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents an error from Microsoft Graph that could happen when performing a managed tenant operation.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|code|String|The error code from the Microsoft Graph error that was encountered.|
|message|String|The message from the Microsoft Graph error that was encountered.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.managedTenants.graphAPIErrorDetails"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedTenants.graphAPIErrorDetails",
  "code": "String",
  "message": "String"
}
```
