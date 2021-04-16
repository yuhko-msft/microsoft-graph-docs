---
title: "governanceRoleDefinition resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# governanceRoleDefinition resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List governanceRoleDefinitions](../api/governanceroledefinition-list.md)|[governanceRoleDefinition](../resources/governanceroledefinition.md) collection|Get a list of the [governanceRoleDefinition](../resources/governanceroledefinition.md) objects and their properties.|
|[Create governanceRoleDefinition](../api/governanceroledefinition-post-governanceroledefinitions.md)|[governanceRoleDefinition](../resources/governanceroledefinition.md)|Create a new [governanceRoleDefinition](../resources/governanceroledefinition.md) object.|
|[Get governanceRoleDefinition](../api/governanceroledefinition-get.md)|[governanceRoleDefinition](../resources/governanceroledefinition.md)|Read the properties and relationships of a [governanceRoleDefinition](../resources/governanceroledefinition.md) object.|
|[Update governanceRoleDefinition](../api/governanceroledefinition-update.md)|[governanceRoleDefinition](../resources/governanceroledefinition.md)|Update the properties of a [governanceRoleDefinition](../resources/governanceroledefinition.md) object.|
|[Delete governanceRoleDefinition](../api/governanceroledefinition-delete.md)|None|Deletes a [governanceRoleDefinition](../resources/governanceroledefinition.md) object.|
|[List governanceResource](../api/governanceroledefinition-list-resource.md)|[governanceResource](../resources/governanceresource.md) collection|Get the governanceResource resources from the resource navigation property.|
|[Create governanceResource](../api/governanceroledefinition-post-resource.md)|[governanceResource](../resources/governanceresource.md)|Create a new governanceResource object.|
|[List governanceRoleSetting](../api/governanceroledefinition-list-rolesetting.md)|[governanceRoleSetting](../resources/governancerolesetting.md) collection|Get the governanceRoleSetting resources from the roleSetting navigation property.|
|[Create governanceRoleSetting](../api/governanceroledefinition-post-rolesetting.md)|[governanceRoleSetting](../resources/governancerolesetting.md)|Create a new governanceRoleSetting object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|externalId|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|resourceId|String|**TODO: Add Description**|
|templateId|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|resource|[governanceResource](../resources/governanceresource.md)|**TODO: Add Description**|
|roleSetting|[governanceRoleSetting](../resources/governancerolesetting.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.governanceRoleDefinition",
  "baseType": "microsoft.graph.entity",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.governanceRoleDefinition",
  "id": "String (identifier)",
  "displayName": "String",
  "externalId": "String",
  "resourceId": "String",
  "templateId": "String"
}
```

