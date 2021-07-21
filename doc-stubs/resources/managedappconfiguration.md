---
title: "managedAppConfiguration resource type"
description: "Configuration used to deliver a set of custom settings as-is to apps for users to whom the configuration is scoped"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedAppConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Configuration used to deliver a set of custom settings as-is to apps for users to whom the configuration is scoped
This is an abstract type.


Inherits from [managedAppPolicy](../resources/managedapppolicy.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedAppConfigurations](../api/managedappconfiguration-list.md)|[managedAppConfiguration](../resources/managedappconfiguration.md) collection|Get a list of the [managedAppConfiguration](../resources/managedappconfiguration.md) objects and their properties.|
|[Create managedAppConfiguration](../api/managedappconfiguration-create.md)|[managedAppConfiguration](../resources/managedappconfiguration.md)|Create a new [managedAppConfiguration](../resources/managedappconfiguration.md) object.|
|[Get managedAppConfiguration](../api/managedappconfiguration-get.md)|[managedAppConfiguration](../resources/managedappconfiguration.md)|Read the properties and relationships of a [managedAppConfiguration](../resources/managedappconfiguration.md) object.|
|[Update managedAppConfiguration](../api/managedappconfiguration-update.md)|[managedAppConfiguration](../resources/managedappconfiguration.md)|Update the properties of a [managedAppConfiguration](../resources/managedappconfiguration.md) object.|
|[Delete managedAppConfiguration](../api/managedappconfiguration-delete.md)|None|Deletes a [managedAppConfiguration](../resources/managedappconfiguration.md) object.|
|[targetApps](../api/managedappconfiguration-targetapps.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|The date and time the policy was created. Inherited from [managedAppPolicy](../resources/managedapppolicy.md).|
|customSettings|[keyValuePair](../resources/keyvaluepair.md) collection|A set of string key and string value pairs to be sent to apps for users to whom the configuration is scoped, unalterned by this service|
|description|String|The policy's description. Inherited from [managedAppPolicy](../resources/managedapppolicy.md).|
|displayName|String|Policy display name. Inherited from [managedAppPolicy](../resources/managedapppolicy.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedDateTime|DateTimeOffset|Last time the policy was modified. Inherited from [managedAppPolicy](../resources/managedapppolicy.md).|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [managedAppPolicy](../resources/managedapppolicy.md).|
|version|String|Version of the entity. Inherited from [managedAppPolicy](../resources/managedapppolicy.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedAppConfiguration",
  "baseType": "microsoft.graph.managedAppPolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedAppConfiguration",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "String",
  "customSettings": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ]
}
```

