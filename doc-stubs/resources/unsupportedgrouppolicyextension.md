---
title: "unsupportedGroupPolicyExtension resource type"
description: "Unsupported Group Policy Extension."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# unsupportedGroupPolicyExtension resource type

Namespace: microsoft.graph



Unsupported Group Policy Extension.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List unsupportedGroupPolicyExtensions](../api/unsupportedgrouppolicyextension-list.md)|[unsupportedGroupPolicyExtension](../resources/unsupportedgrouppolicyextension.md) collection|Get a list of the [unsupportedGroupPolicyExtension](../resources/unsupportedgrouppolicyextension.md) objects and their properties.|
|[Create unsupportedGroupPolicyExtension](../api/unsupportedgrouppolicyextension-create.md)|[unsupportedGroupPolicyExtension](../resources/unsupportedgrouppolicyextension.md)|Create a new [unsupportedGroupPolicyExtension](../resources/unsupportedgrouppolicyextension.md) object.|
|[Get unsupportedGroupPolicyExtension](../api/unsupportedgrouppolicyextension-get.md)|[unsupportedGroupPolicyExtension](../resources/unsupportedgrouppolicyextension.md)|Read the properties and relationships of an [unsupportedGroupPolicyExtension](../resources/unsupportedgrouppolicyextension.md) object.|
|[Update unsupportedGroupPolicyExtension](../api/unsupportedgrouppolicyextension-update.md)|[unsupportedGroupPolicyExtension](../resources/unsupportedgrouppolicyextension.md)|Update the properties of an [unsupportedGroupPolicyExtension](../resources/unsupportedgrouppolicyextension.md) object.|
|[Delete unsupportedGroupPolicyExtension](../api/unsupportedgrouppolicyextension-delete.md)|None|Deletes an [unsupportedGroupPolicyExtension](../resources/unsupportedgrouppolicyextension.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|extensionType|String|ExtensionType of the unsupported extension.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|namespaceUrl|String|Namespace Url of the unsupported extension.|
|nodeName|String|Node name of the unsupported extension.|
|settingScope|groupPolicySettingScope|Setting Scope of the unsupported extension. Possible values are: `unknown`, `device`, `user`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.unsupportedGroupPolicyExtension",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.unsupportedGroupPolicyExtension",
  "id": "String (identifier)",
  "extensionType": "String",
  "namespaceUrl": "String",
  "nodeName": "String",
  "settingScope": "String"
}
```

