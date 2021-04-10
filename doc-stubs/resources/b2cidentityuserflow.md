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

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

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
|[List userFlowIdentityProviders](../api/b2cidentityuserflow-list-userflowidentityproviders.md)|[identityProviderBase](../resources/identityproviderbase.md) collection|Get the identityProviderBase resources from the userFlowIdentityProviders navigation property.|
|[Add identityProviderBase](../api/b2cidentityuserflow-post-userflowidentityproviders.md)|[identityProviderBase](../resources/identityproviderbase.md)|Add userFlowIdentityProviders by posting to the userFlowIdentityProviders collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|apiConnectorConfiguration|[userFlowApiConnectorConfiguration](../resources/userflowapiconnectorconfiguration.md)|**TODO: Add Description**|
|defaultLanguageTag|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isLanguageCustomizationEnabled|Boolean|**TODO: Add Description**|
|userFlowType|userFlowType|**TODO: Add Description** Inherited from [identityUserFlow](../resources/identityuserflow.md). Possible values are: `signUp`, `signIn`, `signUpOrSignIn`, `passwordReset`, `profileUpdate`, `resourceOwner`, `unknownFutureValue`.|
|userFlowTypeVersion|Single|**TODO: Add Description** Inherited from [identityUserFlow](../resources/identityuserflow.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|identityProviders|[identityProvider](../resources/identityprovider.md) collection|**TODO: Add Description**|
|languages|[userFlowLanguageConfiguration](../resources/userflowlanguageconfiguration.md) collection|**TODO: Add Description**|
|userAttributeAssignments|[identityUserFlowAttributeAssignment](../resources/identityuserflowattributeassignment.md) collection|**TODO: Add Description**|
|userFlowIdentityProviders|[identityProviderBase](../resources/identityproviderbase.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.b2cIdentityUserFlow",
  "baseType": "microsoft.graph.identityUserFlow",
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
  "apiConnectorConfiguration": {
    "@odata.type": "microsoft.graph.userFlowApiConnectorConfiguration"
  }
}
```

