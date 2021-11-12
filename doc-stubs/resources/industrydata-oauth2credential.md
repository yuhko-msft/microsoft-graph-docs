---
title: "oAuth2Credential resource type"
description: "Credentials using OAuth 2.0 to authenticate to a resource."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# oAuth2Credential resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Credentials using OAuth 2.0 to authenticate to a resource.


Inherits from [oAuthCredential](../resources/industrydata-oauthcredential.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|clientId|String|Client id of the application authenticating. Inherited from [oAuthCredential](../resources/industrydata-oauthcredential.md).|
|clientSecret|String|Client secret used to authenticate (write-only). Inherited from [oAuthCredential](../resources/industrydata-oauthcredential.md).|
|displayName|String|The name of the credential. Inherited from [credential](../resources/industrydata-credential.md).|
|scope|String|OAuth scope provided to the authentication process.|
|tokenUrl|String|Url to retrieve the token once authentication has happened.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.industryData.oAuth2Credential"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.oAuth2Credential",
  "displayName": "String",
  "clientId": "String",
  "clientSecret": "String",
  "tokenUrl": "String",
  "scope": "String"
}
```

