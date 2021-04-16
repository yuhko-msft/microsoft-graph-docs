---
title: "office365GroupsActivityDetail resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# office365GroupsActivityDetail resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List office365GroupsActivityDetail](../api/office365groupsactivitydetail-list.md)|[office365GroupsActivityDetail](../resources/office365groupsactivitydetail.md) collection|Get a list of the [office365GroupsActivityDetail](../resources/office365groupsactivitydetail.md) objects and their properties.|
|[Create office365GroupsActivityDetail](../api/office365groupsactivitydetail-create.md)|[office365GroupsActivityDetail](../resources/office365groupsactivitydetail.md)|Create a new [office365GroupsActivityDetail](../resources/office365groupsactivitydetail.md) object.|
|[Get office365GroupsActivityDetail](../api/office365groupsactivitydetail-get.md)|[office365GroupsActivityDetail](../resources/office365groupsactivitydetail.md)|Read the properties and relationships of an [office365GroupsActivityDetail](../resources/office365groupsactivitydetail.md) object.|
|[Update office365GroupsActivityDetail](../api/office365groupsactivitydetail-update.md)|[office365GroupsActivityDetail](../resources/office365groupsactivitydetail.md)|Update the properties of an [office365GroupsActivityDetail](../resources/office365groupsactivitydetail.md) object.|
|[Delete office365GroupsActivityDetail](../api/office365groupsactivitydetail-delete.md)|None|Deletes an [office365GroupsActivityDetail](../resources/office365groupsactivitydetail.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|exchangeMailboxStorageUsedInBytes|Int64|**TODO: Add Description**|
|exchangeMailboxTotalItemCount|Int64|**TODO: Add Description**|
|exchangeReceivedEmailCount|Int64|**TODO: Add Description**|
|externalMemberCount|Int64|**TODO: Add Description**|
|groupDisplayName|String|**TODO: Add Description**|
|groupId|String|**TODO: Add Description**|
|groupType|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isDeleted|Boolean|**TODO: Add Description**|
|lastActivityDate|Date|**TODO: Add Description**|
|memberCount|Int64|**TODO: Add Description**|
|ownerPrincipalName|String|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|sharePointActiveFileCount|Int64|**TODO: Add Description**|
|sharePointSiteStorageUsedInBytes|Int64|**TODO: Add Description**|
|sharePointTotalFileCount|Int64|**TODO: Add Description**|
|yammerLikedMessageCount|Int64|**TODO: Add Description**|
|yammerPostedMessageCount|Int64|**TODO: Add Description**|
|yammerReadMessageCount|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.office365GroupsActivityDetail",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.office365GroupsActivityDetail",
  "id": "String (identifier)",
  "exchangeMailboxStorageUsedInBytes": "Integer",
  "exchangeMailboxTotalItemCount": "Integer",
  "exchangeReceivedEmailCount": "Integer",
  "externalMemberCount": "Integer",
  "groupDisplayName": "String",
  "groupId": "String",
  "groupType": "String",
  "isDeleted": "Boolean",
  "lastActivityDate": "Date",
  "memberCount": "Integer",
  "ownerPrincipalName": "String",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "sharePointActiveFileCount": "Integer",
  "sharePointSiteStorageUsedInBytes": "Integer",
  "sharePointTotalFileCount": "Integer",
  "yammerLikedMessageCount": "Integer",
  "yammerPostedMessageCount": "Integer",
  "yammerReadMessageCount": "Integer"
}
```

