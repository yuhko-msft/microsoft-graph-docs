---
title: "authenticationAction resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# authenticationAction resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List onSignupStart](../api/authenticationeventspolicy-list-onsignupstart.md)|[authenticationAction](../resources/authenticationaction.md) collection|Get the authenticationAction resources from the onSignupStart navigation property.|
|[Create onSignupStart](../api/authenticationeventspolicy-post-onsignupstart.md)|[authenticationAction](../resources/authenticationaction.md)|Create a new authenticationAction object.|
|[Update onSignupStart](../api/authenticationeventspolicy-update-onsignupstart.md)|[authenticationAction](../resources/authenticationaction.md)|Update the properties of an onSignupStart object.|
|[Get onSignupStart](../api/authenticationeventspolicy-get-authenticationaction.md)|[authenticationAction](../resources/authenticationaction.md)|Read the properties and relationships of an [authenticationAction](../resources/authenticationaction.md) object.|
|[Delete onSignupStart](../api/authenticationeventspolicy-delete-onsignupstart.md)|None|Delete an [authenticationAction](../resources/authenticationaction.md) object.|
|[List authenticationActions](../api/authenticationaction-list.md)|[authenticationAction](../resources/authenticationaction.md) collection|Get a list of the [authenticationAction](../resources/authenticationaction.md) objects and their properties.|
|[Create authenticationAction](../api/authenticationaction-create.md)|[authenticationAction](../resources/authenticationaction.md)|Create a new [authenticationAction](../resources/authenticationaction.md) object.|
|[Get authenticationAction](../api/authenticationaction-get.md)|[authenticationAction](../resources/authenticationaction.md)|Read the properties and relationships of an [authenticationAction](../resources/authenticationaction.md) object.|
|[Update authenticationAction](../api/authenticationaction-update.md)|[authenticationAction](../resources/authenticationaction.md)|Update the properties of an [authenticationAction](../resources/authenticationaction.md) object.|
|[Delete authenticationAction](../api/authenticationaction-delete.md)|None|Deletes an [authenticationAction](../resources/authenticationaction.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|priority|Int32|**TODO: Add Description**|
|sourceFilter|[authenticationSourceFilter](../resources/authenticationsourcefilter.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.authenticationAction",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.authenticationAction",
  "id": "String (identifier)",
  "priority": "Integer",
  "sourceFilter": {
    "@odata.type": "microsoft.graph.authenticationSourceFilter"
  }
}
```

