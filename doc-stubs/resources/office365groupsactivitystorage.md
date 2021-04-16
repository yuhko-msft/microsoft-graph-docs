---
title: "office365GroupsActivityStorage resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# office365GroupsActivityStorage resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List office365GroupsActivityStorage](../api/office365groupsactivitystorage-list.md)|[office365GroupsActivityStorage](../resources/office365groupsactivitystorage.md) collection|Get a list of the [office365GroupsActivityStorage](../resources/office365groupsactivitystorage.md) objects and their properties.|
|[Create office365GroupsActivityStorage](../api/office365groupsactivitystorage-create.md)|[office365GroupsActivityStorage](../resources/office365groupsactivitystorage.md)|Create a new [office365GroupsActivityStorage](../resources/office365groupsactivitystorage.md) object.|
|[Get office365GroupsActivityStorage](../api/office365groupsactivitystorage-get.md)|[office365GroupsActivityStorage](../resources/office365groupsactivitystorage.md)|Read the properties and relationships of an [office365GroupsActivityStorage](../resources/office365groupsactivitystorage.md) object.|
|[Update office365GroupsActivityStorage](../api/office365groupsactivitystorage-update.md)|[office365GroupsActivityStorage](../resources/office365groupsactivitystorage.md)|Update the properties of an [office365GroupsActivityStorage](../resources/office365groupsactivitystorage.md) object.|
|[Delete office365GroupsActivityStorage](../api/office365groupsactivitystorage-delete.md)|None|Deletes an [office365GroupsActivityStorage](../resources/office365groupsactivitystorage.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|mailboxStorageUsedInBytes|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|siteStorageUsedInBytes|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.office365GroupsActivityStorage",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.office365GroupsActivityStorage",
  "id": "String (identifier)",
  "mailboxStorageUsedInBytes": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "siteStorageUsedInBytes": "Integer"
}
```

