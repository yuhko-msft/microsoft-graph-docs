---
title: "managedAppConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedAppConfiguration resource type

Namespace: microsoft.graph

**TODO: Add Description**


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
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|customSettings|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description**|
|description|String|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|displayName|String|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|version|String|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|

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
  "displayName": "String",
  "description": "String",
  "createdDateTime": "String (timestamp)",
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

