---
title: "passwordAuthenticationMethod resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# passwordAuthenticationMethod resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [authenticationMethod](../resources/authenticationmethod.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List passwordAuthenticationMethods](../api/passwordauthenticationmethod-list.md)|[passwordAuthenticationMethod](../resources/passwordauthenticationmethod.md) collection|Get a list of the [passwordAuthenticationMethod](../resources/passwordauthenticationmethod.md) objects and their properties.|
|[Create passwordAuthenticationMethod](../api/passwordauthenticationmethod-create.md)|[passwordAuthenticationMethod](../resources/passwordauthenticationmethod.md)|Create a new [passwordAuthenticationMethod](../resources/passwordauthenticationmethod.md) object.|
|[Get passwordAuthenticationMethod](../api/passwordauthenticationmethod-get.md)|[passwordAuthenticationMethod](../resources/passwordauthenticationmethod.md)|Read the properties and relationships of a [passwordAuthenticationMethod](../resources/passwordauthenticationmethod.md) object.|
|[Update passwordAuthenticationMethod](../api/passwordauthenticationmethod-update.md)|[passwordAuthenticationMethod](../resources/passwordauthenticationmethod.md)|Update the properties of a [passwordAuthenticationMethod](../resources/passwordauthenticationmethod.md) object.|
|[Delete passwordAuthenticationMethod](../api/passwordauthenticationmethod-delete.md)|None|Deletes a [passwordAuthenticationMethod](../resources/passwordauthenticationmethod.md) object.|
|[disableSmsSignIn](../api/passwordauthenticationmethod-disablesmssignin.md)|None|**TODO: Add Description**|
|[enableSmsSignIn](../api/passwordauthenticationmethod-enablesmssignin.md)|None|**TODO: Add Description**|
|[resetPassword](../api/passwordauthenticationmethod-resetpassword.md)|[passwordResetResponse](../resources/passwordresetresponse.md)|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|creationDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|password|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.passwordAuthenticationMethod",
  "baseType": "microsoft.graph.authenticationMethod",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.passwordAuthenticationMethod",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "creationDateTime": "String (timestamp)",
  "password": "String"
}
```

