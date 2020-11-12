---
title: "userFlowLanguageConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userFlowLanguageConfiguration resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List languages](../api/b2cidentityuserflow-list-languages.md)|[userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md) collection|Get the userFlowLanguageConfiguration resources from the languages navigation property.|
|[Create languages](../api/b2cidentityuserflow-post-languages.md)|[userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md)|Create a new userFlowLanguageConfiguration object.|
|[Update languages](../api/b2cidentityuserflow-update-languages.md)|[userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md)|Update the properties of a languages object.|
|[Get languages](../api/b2cidentityuserflow-get-userflowlanguageconfiguration.md)|[userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md)|Read the properties and relationships of a [userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md) object.|
|[Delete languages](../api/b2cidentityuserflow-delete-languages.md)|None|Delete a [userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md) object.|
|[List userFlowLanguageConfigurations](../api/userflowlanguageconfiguration-list.md)|[userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md) collection|Get a list of the [userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md) objects and their properties.|
|[Create userFlowLanguageConfiguration](../api/userflowlanguageconfiguration-create.md)|[userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md)|Create a new [userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md) object.|
|[Get userFlowLanguageConfiguration](../api/userflowlanguageconfiguration-get.md)|[userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md)|Read the properties and relationships of a [userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md) object.|
|[Update userFlowLanguageConfiguration](../api/userflowlanguageconfiguration-update.md)|[userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md)|Update the properties of a [userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md) object.|
|[Delete userFlowLanguageConfiguration](../api/userflowlanguageconfiguration-delete.md)|None|Deletes a [userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md) object.|
|[List defaultPages](../api/userflowlanguageconfiguration-list-defaultpages.md)|[userFlowLanguagePage](../resources/userflowlanguagepage.md) collection|Get the userFlowLanguagePage resources from the defaultPages navigation property.|
|[Create defaultPages](../api/userflowlanguageconfiguration-post-defaultpages.md)|[userFlowLanguagePage](../resources/userflowlanguagepage.md)|Create a new userFlowLanguagePage object.|
|[Get defaultPages](../api/userflowlanguageconfiguration-get-userflowlanguagepage.md)|[userFlowLanguagePage](../resources/userflowlanguagepage.md)|Read the properties and relationships of a [userFlowLanguagePage](../resources/userflowlanguagepage.md) object.|
|[Update defaultPages](../api/userflowlanguageconfiguration-update-defaultpages.md)|[userFlowLanguagePage](../resources/userflowlanguagepage.md)|Update the properties of a defaultPages object.|
|[Delete defaultPages](../api/userflowlanguageconfiguration-delete-defaultpages.md)|None|Delete a [userFlowLanguagePage](../resources/userflowlanguagepage.md) object.|
|[List overridesPages](../api/userflowlanguageconfiguration-list-overridespages.md)|[userFlowLanguagePage](../resources/userflowlanguagepage.md) collection|Get the userFlowLanguagePage resources from the overridesPages navigation property.|
|[Create overridesPages](../api/userflowlanguageconfiguration-post-overridespages.md)|[userFlowLanguagePage](../resources/userflowlanguagepage.md)|Create a new userFlowLanguagePage object.|
|[Get overridesPages](../api/userflowlanguageconfiguration-get-userflowlanguagepage.md)|[userFlowLanguagePage](../resources/userflowlanguagepage.md)|Read the properties and relationships of a [userFlowLanguagePage](../resources/userflowlanguagepage.md) object.|
|[Update overridesPages](../api/userflowlanguageconfiguration-update-overridespages.md)|[userFlowLanguagePage](../resources/userflowlanguagepage.md)|Update the properties of an overridesPages object.|
|[Delete overridesPages](../api/userflowlanguageconfiguration-delete-overridespages.md)|None|Delete a [userFlowLanguagePage](../resources/userflowlanguagepage.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|isEnabled|Boolean|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|defaultPages|[userFlowLanguagePage](../resources/userflowlanguagepage.md) collection|**TODO: Add Description**|
|overridesPages|[userFlowLanguagePage](../resources/userflowlanguagepage.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userFlowLanguageConfiguration",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userFlowLanguageConfiguration",
  "id": "String (identifier)",
  "isEnabled": "Boolean",
  "displayName": "String"
}
```

