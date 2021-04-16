---
title: "groupPolicyDefinitionFile resource type"
description: "The entity represents an ADMX (Administrative Template) XML file. The ADMX file contains a collection of group policy definitions and their locations by category path. The group policy definition file also contains the languages supported as determined by the language dependent ADML (Administrative Template) language files."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyDefinitionFile resource type

Namespace: microsoft.graph



The entity represents an ADMX (Administrative Template) XML file. The ADMX file contains a collection of group policy definitions and their locations by category path. The group policy definition file also contains the languages supported as determined by the language dependent ADML (Administrative Template) language files.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyDefinitionFiles](../api/grouppolicydefinitionfile-list.md)|[groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md) collection|Get a list of the [groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md) objects and their properties.|
|[Create groupPolicyDefinitionFile](../api/grouppolicydefinitionfile-create.md)|[groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md)|Create a new [groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md) object.|
|[Get groupPolicyDefinitionFile](../api/grouppolicydefinitionfile-get.md)|[groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md)|Read the properties and relationships of a [groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md) object.|
|[Update groupPolicyDefinitionFile](../api/grouppolicydefinitionfile-update.md)|[groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md)|Update the properties of a [groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md) object.|
|[Delete groupPolicyDefinitionFile](../api/grouppolicydefinitionfile-delete.md)|None|Deletes a [groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md) object.|
|[List definitions](../api/grouppolicydefinitionfile-list-definitions.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md) collection|Get the groupPolicyDefinition resources from the definitions navigation property.|
|[Add groupPolicyDefinition](../api/grouppolicydefinitionfile-post-definitions.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md)|Add definitions by posting to the definitions collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|The localized description of the policy settings in the ADMX file. The default value is empty.|
|displayName|String|The localized friendly name of the ADMX file.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|languageCodes|String collection|The supported language codes for the ADMX file.|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified.|
|policyType|groupPolicyType|Specifies the type of group policy. Possible values are: `admxBacked`, `admxIngested`.|
|revision|String|The revision version associated with the file.|
|targetNamespace|String|Specifies the URI used to identify the namespace within the ADMX file.|
|targetPrefix|String|Specifies the logical name that refers to the namespace within the ADMX file.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|definitions|[groupPolicyDefinition](../resources/grouppolicydefinition.md) collection|The group policy definitions associated with the file.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.groupPolicyDefinitionFile",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyDefinitionFile",
  "id": "String (identifier)",
  "description": "String",
  "displayName": "String",
  "languageCodes": [
    "String"
  ],
  "lastModifiedDateTime": "String (timestamp)",
  "policyType": "String",
  "revision": "String",
  "targetNamespace": "String",
  "targetPrefix": "String"
}
```

