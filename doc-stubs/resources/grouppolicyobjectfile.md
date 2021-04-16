---
title: "groupPolicyObjectFile resource type"
description: "The Group Policy Object file uploaded by admin."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyObjectFile resource type

Namespace: microsoft.graph



The Group Policy Object file uploaded by admin.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyObjectFiles](../api/grouppolicyobjectfile-list.md)|[groupPolicyObjectFile](../resources/grouppolicyobjectfile.md) collection|Get a list of the [groupPolicyObjectFile](../resources/grouppolicyobjectfile.md) objects and their properties.|
|[Create groupPolicyObjectFile](../api/grouppolicyobjectfile-create.md)|[groupPolicyObjectFile](../resources/grouppolicyobjectfile.md)|Create a new [groupPolicyObjectFile](../resources/grouppolicyobjectfile.md) object.|
|[Get groupPolicyObjectFile](../api/grouppolicyobjectfile-get.md)|[groupPolicyObjectFile](../resources/grouppolicyobjectfile.md)|Read the properties and relationships of a [groupPolicyObjectFile](../resources/grouppolicyobjectfile.md) object.|
|[Update groupPolicyObjectFile](../api/grouppolicyobjectfile-update.md)|[groupPolicyObjectFile](../resources/grouppolicyobjectfile.md)|Update the properties of a [groupPolicyObjectFile](../resources/grouppolicyobjectfile.md) object.|
|[Delete groupPolicyObjectFile](../api/grouppolicyobjectfile-delete.md)|None|Deletes a [groupPolicyObjectFile](../resources/grouppolicyobjectfile.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|content|String|The Group Policy Object file content.|
|createdDateTime|DateTimeOffset|The date and time at which the GroupPolicy was first uploaded.|
|groupPolicyObjectId|Guid|The Group Policy Object GUID from GPO Xml content|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time at which the GroupPolicyObjectFile was last modified.|
|ouDistinguishedName|String|The distinguished name of the OU.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.groupPolicyObjectFile",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyObjectFile",
  "id": "String (identifier)",
  "content": "String",
  "createdDateTime": "String (timestamp)",
  "groupPolicyObjectId": "Guid",
  "lastModifiedDateTime": "String (timestamp)",
  "ouDistinguishedName": "String"
}
```

