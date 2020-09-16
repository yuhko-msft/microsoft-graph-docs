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
|[List b2xIdentityUserFlow](../api/b2xidentityuserflow-list.md)|[b2xIdentityUserFlow](../resources/b2xidentityuserflow.md) collection|Get a list of the [b2xIdentityUserFlow](../resources/b2xidentityuserflow.md) objects and their properties.|
|[Create b2xIdentityUserFlow](../api/b2xidentityuserflow-create.md)|[b2xIdentityUserFlow](../resources/b2xidentityuserflow.md)|Create a new [b2xIdentityUserFlow](../resources/b2xidentityuserflow.md) object.|
|[Get b2xIdentityUserFlow](../api/b2xidentityuserflow-get.md)|[b2xIdentityUserFlow](../resources/b2xidentityuserflow.md)|Read the properties and relationships of a [b2xIdentityUserFlow](../resources/b2xidentityuserflow.md) object.|
|[Update b2xIdentityUserFlow](../api/b2xidentityuserflow-update.md)|[b2xIdentityUserFlow](../resources/b2xidentityuserflow.md)|Update the properties of a [b2xIdentityUserFlow](../resources/b2xidentityuserflow.md) object.|
|[Delete b2xIdentityUserFlow](../api/b2xidentityuserflow-delete.md)|None|Deletes a [b2xIdentityUserFlow](../resources/b2xidentityuserflow.md) object.|
|[List identityProviders](../api/b2xidentityuserflow-list-identityproviders.md)|[IdentityProvider](../resources/identityprovider.md) collection|Get the IdentityProvider resources from the identityProviders navigation property.|
|[Add identityProviders](../api/b2xidentityuserflow-post-identityproviders.md)|[IdentityProvider](../resources/identityprovider.md)|Add identityProviders by posting to the identityProviders collection.|
|[Remove identityProviders](../api/b2xidentityuserflow-delete-identityproviders.md)|None|Remove an [IdentityProvider](../resources/identityprovider.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [identityUserFlow](../resources/identityuserflow.md)|
|userFlowType|userFlowType|**TODO: Add Description** Inherited from [identityUserFlow](../resources/identityuserflow.md). Possible values are: `signUp`, `signIn`, `signUpOrSignIn`, `passwordReset`, `profileUpdate`, `resourceOwner`, `unknownFutureValue`.|
|userFlowTypeVersion|Single|**TODO: Add Description** Inherited from [identityUserFlow](../resources/identityuserflow.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|identityProviders|[IdentityProvider](../resources/identityprovider.md) collection|**TODO: Add Description**|

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
  "userFlowTypeVersion": "Single"
}
```

