---
title: "setting resource type"
description: "Represents the configuration information for a setting used to configure a Microsoft 365 service."
author: "idwilliams"
ms.localizationpriority: medium
ms.prod: "microsoft-365-lighthouse"
doc_type: resourcePageType
---

# setting resource type

Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents the configuration information for a setting used to configure a Microsoft 365 service.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|The display name for the setting. Required. Read-only.|
|jsonValue|String|The value for the setting serialized as a JSON string. Required. Read-only.|
|overwriteAllowed|Boolean|A flag indicating whether the setting can overwrite existing configurations. Required. Read-only.|
|settingId|String|The unique identifier for the setting. Required. Read-only.|
|valueType|managementParameterValueType|The data type for the setting. The possible values are: `string`, `integer`, `boolean`, `guid`, `stringCollection`, `integerCollection`, `booleanCollection`, `guidCollection`, `unknownFutureValue`. Required. Read-only.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.managedTenants.setting"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedTenants.setting",
  "settingId": "String",
  "displayName": "String",
  "overwriteAllowed": "Boolean",
  "valueType": "String",
  "jsonValue": "String"
}
```

