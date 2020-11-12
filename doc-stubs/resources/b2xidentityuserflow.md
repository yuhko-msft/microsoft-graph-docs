---
title: "b2xIdentityUserFlow resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# b2xIdentityUserFlow resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [identityUserFlow](../resources/identityuserflow.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userFlow](../api/invokeuserflowaction-list-userflow.md)|[b2xIdentityUserFlow](../resources/b2xidentityuserflow.md) collection|Get the b2xIdentityUserFlow resources from the userFlow navigation property.|
|[Add userFlow](../api/invokeuserflowaction-post-userflow.md)|[b2xIdentityUserFlow](../resources/b2xidentityuserflow.md)|Add userFlow by posting to the userFlow collection.|
|[Remove userFlow](../api/invokeuserflowaction-delete-userflow.md)|None|Remove a [b2xIdentityUserFlow](../resources/b2xidentityuserflow.md) object.|
|[List b2xIdentityUserFlow](../api/b2xidentityuserflow-list.md)|[b2xIdentityUserFlow](../resources/b2xidentityuserflow.md) collection|Get a list of the [b2xIdentityUserFlow](../resources/b2xidentityuserflow.md) objects and their properties.|
|[Create b2xIdentityUserFlow](../api/b2xidentityuserflow-create.md)|[b2xIdentityUserFlow](../resources/b2xidentityuserflow.md)|Create a new [b2xIdentityUserFlow](../resources/b2xidentityuserflow.md) object.|
|[Get b2xIdentityUserFlow](../api/b2xidentityuserflow-get.md)|[b2xIdentityUserFlow](../resources/b2xidentityuserflow.md)|Read the properties and relationships of a [b2xIdentityUserFlow](../resources/b2xidentityuserflow.md) object.|
|[Update b2xIdentityUserFlow](../api/b2xidentityuserflow-update.md)|[b2xIdentityUserFlow](../resources/b2xidentityuserflow.md)|Update the properties of a [b2xIdentityUserFlow](../resources/b2xidentityuserflow.md) object.|
|[Delete b2xIdentityUserFlow](../api/b2xidentityuserflow-delete.md)|None|Deletes a [b2xIdentityUserFlow](../resources/b2xidentityuserflow.md) object.|
|[List languages](../api/b2xidentityuserflow-list-languages.md)|[userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md) collection|Get the userFlowLanguageConfiguration resources from the languages navigation property.|
|[Create languages](../api/b2xidentityuserflow-post-languages.md)|[userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md)|Create a new userFlowLanguageConfiguration object.|
|[Get languages](../api/b2xidentityuserflow-get-userflowlanguageconfiguration.md)|[userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md)|Read the properties and relationships of a [userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md) object.|
|[Update languages](../api/b2xidentityuserflow-update-languages.md)|[userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md)|Update the properties of a languages object.|
|[Delete languages](../api/b2xidentityuserflow-delete-languages.md)|None|Delete a [userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md) object.|
|[List userAttributeAssignments](../api/b2xidentityuserflow-list-userattributeassignments.md)|[identityUserFlowAttributeAssignment](../resources/identityuserflowattributeassignment.md) collection|Get the identityUserFlowAttributeAssignment resources from the userAttributeAssignments navigation property.|
|[Create userAttributeAssignments](../api/b2xidentityuserflow-post-userattributeassignments.md)|[identityUserFlowAttributeAssignment](../resources/identityuserflowattributeassignment.md)|Create a new identityUserFlowAttributeAssignment object.|
|[Get userAttributeAssignments](../api/b2xidentityuserflow-get-identityuserflowattributeassignment.md)|[identityUserFlowAttributeAssignment](../resources/identityuserflowattributeassignment.md)|Read the properties and relationships of an [identityUserFlowAttributeAssignment](../resources/identityuserflowattributeassignment.md) object.|
|[Update userAttributeAssignments](../api/b2xidentityuserflow-update-userattributeassignments.md)|[identityUserFlowAttributeAssignment](../resources/identityuserflowattributeassignment.md)|Update the properties of a userAttributeAssignments object.|
|[Delete userAttributeAssignments](../api/b2xidentityuserflow-delete-userattributeassignments.md)|None|Delete an [identityUserFlowAttributeAssignment](../resources/identityuserflowattributeassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|apiConnectorConfiguration|[userFlowApiConnectorConfiguration](../resources/userflowapiconnectorconfiguration.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [identityUserFlow](../resources/identityuserflow.md)|
|userFlowType|userFlowType|**TODO: Add Description** Inherited from [identityUserFlow](../resources/identityuserflow.md). Possible values are: `signUp`, `signIn`, `signUpOrSignIn`, `passwordReset`, `profileUpdate`, `resourceOwner`, `unknownFutureValue`.|
|userFlowTypeVersion|Single|**TODO: Add Description** Inherited from [identityUserFlow](../resources/identityuserflow.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|identityProviders|[identityProvider](../resources/identityprovider.md) collection|**TODO: Add Description**|
|languages|[userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md) collection|**TODO: Add Description**|
|userAttributeAssignments|[identityUserFlowAttributeAssignment](../resources/identityuserflowattributeassignment.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.b2xIdentityUserFlow",
  "baseType": "Microsoft.Cpim.Api.DataModels.identityUserFlow",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.b2xIdentityUserFlow",
  "id": "String (identifier)",
  "userFlowType": "String",
  "userFlowTypeVersion": "Single",
  "apiConnectorConfiguration": {
    "@odata.type": "microsoft.graph.userFlowApiConnectorConfiguration"
  }
}
```

