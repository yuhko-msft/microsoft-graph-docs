---
title: "authenticationEventsPolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# authenticationEventsPolicy resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List events](../api/identitycontainer-list-events.md)|[authenticationEventsPolicy](../resources/authenticationeventspolicy.md) collection|Get the authenticationEventsPolicy resources from the events navigation property.|
|[Create events](../api/identitycontainer-post-events.md)|[authenticationEventsPolicy](../resources/authenticationeventspolicy.md)|Create a new authenticationEventsPolicy object.|
|[Update events](../api/identitycontainer-update-events.md)|[authenticationEventsPolicy](../resources/authenticationeventspolicy.md)|Update the properties of an events object.|
|[Get events](../api/identitycontainer-get-authenticationeventspolicy.md)|[authenticationEventsPolicy](../resources/authenticationeventspolicy.md)|Read the properties and relationships of an [authenticationEventsPolicy](../resources/authenticationeventspolicy.md) object.|
|[Delete events](../api/identitycontainer-delete-events.md)|None|Delete an [authenticationEventsPolicy](../resources/authenticationeventspolicy.md) object.|
|[List authenticationEventsPolicies](../api/authenticationeventspolicy-list.md)|[authenticationEventsPolicy](../resources/authenticationeventspolicy.md) collection|Get a list of the [authenticationEventsPolicy](../resources/authenticationeventspolicy.md) objects and their properties.|
|[Create authenticationEventsPolicy](../api/authenticationeventspolicy-create.md)|[authenticationEventsPolicy](../resources/authenticationeventspolicy.md)|Create a new [authenticationEventsPolicy](../resources/authenticationeventspolicy.md) object.|
|[Get authenticationEventsPolicy](../api/authenticationeventspolicy-get.md)|[authenticationEventsPolicy](../resources/authenticationeventspolicy.md)|Read the properties and relationships of an [authenticationEventsPolicy](../resources/authenticationeventspolicy.md) object.|
|[Update authenticationEventsPolicy](../api/authenticationeventspolicy-update.md)|[authenticationEventsPolicy](../resources/authenticationeventspolicy.md)|Update the properties of an [authenticationEventsPolicy](../resources/authenticationeventspolicy.md) object.|
|[Delete authenticationEventsPolicy](../api/authenticationeventspolicy-delete.md)|None|Deletes an [authenticationEventsPolicy](../resources/authenticationeventspolicy.md) object.|
|[List onSignupStart](../api/authenticationeventspolicy-list-onsignupstart.md)|[authenticationAction](../resources/authenticationaction.md) collection|Get the authenticationAction resources from the onSignupStart navigation property.|
|[Create onSignupStart](../api/authenticationeventspolicy-post-onsignupstart.md)|[authenticationAction](../resources/authenticationaction.md)|Create a new authenticationAction object.|
|[Get onSignupStart](../api/authenticationeventspolicy-get-authenticationaction.md)|[authenticationAction](../resources/authenticationaction.md)|Read the properties and relationships of an [authenticationAction](../resources/authenticationaction.md) object.|
|[Update onSignupStart](../api/authenticationeventspolicy-update-onsignupstart.md)|[authenticationAction](../resources/authenticationaction.md)|Update the properties of an onSignupStart object.|
|[Delete onSignupStart](../api/authenticationeventspolicy-delete-onsignupstart.md)|None|Delete an [authenticationAction](../resources/authenticationaction.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|onSignupStart|[authenticationAction](../resources/authenticationaction.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.authenticationEventsPolicy",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.authenticationEventsPolicy",
  "id": "String (identifier)"
}
```

