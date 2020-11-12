---
title: "b2cIdentityUserFlow resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# b2cIdentityUserFlow resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [identityUserFlow](../resources/identityuserflow.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List b2cIdentityUserFlow](../api/b2cidentityuserflow-list.md)|[b2cIdentityUserFlow](../resources/b2cidentityuserflow.md) collection|Get a list of the [b2cIdentityUserFlow](../resources/b2cidentityuserflow.md) objects and their properties.|
|[Create b2cIdentityUserFlow](../api/b2cidentityuserflow-create.md)|[b2cIdentityUserFlow](../resources/b2cidentityuserflow.md)|Create a new [b2cIdentityUserFlow](../resources/b2cidentityuserflow.md) object.|
|[Get b2cIdentityUserFlow](../api/b2cidentityuserflow-get.md)|[b2cIdentityUserFlow](../resources/b2cidentityuserflow.md)|Read the properties and relationships of a [b2cIdentityUserFlow](../resources/b2cidentityuserflow.md) object.|
|[Update b2cIdentityUserFlow](../api/b2cidentityuserflow-update.md)|[b2cIdentityUserFlow](../resources/b2cidentityuserflow.md)|Update the properties of a [b2cIdentityUserFlow](../resources/b2cidentityuserflow.md) object.|
|[Delete b2cIdentityUserFlow](../api/b2cidentityuserflow-delete.md)|None|Deletes a [b2cIdentityUserFlow](../resources/b2cidentityuserflow.md) object.|
|[List languages](../api/b2cidentityuserflow-list-languages.md)|[userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md) collection|Get the userFlowLanguageConfiguration resources from the languages navigation property.|
|[Create languages](../api/b2cidentityuserflow-post-languages.md)|[userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md)|Create a new userFlowLanguageConfiguration object.|
|[Get languages](../api/b2cidentityuserflow-get-userflowlanguageconfiguration.md)|[userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md)|Read the properties and relationships of a [userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md) object.|
|[Update languages](../api/b2cidentityuserflow-update-languages.md)|[userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md)|Update the properties of a languages object.|
|[Delete languages](../api/b2cidentityuserflow-delete-languages.md)|None|Delete a [userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md) object.|
|[List userAttributeAssignments](../api/b2cidentityuserflow-list-userattributeassignments.md)|[identityUserFlowAttributeAssignment](../resources/identityuserflowattributeassignment.md) collection|Get the identityUserFlowAttributeAssignment resources from the userAttributeAssignments navigation property.|
|[Create userAttributeAssignments](../api/b2cidentityuserflow-post-userattributeassignments.md)|[identityUserFlowAttributeAssignment](../resources/identityuserflowattributeassignment.md)|Create a new identityUserFlowAttributeAssignment object.|
|[Get userAttributeAssignments](../api/b2cidentityuserflow-get-identityuserflowattributeassignment.md)|[identityUserFlowAttributeAssignment](../resources/identityuserflowattributeassignment.md)|Read the properties and relationships of an [identityUserFlowAttributeAssignment](../resources/identityuserflowattributeassignment.md) object.|
|[Update userAttributeAssignments](../api/b2cidentityuserflow-update-userattributeassignments.md)|[identityUserFlowAttributeAssignment](../resources/identityuserflowattributeassignment.md)|Update the properties of a userAttributeAssignments object.|
|[Delete userAttributeAssignments](../api/b2cidentityuserflow-delete-userattributeassignments.md)|None|Delete an [identityUserFlowAttributeAssignment](../resources/identityuserflowattributeassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|apiConnectorConfiguration|[userFlowApiConnectorConfiguration](../resources/userflowapiconnectorconfiguration.md)|**TODO: Add Description**|
|authenticationMethods|b2cAuthenticationMethods|**TODO: Add Description**. Possible values are: `emailWithPassword`, `userName`.|
|defaultLanguageTag|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [identityUserFlow](../resources/identityuserflow.md)|
|isLanguageCustomizationEnabled|Boolean|**TODO: Add Description**|
|tokenClaimsConfiguration|[userFlowTokenClaimsConfiguration](../resources/userflowtokenclaimsconfiguration.md)|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.b2cIdentityUserFlow",
  "baseType": "Microsoft.Cpim.Api.DataModels.identityUserFlow",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.b2cIdentityUserFlow",
  "id": "String (identifier)",
  "userFlowType": "String",
  "userFlowTypeVersion": "Single",
  "isLanguageCustomizationEnabled": "Boolean",
  "defaultLanguageTag": "String",
  "authenticationMethods": "String",
  "tokenClaimsConfiguration": {
    "@odata.type": "microsoft.graph.userFlowTokenClaimsConfiguration"
  },
  "apiConnectorConfiguration": {
    "@odata.type": "microsoft.graph.userFlowApiConnectorConfiguration"
  }
}
```

