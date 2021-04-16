---
title: "openShift resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# openShift resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [changeTrackedEntity](../resources/changetrackedentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List openShifts](../api/openshift-list.md)|[openShift](../resources/openshift.md) collection|Get a list of the [openShift](../resources/openshift.md) objects and their properties.|
|[Create openShift](../api/openshift-create.md)|[openShift](../resources/openshift.md)|Create a new [openShift](../resources/openshift.md) object.|
|[Get openShift](../api/openshift-get.md)|[openShift](../resources/openshift.md)|Read the properties and relationships of an [openShift](../resources/openshift.md) object.|
|[Update openShift](../api/openshift-update.md)|[openShift](../resources/openshift.md)|Update the properties of an [openShift](../resources/openshift.md) object.|
|[Delete openShift](../api/openshift-delete.md)|None|Deletes an [openShift](../resources/openshift.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|draftOpenShift|[openShiftItem](../resources/openshiftitem.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isStagedForDeletion|Boolean|**TODO: Add Description**|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|schedulingGroupId|String|**TODO: Add Description**|
|sharedOpenShift|[openShiftItem](../resources/openshiftitem.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.openShift",
  "baseType": "microsoft.graph.changeTrackedEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.openShift",
  "id": "String (identifier)",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "draftOpenShift": {
    "@odata.type": "microsoft.graph.openShiftItem"
  },
  "isStagedForDeletion": "Boolean",
  "schedulingGroupId": "String",
  "sharedOpenShift": {
    "@odata.type": "microsoft.graph.openShiftItem"
  }
}
```

