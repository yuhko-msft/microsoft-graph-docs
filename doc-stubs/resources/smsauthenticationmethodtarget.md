---
title: "smsAuthenticationMethodTarget resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# smsAuthenticationMethodTarget resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [authenticationMethodTarget](../resources/authenticationmethodtarget.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List smsAuthenticationMethodTargets](../api/smsauthenticationmethodtarget-list.md)|[smsAuthenticationMethodTarget](../resources/smsauthenticationmethodtarget.md) collection|Get a list of the [smsAuthenticationMethodTarget](../resources/smsauthenticationmethodtarget.md) objects and their properties.|
|[Create smsAuthenticationMethodTarget](../api/smsauthenticationmethodtarget-create.md)|[smsAuthenticationMethodTarget](../resources/smsauthenticationmethodtarget.md)|Create a new [smsAuthenticationMethodTarget](../resources/smsauthenticationmethodtarget.md) object.|
|[Get smsAuthenticationMethodTarget](../api/smsauthenticationmethodtarget-get.md)|[smsAuthenticationMethodTarget](../resources/smsauthenticationmethodtarget.md)|Read the properties and relationships of a [smsAuthenticationMethodTarget](../resources/smsauthenticationmethodtarget.md) object.|
|[Update smsAuthenticationMethodTarget](../api/smsauthenticationmethodtarget-update.md)|[smsAuthenticationMethodTarget](../resources/smsauthenticationmethodtarget.md)|Update the properties of a [smsAuthenticationMethodTarget](../resources/smsauthenticationmethodtarget.md) object.|
|[Delete smsAuthenticationMethodTarget](../api/smsauthenticationmethodtarget-delete.md)|None|Deletes a [smsAuthenticationMethodTarget](../resources/smsauthenticationmethodtarget.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isRegistrationRequired|Boolean|**TODO: Add Description** Inherited from [authenticationMethodTarget](../resources/authenticationmethodtarget.md)|
|isUsableForSignIn|Boolean|**TODO: Add Description**|
|targetType|authenticationMethodTargetType|**TODO: Add Description** Inherited from [authenticationMethodTarget](../resources/authenticationmethodtarget.md). Possible values are: `user`, `group`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.smsAuthenticationMethodTarget",
  "baseType": "microsoft.graph.authenticationMethodTarget",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.smsAuthenticationMethodTarget",
  "id": "String (identifier)",
  "isRegistrationRequired": "Boolean",
  "targetType": "String",
  "isUsableForSignIn": "Boolean"
}
```

