---
title: "redirectSingleSignOnExtension resource type"
description: "Represents an Apple Single Sign-On Extension."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# redirectSingleSignOnExtension resource type

Namespace: microsoft.graph



Represents an Apple Single Sign-On Extension.


Inherits from [singleSignOnExtension](../resources/singlesignonextension.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|configurations|[keyTypedValuePair](../resources/keytypedvaluepair.md) collection|Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements.|
|extensionIdentifier|String|Gets or sets the bundle ID of the app extension that performs SSO for the specified URLs.|
|teamIdentifier|String|Gets or sets the team ID of the app extension that performs SSO for the specified URLs.|
|urlPrefixes|String collection|One or more URL prefixes of identity providers on whose behalf the app extension performs single sign-on. URLs must begin with http:// or https://. All URL prefixes must be unique for all profiles.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.redirectSingleSignOnExtension"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.redirectSingleSignOnExtension",
  "configurations": [
    {
      "@odata.type": "microsoft.graph.keyBooleanValuePair"
    }
  ],
  "extensionIdentifier": "String",
  "teamIdentifier": "String",
  "urlPrefixes": [
    "String"
  ]
}
```

