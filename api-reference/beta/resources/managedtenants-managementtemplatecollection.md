---
title: "managementTemplateCollection resource type"
description: "**TODO: Add Description**"
author: "idwilliams"
ms.localizationpriority: medium
ms.prod: "microsoft-365-lighthouse"
doc_type: resourcePageType
---

# managementTemplateCollection resource type

Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managementTemplateCollections](../api/managedtenants-managedtenant-list-managementtemplatecollections.md)|[microsoft.graph.managedTenants.managementTemplateCollection](../resources/managedtenants-managementtemplatecollection.md) collection|Get a list of the [managementTemplateCollection](../resources/managedtenants-managementtemplatecollection.md) objects and their properties.|
|[Get managementTemplateCollection](../api/managedtenants-managementtemplatecollection-get.md)|[microsoft.graph.managedTenants.managementTemplateCollection](../resources/managedtenants-managementtemplatecollection.md)|Read the properties and relationships of a [managementTemplateCollection](../resources/managedtenants-managementtemplatecollection.md) object.|
|[List managementTemplates](../api/managedtenants-managementtemplatecollection-list-managementtemplates.md)|[microsoft.graph.managedTenants.managementTemplate](../resources/managedtenants-managementtemplate.md) collection|Get the managementTemplate resources from the managementTemplates navigation property.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|managementTemplates|[microsoft.graph.managedTenants.managementTemplate](../resources/managedtenants-managementtemplate.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedTenants.managementTemplateCollection",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedTenants.managementTemplateCollection",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String"
}
```
