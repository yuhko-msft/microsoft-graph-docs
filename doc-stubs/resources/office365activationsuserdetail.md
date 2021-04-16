---
title: "office365ActivationsUserDetail resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# office365ActivationsUserDetail resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List office365ActivationsUserDetail](../api/office365activationsuserdetail-list.md)|[office365ActivationsUserDetail](../resources/office365activationsuserdetail.md) collection|Get a list of the [office365ActivationsUserDetail](../resources/office365activationsuserdetail.md) objects and their properties.|
|[Create office365ActivationsUserDetail](../api/office365activationsuserdetail-create.md)|[office365ActivationsUserDetail](../resources/office365activationsuserdetail.md)|Create a new [office365ActivationsUserDetail](../resources/office365activationsuserdetail.md) object.|
|[Get office365ActivationsUserDetail](../api/office365activationsuserdetail-get.md)|[office365ActivationsUserDetail](../resources/office365activationsuserdetail.md)|Read the properties and relationships of an [office365ActivationsUserDetail](../resources/office365activationsuserdetail.md) object.|
|[Update office365ActivationsUserDetail](../api/office365activationsuserdetail-update.md)|[office365ActivationsUserDetail](../resources/office365activationsuserdetail.md)|Update the properties of an [office365ActivationsUserDetail](../resources/office365activationsuserdetail.md) object.|
|[Delete office365ActivationsUserDetail](../api/office365activationsuserdetail-delete.md)|None|Deletes an [office365ActivationsUserDetail](../resources/office365activationsuserdetail.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|reportRefreshDate|Date|**TODO: Add Description**|
|userActivationCounts|[userActivationCounts](../resources/useractivationcounts.md) collection|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.office365ActivationsUserDetail",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.office365ActivationsUserDetail",
  "id": "String (identifier)",
  "displayName": "String",
  "reportRefreshDate": "Date",
  "userActivationCounts": [
    {
      "@odata.type": "microsoft.graph.userActivationCounts"
    }
  ],
  "userPrincipalName": "String"
}
```

