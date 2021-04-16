---
title: "groupPolicyDefinition resource type"
description: "The entity describes all of the information about a single group policy."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyDefinition resource type

Namespace: microsoft.graph



The entity describes all of the information about a single group policy.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyDefinitions](../api/grouppolicydefinition-list.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md) collection|Get a list of the [groupPolicyDefinition](../resources/grouppolicydefinition.md) objects and their properties.|
|[Create groupPolicyDefinition](../api/grouppolicydefinition-create.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md)|Create a new [groupPolicyDefinition](../resources/grouppolicydefinition.md) object.|
|[Get groupPolicyDefinition](../api/grouppolicydefinition-get.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md)|Read the properties and relationships of a [groupPolicyDefinition](../resources/grouppolicydefinition.md) object.|
|[Update groupPolicyDefinition](../api/grouppolicydefinition-update.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md)|Update the properties of a [groupPolicyDefinition](../resources/grouppolicydefinition.md) object.|
|[Delete groupPolicyDefinition](../api/grouppolicydefinition-delete.md)|None|Deletes a [groupPolicyDefinition](../resources/grouppolicydefinition.md) object.|
|[List groupPolicyCategory](../api/grouppolicydefinition-list-category.md)|[groupPolicyCategory](../resources/grouppolicycategory.md) collection|Get the groupPolicyCategory resources from the category navigation property.|
|[Add groupPolicyCategory](../api/grouppolicydefinition-post-category.md)|[groupPolicyCategory](../resources/grouppolicycategory.md)|Add category by posting to the category collection.|
|[List groupPolicyDefinitionFile](../api/grouppolicydefinition-list-definitionfile.md)|[groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md) collection|Get the groupPolicyDefinitionFile resources from the definitionFile navigation property.|
|[Add groupPolicyDefinitionFile](../api/grouppolicydefinition-post-definitionfile.md)|[groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md)|Add definitionFile by posting to the definitionFile collection.|
|[List presentations](../api/grouppolicydefinition-list-presentations.md)|[groupPolicyPresentation](../resources/grouppolicypresentation.md) collection|Get the groupPolicyPresentation resources from the presentations navigation property.|
|[Create groupPolicyPresentation](../api/grouppolicydefinition-post-presentations.md)|[groupPolicyPresentation](../resources/grouppolicypresentation.md)|Create a new groupPolicyPresentation object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|categoryPath|String|The localized full category path for the policy.|
|classType|groupPolicyDefinitionClassType|Identifies the type of groups the policy can be applied to. Possible values are: `user`, `machine`.|
|displayName|String|The localized policy name.|
|explainText|String|The localized explanation or help text associated with the policy. The default value is empty.|
|groupPolicyCategoryId|Guid|The category id of the parent category|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified.|
|policyType|groupPolicyType|Specifies the type of group policy. Possible values are: `admxBacked`, `admxIngested`.|
|supportedOn|String|Localized string used to specify what operating system or application version is affected by the policy.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|category|[groupPolicyCategory](../resources/grouppolicycategory.md)|The group policy category associated with the definition.|
|definitionFile|[groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md)|The group policy file associated with the definition.|
|presentations|[groupPolicyPresentation](../resources/grouppolicypresentation.md) collection|The group policy presentations associated with the definition.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.groupPolicyDefinition",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyDefinition",
  "id": "String (identifier)",
  "categoryPath": "String",
  "classType": "String",
  "displayName": "String",
  "explainText": "String",
  "groupPolicyCategoryId": "Guid",
  "lastModifiedDateTime": "String (timestamp)",
  "policyType": "String",
  "supportedOn": "String"
}
```

