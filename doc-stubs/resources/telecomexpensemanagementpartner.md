---
title: "telecomExpenseManagementPartner resource type"
description: "telecomExpenseManagementPartner resources represent the metadata and status of a given TEM service. Once your organization has onboarded with a partner, the partner can be enabled or disabled to switch TEM functionality on or off."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# telecomExpenseManagementPartner resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

telecomExpenseManagementPartner resources represent the metadata and status of a given TEM service. Once your organization has onboarded with a partner, the partner can be enabled or disabled to switch TEM functionality on or off.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List telecomExpenseManagementPartners](../api/telecomexpensemanagementpartner-list.md)|[telecomExpenseManagementPartner](../resources/telecomexpensemanagementpartner.md) collection|Get a list of the [telecomExpenseManagementPartner](../resources/telecomexpensemanagementpartner.md) objects and their properties.|
|[Create telecomExpenseManagementPartner](../api/telecomexpensemanagementpartner-create.md)|[telecomExpenseManagementPartner](../resources/telecomexpensemanagementpartner.md)|Create a new [telecomExpenseManagementPartner](../resources/telecomexpensemanagementpartner.md) object.|
|[Get telecomExpenseManagementPartner](../api/telecomexpensemanagementpartner-get.md)|[telecomExpenseManagementPartner](../resources/telecomexpensemanagementpartner.md)|Read the properties and relationships of a [telecomExpenseManagementPartner](../resources/telecomexpensemanagementpartner.md) object.|
|[Update telecomExpenseManagementPartner](../api/telecomexpensemanagementpartner-update.md)|[telecomExpenseManagementPartner](../resources/telecomexpensemanagementpartner.md)|Update the properties of a [telecomExpenseManagementPartner](../resources/telecomexpensemanagementpartner.md) object.|
|[Delete telecomExpenseManagementPartner](../api/telecomexpensemanagementpartner-delete.md)|None|Deletes a [telecomExpenseManagementPartner](../resources/telecomexpensemanagementpartner.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appAuthorized|Boolean|Whether the partner's AAD app has been authorized to access Intune.|
|displayName|String|Display name of the TEM partner.|
|enabled|Boolean|Whether Intune's connection to the TEM service is currently enabled or disabled.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastConnectionDateTime|DateTimeOffset|Timestamp of the last request sent to Intune by the TEM partner.|
|url|String|URL of the TEM partner's administrative control panel, where an administrator can configure their TEM service.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.telecomExpenseManagementPartner",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.telecomExpenseManagementPartner",
  "id": "String (identifier)",
  "appAuthorized": "Boolean",
  "displayName": "String",
  "enabled": "Boolean",
  "lastConnectionDateTime": "String (timestamp)",
  "url": "String"
}
```

