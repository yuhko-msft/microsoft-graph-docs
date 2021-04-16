---
title: "androidManagedStoreAppConfigurationSchemaItem resource type"
description: "Single configuration item inside an Android application's custom configuration schema."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidManagedStoreAppConfigurationSchemaItem resource type

Namespace: microsoft.graph



Single configuration item inside an Android application's custom configuration schema.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|dataType|androidManagedStoreAppConfigurationSchemaItemDataType|The type of value this item describes. Possible values are: `bool`, `integer`, `string`, `choice`, `multiselect`, `bundle`, `bundleArray`, `hidden`.|
|defaultBoolValue|Boolean|Default value for boolean type items, if specified by the app developer|
|defaultIntValue|Int32|Default value for integer type items, if specified by the app developer|
|defaultStringArrayValue|String collection|Default value for string array type items, if specified by the app developer|
|defaultStringValue|String|Default value for string type items, if specified by the app developer|
|description|String|Description of what the item controls within the application|
|displayName|String|Human readable name|
|index|Int32|Unique index the application uses to maintain nested schema items|
|parentIndex|Int32|Index of parent schema item to track nested schema items|
|schemaItemKey|String|Unique key the application uses to identify the item|
|selections|[keyValuePair](../resources/keyvaluepair.md) collection|List of human readable name/value pairs for the valid values that can be set for this item (Choice and Multiselect items only)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.androidManagedStoreAppConfigurationSchemaItem"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidManagedStoreAppConfigurationSchemaItem",
  "dataType": "String",
  "defaultBoolValue": "Boolean",
  "defaultIntValue": "Integer",
  "defaultStringArrayValue": [
    "String"
  ],
  "defaultStringValue": "String",
  "description": "String",
  "displayName": "String",
  "index": "Integer",
  "parentIndex": "Integer",
  "schemaItemKey": "String",
  "selections": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ]
}
```

